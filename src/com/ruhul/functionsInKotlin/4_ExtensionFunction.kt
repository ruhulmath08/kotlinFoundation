package com.ruhul.functionsInKotlin

fun addPadding(original: String, numberToReplace: Int, replaceChar: Char = ' '): String {
    val startToAdd: String = replaceChar.toString().repeat(numberToReplace)
    return original + startToAdd
}

//Extension function
fun String.pad(numberToReplace: Int, replaceChar: Char = ' '): String {
    val startToAdd: String = replaceChar.toString().repeat(numberToReplace)
    return this + startToAdd
}


fun main() {
    val original = "Ruhul"
    val newString = addPadding(original, numberToReplace = 2)
    println("***${newString}***") //***Ruhul  ***

    val newerString = original.pad(numberToReplace = 3, replaceChar = '&')
    println(newerString) //Ruhul&&&
}