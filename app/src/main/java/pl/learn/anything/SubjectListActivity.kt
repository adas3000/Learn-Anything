package pl.learn.anything

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pl.learn.anything.adapter.RvSubjectListAdapter

class SubjectListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subject_list)

        


    }


    override fun onBackPressed() {
        startActivity(Intent(this,LearnKindActivity::class.java))
    }

}
