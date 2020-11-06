/* Faça um algoritmo que receba o salário-base de um funcionário, calcule e
mostre o salário a receber, sabendo-se que esse funcionário tem gratificação de
5% sobre o salário-base e paga imposto de 7% sobre o total. */

import java.util.Scanner;

public class salarioBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        float salario_base;
        float salario_receber;
        float total;

        System.out.println("Digite o nome do funcionário: ");
        nome = input.nextLine();

        System.out.println("Digite o salário base do funcionário: ");
        salario_base = input.nextFloat();

        // Cálculo de valores - Aumento de 5% do salário base
        salario_receber = salario_base + (salario_base * 0.05f);
        // Desconto de 7% do total
        total = salario_receber - (salario_receber * 0.07f);

        System.out.printf("O salário com aumento de 5 por cento é de R$%.2f\n",salario_receber);
        System.out.printf("O salário com desconto de 7 por cento do total é de R$%.2f\n",total);
    }
}