package DesignPatterns.behavioral.templatemethod

import DesignPatterns.behavioral.templatemethod.concrete.ConcreteClass1
import DesignPatterns.behavioral.templatemethod.concrete.ConcreteClass2

// Entry Point
fun main() {
    val abstract1 = ConcreteClass1()
    abstract1.templateMethod()

    val abstract2 = ConcreteClass2()
    abstract2.templateMethod()
}