package isomora.com.greendoctor

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.RadioButton
import android.widget.Toast
import isomora.com.greendoctor.R
import kotlinx.android.synthetic.main.activity_fertilizer.*
import kotlinx.android.synthetic.main.activity_fertilizer_area.*
import kotlinx.android.synthetic.main.activity_fertilizer_area.calcu
import kotlinx.android.synthetic.main.activity_fertilizer_area.dap
import kotlinx.android.synthetic.main.activity_fertilizer_area.editText
import kotlinx.android.synthetic.main.activity_fertilizer_area.mop
import kotlinx.android.synthetic.main.activity_fertilizer_area.mop2
import kotlinx.android.synthetic.main.activity_fertilizer_area.ssp
import kotlinx.android.synthetic.main.activity_fertilizer_area.urea
import kotlinx.android.synthetic.main.activity_fertilizer_area.urea2

class FertilizerAreaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fertilizer_area)


         var str: String = ""

        radiogroup.setOnCheckedChangeListener {
                _, checkedId -> val radioButton = this.findViewById<RadioButton>(checkedId)
            Toast.makeText(this, radioButton.text.toString() + " is checked", Toast.LENGTH_LONG).show()
            str = radioButton.text.toString()
        }

        calcu.setOnClickListener{

            if(str == "Acre")
            {
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

                    var mopValue: Double = value * 34.0
                    var sspValue: Double = value * 152.0
                    var ureaValue: Double = value * 101.0
                    var dapValue: Double = value * 53.0
                    var ureaValue2: Double = value * 81.0


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
            else if(str == "Hectare")
            {
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

                    var mopValue: Double = value * 83.0
                    var sspValue: Double = value * 375.0
                    var ureaValue: Double = value * 250.0
                    var dapValue: Double = value * 132.0
                    var ureaValue2: Double = value * 200.0


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
            else
            {
                Toast.makeText(this,"Please Select Unit",Toast.LENGTH_LONG).show()
            }
        }
    }
}
