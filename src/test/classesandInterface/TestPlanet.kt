package test.classesandInterface

import com.ruhul.classesandInterface.Planet
import com.ruhul.classesandInterface.StdoutLogger

class TestPlanet {
    private lateinit var planet : Planet

    fun setup() {
        planet = Planet(name = "", diameter = 0, logger = StdoutLogger())
    }

    fun test() {
        planet.population
    }
}