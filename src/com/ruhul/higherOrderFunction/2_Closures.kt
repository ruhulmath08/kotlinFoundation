package com.ruhul.higherOrderFunction

fun main(){
    var total = 0
    fibonacci(8){total += it}
    println(total)
}

fun fibonacci(limit: Int, action: (Int) -> Unit) {
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