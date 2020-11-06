/* Faça um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual,
calcule e mostre:
a) a idade atual dessa pessoa.
b) quantos anos ela terá em 2038. */

import java.util.Scanner;

public class idadeFuturo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;
        int idade_futuro;
        int nascimento;
        int ano_atual;

        System.out.println("Qual seu nome? ");
        nome = input.nextLine();

        System.out.printf("Bem-vindo, %s. Quando você nasceu? ",nome);
        nascimento = input.nextInt();

        System.out.printf("Em que anos estamos? ");
        ano_atual = input.nextInt();

        // Cálculo de valores
        idade = ano_atual - nascimento;
        idade_futuro = 2038 - nascimento;

        System.out.printf("Olá, %s. Você possui %d anos.\n",nome,idade);
        System.out.printf("Em 2038 você terá %d anos.\n",idade_futuro);
    }
}