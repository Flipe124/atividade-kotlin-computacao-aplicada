import java.util.*
import javax.swing.text.NavigationFilter

private var scanner = Scanner(System.`in`);

// TEM QUE TROCAR PARA FUNÇÂO COM RETORNO!!!!!!!!!!!!!!!!!!!!!!

fun FizzBuzz(){
    var nInicial = 0;
    var nFinal = 0;

    println("Digite um número inicial da sequência:");
    nInicial = scanner.nextInt();

    println("Digite o número final da sequência:")
    nFinal = scanner.nextInt();

    for (i in nInicial..nFinal){
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz");

        } else if (i % 5 == 0) {
            println("Buzz");

        } else if (i % 3 == 0){
            println("Fizz");

        }
        else {
            println(i)

        }
    }
}