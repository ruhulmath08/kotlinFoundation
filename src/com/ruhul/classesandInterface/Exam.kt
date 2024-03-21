package com.ruhul.classesandInterface

//Heavy class
/*
class Score(private val score: Int) {
    init {
        if (score < 0 || score > 100) throw IllegalArgumentException()

    }
}
*/

//Inline class

@JvmInline
value class Score(private val score: Int) {
    init {
        if (score < 0 || score > 100) throw IllegalArgumentException()

    }
}

class Exam() {
    fun score(name: String, studentScore: Score) {


        // do something
    }

    fun amendScore(id: Int, newScore: Int) {
        if (newScore < 0 || newScore > 100) throw IllegalArgumentException()
        // do something
    }
}

fun main() {

}