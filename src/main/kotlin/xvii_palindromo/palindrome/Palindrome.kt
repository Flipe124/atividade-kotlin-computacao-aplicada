package xvii_palindromo.palindrome

import xvii_palindromo.palindrome.cli.Terminal
import xvii_palindromo.palindrome.core.Palindrome

private const val MESSAGE_MAIN = "***** Palindrome Discover! *****"
private const val LABEL_IS = "is"
private const val LABEL_IS_NOT = "is not"

object Palindrome {

    private val terminal = Terminal()
    private val palindrome = Palindrome()

    fun run() {

        println(MESSAGE_MAIN)
        val answer = terminal.readInput()

        val (isPalindrome, reversedAnswer) = palindrome.validate(answer)
        val complement = if (!isPalindrome) LABEL_IS_NOT else LABEL_IS

        println("Explanation: \"$answer\" reversed is \"$reversedAnswer\", so ${complement.uppercase()} palindrome!")

    }

}
