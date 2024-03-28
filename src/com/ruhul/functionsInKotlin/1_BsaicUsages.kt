package com.ruhul.functionsInKotlin

//if a function return nothing then it return Unit -> fun padding(): Unit {}
//We no need to mention Unit
fun padding(origin: String, numberToReplace: Int, replacementChar: Char): String {
    val strToAdd: String = replacementChar.toString().repeat(numberToReplace)
    return origin + strToAdd
}

fun main() {
    val original = "Ruhul"
    val newString = padding(original, 5, '$')
    println(newString) //Ruhul$$$$$
}
