package com.example.mobiledeveloping.task2

fun main(){
    val firstNumber = 12
    val secondNumber = 6
    val thirdNumber = 3

    when {
        hasEqualNumbers(firstNumber, secondNumber, thirdNumber) -> println("yes")
        else -> println("no")
    }
}
