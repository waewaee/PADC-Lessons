package com.waewaee.waeefirst.day11

import kotlinx.coroutines.*

//fun main() {
//
//    GlobalScope.launch { // launch a new coroutine in background and continue
//        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
//        println("World!") // print after delay
//    }
//
//    println("Hello,") // main thread continues while coroutine is delayed
//    Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
//}

//fun main() {
//
//    GlobalScope.launch { // launch a new coroutine in background and continue
//        delay(1000L)
//        println("World!")
//    }
//
//    println("Hello,") // main thread continues here immediately
//    runBlocking { // but this expression blocks the main thread
//        delay(5000L) // ...while we delay for 2 seconds to keep JVM alive
//    }
//    println("over")
//}

//fun doJob() = runBlocking { // start main coroutine
//    GlobalScope.launch { // launch a new coroutine in background and continue
//        delay(1000L)
//        println("World!")
//    }
//
//    println("Hello,") // main thread continues here immediately
//    delay(2000L) // delaying for 2 seconds to keep JVM alive
//}
//
//fun main() {
//    doJob()
//}

//// Suspend function
//fun main() = runBlocking {
//    GlobalScope.launch {
//        doWorld()
//    }
//    println("Hello,")
//}
//
//// This is your first suspending function
//suspend fun doWorld() {
//    delay(1000L)
//    println("World!")
//}

//fun main() = runBlocking {
//    val job = GlobalScope.launch { // launch a new coroutine and keep a reference to its job
//        delay(1000L)
//        println("World!")
//    }
//    println("Hello,")
//    job.join() // wait until child coroutine completes
//}

fun main() = runBlocking { // this: CoroutineScope

    launch {
        delay(200L)
        println("Task from runBlocking")
    }

    coroutineScope { // Creates a coroutine scope
        launch {
            delay(500L)
            println("Task from nested launch")
        }

        delay(100L)
        println("Task from coroutine scope") // This line will be printed before the nested launch
    }

    println("Coroutine scope is over") // This line will not be printed until the nested launch completes
}