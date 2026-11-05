// Código original
// Enunciado:
// Entrar com um número e imprimir uma das mensagens: é multiplo de 3 ou não é multiplo de 3.
//
// prog se5
// int numero;
// imprima "\ndigite numero: ";
// leia numero;
// se ( numero % 3 == 0 )
// { imprima "\nmultiplo de 3 ";}
// senao
// { imprima "\nnao e multiplo de 3"; }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite número: ")
    val numero = readLine()?.toIntOrNull() ?: return

    if (numero % 3 == 0) {
        println("Múltiplo de 3")
    } else {
        println("Não é múltiplo de 3")
    }
}