import java.util.*

private val scanner = Scanner(System. `in`);

fun TrocaTroca(){
    var n1 = 0;
    var n2 = 0;
    var aux = 0;

    println("Digite um número:");
    n1 = scanner.nextInt();

    println("Digite outro número:");
    n2 = scanner.nextInt();

    aux = n1;
    n1 = n2;
    n2 = aux;

    println("Valor atual de A: ${n1}  e B: ${n2}")
}