package com.ruhul.introduction

fun main() {
    var intArray: IntArray = intArrayOf(1, 2, 3)
    var stringArray: Array<String> = arrayOf("Ruhul", "Amin")

    println("Name is: ${stringArray[0]} ${stringArray[1]}")

    stringArray[0] = "Nishat"
    println("Name is: ${stringArray[0]} ${stringArray[1]}")
}