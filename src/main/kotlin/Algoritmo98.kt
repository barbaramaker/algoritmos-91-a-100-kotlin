// Código original
// Enunciado:
// A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários
// estatutários. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
// Fazer um algoritmo que permita entrar com o salário bruto e o valor da prestação e informar
// se o empréstimo pode ou não ser concedido.
//
// prog se9
// real sb, vp;
// imprima "\ndigite o salario: ";
// leia sb;
// imprima "\ndigite o valor da prestacao: ";
// leia vp;
// se( vp <= 0.3 * sb )
// {imprima " \nemprestimo concedido ";}
// senao
// {imprima "\nemprestimo negado ";}
// imprima "\n";
// fimprog

fun main() {
    print("Digite o salário: ")
    val sb = readLine()?.toDoubleOrNull() ?: return

    print("Digite o valor da prestação: ")
    val vp = readLine()?.toDoubleOrNull() ?: return

    if (vp <= 0.3 * sb) {
        println("Empréstimo concedido")
    } else {
        println("Empréstimo negado")
    }
}