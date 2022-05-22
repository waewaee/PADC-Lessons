package com.waewaee.waeefirst.day3

open class Person(name: String) {

//    var name:String = "Mg Mg"
//    set(value) {
//        if(value.isNotEmpty()) {
//            field = value
//        }
//    }

    init {
        val name = name
    }

    constructor(): this(name = "")

    open fun eat() {}

    fun sleep() {}

    fun work() {}

    companion object {

        val email: String? = null
        fun getPersonInfo() {
            //1
            if(email != null) {
                // null safe
            }

            //2
            email?.let {
                // null safe
            }

            //3
            val data = email ?: ""
        }
    }
}