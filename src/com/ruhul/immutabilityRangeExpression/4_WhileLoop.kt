package com.ruhul.immutabilityRangeExpression

fun main() {
    var count = 5
    while (count > 1) {
        print("$count ") //5 4 3 2
        count--
    }

    //while with break
    println()
    var value = 5
    while (value > 1) {
        print("$value ") //5 4
        value--

        if (value == 3) break
    }

    //do while
    println()
    var count2 = 6
    do {
        print("$count2 ") //6 5 4 3 2
        count2--
    } while (count2 > 1)

    ///do-while loop execute at least one time
    println()
    var count3 = 6
    do {
        print("$count3 ") //6
        count3--
    } while (count3 > 100)
}