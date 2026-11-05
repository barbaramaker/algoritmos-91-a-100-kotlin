// Código original
// Enunciado:
// Entrar com um número e informar se ele é ou não divisível por 5.
//
// prog se6
// int numero;
// imprima "\ndigite numero: ";
// leia numero;
// se ( numero % 5 == 0 )
// { imprima "\ne divisivel por 5 "; }
// senao
// { imprima "\nnao e divisivel por 5"; }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite número: ")
    val numero = readLine()?.toIntOrNull() ?: return

    if (numero % 5 == 0) {
        println("É divisível por 5")
    } else {
        println("Não é divisível por 5")
    }
}