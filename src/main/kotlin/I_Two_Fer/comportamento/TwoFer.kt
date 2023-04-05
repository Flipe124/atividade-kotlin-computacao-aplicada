package I_Two_Fer.comportamento

fun TwoFer(nome : String): String {
    var frase = "";

    if (nome == "Alice"){
        frase = "Um para Alice, um para mim.";
        return frase;

    } else if(nome == "bob") {
        frase = "Um para Bob, um para mim.";
        return frase;

    } else if(nome == "Jose"){
        frase = "Um para José, um para mim.";
        return frase;

    } else if (nome == ""){
        frase = "Um para você, um para mim.";
        return frase;

    } else {
        frase = ";/";
        return frase;
    }
}