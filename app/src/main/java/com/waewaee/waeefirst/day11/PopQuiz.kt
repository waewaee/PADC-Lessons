package com.waewaee.waeefirst.day11

fun main() {
    makeDummyNetworkCall(
        input = 1,
        onSuccess = { message ->
            println(message)
        },
        onFailure = { message ->
            println(message)
        }
    )
}

fun makeDummyNetworkCall(
    input: Int,
    onSuccess: (String) -> Unit,
    onFailure: (String) -> Unit
) {
    Thread.sleep(2000L)
    when(input) {
        0 -> onFailure("Did not succeed")
        else -> onSuccess("Success")
    }
}