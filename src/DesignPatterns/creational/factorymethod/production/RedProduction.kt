package DesignPatterns.creational.factorymethod.production

data class RedProduction constructor(
    // data class : private field가 아닌 경우 getter, setter를 만들어 줌
    var name: String,
    private val onlyRedProperty: String = "Default Property"
): Production {
    override fun consume() {
        println(this.name)
        println(this.onlyRedProperty)
    }
}