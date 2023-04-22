package xii_velocidade_do_projetil.calculo.core

class Calculo(
    private val quilometros: Double,
    private var minutos: Double,
) {
    fun calcularVelocidade() = (quilometros * 1000) / (minutos * 60)
}