package com.example.mobiledeveloping.task2

fun main(){
    val firstNumber = 12
    val secondNumber = 6
    val thirdNumber = 3

    fun displayHasEqualNumbers(){
        val hasEqualNumbers = hasEqualNumbers(firstNumber, secondNumber, thirdNumber)

        if(hasEqualNumbers) println("yes")
        else println("no")
    }

    displayHasEqualNumbers()
}
