/* Escrever um programa para ler um número inteiro e informar se ele é divisível
por 5. */

import java.util.Scanner;

public class divisivel5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        if (numero%5 == 0) {
            System.out.println("Número é divisível por 5.");
        }
        else {
            System.out.println("Número não é divisível por 5.");
        }
    }
}