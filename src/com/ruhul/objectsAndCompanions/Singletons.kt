package com.ruhul.objectsAndCompanions

// This Logger act as a Singleton
object Logger {
    fun debug(message: String) {
        println("** debug $this: $message")
    }

    fun info(message: String) {
        println("** info $this: $message")
    }
}

class Person {
    fun doWork() {
        Logger.debug("Some message")
    }
}

fun main() {
    val ruhul = Person()
    val rahat = Person()

    ruhul.doWork() // ** debug com.ruhul.objectsAndCompanions.Logger@1134affc: Some message
    rahat.doWork() // ** debug com.ruhul.objectsAndCompanions.Logger@1134affc: Some message
}

