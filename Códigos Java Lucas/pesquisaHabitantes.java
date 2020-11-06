/* Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os
dados de idade, sexo (M/F) e salário. Faça um algoritmo que informe:
a) a média de salário do grupo;
b) quantidade de mulheres com salário até R$1500,00. */

import java.util.Scanner;

public class pesquisaHabitantes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char sexo;
        int hab;
        float salario;
        float salarioTotal = 0;
        float media;
        int mulheres = 0; // Contador.


        for (hab = 0; hab <= 4; hab++){
            System.out.print("Qual o sexo? (M-Masculino ou F-Feminino): ");
            sexo = input.next().charAt(0);

            System.out.print("Qual o salário?: ");
            salario = input.nextFloat();
            
            salarioTotal += salario;

            if (sexo == 'F' && salario < 1500) {
                mulheres++;
            }
        }

        media = salarioTotal / hab;

        System.out.printf("A média dos salários do grupo é de R$%.2f \n",media);
        System.out.printf("O total de mulheres que recebem menos de R$1500,00 são %d pessoas.\n",mulheres);
    }
}