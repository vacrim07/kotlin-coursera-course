package com.vappz.src.secondweek

// Java style
/*
fun updateWeather(degrees: Int) {
    val description: String
    val color: Color
    if (degrees < 10){
        description = "cold"
        color = Color.BLUE
    } else if (degrees < 25){
        description = "mild"
        color = Color.ORANGE
    } else {
        description = "hot"
        color = Color.RED
    }
}*/

// Kotlin style
fun updateWeather(degrees: Int) {
    val (description, color) = when {
        degrees < 10 -> "cold" to Color.BLUE
        degrees < 25 -> "mild" to Color.ORANGE
        else -> "hot" to Color.RED
    }
}
