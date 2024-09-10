package com.example.mobiledeveloping.task5.Shapes

import com.example.mobiledeveloping.task5.Shapes.Abstract.Shape

class Rectangle(
    private val color: String,
    private val borderThickness: Int,
    private val width: Double,
    private val height: Double
) : Shape(color, borderThickness) {

    override val name: String
        get() = "Rectangle"

    override fun area(): Double {
        return  width * height
    }

    override fun perimeter(): Double {
        return  2 * (width + height)
    }

}
