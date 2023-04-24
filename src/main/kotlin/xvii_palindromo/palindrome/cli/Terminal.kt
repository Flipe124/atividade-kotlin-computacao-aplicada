package xvii_palindromo.palindrome.cli

import java.util.Scanner

private const val MESSAGE_GET_INPUT = "Enter with any phrase:"

class Terminal {

    private val scanner = Scanner(System.`in`)

    fun readInput(): String? {

        print("$MESSAGE_GET_INPUT ")
        return scanner.nextLine()

    }

}
