package com.example.mobiledeveloping.task4

fun getStringLength(any: Any?): Int{
    val string = any as? String ?: return -1
    return string.length
}
