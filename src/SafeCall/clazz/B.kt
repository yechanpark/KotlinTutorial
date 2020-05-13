package SafeCall.clazz

class B {
    var c: C? = null
    get() {
        println(this.javaClass.simpleName + "# get()")
        return field
    }
}