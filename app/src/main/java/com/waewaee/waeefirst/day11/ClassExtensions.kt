package com.waewaee.waeefirst.day11

class Developer(val name: String) {
    companion object {
        val address: String = "Yangon"
    }
}

fun main() {
    println("Palindrome => ${"1001".isPalinDrome()}")
    println(Developer("Aung Aung").getFirstName())
    println(Developer("Aung Aung").defaultPosition)
    println(Developer.getAddress())
}

fun String.isPalinDrome(): Boolean {

    var reverse = ""
    for (i in this.length-1 downTo 0) {
        reverse += this[i]
    }

    if (reverse == this) return true
    return false
}

fun Developer.getFirstName(): String {
    return name.split(" ").first()
}

val Developer.defaultPosition : String
    get() = "Mobile Developer"

fun Developer.Companion.getAddress(): String {
//    return this.getAddress()
    return "I am from $address"
}
