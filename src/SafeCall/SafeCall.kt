package SafeCall

import SafeCall.clazz.A
import SafeCall.clazz.B
import SafeCall.clazz.C
import SafeCall.clazz.D

fun main() {
    println(safeCall(null))
    println("----------------------------")

    val a = A(1)
    val b = B()
    val c = C()
    a.b = b
    b.c = c
    println(safeCall(a))
    println("----------------------------")


    val d = D("D name")
    c.d = d
    println(safeCall(a))
    println("----------------------------")

    c.d = null
    // KNPE1(a)
    KNPE2(a)
}

private fun safeCall(a: A?): String? {
    /* 아래와 같이 코드를 작성할 필요 없음
        if (a == null) {return;}

        B b = a.getB()
        if (b == null) {return;}

        C c = b.getC()
        if (c == null) {return;}

        D d = c.getD()
        d.method()
    */
    // null이 아니라면 다음 변수를 참조할 수 있도록 체이닝
    // 중간에 null이 나오는 경우 method chain call을 멈추고 null을 리턴
    // 단점 : 어디서 null이 발생했는지 알 수 없음
    return a?.b?.c?.d?.name
}

fun KNPE1(a: A?) {
    // KNPE를 간단하게 발생시키는 경우
    println(a!!.b!!.c!!.d!!.name)
}

fun KNPE2(a: A?) {
    // ?: : Elvis연산자. 조건절이 null인 경우 ?: 뒤의 문장을 실행
    println(a?.b?.c?.d?.name ?: "elvis operator with null")

    // KNPE 또는 그 외 Exception을 지정하여 발생시키는 경우
    println(a?.b?.c?.d?.name ?: throw KotlinNullPointerException("KNPE2"))

}