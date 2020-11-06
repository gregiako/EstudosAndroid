/* Faça um programa que o usuário informe o salário recebido e o total gasto.
Deverá ser exibido na tela “Gastos dentro do orçamento” caso o valor gasto não
ultrapasse o valor do salário e “Orçamento estourado” se o valor gasto
ultrapassar o valor do salário. */

import java.util.Scanner;

public class gastosOrcamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float gastos;
        float salario;

        System.out.print("Qual seu salário?: ");
        salario = input.nextFloat();

        System.out.print("Quais foram seus gastos?: ");
        gastos = input.nextFloat();

        if (gastos > salario) {
            System.out.println("Orçamento estourado!");
        }
        else {
            System.out.println("Gastos dentro do orçamento.");
        }
    }
}