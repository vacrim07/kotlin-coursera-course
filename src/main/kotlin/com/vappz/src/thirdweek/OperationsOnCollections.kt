package com.vappz.src.thirdweek

private val primaryList: List<Int> = mutableListOf(1, 2, 3, 4)
private val secondaryList: List<Char> = mutableListOf('a', 'b', 'c', 'd', 'e')
private val paris = Employee("Paris", 30)
private val prague = Employee("Prague", 30)
private val pekin = Employee("Pekin", 40)
private val employeesOnCities = mutableListOf(paris, prague, pekin)

fun useOfFilter() {
    println(primaryList.filter { it % 2 == 0 })
}

fun useOfMap() {
    println(primaryList.map { it * it })
}

fun useOfAny() {
    println(primaryList.any { it % 2 == 0 })
}

fun useOfAll() {
    println(primaryList.all { it < 5 })
}

fun useOfNone() {
    println(primaryList.none { it > 4 })
}

fun useOfFind() {
    println(primaryList.find { it == 4 })
}

fun useOfFirstOrNull() {
    println(primaryList.firstOrNull { it == 3 })
}

fun useOfFirst() {
    println(primaryList.first { it == 5 })
}

fun useOfCount() {
    println(primaryList.count { it % 2 == 0 })
}

fun useOfPartition() {
    println(primaryList.partition { it % 2 == 0 })
}

fun useOfGroupBy() {
    println(employeesOnCities.groupBy { it.age })
}

fun useOfAssociateBy() {
    println(employeesOnCities.associateBy { it.age })
}

fun useOfAssociate() {
    println(primaryList.associate { 'a' + it to 10 * it })
}

fun useOfZip(){
    println(primaryList.zip(secondaryList))
}

fun useOfZipWithNext(){
    println(primaryList.zipWithNext())
}

fun useOfFlatMap(){
    println(primaryList.flatMap { secondaryList })
}

fun main() {
    //useOfFilter()
    //useOfMap()
    //useOfAny()
    //useOfAll()
    //useOfNone()
    //useOfFind()
    //useOfFirstOrNull()
    //useOfFirst()
    //useOfCount()
    //useOfPartition()
    //useOfGroupBy()
    //useOfAssociateBy()
    //useOfAssociate()
    //useOfZip()
    //useOfZipWithNext()
    useOfFlatMap()
}