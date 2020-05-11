package DesignPatterns.creational.factorymethod

import DesignPatterns.creational.factorymethod.factory.ProductionFactory
import DesignPatterns.creational.factorymethod.production.Production
import DesignPatterns.creational.factorymethod.production.ProductionType
import DesignPatterns.creational.factorymethod.production.RedProduction

// Entry Point
fun main() {
    // val : 불변 - 할당된 객체 또는 변수값 자체를 변경하는 것은 불가능
    //              Compile Error : Val cannot be reassigned
    //              redProduction = ProductionFactory.create(ProductionType.RED)
    // ProductionFactory.Companion.create()의 축약형
    val redProduction: Production = ProductionFactory.create(ProductionType.RED)
    println(redProduction)

    // is : 타입 체크
    if (redProduction is RedProduction) {
        println("redProduction is " + redProduction.javaClass.simpleName)
    }

    // as : 캐스팅
    // 할당된 val 객체 내의 프로퍼티는 수정 가능 (단, 프로퍼티는 var여야 함)
    (redProduction as RedProduction).name = "Updated Red Production Name"
    println(redProduction)

    // 파라미터 이름을 지정하여 순서를 바꾸어 넣을 수 있음
    // 타입추론 : Production.create()의 반환 타입을 통해 blueProduction의 타입을 추론
    var blueProduction = ProductionFactory.create(name = "Blue Production", type = ProductionType.BLUE)
    println(blueProduction)

    // var : 가변
    blueProduction = ProductionFactory.create(ProductionType.RED, "New Red Production")
    println(blueProduction)

    val defaultProduction = ProductionFactory.create()
    println(defaultProduction)

    println("--------Iteration--------")
    // Iteration
    val productionList: List<Production>
            = listOf(redProduction, blueProduction, defaultProduction)
    val numbersIterator = productionList.iterator()
    while (numbersIterator.hasNext()) {
        val production = numbersIterator.next()
        production.consume()
    }
}