package v_circuferencia

import java.util.*

private var scanner = Scanner(System.`in`);

fun main() {
    var raio = 0.0

    println("Informe um valor para calcular sua circuferência: ");
    raio = scanner.nextDouble();

    println(calcular(raio));
}