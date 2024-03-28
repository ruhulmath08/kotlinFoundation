package com.ruhul.functionsInKotlin

//Infix function
data class Point(val x: Int, val y: Int) {
    infix fun add(point: Point): Point {
        return Point(this.x + point.x, this.y + point.y)
    }
}

//Infix extension function
data class AddPoint(val x: Int, val y: Int)

infix fun AddPoint.addPoint(points: AddPoint): AddPoint {
    return AddPoint(this.x + points.x, this.y + points.y)
}

infix fun AddPoint.addPointsExpression(points: AddPoint) = AddPoint(this.x + points.x, this.y + points.y)

//Operator overloading
operator fun AddPoint.plus(points: AddPoint) = AddPoint(this.x + points.x, this.y + points.y)


fun main() {
    val point1 = Point(1, 1)
    val point2 = Point(2, 2)
    val newPoint: Point = point1 add point2
    println(newPoint) //Point(x=3, y=3)

    val firstPoint = AddPoint(4, 5)
    val secondPoint = AddPoint(2, 1)
    val addPoints = firstPoint addPoint secondPoint
    println(addPoints) //AddPoint(x=6, y=6)

    val addPointsWithExpression = firstPoint addPointsExpression secondPoint
    println(addPointsWithExpression) //AddPoint(x=6, y=6)

    val addPointsWithPlus = firstPoint + secondPoint
    println(addPointsWithPlus) //AddPoint(x=6, y=6)
}