package com.waewaee.waeefirst.day11

val list = listOf(1, 2, 3, 4, 5)

var calculate: (Int, Int, Char) -> Int = {num1, num2, operator -> 0}

// Higher Order Function
fun numberListCalculator(list: List<Int>, operator: Char, calculate: (Int, Int, Char) -> Int): Int {

    var initialValue = 0
    for (num in list) {
        initialValue = calculate(initialValue, num, operator)
    }
    return initialValue
}

fun main() {

    //First Way
//    val result = numberListCalculator(
//        list = list,
//        operator = '+',
//        calculate = { num1,num2, operator ->
//
//        when (operator) {
//            '+' -> num1 + num2
//            '-' -> num1 - num2
//            '*' -> num1 * num2
//            '/' -> num1 / num2
//            else -> 0
//        }
//
//    })

    val result = numberListCalculator(
        list = list,
        operator = '+'
    ) { num1,num2, operator ->

        when (operator) {
            '+' -> num1 + num2
            '-' -> num1 - num2
            '*' -> num1 * num2
            '/' -> num1 / num2
            else -> 0
        }

    }

    print("Result is $result")

    "aa".let {
        print(it)
    }

    // Second Way
//    calculate = { num1, num2, operator ->
//        when (operator) {
//            '+' -> num1 + num2
//            '-' -> num1 - num2
//            '*' -> num1 * num2
//            '/' -> num1 / num2
//            else -> 0
//        }
//    }
//
//    val result = numberListCalculator(
//        list = list,
//        operator = '+',
//        calculate = calculate )
//
//    print("Result is $result")
}