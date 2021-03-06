package DesignPatterns.creational.factorymethod.production

/**
 * data : class에 붙인 경우 data class로 인식.
 *
 * */
data class BlueProduction constructor(
    private val name: String
): Production {
    override fun consume() {
        println(this.name)
    }
}