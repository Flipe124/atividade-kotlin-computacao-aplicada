package x_soma_dos_quadrados

import java.util.*;
private var scanner = Scanner(System. `in`);

fun main() {
    var quadrado1 = 0;
    var quadrado2 = 0;
    var quadrado3 = 0;
    var soma = 0;

    println("Informe o 1° valor: ");
    quadrado1 = scanner.nextInt();

    println("Informe o 2° valor: ");
    quadrado2 = scanner.nextInt();

    println("Informe o 3° valor: ");
    quadrado3 = scanner.nextInt();

    soma = (quadrado1*quadrado1) + (quadrado2*quadrado2) + (quadrado3*quadrado3);

    println("Soma dos quadrados: " + soma);
}