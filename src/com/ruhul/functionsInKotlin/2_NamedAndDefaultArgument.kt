package com.ruhul.functionsInKotlin


//We add default replacementChar as an empty space
fun addCharacter(origin: String, numberToReplace: Int, replacementChar: Char = ' '): String {
    val strToAdd: String = replacementChar.toString().repeat(numberToReplace)
    return origin + strToAdd
}

//Named parameter function
fun addPlayer(name: String, highScore: Int, lowScore: Int, totalScore: Int) {}

//Function overloading
fun addPlayer(firstName: String, lastName: String, highScore: Int, lowScore: Int, totalScore: Int) {
    addPlayer(name = "$firstName+$lastName", highScore, lowScore, totalScore)
}

fun main() {
    val original = "Ruhul"
    val newString = addCharacter(original, 5)
    println("###${newString}###") //###Ruhul     ###

    val string = addCharacter(original, 5, '%')
    println(string) //Ruhul%%%%%

    //Named parameter
    addPlayer(name = "Ruhul", lowScore = 20, highScore = 90, totalScore = 500)
    addPlayer(firstName = "Ruhul ", lastName = "Amin", lowScore = 20, highScore = 90, totalScore = 500)
}
