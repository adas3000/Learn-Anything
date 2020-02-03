package pl.learn.anything.factory

import pl.learn.anything.enums.LearnKind
import pl.learn.anything.model.Subject

class DefListFactory {

    fun createDefList(learnKind: LearnKind,subject:Subject):List<String>{

        if(learnKind==LearnKind.Tasks)
            return subject.getTasksList()
        else if(learnKind==LearnKind.Definitions)
            return subject.getDefsList()
        else throw NoClassDefFoundError("learnkind not founded")
    }


}