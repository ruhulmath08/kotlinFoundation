package com.ruhul.immutabilityRangeExpression

fun main() {
    val nums: Array<Int> = arrayOf(1)

    var anotherNum = 100
    try {
        anotherNum = nums[3]
    }catch (e: Throwable){
        println(e.message)
    }
    println("Another number is: $anotherNum")

    ///This code is much clear
    val ans: Int = try {
        nums[1]
    } catch (e: Throwable) {
        0
    }
    println("The answer is: $ans")
}