package com.ruhul.functionsInKotlin

fun simpleFunction(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun singleExpressionFunction(a:Int, b:Int) = if(a>b) a else b

fun main() {
    println("Max of 30 and 20 is: ${simpleFunction(30, 20)}") //Max of 30 and 20 is: 30
    println("Max of 33 and 20 is: ${singleExpressionFunction(33, 20)}") //Max of 33 and 20 is: 33
}