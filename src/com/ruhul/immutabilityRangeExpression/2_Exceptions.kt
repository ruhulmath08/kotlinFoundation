package com.ruhul.immutabilityRangeExpression


fun main() {

    /// RuntimeException
    val nums: Array<Int> = arrayOf(5)
    val num: Int

    try {
        num = nums[1]

    } catch (t: Throwable) {
        println(t.message)
    }

    ///CheckedException
    try {

        throwException()
    }catch (e: Exception){
        println(e.message)
    }finally {
        println("Inside finally bloc")
    }
}

fun throwException() {
    throw Exception("Our own Exception")
}