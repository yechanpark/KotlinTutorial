package DesignPatterns.behavioral.observer.observer

import DesignPatterns.behavioral.observer.subject.ConcreteSubject

open class ConcreteObserver4(
    private val concreteSubject: ConcreteSubject
) : Observer {

    override fun update() {
        showNumbers(concreteSubject.getNumbers())
        println("--------------------------------------")
    }

    private fun showNumbers(numberList: List<Int>) {
        print("LIST :  ")
        for (number in numberList) print("$number ")
        println()
    }

}