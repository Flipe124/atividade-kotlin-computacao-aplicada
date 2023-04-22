import i_two_fer.comportamento.TwoFer
import java.util.*

private val scanner = Scanner(System.`in`)

fun main(){
    var nome = "";

    println("Informe um nome: ");
    nome = scanner.nextLine();

    println(TwoFer(nome));

}