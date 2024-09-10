package com.example.mobiledeveloping.task5.Shapes.Abstract

abstract class Shape (
    private val color: String,
    private val borderThickness: Int
) {

    protected abstract val name : String

    abstract fun area(): Double

    abstract  fun perimeter(): Double

    fun displayInfo(): String{
        return "This is a ${color.lowercase()} ${name.lowercase()} with border thickness $borderThickness px. Area = ${area()}, perimeter = ${perimeter()}"
    }

}
