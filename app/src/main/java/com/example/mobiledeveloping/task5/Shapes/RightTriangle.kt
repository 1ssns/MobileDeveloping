package com.example.mobiledeveloping.task5.Shapes

import com.example.mobiledeveloping.task5.Shapes.Abstract.Shape
import kotlin.math.pow
import kotlin.math.sqrt

class RightTriangle(
    private val color: String,
    private val borderThickness: Int,
    private val firstLeg: Double,
    private val secondLeg: Double
    ) : Shape(color, borderThickness) {

    private val hypotenuse = sqrt(firstLeg.pow(2) + secondLeg.pow(2))

    override val name: String
        get() = "RightTriangle"

    override fun area(): Double {
        return  (firstLeg * secondLeg) / 2
    }

    override fun perimeter(): Double {
        return firstLeg + secondLeg + hypotenuse
    }

}
