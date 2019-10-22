package com.vappz.src.thirdweek

data class Employee(val city: String, val age: Int)

fun workingWithCollections() {
    val juan = Employee("Prague", 40)
    val pedro = Employee("Prague", 20)
    val luis = Employee("Paris", 60)
    val employees: List<Employee> = listOf(juan, pedro, luis)
    val averageInPrague = employees.filter { it.city == "Prague" }
        .map { it.age }
        .average()
    println(averageInPrague)
}

fun lambdaSyntaxies() {
    val list = listOf(-1, 2)
    // full syntax
    //val isAnyPositiveNumber = list.any({ i: Int -> i > 0 })
    // alternative syntax
    //val isAnyPositiveNumber = list.any() { i: Int -> i > 0 }
    // light syntax
    val isAnyPositiveNumber = list.any { i: Int -> i > 0 }
}

fun equivalentArguments(){
    val list = listOf(-1, 2)
    list.any { i -> i > 0 }
    list.any { it > 0 }
}

fun multiLine(){
    val list = listOf(-1, 2)
    list.any{
        println("processing $it")
        it > 0
    }
}

fun workingWithMaps(){
    val map = mapOf(1 to "X", 2 to "Y")
    println(map.mapValues { (key, value) -> "$key -> $value" })
    println(map.mapValues { (_, value) -> "just the value -> $value" })
}
fun main() {
    workingWithMaps()
}