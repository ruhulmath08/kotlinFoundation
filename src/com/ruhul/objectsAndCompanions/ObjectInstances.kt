package com.ruhul.objectsAndCompanions

import java.awt.event.MouseEvent

/*
 Object don't have a name

 */
/*
fun main() {
    val simple = object {
        val name = "Ruhul"

        fun printValue() {
            println(name)
        }
    }

    println(simple.name) //Ruhul
    simple.printValue() //Ruhul
}
*/

fun main() {
    val window = Window()
    window.addMouseListener(object : MouseListener{
        override fun mouseClicked(e: MouseEvent) {

        }

        override fun mouseEntered(e: MouseEvent) {

        }
    })
}

class Window {
    fun addMouseListener(listener: MouseListener) {}
}

interface MouseListener {
    fun mouseClicked(e: MouseEvent)
    fun mouseEntered(e: MouseEvent)
}

class MouseEvent{

}