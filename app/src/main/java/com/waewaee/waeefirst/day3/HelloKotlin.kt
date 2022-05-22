package com.waewaee.waeefirst.day3

lateinit var value3: String

fun main(args: Array<String>) {
    println("Hello Kotlin")

    val value = "Read Only"
//    value = "Write"

    var value2 = "Read and Write"
    value2 = "Assign"

    var data1 = 0.1
    var data2 = 1

    value3 = "Assign Me"
    println(value3)

    data1 = data2.toDouble()
    data2 = data1.toInt()

    Person.getPersonInfo()

    var person = Person("Aung")
//    person.name = ""
}