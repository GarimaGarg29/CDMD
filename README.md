# Care Green: Crop Disease Detection
Crop disease detection and prevention system using Deep Learning and Android.

<h2> Team Members </h2>
<p> <a href="https://github.com/shivam1808">Shivam Gupta</a>, <a href="https://github.com/GarimaGarg29">Garima Garg</a> and <a href="https://scholar.google.com/citations?user=qRKv67AAAAAJ&hl=en">Preeti Mishra</a>(Mentor)</p>



<a href="https://www.youtube.com/watch?v=G5oioJgQWSg">![CDMD Logo](https://user-images.githubusercontent.com/46889699/72204929-21d2d400-34a3-11ea-8fb4-0fda1369c4b6.png)</a>

<p> Click on the above icon for the preview of the Android App </p>

<h2> Hardware Requirement</h2>
<ol>
  <li>Our mode is successfully trained on Ubuntu 18.04 Operating System. </li>
  <li>Our application is successfully tested on Android 8.0</li>
</ol>

<h2>Android App</h2>

![CareGreenStep](https://user-images.githubusercontent.com/46889699/72213779-02778d80-351b-11ea-9222-53a48d3a5dea.png)

<h2> Disease detection model details </h2>
<ol>
  <li>We used MobileNet V2 model for disease classification as it is memory efficient and thus takes lesser training time.</li>
  <li>We trained our classification model on <a href="https://drive.google.com/file/d/17qOOHrRBih4jhl-n7AMpoAG60cWcc7-h/view?usp=sharing">PlantVillage dataset</a> . This dataset has leaf images of 5 plants with 25 disease.</li>
  <li>Instead of training our model from scratch, we used pre-trained weights for the training.</li>
  <li>Test accuracy of our model is 96.70 %.</li>
</ol>
