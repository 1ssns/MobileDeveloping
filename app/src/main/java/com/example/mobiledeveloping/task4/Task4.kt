package com.example.mobiledeveloping.task4

fun main(){
    val numbers = arrayOf(3, 8, 5, 12, 1, 7, 2, 9, 14)

    val sortedEvenNumbers = numbers.filter { it % 2 == 0 }.sorted()
    val sortedOddNumbers = numbers.filter { it % 2 != 0 }.sorted()

    println("Четные числа: $sortedEvenNumbers")
    println("Нечетные числа: $sortedOddNumbers")
}
