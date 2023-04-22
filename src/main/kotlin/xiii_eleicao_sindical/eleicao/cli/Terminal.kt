package xiii_eleicao_sindical.eleicao.cli

import java.util.Scanner

private const val DEFAULT_VALUE_INT = -1
private const val KEY_QUIT = "q"

class Terminal {

    private val scanner = Scanner(System.`in`)

    protected fun readVotes(candidates: Array<String>): Map<String, Int> {

        // O contador geral dos votos começa com -1 para descontar o último encremento que é da saida do loop.
        var countAll = DEFAULT_VALUE_INT - 1
        var countNulls = DEFAULT_VALUE_INT
        var countBlanks = DEFAULT_VALUE_INT

        var result = mutableMapOf<String, Int>()

        do {
            var flagStay = true
            val answer: String?

            println("<Escolha \"$KEY_QUIT\" para sair!>")
            print("Voto: ")
            answer = scanner.nextLine()

            when {
                answer.equals(KEY_QUIT) -> flagStay = false
                answer === null -> countNulls++
                answer.isBlank() -> countBlanks++
                in candidates. -> null
                else -> {

                }
            }
            countAll++
        } while (flagStay)

        result["all"] = countAll
        result["nulls"] = countNulls
        result["blanks"] = countBlanks

        return result

    }

}