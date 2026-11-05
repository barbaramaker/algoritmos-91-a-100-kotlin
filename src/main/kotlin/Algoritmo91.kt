// Código original
// Enunciado:
// Construir um algoritmo que leia dois valores numéricos inteiros e efetue a adição; caso o resultado seja maior que 10, apresentá-lo.
//
// prog se2
// int num1, num2, soma;
// imprima "\n\ndigite 1 numero: ";
// leia num1;
// imprima "\n\ndigite 2 numero: ";
// leia num2;
// soma <- num1 + num2;
// se ( soma > 10 )
// { imprima "\nsoma: " soma; }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite 1 número: ")
    val num1 = readLine()?.toIntOrNull() ?: return

    print("digite 2 número: ")
    val num2 = readLine()?.toIntOrNull() ?: return

    val soma = num1 + num2

    if (soma > 10) {
        println("Soma: $soma")
    }
}