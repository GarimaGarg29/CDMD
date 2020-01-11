from __future__ import absolute_import
from __future__ import division
from __future__ import print_function

import argparse
import io
import time
import numpy as np
import picamera
import cv2
import os

from PIL import Image
from tflite_runtime.interpreter import Interpreter

pixels = 224
IMAGE_SIZE = (pixels, pixels)


def load_labels(path):
  with open(path, 'r') as f:
    return {i: line.strip() for i, line in enumerate(f.readlines())}


def set_input_tensor(interpreter, image):
  tensor_index = interpreter.get_input_details()[0]['index']
  input_tensor = interpreter.tensor(tensor_index)()[0]
  input_tensor[:, :] = image


def classify_image(interpreter, image, top_k=1):
  """Returns a sorted array of classification results."""
  set_input_tensor(interpreter, image)
  interpreter.invoke()
  output_details = interpreter.get_output_details()[0]
  output = np.squeeze(interpreter.get_tensor(output_details['index']))

  # If the model is quantized (uint8 data), then dequantize the results
  if output_details['dtype'] == np.uint8:
    scale, zero_point = output_details['quantization']
    output = scale * (output - zero_point)

  ordered = np.argpartition(-output, top_k)
  return [(i, output[i]) for i in ordered[:top_k]]

def main():
    
  labels = load_labels("plant_labels.txt")

  interpreter = Interpreter("plant_disease_model.tflite")
  
  cmd = 'fswebcam pic2.jpg'
  os.system(cmd)
    
  interpreter.allocate_tensors()
  _, height, width, _ = interpreter.get_input_details()[0]['shape']
  
  img = cv2.imread("pic2.jpg")
  img = cv2.resize(img, (IMAGE_SIZE[0], IMAGE_SIZE[1]) )
  img = img /255

  #image = img.resize((width, height),Image.ANTIALIAS)
  results = classify_image(interpreter, img)
  print(results)
  label_id, prob = results[0]
  print('Plant-%s \nProb-%.5f'% (labels[label_id], prob))  
  
if __name__ == '__main__':
  main()
