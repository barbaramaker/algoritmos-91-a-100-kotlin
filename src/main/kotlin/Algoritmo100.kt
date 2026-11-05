// Código original
// Enunciado:
// Ler um número inteiro de 4 casas e imprimir se é ou não múltiplo de quatro o número formado pelos algarismos que estão nas casas das unidades de milhar e das centenas.
//
// prog se11
// int num, c;
// imprima "\nnumero de 4 algarismos: ";
// leia num;
// c <- num div 100;
// se( c % 4 == 0 )
// {imprima "\no numero e multiplo de 4: ",c;}
// senao
// {imprima "\no numero nao e multiplo de 4: ",c;}
// imprima "\n";
// fimprog


// Código em Kotlin

fun main() {
    print("Número de 4 algarismos: ")
    val num = readLine()?.toIntOrNull() ?: return

    val c = num / 100

    if (c % 4 == 0) {
        println("O número é múltiplo de 4: $c")
    } else {
        println("o numero nao e múltiplo de 4: $c")
    }
}