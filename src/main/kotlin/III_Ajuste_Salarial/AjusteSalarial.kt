import java.util.*

private val scanner = Scanner(System. `in`);

fun AjusteSalarial(){
    var salario = 0.0;
    var reajuste = 0.0;
    var salario_reajustado = 0.0;

    println("Informe o salário: ");
    salario = scanner.nextDouble();

    println("Informe o reajuste: ");
    reajuste = scanner.nextDouble();

    salario_reajustado = (salario * reajuste) + salario;

    println("Salário ${salario} com aumento de ${reajuste}");
    println("Novo salário: ${salario_reajustado}");
}