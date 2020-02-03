package pl.learn.anything.presenter

import pl.learn.anything.enums.LearnKind
import pl.learn.anything.model.ILearnKind

interface ILearnKindPresenter {
    fun onSelect(iLearnKind:ILearnKind)
}