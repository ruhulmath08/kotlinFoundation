package com.ruhul.dataclass

data class Bird(val name: String, val age: Int)

fun main() {
    val hen = Bird(name = "Tiger Hen", age = 4)
    val smallHen = hen.copy(name = "Serama Bantams", age = 3)

    println("$hen has hasCod: ${hen.hashCode()}") //Bird(name=Tiger Hen, age=4) has hasCod: 1728495124
    println("$smallHen has hasCod: ${smallHen.hashCode()}") //Bird(name=Serama Bantams, age=3) has hasCod: 1922950476

    // Destructuring
    println("Hen species name: ${hen.name} and age: ${hen.age}")

    val (name: String, age:Int) = hen
    println("Hen species name: $name and age: $age")
}