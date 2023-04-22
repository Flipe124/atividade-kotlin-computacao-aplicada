package vi_salario_liquido_professor

import java.util.*

private var scanner = Scanner(System. `in`);

fun main() {
    var valor_hora = 0.0;
    var hora_trabalhada = 0.0;
    var desconto = 0.0;

    println("Informe o valor das horas:");
    valor_hora = scanner.nextDouble();

    println("Informe a quantidade de horas trabalhadas no mês:");
    hora_trabalhada = scanner.nextDouble();

    println("Informe o % de desconto do INSS:");
    desconto = scanner.nextDouble();

    println(calcular(valor_hora, hora_trabalhada, desconto));

}