package com.waewaee.waeefirst.day3

fun main() {
    val age = 15

    when (age) {
        in 0..15->print("Under 16")
        in 16..30->print("Under 30")
        else->print("Under 60")
    }
    println()

    val numbers = listOf(10, 20, 30, 40 ,50)

    for (i in numbers) {
        print("$i ")
    }
    println()

    for (i in numbers.indices) {
        print("$i ")
    }
    println()

    for ((index, value ) in numbers.withIndex()) {
        print("$index, $value \n")
    }
    println()

    for (i in 0..5) {
        print("$i ")
    }
    println()

    for (i in 0..10 step 2) {
        print("$i ")
    }
    println()

    for (i in 10 downTo 5) {
        print("$i ")
    }
    println()


}