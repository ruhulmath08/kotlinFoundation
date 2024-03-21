package com.ruhul.classesandInterface

/*
* Kotlin's classes are public final by default
* Property that passing throw the constructor is private by default
* can make it public by adding val keyword -> Planet(val name:String)
* val makes the value read only, cannot change or set the val
* */
open class Planet(name: String, diameter: Int, val logger: Logger) : SpaceBody(name) {
    open var population: Long = 0


    //init is called after the constructor values are set
    init {
        println("We have been created with name: $name")
        population = 0
    }

    val radious: Int = diameter / 2

    //secondary constructor
    constructor(name: String, diameter: Int, gaseous: Boolean, logger: Logger) : this(name, diameter, logger)
    constructor(name: String, diameter: Int, gaseous: Boolean, hasLife: Boolean, logger: Logger) : this(
        name,
        diameter,
        logger
    )

    //public method
    open fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Int): Long {
        logger.debug("Starting the model")
        initPopulationRun(startDate, endDate, startPopulation)
        return population
    }

    //private method
    private fun initPopulationRun(startDate: Int, endDate: Int, startPopulation: Int) {
        //do some work
    }

    override fun calculateMotion() {
        TODO("Not yet implemented")
    }
}

/*
Classes represent things
 - Planets 
 - People

Classes derivation model an 'isA' relationship
 - A Planet 'isA' SpaceBody
 - A HabitablePlanet 'isA' Planet
*/

//abstract classes are open by default and can have property and method
abstract class SpaceBody(val name: String) {
    abstract fun calculateMotion()
}

class BlackHole(name: String) : SpaceBody(name) {
    override fun calculateMotion() {
        TODO("Not yet implemented")
    }
}

class HabitablePlanet(name: String, diameter: Int, logger: Logger) : Planet(name, diameter, logger) {
    override var population: Long = 0

    //override method
    override fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Int): Long {
        super.runPopulationModel(startDate, endDate, startPopulation)
        return 0
    }
}