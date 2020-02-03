package pl.learn.anything.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pl.learn.anything.R
import pl.learn.anything.view.IDefListView

class RvDefsListAdapter(val defsList:List<String>,val view:IDefListView):RecyclerView.Adapter<RvDefsListAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return defsList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.defName.setText(defsList[position])

        holder.defName.setOnClickListener {
            view.onDefChoose(position)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.subject_name,parent,false)
        return RvDefsListAdapter.ViewHolder(v)
    }


    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val defName = view.findViewById<TextView>(R.id.textViewSubjectName)
    }


}