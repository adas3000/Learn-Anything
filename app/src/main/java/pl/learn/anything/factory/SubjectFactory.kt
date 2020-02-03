package pl.learn.anything.factory

import android.content.res.Resources
import pl.learn.anything.model.Electronic
import pl.learn.anything.model.Physics
import pl.learn.anything.model.Subject


class SubjectFactory {

    private val resources: Resources

    constructor(resources: Resources) {
        this.resources = resources
    }

    fun createSubject(subject:String):Subject{

        if(subject.equals("electronic")){
            return Electronic(resources)
        }
        else
            return Physics(resources)

    }

}