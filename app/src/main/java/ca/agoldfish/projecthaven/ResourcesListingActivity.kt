package ca.agoldfish.projecthaven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_resources_listing.*

class ResourcesListingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resources_listing)

        //create rv
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)

        val resources = ArrayList<Resource>()

        resources.add(Resource("Women’s Community House"))
        resources.add(Resource("Rotholme Women & Families"))
        resources.add(Resource("Zhaawanong Shelter"))

        val adapter = ResourceAdapter(resources)
        recyclerView.adapter = adapter

//        if (intent != null) {
//            val info = intent.getStringExtra("info")
//            txtInfo.text = info
//        }
    }
}
