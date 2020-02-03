package pl.learn.anything.view

import pl.learn.anything.enums.LearnKind

interface ILearnKindView {

    fun onChoose(learnKind: LearnKind)

}