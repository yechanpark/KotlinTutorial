package DesignPatterns.creational.factorymethod.factory

import DesignPatterns.creational.factorymethod.production.*

class ProductionFactory {
    // companion object : 자바의 static method처럼 사용 가능
    companion object {
        // Default Value 설정 가능
        // 파라미터1을 파라미터2의 기본값으로 사용 가능
        fun create(
            type: ProductionType = ProductionType.DEFAULT,
            name: String = type.getDefaultProductionName()
        ): Production {
            // 1. if ... else
            // 2. switch
            // 3. when
            // Enum, String, Integer, Type (is)
            return when(type) {
                ProductionType.BLUE -> BlueProduction(name)
                ProductionType.RED  -> RedProduction(name)
                else                -> DefaultProduction(name)
            }
        }
    }
}