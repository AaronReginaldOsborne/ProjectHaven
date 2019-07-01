package ca.agoldfish.projecthaven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resources.*

class ResourcesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resources)

        if (intent != null) {
            val info = intent.getStringExtra("info")
            txtInfo.text = info
        }
    }
}
