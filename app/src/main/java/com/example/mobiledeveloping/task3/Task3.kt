package com.example.mobiledeveloping.task3

fun main(){
    val n = readInputNumber() ?: return println("Введено не число")

    for(i in 1..3){
        repeat(i * n){
            print(i)
        }
        println()
    }
}

fun readInputNumber(): Int?{
    print("Введите число n: ")
    val inputLine = readlnOrNull()

    return inputLine?.toIntOrNull()
}
