package DesignPatterns.creational.factorymethod.factory

import DesignPatterns.creational.factorymethod.production.ProductionType
import DesignPatterns.creational.factorymethod.production.BlueProduction
import DesignPatterns.creational.factorymethod.production.Production
import DesignPatterns.creational.factorymethod.production.RedProduction

class ProductionFactory {
    companion object {
        fun create(type: ProductionType, name:String = "Default Production Name"): Production {
            return when(type) {
                ProductionType.BLUE -> BlueProduction(name = name)
                ProductionType.RED  -> RedProduction(name = name)
            }
        }
    }
}