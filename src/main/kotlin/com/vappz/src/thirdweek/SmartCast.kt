package com.vappz.src.thirdweek

fun typeCast(){
    val any = "Hello Kotlin"
    val anyNumber = 1
    println((any as String).toUpperCase())
    println((anyNumber as String).toUpperCase())
}

fun smartCast(){
    val any = "Hello Kotlin"
    val anyNumber = 1
    println((any as? String)?.toUpperCase())
    println((anyNumber as? String)?.toUpperCase())
}

fun main(){
    // Throws an exception when fails
    typeCast()
    // Returns null when fails
    smartCast()
}