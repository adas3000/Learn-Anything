package pl.learn.anything

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pl.learn.anything.enums.LearnKind
import pl.learn.anything.fragment.DefFragment

class SingleDefActivity : AppCompatActivity() {

    private lateinit var learnKind: LearnKind
    private lateinit var subjectName:String
    private lateinit var defBody:String
    private lateinit var imgName:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_def)

        learnKind = LearnKind.valueOf(intent.getStringExtra(getString(R.string.on_choose_learn_kind_text)))
        subjectName = intent.getStringExtra(getString(R.string.on_choose_learn_subject_text))
        defBody = intent.getStringExtra(getString(R.string.def_body_text))
        imgName = intent.getStringExtra(getString(R.string.def_img_text))

        if(learnKind==LearnKind.Definitions){
            val fragment = DefFragment.newInstance(defBody,imgName)
            val ft = supportFragmentManager.beginTransaction()
            ft.replace(R.id.SingleDefActivityFrameLayout,fragment)
            ft.commit()
        }


    }

    override fun onBackPressed() {
        startActivity(Intent(this,DefListActivity::class.java).apply {
            putExtra(getString(R.string.on_choose_learn_kind_text),learnKind.toString())
            putExtra(getString(R.string.on_choose_learn_subject_text),subjectName)
        })
        finish()
    }

}
