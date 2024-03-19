package com.ruhul.immutabilityRangeExpression

enum class MyColors {
    RED, GREEN, BLUE
}

fun main() {

//    isNumberEqualSix()
//    numberEqualSelectedValue()
//    numberNotEqualSelectedValue()
//    inRange()
//    validNumber()
//    boolValue()
    workingWithEnum()

}

fun isNumberEqualSix() {
    val num = 6

    val isNumEqualSix: Boolean = when (num) {
        6 -> true
        else -> false;
    }
    println("Number is $num and equal to 6 is: $isNumEqualSix")
    //Number is 6 and equal to 6 is: true
}

fun numberEqualSelectedValue() {
    val number = 7
    val isNumEqualSelectedValue: Boolean = when (number) {
        6, 7 -> true
        else -> false;
    }
    println("Number is $number and isNumEqualSelectedValue is: $isNumEqualSelectedValue")
    //Number is 7 and isNumEqualSelectedValue is: true
}

fun numberNotEqualSelectedValue() {
    val number = 8
    val isNumberNotEqualSelectedValue: Boolean = when (number) {
        6, 7 -> false
        else -> true;
    }
    println("Number is $number and isNumberNotEqualSelectedValue (6,7) is: $isNumberNotEqualSelectedValue")
    //Number is 8 and isNumberNotEqualSelectedValue (6,7) is: true
}

fun inRange() {
    val num = 11
    when (num) {
        in 1..10 -> println("Number is in range")
        else -> println("Number is not in range")
    }
    //Number is in range -> num =10
    //Number is not in range -> num =11
}

fun validNumber() {
    val num = 12
    val validNumber: IntRange = 1..5
    when (num) {
        in validNumber -> println("Number is valid")
        in 1..10 -> println("Number is in range")
        else -> println("Number is not in range")
    }
    //Number is in range -> num =6
    //Number is valid -> num =1
    //Number is not in range -> num =12
}

fun boolValue() {
    val someBool: Boolean = false
    when (someBool) {
        true -> println("It's true")
        else -> println("It's false")
    }
    //It's false
}

fun workingWithEnum(){
    val color = MyColors.RED
    when(color){
        MyColors.RED -> println("Color is: $color")
        MyColors.GREEN -> println("Color is: $color")
        MyColors.BLUE -> println("Color is: $color")
    }

    //Color is: RED
}


