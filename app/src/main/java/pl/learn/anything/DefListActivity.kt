package pl.learn.anything

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_def_list.*
import pl.learn.anything.adapter.RvDefsListAdapter
import pl.learn.anything.enums.LearnKind
import pl.learn.anything.factory.DefBodyListFactory
import pl.learn.anything.factory.DefListFactory
import pl.learn.anything.factory.SubjectFactory
import pl.learn.anything.model.Subject
import pl.learn.anything.view.IDefListView

class DefListActivity : AppCompatActivity() , IDefListView {

    private lateinit var learnKind: LearnKind
    private lateinit var subjectName:String
    private lateinit var subject:Subject
    private lateinit var defsbodyList:List<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_def_list)

        learnKind = LearnKind.valueOf(intent.getStringExtra(getString(R.string.on_choose_learn_kind_text)))
        subjectName = intent.getStringExtra(getString(R.string.on_choose_learn_subject_text))

        subject = SubjectFactory(resources).createSubject(subjectName)
        val defList:List<String> = DefListFactory().createDefList(learnKind,subject)

        defsbodyList = DefBodyListFactory().createBodyList(learnKind,subject)

        recyclerViewDef.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        recyclerViewDef.adapter = RvDefsListAdapter(defList,this)

    }

    override fun onDefChoose(position: Int) {

        startActivity(Intent(this,SingleDefActivity::class.java).apply {
            putExtra(getString(R.string.on_choose_learn_kind_text),learnKind)
            putExtra(getString(R.string.on_choose_learn_subject_text),subjectName)
        })
        finish()

    }

    override fun onBackPressed() {

    }

}
