package pl.learn.anything.factory

import android.content.res.Resources
import pl.learn.anything.R
import pl.learn.anything.model.Electronic
import pl.learn.anything.model.Physics
import pl.learn.anything.model.Subject


class SubjectFactory {

    private val resources: Resources
    private val subjects:List<String>

    constructor(resources: Resources) {
        this.resources = resources
        this.subjects = resources.getStringArray(R.array.subjects_array_pl).toList()
    }

    fun createSubject(subject:String):Subject{

        if(subject == subjects[0]){
            return Physics(resources)
        }
        else if(subject == subjects[1]){
            return Electronic(resources)
        }
        else throw NoClassDefFoundError("no_such_class")
    }

}