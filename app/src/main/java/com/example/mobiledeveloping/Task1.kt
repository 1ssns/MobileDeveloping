package com.example.mobiledeveloping

fun main(){
    var firstNumber = 15
    var secondNumber = 55

    fun printNumbers(){
        println("firstNumber = $firstNumber, secondNumber = $secondNumber")
    }

    printNumbers()

    secondNumber.also  {
        secondNumber = firstNumber
        firstNumber = it
    }

    printNumbers()
}
