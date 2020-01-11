package isomora.com.greendoctor

import android.content.pm.ApplicationInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_detail.*


class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar!!.title = "Detail"
        val bundle: Bundle? = intent.extras

        val key = bundle!!.getInt("key")

        if(key == 1)
        {
            val leaf = bundle!!.getString("leaf_detect")
            var count = 0

            if (leaf != null) {
                for(element in leaf) {
                    count += 1
                    if(element == '_')
                        break
                }
            }
            val leaf_name = leaf.subSequence(0,count-1)
            val disease = leaf.subSequence(count, leaf.length)
            textView2.text = leaf_name
            textView3.text = disease

            if(leaf == "Apple_Apple scab")
            {
                textView4.text = getString(R.string.a1)
                var img = R.drawable.l1
                imageView.setImageResource(img)
            }
            else if(leaf == "Apple_Black rot")
            {
                textView4.text = getString(R.string.a2)
                var img = R.drawable.l2
                imageView.setImageResource(img)
            }
            else if(leaf == "Apple_Cedar apple rust")
            {
                textView4.text = getString(R.string.a3)
                var img = R.drawable.l3
                imageView.setImageResource(img)
            }
            else if(leaf == "Apple_Healthy")
            {
                textView4.text = getString(R.string.a4)
                var img = R.drawable.l4
                imageView.setImageResource(img)
            }
            else if(leaf == "Blueberry_Healthy")
            {
                textView4.text = getString(R.string.a5)
                var img = R.drawable.l5
                imageView.setImageResource(img)
            }
            else if(leaf == "Cherry Sour_Powdery mildew")
            {
                textView4.text = getString(R.string.a6)
                var img = R.drawable.l6
                imageView.setImageResource(img)
            }
            else if(leaf == "Cherry Sour_Healthy")
            {
                textView4.text = getString(R.string.a7)
                var img = R.drawable.l7
                imageView.setImageResource(img)
            }
            else if(leaf == "Corn maize_Cercospora leaf spot gray leaf spot")
            {
                textView4.text = getString(R.string.a8)
                var img = R.drawable.l8
                imageView.setImageResource(img)
            }
            else if(leaf == "Corn maize_Common rust")
            {
                textView4.text = getString(R.string.a9)
                var img = R.drawable.l9
                imageView.setImageResource(img)
            }
            else if(leaf == "Corn maize_Northern leaf blight")
            {
                textView4.text = getString(R.string.a10)
                var img = R.drawable.l10
                imageView.setImageResource(img)
            }
            else if(leaf == "Corn maize_Healthy")
            {
                textView4.text = getString(R.string.a11)
                var img = R.drawable.l11
                imageView.setImageResource(img)
            }
            else if(leaf == "Grape_Black rot")
            {
                textView4.text = getString(R.string.a12)
                var img = R.drawable.l12
                imageView.setImageResource(img)
            }
            else if(leaf == "Grape_Esca black measles")
            {
                textView4.text = getString(R.string.a13)
                var img = R.drawable.l13
                imageView.setImageResource(img)
            }
            else if(leaf == "Grape_Leaf blight isariopsis leaf spot")
            {
                textView4.text = getString(R.string.a14)
                var img = R.drawable.l14
                imageView.setImageResource(img)
            }
            else if(leaf == "Grape_Healthy")
            {
                textView4.text = getString(R.string.a15)
                var img = R.drawable.l15
                imageView.setImageResource(img)
            }
            else if(leaf == "Orange_Huanglongbing citrus greening")
            {
                textView4.text = getString(R.string.a16)
                var img = R.drawable.l16
                imageView.setImageResource(img)
            }
            else if(leaf == "Peach_Bacterial spot")
            {
                textView4.text = getString(R.string.a17)
                var img = R.drawable.l17
                imageView.setImageResource(img)
            }
            else if(leaf == "Peach_Healthy")
            {
                textView4.text = getString(R.string.a18)
                var img = R.drawable.l18
                imageView.setImageResource(img)
            }
            else if(leaf == "Pepper_Bell bacterial spot")
            {
                textView4.text = getString(R.string.a19)
                var img = R.drawable.l19
                imageView.setImageResource(img)
            }
            else if(leaf == "Pepper_Bell healthy")
            {
                textView4.text = getString(R.string.a20)
                var img = R.drawable.l20
                imageView.setImageResource(img)
            }
            else if(leaf == "Potato_Early blight")
            {
                textView4.text = getString(R.string.a21)
                var img = R.drawable.l21
                imageView.setImageResource(img)
            }
            else if(leaf == "Potato_Late blight")
            {
                textView4.text = getString(R.string.a22)
                var img = R.drawable.l22
                imageView.setImageResource(img)
            }
            else if(leaf == "Potato_Healthy")
            {
                textView4.text = getString(R.string.a23)
                var img = R.drawable.l23
                imageView.setImageResource(img)
            }
            else if(leaf == "Raspberry_Healthy")
            {
                textView4.text = getString(R.string.a24)
                var img = R.drawable.l24
                imageView.setImageResource(img)
            }
            else if(leaf == "Soybean_Healthy")
            {
                textView4.text = getString(R.string.a25)
                var img = R.drawable.l25
                imageView.setImageResource(img)
            }
            else if(leaf == "Squash_Powdery mildew")
            {
                textView4.text = getString(R.string.a26)
                var img = R.drawable.l26
                imageView.setImageResource(img)
            }
            else if(leaf == "Strawberry_Leaf scorch")
            {
                textView4.text = getString(R.string.a27)
                var img = R.drawable.l27
                imageView.setImageResource(img)
            }
            else if(leaf == "Strawberry_Healthy")
            {
                textView4.text = getString(R.string.a28)
                var img = R.drawable.l28
                imageView.setImageResource(img)
            }
            else if(leaf == "Tomato_Bacterial spot")
            {
                textView4.text = getString(R.string.a29)
                var img = R.drawable.l29
                imageView.setImageResource(img)
            }
            else if(leaf == "Tomato_Early blight")
            {
                textView4.text = getString(R.string.a30)
                var img = R.drawable.l30
                imageView.setImageResource(img)
            }
            else if(leaf == "Tomato_Late blight")
            {
                textView4.text = getString(R.string.a31)
                var img = R.drawable.l31
                imageView.setImageResource(img)
            }
            else if(leaf == "Tomato_Leaf mold")
            {
                textView4.text = getString(R.string.a32)
                var img = R.drawable.l32
                imageView.setImageResource(img)
            }
            else if(leaf == "Tomato_Septoria leaf spot")
            {
                textView4.text = getString(R.string.a33)
                var img = R.drawable.l33
                imageView.setImageResource(img)
            }
            else if(leaf == "Tomato_Spider mites two spotted spider mite")
            {
                textView4.text = getString(R.string.a34)
                var img = R.drawable.l34
                imageView.setImageResource(img)
            }
            else if(leaf == "Tomato_Target spot")
            {
                textView4.text = getString(R.string.a35)
                var img = R.drawable.l35
                imageView.setImageResource(img)
            }
            else if(leaf == "Tomato_Tomato yellow leaf curl virus")
            {
                textView4.text = getString(R.string.a36)
                var img = R.drawable.l36
                imageView.setImageResource(img)
            }
            else if(leaf == "Tomato_Tomato mosaic virus")
            {
                textView4.text = getString(R.string.a37)
                var img = R.drawable.l37
                imageView.setImageResource(img)
            }
            else if(leaf == "Tomato_Healthy")
            {
                textView4.text = getString(R.string.a38)
                var img = R.drawable.l38
                imageView.setImageResource(img)
            }

            preventive.setOnClickListener{
                var img = R.drawable.applescabprev
                imageView2.setImageResource(img)
            }

            treatnow.setOnClickListener {
                var img = R.drawable.applescabtreat
                imageView2.setImageResource(img)
            }
        }
        else if(key == 2)
        {
            val leaf = bundle!!.getString("leaf")
            val dis = bundle!!.getString("disease")

            textView2.text = leaf
            textView3.text = dis

            if(leaf == "Apple")
            {
                if(dis == "Apple Scab")
                {
                    textView4.text = getString(R.string.a1)
                    var img = R.drawable.l1
                    imageView.setImageResource(img)
                }
                else if(dis == "Black Rot")
                {
                    textView4.text = getString(R.string.a2)
                    var img = R.drawable.l2
                    imageView.setImageResource(img)
                }
                else if(dis == "Cedar Rust")
                {
                    textView4.text = getString(R.string.a3)
                    var img = R.drawable.l3
                    imageView.setImageResource(img)
                }
                else if(dis == "Healthy")
                {
                    textView4.text = getString(R.string.a4)
                    var img = R.drawable.l4
                    imageView.setImageResource(img)
                }
            }
            else if(leaf == "Blueberry" && dis == "Healthy")
            {
                textView4.text = getString(R.string.a5)
                var img = R.drawable.l5
                imageView.setImageResource(img)
            }
            else if(leaf == "Cherry" && dis == "Powdery Mildew")
            {
                textView4.text = getString(R.string.a6)
                var img = R.drawable.l6
                imageView.setImageResource(img)
            }
            else if(leaf == "Cherry" && dis == "Healthy")
            {
                textView4.text = getString(R.string.a7)
                var img = R.drawable.l7
                imageView.setImageResource(img)
            }
            else if(leaf == "Corn" && dis == "Cercospora Leaf Spot Gray")
            {
                textView4.text = getString(R.string.a8)
                var img = R.drawable.l8
                imageView.setImageResource(img)
            }
            else if(leaf == "Corn" && dis == "Common Rust")
            {
                textView4.text = getString(R.string.a9)
                var img = R.drawable.l9
                imageView.setImageResource(img)
            }
            else if(leaf == "Corn" && dis == "Northern Leaf Blight")
            {
                textView4.text = getString(R.string.a10)
                var img = R.drawable.l10
                imageView.setImageResource(img)
            }
            else if(leaf == "Corn" && dis == "Healthy")
            {
                textView4.text = getString(R.string.a11)
                var img = R.drawable.l11
                imageView.setImageResource(img)
            }
            else if(leaf == "Grapes" && dis == "Black Rot")
            {
                textView4.text = getString(R.string.a12)
                var img = R.drawable.l12
                imageView.setImageResource(img)
            }
            else if(leaf == "Grapes" && dis == "Esca Black Measles")
            {
                textView4.text = getString(R.string.a13)
                var img = R.drawable.l13
                imageView.setImageResource(img)
            }
            else if(leaf == "Grapes" && dis == "Blight Isariopsis Leaf Spot")
            {
                textView4.text = getString(R.string.a14)
                var img = R.drawable.l14
                imageView.setImageResource(img)
            }
            else if(leaf == "Grapes" && dis == "Healthy")
            {
                textView4.text = getString(R.string.a15)
                var img = R.drawable.l15
                imageView.setImageResource(img)
            }
            else if(leaf == "Orange" && dis == "Citrus Greening")
            {
                textView4.text = getString(R.string.a16)
                var img = R.drawable.l16
                imageView.setImageResource(img)
            }
            else if(leaf == "Peach" && dis =="Bacterial Spot")
            {
                textView4.text = getString(R.string.a17)
                var img = R.drawable.l17
                imageView.setImageResource(img)
            }
            else if(leaf == "Peach" && dis=="Healthy")
            {
                textView4.text = getString(R.string.a18)
                var img = R.drawable.l18
                imageView.setImageResource(img)
            }
            else if(leaf == "Pepper" && dis=="Bell Bacterial Spot")
            {
                textView4.text = getString(R.string.a19)
                var img = R.drawable.l19
                imageView.setImageResource(img)
            }
            else if(leaf == "Pepper" && dis=="Healthy")
            {
                textView4.text = getString(R.string.a20)
                var img = R.drawable.l20
                imageView.setImageResource(img)
            }
            else if(leaf == "Potato" && dis=="Early Blight")
            {
                textView4.text = getString(R.string.a21)
                var img = R.drawable.l21
                imageView.setImageResource(img)
            }
            else if(leaf == "Potato" && dis=="Late Blight")
            {
                textView4.text = getString(R.string.a22)
                var img = R.drawable.l22
                imageView.setImageResource(img)
            }
            else if(leaf == "Potato" && dis=="Healthy")
            {
                textView4.text = getString(R.string.a23)
                var img = R.drawable.l23
                imageView.setImageResource(img)
            }
            else if(leaf == "Raspberry" && dis=="Healthy")
            {
                textView4.text = getString(R.string.a24)
                var img = R.drawable.l24
                imageView.setImageResource(img)
            }
            else if(leaf == "Soybean" && dis=="Healthy")
            {
                textView4.text = getString(R.string.a25)
                var img = R.drawable.l25
                imageView.setImageResource(img)
            }
            else if(leaf == "Squash" && dis=="Powdery Mildew")
            {
                textView4.text = getString(R.string.a26)
                var img = R.drawable.l26
                imageView.setImageResource(img)
            }
            else if(leaf == "Strawberry" && dis == "Leaf Scorch")
            {
                textView4.text = getString(R.string.a27)
                var img = R.drawable.l27
                imageView.setImageResource(img)
            }
            else if(leaf == "Strawberry" && dis=="Healthy")
            {
                textView4.text = getString(R.string.a28)
                var img = R.drawable.l28
                imageView.setImageResource(img)
            }
            else if(leaf == "Tomato" && dis=="Bacterial Spot")
            {
                textView4.text = getString(R.string.a29)
                var img = R.drawable.l29
                imageView.setImageResource(img)
            }
            else if(leaf == "Tomato" && dis=="Early Blight")
            {
                textView4.text = getString(R.string.a30)
                var img = R.drawable.l30
                imageView.setImageResource(img)
            }
            else if(leaf == "Tomato" && dis=="Late Blight")
            {
                textView4.text = getString(R.string.a31)
                var img = R.drawable.l31
                imageView.setImageResource(img)
            }
            else if(leaf == "Tomato" && dis=="Leaf Mold")
            {
                textView4.text = getString(R.string.a32)
                var img = R.drawable.l32
                imageView.setImageResource(img)
            }
            else if(leaf == "Tomato" && dis=="Septoria Leaf Spot")
            {
                textView4.text = getString(R.string.a33)
                var img = R.drawable.l33
                imageView.setImageResource(img)
            }
            else if(leaf == "Tomato" && dis=="Spider Mites")
            {
                textView4.text = getString(R.string.a34)
                var img = R.drawable.l34
                imageView.setImageResource(img)
            }
            else if(leaf == "Tomato" && dis=="Target Spot")
            {
                textView4.text = getString(R.string.a35)
                var img = R.drawable.l35
                imageView.setImageResource(img)
            }
            else if(leaf == "Tomato" && dis=="Yellow Leaf Curl Virus")
            {
                textView4.text = getString(R.string.a36)
                var img = R.drawable.l36
                imageView.setImageResource(img)
            }
            else if(leaf == "Tomato" && dis=="Tomato Mosaic")
            {
                textView4.text = getString(R.string.a37)
                var img = R.drawable.l37
                imageView.setImageResource(img)
            }
            else if(leaf == "Tomato" && dis=="Healthy")
            {
                textView4.text = getString(R.string.a38)
                var img = R.drawable.l38
                imageView.setImageResource(img)
            }

            preventive.setOnClickListener{
                var img = R.drawable.applescabprev
                imageView2.setImageResource(img)
            }

            treatnow.setOnClickListener {
                var img = R.drawable.applescabtreat
                imageView2.setImageResource(img)
            }
        }

    }

}
