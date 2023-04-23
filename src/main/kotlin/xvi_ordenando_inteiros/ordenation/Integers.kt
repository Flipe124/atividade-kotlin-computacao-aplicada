package xvi_ordenando_inteiros.ordenation

import xvi_ordenando_inteiros.ordenation.cli.Terminal

private const val MESSAGE_MAIN = "***** Descending Sorting Order of Integer Number! *****"
private const val MESSAGE_FINAL = "Items in descending order are:"

object Integers {

    fun run() {

        val terminal = Terminal()

        println(MESSAGE_MAIN)

        val arrayOfIntegers = terminal.readIntegers()
        arrayOfIntegers.sortDescending()

        print("$MESSAGE_FINAL\n> ")
        for ((index, value) in arrayOfIntegers.withIndex()) {
            val complement = if (!index.equals(arrayOfIntegers.lastIndex)) ", " else "."
            print("${value}${complement}")
        }

    }

}
