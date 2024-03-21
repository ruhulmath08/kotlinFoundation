package com.ruhul.classesandInterface

fun main() {
    println("Started...")
    //val logger = StdoutLogger()
    val logger = NullLogger()
    val earth = Planet("Earth", 12742, logger)

    //  println("Planet created ${earth.name} and it's diameter is ${earth.diameter}") //should be -> val diameter: Int inside constructor
    println("Planet created ${earth.name} and it's radius is ${earth.radious}")
    println("Planet created ${earth.name} and it's radius is ${earth.radious} and population is ${earth.population}")

    earth.population = 7_000_000_000
    println("Planet created ${earth.name} and it's radius is ${earth.radious} and population is ${earth.population}")

    val newPopulation: Long = earth.runPopulationModel(0, 100, 100)
    println("New population is: $newPopulation")

    //val galaxy = SpaceBody("NGC-001")
}