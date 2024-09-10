package com.example.mobiledeveloping.task5.Shapes

import com.example.mobiledeveloping.task5.Shapes.Abstract.Shape
import kotlin.math.PI
import kotlin.math.pow

class Circle(
    private val color: String,
    private val borderThickness: Int,
    private val radius: Double
) : Shape(color, borderThickness) {

    override val name: String
        get() = "Circle"

    override fun area(): Double {
        return  PI * radius.pow(2)
    }

    override fun perimeter(): Double {
         return  2 * PI * radius
    }

}
