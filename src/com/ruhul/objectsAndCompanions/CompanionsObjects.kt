package com.ruhul.objectsAndCompanions

class Invoice {

    object Logger {
        fun debug(message: String) {
            println("$this $message")
        }
    }

    fun calculate() {
        //If we declare debug() method as private we cannot access it
        Logger.debug("Calculate invoice")
    }
}

class Counter {

    companion object Register {
        fun test(message: String) {
            println("$this $message")
        }
    }

    fun count() {
        test("Start counting")
    }
}

fun main() {
    val invoice = Invoice()
    val invoice2 = Invoice()
    invoice.calculate() //com.ruhul.objectsAndCompanions.Invoice$Logger@1134affc Calculate invoice
    invoice2.calculate() //com.ruhul.objectsAndCompanions.Invoice$Logger@1134affc Calculate invoice

    //If we declare Logger as private we cannot access debug() method
    //If we declare debug() method as private we cannot access it
    Invoice.Logger.debug("Call from main") //com.ruhul.objectsAndCompanions.Invoice$Logger@1134affc Call from main


    val counter = Counter()
    val counter2 = Counter()

    counter.count() //com.ruhul.objectsAndCompanions.Counter$Register@1b0375b3 Start counting
    counter2.count() //com.ruhul.objectsAndCompanions.Counter$Register@1b0375b3 Start counting

    Counter.test("Call counter") //com.ruhul.objectsAndCompanions.Counter$Register@1b0375b3 Call counter
}