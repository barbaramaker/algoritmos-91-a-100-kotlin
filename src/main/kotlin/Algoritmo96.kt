// Código original
// Enunciado:
// Entrar com um número e informar se ele é divisível por 3 e por 7.
//
// prog se7
// int numero;
// imprima "\ndigite numero: ";
// leia numero;
// se (numero % 3==0 && numero %7==0 ) / *poderia testar (numero % 21 == 0) */
// { imprima "\ndivisivel por 3 e por 7"; }
// senao
// { imprima "\nnão e divisivel por 3 e por 7"; }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite número: ")
    val numero = readLine()?.toIntOrNull() ?: return

    if (numero % 3 == 0 && numero % 7 == 0) {
        println("Divisível por 3 e por 7")
    } else {
        println("Não é divisível por 3 e por 7")
    }
}