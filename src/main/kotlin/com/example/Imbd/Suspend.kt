package com.example.Imbd

import kotlinx.coroutines.*

fun main() = runBlocking{
    val s=launch {
        val call1= async {  call1() }
        val sss=call1.await()

        val call2= call2()
        println("hello ${call1.await()} and $call2")
    }

}
suspend fun call1():Int{

        delay(2000)
        println("this is call1")
    return 11
}
suspend fun call2():Int{
    delay(2000)
    println("this is call2")
    return 43
}
