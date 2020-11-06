/* Ler dois números e imprimir todos os números entre eles. Suponha que o
segundo número é maior que o primeiro. */

import java.util.Scanner;

public class somaTodosnumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;
        int soma;
        int cont; // Contador

        System.out.print("Insira um número: ");
        numero1 = input.nextInt();

        System.out.print("Insira outro número: ");
        numero2 = input.nextInt();

        if (numero2 > numero1) {
            for (cont = numero1 + 1; cont < numero2; cont++) {
                System.out.println(cont);
            }
        }
        else {
            System.out.println("O segundo número não é maior que o primeiro.");
        }
    }
}