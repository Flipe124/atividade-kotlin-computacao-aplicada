package xvii_palindromo.palindrome.core

class Palindrome {

    fun validate(phrase: String?): Pair<Boolean, String?> {
        val reversedPhrase = phrase?.reversed()
        return Pair(phrase.equals(reversedPhrase), reversedPhrase)
    }

}
