package isomora.com.greendoctor

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detection.*

class DetectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detection)

        // Package name of GMail app
        val packageName = "com.ryzerobotics.tello"
        val packageName2 = "mobileSSH.feng.gao"

        // Click listener for button widget
        drone_button.setOnClickListener{
            // Launch the app programmatically
            launchApp(packageName)
        }

        raspberry_button.setOnClickListener{
            // Launch the app programmatically
            launchApp(packageName2)
        }

        android_button.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        drone_detection_button.setOnClickListener {
            val intent = Intent(this, DroneDetectionActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }
    // Custom method to launch an app
    private fun launchApp(packageName: String) {
        // Get an instance of PackageManager
        val pm = applicationContext.packageManager
        // Initialize a new Intent
        val intent: Intent? = pm.getLaunchIntentForPackage(packageName)
        // Add category to intent
        intent?.addCategory(Intent.CATEGORY_LAUNCHER)
        // If intent is not null then launch the app
        if(intent!=null){
            applicationContext.startActivity(intent)
        }else{
            Toast.makeText(this, "Intent Null!!!", Toast.LENGTH_LONG).show()
        }
    }
}
