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

// Testing named parameters
/*
fun main(){
    println(listOf('a','b','c')
        .joinToString(
            postfix = ")",
            prefix = "(",
            separator = ""

        ))
}*/

// Testing function setOf(), switch the colors order!
/*
fun main() {
    val colorOne = Color.RED
    val colorTwo = Color.ORANGE
    when (setOf(colorOne, colorTwo)) {
        setOf(Color.BLUE, Color.RED) -> println("Violet")
        setOf(Color.ORANGE, Color.BLUE) -> println("Opposite colors")
        else -> throw Exception("Mix not defined")
    }
}*/

// Testing smart cast, switch the return value of getFavouritePet()
/*
fun main(){
    when (val pet = Pet().getFavouritePet()) {
        is Cat -> pet.meow()
        is Dog -> pet.woof()
        else -> throw Exception("Pet not defined")
    }
}*/

// Testing iteration over a map
/*
fun main(){
    val map = mapOf(
        1 to "one",
        2 to "two",
        3 to "three"
    )
    for ((key, value) in map){
        println("$key = $value")
    }
}*/

// Testing for loop
/*fun main(){
    for (i in 9 downTo 2 step 3){
        println(i)
    }
}*/

// Testing ranges
fun main(){
    fun isLetter(c: Char) = c in 'a'..'z' || ('A' <= c && c <= 'Z')
    println(isLetter('3'))
    fun isNotDigit(c: Char) = c !in '0'..'9'
    println(isNotDigit('*'))
    fun isInTheRange(s: String) = s in "Java".."Scala"
    println(isInTheRange("kotlin"))
    println("_Kotlin".take(1) == "_")
}
