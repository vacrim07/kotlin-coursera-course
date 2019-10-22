package com.vappz.src.thirdweek

fun main() {
    // Variable as lambda
    val sum = { x: Int, y: Int -> x + y }
    val isEven = { i: Int -> i % 2 == 0 }

    val list = listOf(1,2,3,4)

    // lambda variable as a function argument
    println(list.any(isEven))
    println(list.filter(isEven))

    // calling directly a lambda
    run{ println("calling directly a lambda")}
}