package pl.learn.anything.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pl.learn.anything.R

class RvSubjectListAdapter(val subjectList:List<String>):RecyclerView.Adapter<RvSubjectListAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return subjectList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.subject_name,parent,false)
        return ViewHolder(v)
    }



    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val subjectName = view.findViewById<TextView>(R.id.textViewSubjectName)
    }

}