package com.vappz.src.secondweek

// To use Weather.kt
/*fun main() {
    val person = Person("Alice", 27)
    println(person.name)
    val updatedWeather = updateWeather(12)
}*/

// Difference from mutable and inmutable objects
/*fun main(args:Array<String>){
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")
    name.replace("K","J")
    println("Hello, $name!")

    val list = mutableListOf("Java")
    println(list)
    list.add("Kotlin")
    println(list)
    list.removeAt(0)
    println(list)
}*/

fun main(){
    println(listOf('a','b','c')
        .joinToString(
            postfix = ")",
            prefix = "(",
            separator = ""

        ))
}