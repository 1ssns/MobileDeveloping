package com.example.mobiledeveloping.task2

import java.util.Locale

fun String.toUpperCaseFirstChar(): String{
    return  this.replaceFirstChar { if (it. isLowerCase()) it. titlecase(Locale.getDefault()) else it. toString() }
}
