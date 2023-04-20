package VI_Salario_Liquido_Professor

fun calcular(valor_hora: Double, hora_trabalhada : Double, desconto : Double ): String {
    var resultado_bruto = 0.0;
    var resultado_liquido = 0.0;

    resultado_bruto = valor_hora * hora_trabalhada;
    resultado_liquido = resultado_bruto - (resultado_bruto * desconto);

    return "Salario bruto: R$" + resultado_bruto + "\n" +"Salario liquído: R$" + resultado_liquido;
}