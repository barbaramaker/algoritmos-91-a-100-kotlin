// Código original
// Enunciado:
// Entrar com um número e imprimir a raiz quadrada do número caso ele seja positivo e o quadrado do número caso ele seja negativo.
//
// prog se4
// real numero;
// imprima "\ndigite numero: ";
// leia numero;
// se ( numero > 0. )
// { imprima "\nraiz: " raiz(numero); }
// senao
// {
// se ( numero < 0. )
// { imprima "\nquadrado: " numero ** 2; }
// }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite número: ")
    val numero = readLine()?.toDoubleOrNull() ?: return

    if (numero > 0.0) {
        val raiz = kotlin.math.sqrt(numero)
        println("Raiz: $raiz")
    } else {
        if (numero < 0.0) {
            val quadrado = numero * numero
            println("Quadrado: $quadrado")
        }
    }
}