package DesignPatterns.creational.factorymethod.production


data class DefaultProduction constructor(
    private val name: String
): Production {
    override fun consume() {
        println(this.name)
    }
}