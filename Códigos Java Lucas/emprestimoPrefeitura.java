/* A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários
estatutários. O valor máximo da prestação não poderá ultrapassar 30% do salário
bruto. Fazer um algoritmo que permita entrar com o salário bruto e o valor da
prestação e informar se o empréstimo pode ou não ser concedido. */

import java.util.Scanner;

public class emprestimoPrefeitura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float salario_bruto;
        float prestacao;
        float total;

        System.out.print("Qual o salário bruto?: ");
        salario_bruto = input.nextFloat();

        System.out.print("Qual o valor da prestação?: ");
        prestacao = input.nextFloat();

        // Cálculo de valores
        total = salario_bruto * 0.3f;

        if (prestacao <= total) {
            System.out.printf("Empréstimo concedido.\n");
        }
        else {
            System.out.printf("Empréstimo não concedido.\n");
        }
    }
}