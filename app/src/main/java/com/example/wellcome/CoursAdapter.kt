package com.example.wellcome
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wellcome.R
import com.example.wellcome.models.Lesson

class CoursAdapter(private val dataSet: List<Lesson>):
    RecyclerView.Adapter<CoursAdapter.ViewHolder>()
{
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = itemView.findViewById(R.id.title_cours)
        val address: TextView = itemView.findViewById(R.id.address_cours)
        val phone: TextView = itemView.findViewById(R.id.phone_cours)
        val tags: TextView = itemView.findViewById(R.id.tags_cours)
        val sessionDuration: TextView = itemView.findViewById(R.id.sessionDuration_cours)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoursAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cours_card_view, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.title.text = dataSet[position].title
        viewHolder.phone.text = dataSet[position].phone
        viewHolder.address.text = dataSet[position].address
        viewHolder.tags.text = dataSet[position].tags.toString()
        viewHolder.sessionDuration.text = dataSet[position].sessionDuration
    }

    override fun getItemCount() = dataSet.size

}