// Código original
// Enunciado:
// Construir um algoritmo que leia dois números e efetue a adição. Caso o valor somado seja maior que 20, este deverá ser apresentado somando-se a ele mais 8; caso o valor somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se 5.
//
// prog se3
// real numl, num2, soma;
// imrpima "\ndigite 1 numero: " ;
// leia num1;
// imprima "\ndigite 2 numero:" ;
// leia num2;
// soma <- num1 + num2;
// se ( soma > 20. )
// { imprima "\nsoma: ", soma + 8; }
// senao
// { imprima "\nsoma: ", soma - 5; }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite 1 número: ")
    val num1 = readLine()?.toDoubleOrNull() ?: return

    print("Digite 2 número: ")
    val num2 = readLine()?.toDoubleOrNull() ?: return

    val soma = num1 + num2

    if (soma > 20.0) {
        println("Soma: ${soma + 8}")
    } else {
        println("Soma: ${soma - 5}")
    }
}