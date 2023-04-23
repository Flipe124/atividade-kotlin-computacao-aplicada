package xvi_ordenando_inteiros.ordenation.cli

import java.util.InputMismatchException
import java.util.Scanner

private const val MESSAGE_GET_INPUT = "Enter with a integer number"
private const val MESSAGE_EXCEPTION_INPUT_MISMATCH = "Input Mismatch! Try again with a integer number..."
private const val ITERATE_VALUE_BEGIN = 1
private const val ITERATE_VALUE_END = 12

class Terminal {

    private val scanner = Scanner(System.`in`)

    fun readIntegers(): ArrayList<Int> {

        val arrayOfIntegers = arrayListOf<Int>()

        for (count in ITERATE_VALUE_BEGIN..ITERATE_VALUE_END) {
            while (true) {
                print("$MESSAGE_GET_INPUT [$count/$ITERATE_VALUE_END]: ")
                try {
                    val answer = scanner.nextInt()
                    arrayOfIntegers.add(answer)
                    break
                } catch (exception: InputMismatchException) {
                    println(MESSAGE_EXCEPTION_INPUT_MISMATCH)
                    scanner.next()
                }
            }
        }

        return arrayOfIntegers

    }

}
