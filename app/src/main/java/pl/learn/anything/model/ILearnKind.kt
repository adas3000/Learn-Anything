package pl.learn.anything.model

import pl.learn.anything.enums.LearnKind
import pl.learn.anything.view.ILearnKindView

interface ILearnKind {
    fun learnKind():LearnKind
    fun doLearn(view:ILearnKindView)
}


class LearnByTasks : ILearnKind{
    override fun learnKind(): LearnKind {
        return LearnKind.Tasks
    }

    override fun doLearn(view: ILearnKindView) {
        view.onChoose(learnKind())
    }
}

class LearnByDefs : ILearnKind{
    override fun learnKind(): LearnKind {
        return LearnKind.Definitions
    }

    override fun doLearn(view: ILearnKindView) {
        view.onChoose(learnKind())
    }
}