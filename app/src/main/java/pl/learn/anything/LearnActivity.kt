package pl.learn.anything

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pl.learn.anything.enums.LearnKind
import pl.learn.anything.factory.SubjectFactory
import pl.learn.anything.model.Subject

class LearnActivity : AppCompatActivity() {

    private lateinit var learnKind: LearnKind
    private lateinit var subjectName:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn)

        learnKind = LearnKind.valueOf(intent.getStringExtra(getString(R.string.on_choose_learn_kind_text)))
        subjectName = intent.getStringExtra(getString(R.string.on_choose_learn_subject_text))

        val subject :Subject= SubjectFactory(resources).createSubject(subjectName)

    }
}
