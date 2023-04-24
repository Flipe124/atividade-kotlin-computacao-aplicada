package xiv_media_do_aluno.media.cli

import java.util.InputMismatchException
import java.util.Scanner

private const val DEFAULT_VALUE_DOUBLE = 0.0
private const val MESSAGE_EXCEPTION_INPUT_MISMATCH = "Enter a valid decimal grade!"

class Terminal {

    private val scanner = Scanner(System.`in`)
    private val notes = arrayListOf<Double>()

    fun getNotes(): ArrayList<Double> {

        for (index in 1..4) {
            var flagStay = true
            while (flagStay) {
                print("$index) ")
                try {
                    notes.add(scanner.nextDouble())
                    flagStay = false
                } catch (exception: InputMismatchException) {
                    println(MESSAGE_EXCEPTION_INPUT_MISMATCH)
                    scanner.next()
                }
            }
        }

        return notes

    }

}
