package isomora.com.greendoctor
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import isomora.com.greendoctor.AppleActivity
import isomora.com.greendoctor.R
import isomora.com.greendoctor.StrawBerryActivity
import isomora.com.greendoctor.TomatoActivity
import kotlinx.android.synthetic.main.activity_apple.*
import kotlinx.android.synthetic.main.activity_apple.apple
import kotlinx.android.synthetic.main.activity_apple.blueberry
import kotlinx.android.synthetic.main.activity_apple.corn
import kotlinx.android.synthetic.main.activity_apple.fertilizer_cal
import kotlinx.android.synthetic.main.activity_apple.grape
import kotlinx.android.synthetic.main.activity_apple.health_check
import kotlinx.android.synthetic.main.activity_apple.orange
import kotlinx.android.synthetic.main.activity_apple.peach
import kotlinx.android.synthetic.main.activity_apple.pepper
import kotlinx.android.synthetic.main.activity_apple.pests
import kotlinx.android.synthetic.main.activity_apple.soybean
import kotlinx.android.synthetic.main.activity_apple.strawberry
import kotlinx.android.synthetic.main.activity_apple.tomato
import kotlinx.android.synthetic.main.activity_blueberry.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_apple.cherry as cherry1
import kotlinx.android.synthetic.main.activity_blueberry.raspberry as raspberry1
import kotlinx.android.synthetic.main.activity_blueberry.squash as squash1
import kotlinx.android.synthetic.main.activity_blueberry.weather as weather1

class PotatoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_potato)

        apple.setOnClickListener{
            val intent = Intent(this, AppleActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            finish()
        }

        blueberry.setOnClickListener{
            val intent = Intent(this, BlueberryActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            finish()
        }

        corn.setOnClickListener{
            val intent = Intent(this, CornActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            finish()
        }

        grape.setOnClickListener{
            val intent = Intent(this, GrapesActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            finish()
        }

        orange.setOnClickListener{
            val intent = Intent(this, OrangeActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            finish()
        }

        peach.setOnClickListener{
            val intent = Intent(this, PeachActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            finish()
        }

        pepper.setOnClickListener{
            val intent = Intent(this, PepperActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            finish()
        }

        soybean.setOnClickListener{
            val intent = Intent(this, SoybeanActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            finish()
        }

        strawberry.setOnClickListener{
            val intent = Intent(this, StrawBerryActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            finish()
        }

        tomato.setOnClickListener{
            val intent = Intent(this, TomatoActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            finish()
        }
        pests.setOnClickListener{
            val intent = Intent(this, PestActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        fertilizer_cal.setOnClickListener{
            val intent = Intent(this, FertilizerAreaActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        health_check.setOnClickListener{
            val intent = Intent(this, DetectionActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        cherry.setOnClickListener {
            val intent = Intent(this, Cherryactivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            finish()
        }

        raspberry.setOnClickListener {
            val intent = Intent(this, RaspberryActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            finish()
        }

        squash.setOnClickListener {
            val intent = Intent(this, SquashActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        finish()
        }
        weather.setOnClickListener {
            val intent = Intent(this, WeatherActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }
}
