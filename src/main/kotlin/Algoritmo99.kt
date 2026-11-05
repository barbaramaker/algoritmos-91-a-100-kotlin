// Código original
// Enunciado:
// Ler um número inteiro de 3 casas decimais e imprimir
// se o algarismo da casa das centenas é par ou ímpar.
//
// prog se10
// int num, c;
// imprima "\nnumero de 3 algarismos: ";
// leia num;
// c <- num div 100;
// se( c % 2 == 0 )
// {imprima "\no algarismo das centenas e par: ",c;}
// senao
// {imprima "\no algarismo das centenas e impar: ",c;}
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Número de 3 algarismos: ")
    val num = readLine()?.toIntOrNull() ?: return

    val c = num / 100

    if (c % 2 == 0) {
        println("O algarismo das centenas é par: $c")
    } else {
        println("O algarismo das centenas é ímpar: $c")
    }
}