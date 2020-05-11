package DesignPatterns.behavioral.observer

import DesignPatterns.behavioral.observer.observer.*
import DesignPatterns.behavioral.observer.subject.ConcreteSubject

// Entry Point
fun main() {
    val subject = ConcreteSubject()
    val observer1: Observer = ConcreteObserver1(subject)
    val observer2: Observer = ConcreteObserver2(subject)
    val observer3: Observer = ConcreteObserver3(subject)

    subject.attach(observer1)
    subject.attach(observer2)
    subject.attach(observer3)

    // object expression : Anonymous Class - 클래스의 경우 open이어야 함
    val observer4 = object: ConcreteObserver4(subject) {
        override fun update() {
            println("updated")
        }

    }

    subject.attach(observer4)
    subject.addNumber(1)

    subject.detach(observer1)
    subject.addNumber(2)
}