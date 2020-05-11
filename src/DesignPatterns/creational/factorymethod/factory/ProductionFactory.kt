package DesignPatterns.creational.factorymethod.factory

import DesignPatterns.creational.factorymethod.production.*

class ProductionFactory {
    /* companion object : 자바의 static 처럼 사용 가능 (단, static의 대체는 아니므로, 자바의 static이라는 것은 아님)
     *                    companion object는 객체임
     *                    companion object는 클래스 당 하나만 가능 (별칭을 부여하더라도)
     *
     *                    companion object MyCompanion { ... }와 같이 이름 설정 가능
     *                    ProductionFactory.MyCopmpanion.method()와 같이 접근
     */
    companion object {
        // Default Value 설정 가능
        // 특정 파라미터(type)를 다른 파라미터(name)의 기본 값으로 사용 가능
        fun create(
            type: ProductionType = ProductionType.DEFAULT,
            name: String = type.productionName
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