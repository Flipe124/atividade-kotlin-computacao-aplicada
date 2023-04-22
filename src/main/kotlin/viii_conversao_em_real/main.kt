package viii_conversao_em_real
import java.util.*;

private var scanner = Scanner(System. `in`);

fun main() {
    var cotacao = 0.0;
    var dolares = 0.0;
    var valor_real = 0.0;

    println("Informe a contação do dolar: ");
    cotacao = scanner.nextDouble();

    println("Informe a quantidade de dolares: ")
    dolares = scanner.nextDouble();

    valor_real = dolares * cotacao;

    println("Quandidade em reais: R$" + valor_real);
}