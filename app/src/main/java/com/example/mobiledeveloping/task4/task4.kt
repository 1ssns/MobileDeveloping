package com.example.mobiledeveloping.task4

import com.example.mobiledeveloping.task1.task1
import com.example.mobiledeveloping.task2.task2
import com.example.mobiledeveloping.task3.printArray

fun main(){
    val array = arrayOf(12, 41, 63, -23, -2, 4, 0)

    val newArray = array.filterAndMap(task2, ::task1)
    printArray(newArray, "newArray")
}
