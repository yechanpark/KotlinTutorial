package DesignPatterns.behavioral.observer.subject

class ConcreteSubject: Subject() {
    /* Read-only          | Mutable
     * ==========================================================
     * listOf(): List<T>  | mutableListOf(): MutableList<T>
     *                    | arrayListOf():   ArrayList<T>
     * setOf(): Set<T>    | mutableSetOf():  MutableSet<T>
     *                    | hashSetOf():     HashSet<T>
     *                    | linkedSetOf():   LinkedHashSet<T>
     *                    | sortedSetOf():   TreeSet<T>
     * mapOf(): Map<K, V> | mutableMapOf():  MutableMap<K, V>
     *                    | hashMapOf():     HashMap<K, V>
     *                    | linkedMapOf():   LinkedHashMap<K, V>
     *                    | sortedMapOf():   SortedMap<K, V>
     */
    private val numbers: MutableList<Int> = mutableListOf()
    /*
     * init을 사용하는 경우 val이 아닌 var을 사용해야 함 (초기에는 null이지만 새로운 객체를 할당하므로)
     * private var numbers: MutableList<Int>? = null
     *
     * init {
     *     numbers = mutableListOf()
     * }
     * */

    fun addNumber(number: Int) {
        numbers.add(number)
        notifyObservers()
    }

    fun getNumbers(): List<Int> {
        return numbers
    }
}