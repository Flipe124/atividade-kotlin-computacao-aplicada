package IX_Conversao_em_dolar

import java.util.*;

private var scanner = Scanner(System. `in`);

fun main() {
    var cotacao = 0.0;
    var reais = 0.0;
    var valor_dolar = 0.0;

    println("Informe a contação do real: ");
    cotacao = scanner.nextDouble();

    println("Informe a quantidade de reais: ")
    reais = scanner.nextDouble();

    valor_dolar = reais * cotacao;

    println("Quandidade em reais: US$" + valor_dolar);
}