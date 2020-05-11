package DesignPatterns.behavioral.observer

import DesignPatterns.behavioral.observer.observer.ConcreteObserver1
import DesignPatterns.behavioral.observer.observer.ConcreteObserver2
import DesignPatterns.behavioral.observer.observer.ConcreteObserver3
import DesignPatterns.behavioral.observer.observer.Observer
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
    subject.addNumber(1)

    subject.detach(observer1)
    subject.addNumber(2)
}