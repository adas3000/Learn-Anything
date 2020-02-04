package pl.learn.anything.factory

import pl.learn.anything.enums.LearnKind
import pl.learn.anything.model.Subject

class DefBodyListFactory {


    fun createBodyList(learnKind: LearnKind,subject: Subject):List<String>{

        if(learnKind==LearnKind.Definitions)
            return subject.getDefsBodyItem()
        else if(learnKind==LearnKind.Tasks)
            return subject.getTasksBody()
        else throw NoClassDefFoundError("no_such_learnkind")
    }


}