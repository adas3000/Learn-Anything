package pl.learn.anything

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    private lateinit var defsimgbodyList:List<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_def_list)

        learnKind = LearnKind.valueOf(intent.getStringExtra(getString(R.string.on_choose_learn_kind_text)))
        subjectName = intent.getStringExtra(getString(R.string.on_choose_learn_subject_text))

        subject = SubjectFactory(resources).createSubject(subjectName)
        val defList:List<String> = DefListFactory().createDefList(learnKind,subject)

        val defBodyListFactory = DefBodyListFactory()
        defsbodyList = defBodyListFactory.createBodyList(learnKind,subject)
        defsimgbodyList = defBodyListFactory.createImgList(learnKind,subject)


        recyclerViewDef.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        recyclerViewDef.adapter = RvDefsListAdapter(defList,this)
    }

    override fun onDefChoose(position: Int) {

        startActivity(Intent(this,SingleDefActivity::class.java).apply {
            putExtra(getString(R.string.on_choose_learn_kind_text),learnKind.toString())
            putExtra(getString(R.string.on_choose_learn_subject_text),subjectName)
            putExtra(getString(R.string.def_body_text),defsbodyList[position])
            putExtra(getString(R.string.def_img_text),defsimgbodyList[position])
        })
        finish()

    }

    override fun onBackPressed() {
        startActivity(Intent(this,SubjectListActivity::class.java).apply {
            putExtra(getString(R.string.on_choose_learn_kind_text),learnKind.toString())
        })
        finish()
    }

}
