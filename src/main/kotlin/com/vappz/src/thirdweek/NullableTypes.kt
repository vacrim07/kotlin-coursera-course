package com.vappz.src.thirdweek

fun nullableVsNotNullable(){
    // @NotNull
    val s1: String = "always not null"
    // @Nullable
    val s2: String? = "could be null or not null"

    // accessing members
    s1.length
    s2?.length
}

fun elvisOperator(){
    val s: String? = "nullable string"
    val length: Int = s?.length ?: 0
}

fun callingNPEexplicitly(){
    val s: String? = "nullable string"
    s!!
    s.length
}

// In conclusion: use ?.    ?:  if(null)    rather than !!