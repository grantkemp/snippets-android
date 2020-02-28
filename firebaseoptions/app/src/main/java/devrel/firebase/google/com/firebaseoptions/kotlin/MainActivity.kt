package devrel.firebase.google.com.firebaseoptions.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import devrel.firebase.google.com.firebaseoptions.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // [START firebase_options]
        // Manually configure Firebase Options. The following fields are REQUIRED:
        //   - Project ID
        //   - App ID
        //   - API Key
        val options = FirebaseOptions.Builder()
                .setProjectId("my-firebase-project")
                .setApplicationId("1:27992087142:android:ce3b6448250083d1")
                .setApiKey("AIzaSyADUe90ULnQDuGShD9W23RDP0xmeDc6Mvw")
                // setDatabaseURL(...)
                // setStorageBucket(...)
                .build()
        // [END firebase_options]

        // [START firebase_secondary]
        // Initialize with secondary app
        FirebaseApp.initializeApp(this /* Context */, options, "secondary")

        // Retrieve secondary FirebaseApp
        val secondary = FirebaseApp.getInstance("secondary")
        // [END firebase_secondary]
    }
}
