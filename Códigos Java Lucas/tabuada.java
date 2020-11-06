/* Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada
de 1 a 10 do valor lido. */

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int multiplicador;
        int total;

        System.out.print("Digite um número entre 1 e 10: ");
        numero = input.nextInt();

        if (numero > 10) {
            System.out.println("Inserir valores entre 1 e 10.");
        }
        else {
            for (multiplicador = 1; multiplicador <= 10 ; multiplicador++) {
                total = numero * multiplicador;
                System.out.printf("%d x %d = %d\n",numero,multiplicador,total);
            }
        }
    }
}