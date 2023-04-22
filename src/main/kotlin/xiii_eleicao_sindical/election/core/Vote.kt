package xiii_eleicao_sindical.election.core

import xiii_eleicao_sindical.election.warning.Warning

private const val DEFAULT_VALUE_STRING = ""

class Vote {

    private val warning = Warning()

    fun validateVote(answer: String, compareTo: Array<String>): Array<Any> {
        for (item in compareTo) {
            if (answer.equals(item)) {
                return arrayOf(true, item)
            }
        }
        warning.printWrongAnswer()
        return arrayOf(false, DEFAULT_VALUE_STRING)
    }

}
