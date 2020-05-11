package DesignPatterns.behavioral.observer.subject

import DesignPatterns.behavioral.observer.observer.Observer

/* open : 추상 클래스가 아닌 일반 클래스를 상속할 때 사용
 *        Kotlin에서는 일반 클래스의 지정자는 final이므로 상속 불가.
 *        이를 open을 사용해 상속이 가능하도록 함
 */
open class Subject {
    private val observers: MutableList<Observer> = ArrayList()

    open fun attach(observer: Observer) {
        observers.add(observer)
    }

    open fun detach(observer: Observer) {
        observers.remove(observer)
    }

    open fun notifyObservers() {
        for (observer in observers) observer.update()
    }
}