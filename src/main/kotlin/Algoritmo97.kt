// Código original
// Enunciado:
// Entrar com um número e informar se ele é divisível por 10, por 5, por 2 ou se não é divisível por nenhum destes.
//
// prog se8
// int numero;
// imprima "\ndigite numero: ";
// leia numero;
// se ( numero % 10 == 0 )
// { imprima "\nmultiplo de 10"; }
// senao
// {
// se ( numero % 2 == 0 )
// { imprima "\nmultiplo de 2"; }
// senao
// {
// se ( numero % 5 == 0 )
// { imprima "\nmultiplo de 5"; }
// senao
// { imprima "\nnão é multiplo de 2 nem de 5"; }
// }
// }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite número: ")
    val numero = readLine()?.toIntOrNull() ?: return

    if (numero % 10 == 0) {
        println("Múltiplo de 10")
    } else {
        if (numero % 2 == 0) {
            println("Múltiplo de 2")
        } else {
            if (numero % 5 == 0) {
                println("Múltiplo de 5")
            } else {
                println("Não é múltiplo de 2 nem de 5")
            }
        }
    }
}