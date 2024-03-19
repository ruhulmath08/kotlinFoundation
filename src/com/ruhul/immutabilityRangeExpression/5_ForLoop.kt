package com.ruhul.immutabilityRangeExpression

fun main() {
    range()
    overArray()
    workingWithMap()
}

fun range() {
    for (i: Int in 1..5) {
        print("$i ") //1 2 3 4 5
    }

    println()
    for (i: Int in 1..10 step 2) {
        print("$i ") //1 3 5 7 9
    }

    println()
    for (i: Int in 5 downTo 1) {
        print("$i ") //5 4 3 2 1
    }

    println()
    for (i: Int in 1 until 5) {
        print("$i ") //1 2 3 4
    }
}

fun overArray() {
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    for (num: Int in numbers) {
        print("$num ") //1 2 3 4 5
    }

    println()
    for ((index: Int, num: Int) in numbers.withIndex()) {
        println("Number: $num at index: $index")
    }

    /*
    Number: 1 at index: 0
    Number: 2 at index: 1
    Number: 3 at index: 2
    Number: 4 at index: 3
    Number: 5 at index: 4
    */
}

fun workingWithMap() {
    val people = HashMap<String, Int>()
    people["Ruhul"] = 33
    people["Harun"] = 29
    people["Rahat"] = 4

    for ((name: String, age: Int) in people) {
        println("Name: $name and age: $age")
    }
    /*
    Name: Ruhul and age: 33
    Name: Harun and age: 29
    Name: Rahat and age: 4
    */
}