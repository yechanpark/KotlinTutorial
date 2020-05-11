package DesignPatterns.behavioral.templatemethod.abstract

// abstract : 추상 클래스 혹은 추상 메서드를 정의할 때 사용.
//            abstract/interface의 경우 애초에 상속 또는 구현을 목적으로 하므로, open을 붙이지 않아도 동일한 효과를 봄
//            abstract class 또는 interface에 open 키워드를 붙이는 경우 "Modifier 'open' is redundant because 'abstract' is present" Warning 발생
// Abstract Class
abstract class AbstractClass {
    // Template Method
    fun templateMethod() {
        println(this.javaClass.simpleName + "# " + this::templateMethod.name + "() Start")
        println(this.primitiveMethod())
        println(this.javaClass.simpleName + "# " + this::templateMethod.name + "() End")
    }

    // Primitive Method
    protected abstract fun primitiveMethod(): String
}