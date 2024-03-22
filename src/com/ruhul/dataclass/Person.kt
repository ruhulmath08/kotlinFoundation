package com.ruhul.dataclass

/*
Data class override toString() method
*/
data class Person(val name: String, val age: Int)

fun main() {
    val sam = Person(name = "Sam", age = 31)
    val samuel = Person(name = "Sam", age = 31)

    // println(sam) //Person(name=Sam, age=31)

    //have the same hasCode
    println("$sam, has hasCode ${sam.hashCode()}") //Person(name=Sam, age=31), has hasCode 2569280
    println("$samuel, has hasCode ${samuel.hashCode()}") //Person(name=Sam, age=31), has hasCode 2569280

    //If we change one of the class property then the hasCode is different
    val ruhul = Person(name = "Ruhul", age = 31)
    println("$sam, has hasCode ${sam.hashCode()}") ////Person(name=Sam, age=31), has hasCode 2569280
    println("$ruhul, has hasCode ${ruhul.hashCode()}") //Person(name=Ruhul, age=31), has hasCode -1836110877

    //Check the hasCode equality
    println("Equality test using .equals(): ${sam.hashCode() == samuel.hashCode()}")
    println("Equality test using ==: ${sam.hashCode() == samuel.hashCode()}")
    //Reference equality test
    println("Reference test using ===: ${sam === samuel}")
}