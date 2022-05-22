package com.waewaee.waeefirst.day3

class ITMan(val name: String) : Person(name = name) {
    fun doSomething() {
        super.eat()
    }

    override fun eat() {
        super.eat()
    }
}