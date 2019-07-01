package ca.agoldfish.projecthaven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSingleEvent(mainGrid)
    }

    private fun setSingleEvent(mainGrid: GridLayout) {
        //Loop all child item of Main Grid
        for (i in 0 until mainGrid.childCount) {
            //You can see , all child item is CardView , so we just cast object to CardView
            val cardView = mainGrid.getChildAt(i) as CardView
            cardView.setOnClickListener {
                val intent = Intent(this@MainActivity, ResourcesActivity::class.java)
                intent.putExtra("info", "This is activity from card item index  $i")
                startActivity(intent)
            }
        }
    }
}
