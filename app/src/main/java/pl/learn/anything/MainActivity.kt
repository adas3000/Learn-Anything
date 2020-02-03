package pl.learn.anything

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pl.learn.anything.view.ILearnKindView

class MainActivity : AppCompatActivity() , ILearnKindView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onDefs() {

    }

    override fun onTasks() {
        
    }

}
