package com.ruhul.dataclass

data class Animal(val name: String) {
    var age: Int = 0

    override fun toString(): String {
        return "Person(name = $name, age =$age)"
    }
}

fun main() {
    val cow = Animal("Brahman")
    cow.age = 3

    val bigCow = Animal("Brahman")
    bigCow.age = 5

    //Any value that's not in the constructor is removed from the hasCode
    println("$cow has hasCod: ${cow.hashCode()}") //Animal(name=Brahman) has hasCod: 1802211683
    println("$bigCow has hasCod: ${bigCow.hashCode()}") //Animal(name=Brahman) has hasCod: 1802211683

    //After override the toString() method the we output is
    println("$cow has hasCod: ${cow.hashCode()}") //Person(name = Brahman, age =3) has hasCod: 1802211683
    println("$bigCow has hasCod: ${bigCow.hashCode()}") //Person(name = Brahman, age =5) has hasCod: 1802211683
}