package com.vappz.src.secondweek

class Main {
    fun main() {
        val person = Person("Alice", 27)
        println(person.name)
        val updatedWeather = updateWeather(12)
        val (a,b) = Pair("a",1)
        println(a)
        val (c,d) = "a" to 1
        println(c)
    }
}