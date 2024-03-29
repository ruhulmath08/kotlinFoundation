package com.ruhul.higherOrderFunction

interface Process {
    fun execute(value: Int)
}

fun main() {/*
    fibonacci(8, object : Process {
        override fun execute(value: Int) {
            println(value)
        }

    })
    */

    // fibonacciUsingHigherOrder(5, {n-> println(n) })
    //fibonacciUsingHigherOrder(5, { println(it) })
    //fibonacciUsingHigherOrder(5) { println(it) }

    // :: -> Kotlin scoping operator
    fibonacciUsingHigherOrder(5, ::println)
}

fun fibonacci(limit: Int, process: Process) {
    var prev = 0
    var prevprev = 0
    var current = 1

    for (i: Int in 1..limit) {
        process.execute(current)

        val temp: Int = current
        prevprev = prev
        prev = temp
        current = prev + prevprev
    }
}

//Higher order function
fun fibonacciUsingHigherOrder(limit: Int, action: (Int) -> Unit) {
    println("Fibonacci using higher order")
    var prev = 0
    var prevprev = 0
    var current = 1

    for (i: Int in 1..limit) {
        action(current)

        val temp: Int = current
        prevprev = prev
        prev = temp
        current = prev + prevprev
    }
}

//1 1 2 3 5 8 13 21 34 ....
fun fibonacciUsingForLoop(limit: Int) {
    var prev = 0
    var prevprev = 0
    var current = 1

    for (i: Int in 1..limit) {
        println(current)

        val temp: Int = current
        prevprev = prev
        prev = temp
        current = prev + prevprev
    }
}