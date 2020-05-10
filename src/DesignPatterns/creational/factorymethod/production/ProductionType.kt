package DesignPatterns.creational.factorymethod.production

enum class ProductionType(private val defaultProductionName: String) {
    RED("Red Default Production Name"),
    BLUE("Blue Default Production Name"),
    DEFAULT("Default Production Name");

    fun getDefaultProductionName(): String {
        return this.defaultProductionName
    }
}