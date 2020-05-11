package DesignPatterns.behavioral.observer.observer

import DesignPatterns.behavioral.observer.subject.ConcreteSubject
import java.util.*

// MinMax
class ConcreteObserver1(
    private val concreteSubject: ConcreteSubject
) : Observer {

    override fun update() {
        showMinMAx(concreteSubject.getNumbers())
        println("--------------------------------------")
    }

    private fun showMinMAx(numberList: List<Int>) {
        println("min : " + Collections.min(numberList))
        println("max : " + Collections.max(numberList))
    }

}