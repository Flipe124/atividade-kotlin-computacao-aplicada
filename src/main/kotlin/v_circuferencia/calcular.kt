package v_circuferencia

import java.util.*

private var scanner = Scanner(System.`in`);

fun calcular(raio : Double) : Double {
    var pi = 3.14159265;
    var raio = raio;
    var resultado = 0.0;

    resultado = (raio * 2) * pi;

    return resultado;
}