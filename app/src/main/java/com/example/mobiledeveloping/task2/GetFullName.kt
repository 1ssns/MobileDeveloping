package com.example.mobiledeveloping.task2

fun getFullName(firstName: String?, lastName: String?): String{
    val getPartOfName: (String?) -> String = { part: String? -> part?.toUpperCaseFirstChar() ?: "Unknown" }

    return "${getPartOfName(firstName)} ${getPartOfName(lastName)}"
}


