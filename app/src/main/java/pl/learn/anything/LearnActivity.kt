package pl.learn.anything

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LearnActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn)
    }

    override fun onBackPressed() {
        startActivity(Intent(this,DefListActivity::class.java).apply {

        })
        finish()
    }

}
