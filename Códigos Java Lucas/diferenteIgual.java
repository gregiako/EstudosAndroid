/* Faça um algoritmo para ler dois números inteiros e informar se estes são iguais
ou diferentes. */

import java.util.Scanner;

public class diferenteIgual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Olá. Muito bem-vindo!\n");

        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        System.out.print("Insira o segundo número: ");
        num2 = input.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são iguais.");
        }
        else {
            System.out.println("Os números são diferentes.");
        }
    }
}