package com.ruhul.otherClassTypes

/*
    Used to created restricted class hierarchies
    Provide more control over inheritance
    All subclasses are known at compile time
    All subclasses in same module as sealed class
    Similar to enums
        - But can have instances of a sealed class
        - With its own state
 */

/*
sealed class PersonEvents {
    val name = "Sealed"
    fun doSomething(){}
    class Awake : PersonEvents()
    class ASleep : PersonEvents()
    class Eating(val food: String) : PersonEvents()

}
*/

//sealed class can have its own constructor
sealed class PersonEvents(val id: Int) {
    class Awake(id: Int) : PersonEvents(id)
    class ASleep(id: Int) : PersonEvents(id)
    class Eating(id: Int, val food: String) : PersonEvents(id)
}

class Cooking(id: Int) : PersonEvents(id)

fun main() {
    val evt = PersonEvents.Awake(id = 1)
    handlePersonEvent(evt) //Awake: 1

    val secondEvt = PersonEvents.Eating(2, "Rice")
    handlePersonEvent(secondEvt) //Eating: 2, Rice
}

fun handlePersonEvent(evt: PersonEvents) {
    when (evt) {
        is PersonEvents.ASleep -> {
            println("ASleep: ${evt.id}")
        }

        is PersonEvents.Awake -> {
            println("Awake: ${evt.id}")
        }

        is PersonEvents.Eating -> {
            println("Eating: ${evt.id}, ${evt.food}")
        }

        is Cooking -> {
            println("Cooking: ${evt.id}")
        }

    }
}