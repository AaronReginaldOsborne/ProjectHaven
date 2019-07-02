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
        for (i in 0 until mainGrid.childCount) {
            val cardView = mainGrid.getChildAt(i) as CardView
            cardView.setOnClickListener {
                val intent = Intent(this@MainActivity, ResourcesListingActivity::class.java)
                intent.putExtra("info", "This is activity from card item index  $i")
                startActivity(intent)
            }
        }
    }
}
