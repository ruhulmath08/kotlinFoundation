package com.ruhul.introduction

fun main(args: Array<String>) {
    for (a: String in args) {
        print(a)
    }

    println()

    val value: Int = sum2(23, 42)
    println(value)
    doNothing()
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a+b

fun doNothing(): Unit{
    println("Call nothing")
}