package com.ruhul.higherOrderFunction

import java.io.Closeable

class GroupMeeting : Closeable {
    fun create() {
        println("Group meeting is created")
    }


    override fun close() {
        println("Was close")
    }
}

fun main() {
    GroupMeeting().use {
        it.create()
    }
}