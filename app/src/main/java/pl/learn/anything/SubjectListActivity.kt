package pl.learn.anything

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_subject_list.*
import pl.learn.anything.adapter.RvSubjectListAdapter
import pl.learn.anything.view.ISubjectListView

class SubjectListActivity : AppCompatActivity(), ISubjectListView {

    private lateinit var learnKind: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subject_list)

        learnKind = intent.getStringExtra(getString(R.string.on_choose_learn_kind_text))

        recyclerViewSubjects.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerViewSubjects.adapter =
            RvSubjectListAdapter(resources.getStringArray(R.array.subjects_array_pl).toList(), this)


    }


    override fun onBackPressed() {
        startActivity(Intent(this, LearnKindActivity::class.java))
        finish()
    }

    override fun onSubjectChoose(name: String) {

        startActivity(Intent(this,DefListActivity::class.java).apply {
            putExtra(getString(R.string.on_choose_learn_kind_text),learnKind)
            putExtra(getString(R.string.on_choose_learn_subject_text),name)
        })
        finish()

    }

}
