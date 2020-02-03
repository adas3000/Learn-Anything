package pl.learn.anything.presenter

import pl.learn.anything.model.ILearnKind
import pl.learn.anything.view.ILearnKindView

class LearnKindPresenter : ILearnKindPresenter {

    val view:ILearnKindView

    constructor(view: ILearnKindView) {
        this.view = view
    }


    override fun onSelect(iLearnKind: ILearnKind) {
        iLearnKind.doLearn(view)
    }
}