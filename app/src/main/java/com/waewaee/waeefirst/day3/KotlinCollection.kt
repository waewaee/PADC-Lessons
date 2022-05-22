package com.waewaee.waeefirst.day3

val list1 = listOf(1, 2, 3)
val list2 = mutableListOf(1, 2, 3)

val map1 = mapOf(1 to "a", 2 to "b", 3 to "c")
val map2 = mutableMapOf("a" to "Apple", "b" to "Banana")

val set1 = setOf("a", "a", "b")
val set2 = mutableSetOf("a", "a", "b", "c")

fun main() {
    list2.add(4)

    map2["c"] = "Coconut"
    map2.put("c", "Cow")
}