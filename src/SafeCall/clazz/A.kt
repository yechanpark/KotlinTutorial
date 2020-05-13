package SafeCall.clazz

// data class인 경우 반드시 생성자가 있어야 하며, 최소 1개의 필드를 받아야 함
data class A (
    private val i : Int
){
    // B? : nullable field로 선언
    var b: B? = null
        // data class가 아닌 경우 getter를 아래와 만들어야 함.
        // data class인 경우에도 선언하여 커스터마이징 가능 (setter 동일)
        // data class인 경우 a.b 와 같이 접근하더라도, 내부적으로 getter를 사용하게 됨
        // getter() : visibility는 field와 동일해야 함
        /* public */ get() {
            println(this.javaClass.simpleName + "# get()")
            // field는 b를 의미
            return field
        }

    protected var b2: B? = null
        // setter() : visibility는 field보다 좁아야 함
        // 아래의 경우 private, protected 가능
        private set(value) {field = value}
}