package pl.learn.anything.model

import android.content.res.Resources
import pl.learn.anything.R

interface Subject {

    fun getDefsList():List<String>
    fun getTasksList():List<String>

}

class Electronic : Subject{

    private val resources:Resources

    constructor(resources: Resources) {
        this.resources = resources
    }

    override fun getDefsList(): List<String> {
        return resources.getStringArray(R.array.electronic_defs_name_pl).toList()
    }

    override fun getTasksList(): List<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class Physics : Subject{

    private val resources:Resources

    constructor(resources: Resources) {
        this.resources = resources
    }

    override fun getDefsList(): List<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTasksList(): List<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}