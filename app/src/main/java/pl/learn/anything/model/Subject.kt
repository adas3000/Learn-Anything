package pl.learn.anything.model

import android.content.res.Resources
import pl.learn.anything.R

interface Subject {

    fun getDefsList():List<String>
    fun getDefsBodyItem():List<String>
    fun getTasksBody():List<String>
    fun getTasksList():List<String>
    fun getImgDefsList():List<String>
//    fun getImgTasksList():List<String>
}

class Electronic : Subject{

    private val resources:Resources

    constructor(resources: Resources) {
        this.resources = resources
    }

    override fun getDefsBodyItem(): List<String> {
        return resources.getStringArray(R.array.electronic_defs).toList()
    }

    override fun getTasksBody(): List<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDefsList(): List<String> {
        return resources.getStringArray(R.array.electronic_defs_name).toList()
    }

    override fun getImgDefsList(): List<String> {
        return resources.getStringArray(R.array.electronic_defs_pics).toList()
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

    override fun getDefsBodyItem(): List<String> {
        return resources.getStringArray(R.array.physics_defs).toList()
    }

    override fun getTasksBody(): List<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDefsList(): List<String> {
        return resources.getStringArray(R.array.physics_defs_name).toList()
    }

    override fun getTasksList(): List<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getImgDefsList(): List<String> {
        return resources.getStringArray(R.array.physics_defs_pics).toList()
    }

}