package com.ruhul.otherClassTypes

enum class ErrorCode(val error: Int) {
    Name(0),
    Unknown(1),
    ConnectionLost(300),
}

fun main() {
    val errorCode = ErrorCode.ConnectionLost

    when (errorCode) {
        ErrorCode.Name -> {
            println("No Error") //No Error
        }

        ErrorCode.Unknown -> {}
        ErrorCode.ConnectionLost -> {}
    }

    println("Error code has name: ${errorCode.name} and has ordinal: ${errorCode.ordinal}")
    /*
    Error code has name: Name and has ordinal: 0
    when -> val errorCode = ErrorCode.Name
     */

    println("Error code has name: ${errorCode.name} and has ordinal: ${errorCode.ordinal} and has value: ${errorCode.error}")
    /*
    Error code has name: ConnectionLost and has ordinal: 2 and has value: 300
    when ->  val errorCode = ErrorCode.ConnectionLost
    */

    val error: ErrorCode = ErrorCode.valueOf("Unknown")
    println("Error has name: ${error.name} and has ordinal: ${error.ordinal} and has value: ${error.error}")
    //Error has name: Unknown and has ordinal: 1 and has value: 1
}