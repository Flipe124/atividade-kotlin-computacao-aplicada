package xiii_eleicao_sindical.election.cli

import xiii_eleicao_sindical.election.core.Vote
import java.util.*

private const val DEFAULT_VALUE_INT = 0
private const val KEY_QUIT = "quit"

class Terminal {

    private val scanner = Scanner(System.`in`)
    private val vote = Vote()

    fun readVotes(candidates: Array<String>): Map<String, Int> {

        // O contador geral dos votos começa com -1 para descontar o último encremento que é da saida do loop.
        var countAll = DEFAULT_VALUE_INT - 1
        var countBlankAndNulls = DEFAULT_VALUE_INT
        val result = mutableMapOf<String, Int>()

        for (candidate in candidates) {
            result[candidate] = DEFAULT_VALUE_INT
        }

        println("Observation: choose \"$KEY_QUIT\" to quit!")
        do {
            var flagStay = true
            print("Vote: ")
            val answer: String? = scanner.nextLine()
            when {
                answer.equals(KEY_QUIT) -> flagStay = false
                answer.isNullOrBlank() -> countBlankAndNulls++
                else -> {
                    val (isValidVote, candidate) = vote.validateVote(answer, candidates)
                    if (isValidVote is Boolean && isValidVote) {
                        result.put(candidate as String, result.getValue(candidate) + 1)
                    } else {
                        countAll--
                    }
                }
            }
            countAll++
        } while (flagStay)

        result.put("all", countAll)
        result.put("blanksAndNulls", countBlankAndNulls)
        return result

    }

}
