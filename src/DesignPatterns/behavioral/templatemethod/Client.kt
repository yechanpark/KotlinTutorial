package DesignPatterns.behavioral.templatemethod

import DesignPatterns.behavioral.templatemethod.abstract.AbstractClass
import DesignPatterns.behavioral.templatemethod.concrete.ConcreteClass1
import DesignPatterns.behavioral.templatemethod.concrete.ConcreteClass2

// Entry Point
fun main() {
    val abstractList: List<AbstractClass>
            = listOf(ConcreteClass1(), ConcreteClass2())

    for (abstract in abstractList) {
        abstract.templateMethod()
    }
}