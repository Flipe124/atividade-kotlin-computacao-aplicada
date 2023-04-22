package vii_volume_de_caixa

import java.util.*;

private var scanner = Scanner(System. `in`)

fun main() {
    var comprimento = 0.0;
    var largura = 0.0;
    var altura = 0.0;

    var volume = 0.0;

    println("Informe o comprimento do retângulo: ");
    comprimento = scanner.nextDouble();

    println("Informe a largura do retângulo: ");
    largura = scanner.nextDouble();

    println("Informe a altura do retângulo: ");
    altura = scanner.nextDouble();

    volume = comprimento * largura * altura;

    println("Volume do retângulo: " + volume);
}