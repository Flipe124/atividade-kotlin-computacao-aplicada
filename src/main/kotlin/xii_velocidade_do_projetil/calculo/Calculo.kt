package xii_velocidade_do_projetil.calculo

import xii_velocidade_do_projetil.calculo.core.Calculo
import java.util.*

private const val LABEL_MENSAGEM_PRINCIPAL = "Para calcular a velocidade de um projétil, entre com a distância em quilômetros e o tempo em minutos."
private const val LABEL_MENSAGEM_QUILOMETROS = "Entre com a distância em quilômetros"
private const val LABEL_MENSAGEM_MINUTOS = "Entre com o tempo em minutos"
private const val LABEL_MENSAGEM_RESULTADO = "Resultado em metros por segundo"
private const val LABEL_UNIDADE_MEDIDA_MPM = "MpM"

object Calculo {

    fun run() {

        val scanner = Scanner(System.`in`)

        println(LABEL_MENSAGEM_PRINCIPAL)

        print("$LABEL_MENSAGEM_QUILOMETROS: ")
        val quilometros = scanner.nextDouble()

        print("$LABEL_MENSAGEM_MINUTOS: ")
        val minutos = scanner.nextDouble()

        val calculo = Calculo(quilometros, minutos)
        println("$LABEL_MENSAGEM_RESULTADO: ${calculo.calcularVelocidade()}$LABEL_UNIDADE_MEDIDA_MPM")

    }

}
