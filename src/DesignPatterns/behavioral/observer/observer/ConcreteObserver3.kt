package DesignPatterns.behavioral.observer.observer

import DesignPatterns.behavioral.observer.subject.ConcreteSubject

// DESC
class ConcreteObserver3(
    private val concreteSubject: ConcreteSubject
) : Observer {

    override fun update() {
        showDesc(concreteSubject.getNumbers())
        println("--------------------------------------")
    }

    private fun showDesc(numberList: List<Int>) {
        print("DESC :  ")
        for (number in numberList.reversed()) print("$number ")
        println()
    }

}