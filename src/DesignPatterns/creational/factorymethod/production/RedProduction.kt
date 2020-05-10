package DesignPatterns.creational.factorymethod.production

data class RedProduction constructor(
    private val name: String,
    private val onlyRedProperty: String = "Default Property"
): Production {
    override fun consume() {
        println(this.name)
        println(this.onlyRedProperty)
    }
}