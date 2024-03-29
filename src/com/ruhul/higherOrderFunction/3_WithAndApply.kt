package com.ruhul.higherOrderFunction

import java.time.LocalDate

class Meeting {
    var Title: String = ""
    var When: LocalDate = LocalDate.MIN
    var Who: MutableList<String> = mutableListOf<String>()

    fun creatr() {}
}

fun main() {
    val boardMeeting = Meeting()

    with(boardMeeting) {
        boardMeeting.Title = "Board Meeting"
        boardMeeting.When = LocalDate.now()
        boardMeeting.Who.add("Ruhul Amin")
    }

    //apply returns the instance that is being worked on
    //After call apply we can call functions, methods on that instance
    boardMeeting.apply {
        boardMeeting.Title = "Board Meeting"
        boardMeeting.When = LocalDate.now()
        boardMeeting.Who.add("Ruhul Amin")
    }.creatr()

    /*
    boardMeeting.Title = "Board Meeting"
    boardMeeting.When = LocalDate.now()
    boardMeeting.Who.add("Ruhul Amin")
     */
}