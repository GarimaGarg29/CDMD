package isomora.com.greendoctor

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.widget.Button
import android.widget.Toast
import isomora.com.greendoctor.R
import kotlinx.android.synthetic.main.activity_fertilizer.*
import android.widget.Toast.makeText as makeText1

class FertilizerActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fertilizer)



        calcu.setOnClickListener{

            var inputValue1: String
            var inputValue2: String
            var inputValue3: String
            var inputValue4: String
            var inputValue5: String

            var inputValue: String = editText.text.toString()

            if (inputValue == null || inputValue.trim()=="")
            {
                Toast.makeText(this,"Please Input Data",Toast.LENGTH_LONG).show()
            }
            else
            {
                var value: Int = inputValue.toInt()

                var mopValue: Double = value * 0.667
                var sspValue: Double = value * 1.2
                var ureaValue: Double = value * 0.870
                var dapValue: Double = value * 0.435
                var ureaValue2: Double = value * 0.69


                inputValue1 = mopValue.toString() + " kg"
                inputValue2 = sspValue.toString() + " kg"
                inputValue3 = ureaValue.toString() + " kg"
                inputValue4 = dapValue.toString() + " kg"
                inputValue5 = ureaValue2.toString() + " kg"

                mop.setText(inputValue1).toString()
                ssp.setText(inputValue2).toString()
                urea.setText(inputValue3).toString()
                dap.setText(inputValue4).toString()
                mop2.setText(inputValue1).toString()
                urea2.setText(inputValue5).toString()
            }

        }

    }

}
