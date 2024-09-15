package com.example.mobiledeveloping.task3

import com.example.mobiledeveloping.task1.task1
import com.example.mobiledeveloping.task2.task2

fun main(){
    val n = readInputNumber() ?: return println("Некорректная длина массива")

    val array = Array(n) { (-100..500).random() }
    printArray(array, "array")

    val arrayTask1 = array.map(::task1).toTypedArray()
    printArray(arrayTask1, "arrayTask1")

    val arrayTask2 = array.filter(task2).toTypedArray()
    printArray(arrayTask2, "arrayTask2")

    val arrayTask3 = array.filter(task2).map(::task1).toTypedArray()
    printArray(arrayTask3, "arrayTask3")
}

fun <T>printArray(array: Array<T>, arrayName: String){
    println("$arrayName = " + array.contentToString())
}

fun readInputNumber(): Int?{
    print("Введите длину массива = ")
    val input = readlnOrNull()

    return  input?.toIntOrNull()
}
