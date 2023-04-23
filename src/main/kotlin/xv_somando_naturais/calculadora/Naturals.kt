package xv_somando_naturais.calculadora

private const val DEFAULT_VALUE_INT = 0
private const val MESSAGE_MAIN = "***** Summing the Natural Numbers! *****"
private const val MESSAGE_DESCRIBE = "Sum of 100 natural numbers range:"
private const val MESSAGE_FINAL = "Total sum:"

object Naturals {

    fun run() {

        val naturalNumbers = arrayListOf<Int>()
        var total = DEFAULT_VALUE_INT

        println(MESSAGE_MAIN)
        println(MESSAGE_DESCRIBE)

        naturalNumbers.addAll(1..100)

        for ((index, value) in naturalNumbers.withIndex()) {
            val symbol = if (!index.equals(naturalNumbers.lastIndex)) ";" else "."
            println("- ${value}${symbol}")
            total += value
        }

        println("$MESSAGE_FINAL $total")

    }

}
