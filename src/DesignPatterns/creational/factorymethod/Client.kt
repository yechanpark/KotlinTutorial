package DesignPatterns.creational.factorymethod

import DesignPatterns.creational.factorymethod.factory.ProductionFactory
import DesignPatterns.creational.factorymethod.production.Production
import DesignPatterns.creational.factorymethod.production.ProductionType

fun main() {
    val redProduction: Production = ProductionFactory.create(ProductionType.RED)
    val blueProduction: Production = ProductionFactory.create(ProductionType.BLUE, "Blue Production")

    println(redProduction)
    println(blueProduction)
}