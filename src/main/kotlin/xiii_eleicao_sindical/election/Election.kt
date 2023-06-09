package xiii_eleicao_sindical.election

import xiii_eleicao_sindical.election.cli.Terminal

private const val LABEL_MESSAGE_MAIN = "***** Union Selection! *****"
private const val LABEL_MESSAGE_CANDIDATES = "The candidates are:"
private const val LABEL_MESSAGE_RESULT = "The result are:"

object Election {

    private val terminal = Terminal()
    private val candidates = arrayOf("A", "B", "C")

    fun run() {

        println(LABEL_MESSAGE_MAIN)
        println(LABEL_MESSAGE_CANDIDATES)
        for (candidate in candidates) {
            println("- $candidate")
        }

        val result = terminal.readVotes(candidates)

        println(LABEL_MESSAGE_RESULT)
        println("""
            - All votes: ${result.getValue("all")}
            - A: ${result.getValue("A")}
            - B: ${result.getValue("B")}
            - C: ${result.getValue("C")}
            - Blanks and Nulls: ${result.getValue("blanksAndNulls")}
        """.trimIndent())

    }

}
