package DesignPatterns.behavioral.observer.observer

import DesignPatterns.behavioral.observer.subject.ConcreteSubject

// ASC
class ConcreteObserver2(
    private val concreteSubject: ConcreteSubject
) : Observer {

    override fun update() {
        showAsc(concreteSubject.getNumbers())
        println("--------------------------------------")
    }

    private fun showAsc(numberList: List<Int>) {
        print("ASC :  ")
        for (number in numberList.sorted()) print("$number ")
        println()
    }

}