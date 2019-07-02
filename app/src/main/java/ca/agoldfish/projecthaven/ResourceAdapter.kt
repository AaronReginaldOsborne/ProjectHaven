package ca.agoldfish.projecthaven

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class ResourceAdapter(val resourceList: ArrayList<Resource>) : RecyclerView.Adapter<ResourceAdapter.ViewHolder>() {


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val resource: Resource = resourceList[position]
        holder.textViewAddress.text = resource.name

        holder.index = position
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.list_item_layout, parent,false);
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return resourceList.size
    }

    class ViewHolder(itemView: View, var index: Int = 0) : RecyclerView.ViewHolder(itemView){
        val textViewAddress = itemView.findViewById<TextView>(R.id.textView)!!

        init {
            itemView.setOnClickListener{
                val intent = Intent(itemView.context, ResourceDetailActivity::class.java )
                intent.putExtra("intVariableName", index)
                itemView.context.startActivity(intent)
            }
        }
    }
}