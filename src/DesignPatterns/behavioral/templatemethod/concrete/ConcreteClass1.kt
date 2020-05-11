package DesignPatterns.behavioral.templatemethod.concrete

import DesignPatterns.behavioral.templatemethod.abstract.AbstractClass

class ConcreteClass1: AbstractClass() {
    override fun primitiveMethod(): String {
        return this.javaClass.simpleName
    }

}