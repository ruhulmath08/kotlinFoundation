package com.ruhul.introduction

import kotlin.random.Random

fun main() {
    val random = (1..5).random()

    when (random){
        1-> println("Random is : 1")
        2-> println("Random is : 2")
        3-> println("Random is : 3")
        4-> println("Random is : 4")
        5-> println("Random is : 5")
    }

    usingIf()

}

fun usingIf() {
    val count = 600;

    if (count < 5) {
        println("Count is less than 5")
    } else if (count < 10) {
        println("Count is less than 10")
    } else {
        println("Count is : $count")
    }
}