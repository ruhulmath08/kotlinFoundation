package com.ruhul.immutabilityRangeExpression

fun main() {
    val a = 23
    val b = 10

    var min:Int = a

    if (a <b){
        min = a
    }else{
        min = b
    }

    println("Min is: $min")
}