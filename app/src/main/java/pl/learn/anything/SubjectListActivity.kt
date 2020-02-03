package pl.learn.anything

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_subject_list.*
import pl.learn.anything.adapter.RvSubjectListAdapter
import pl.learn.anything.enums.LearnKind

class SubjectListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subject_list)

        val learnKind :LearnKind= LearnKind.valueOf(intent.getStringExtra(getString(R.string.on_choose_learn_kind_text)))

        recyclerViewSubjects.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        recyclerViewSubjects.adapter = RvSubjectListAdapter(resources.getStringArray(R.array.subjects_array_pl).toList())



    }


    override fun onBackPressed() {
        startActivity(Intent(this,LearnKindActivity::class.java))
        finish()
    }

}
