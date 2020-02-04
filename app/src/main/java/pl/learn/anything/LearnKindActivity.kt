package pl.learn.anything

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_learn_kind.*
import pl.learn.anything.enums.LearnKind
import pl.learn.anything.model.LearnByDefs
import pl.learn.anything.model.LearnByTasks
import pl.learn.anything.presenter.ILearnKindPresenter
import pl.learn.anything.presenter.LearnKindPresenter
import pl.learn.anything.view.ILearnKindView


class LearnKindActivity : AppCompatActivity() , ILearnKindView {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_kind)


        val presenter:ILearnKindPresenter = LearnKindPresenter(this)

        textViewDefs.setOnClickListener {
            presenter.onSelect(LearnByDefs())
        }
        textViewTasks.setOnClickListener {
            presenter.onSelect(LearnByTasks())
        }

    }

    override fun onChoose(learnKind: LearnKind) {

        startActivity(Intent(this,SubjectListActivity::class.java).apply {
            putExtra(getString(R.string.on_choose_learn_kind_text),learnKind.toString())
        })
        finish()

    }

}
