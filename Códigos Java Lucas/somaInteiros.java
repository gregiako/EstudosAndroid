/* Ler 2 valores, calcular e escrever a soma dos inteiros existentes entre os 2
valores lidos (incluindo os valores lidos na soma). Considere que o segundo
valor lido será sempre maior que o primeiro valor lido. */

import java.util.Scanner;

public class somaInteiros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor1;
        int valor2;
        int x; // Um contador para o for()
        int soma1;
        int soma2 = 0;

        System.out.print("Digite um número: ");
        valor1 = input.nextInt();

        System.out.print("Digite outro número: ");
        valor2 = input.nextInt();

        soma1 = valor1 + valor2;

        if (valor2 > valor1) {
            for(x = valor1; x <= valor2; x++) {
                soma2 = soma2 + x;
            }
            System.out.printf("A soma destes numeros é %d e dos numeros que estão entre eles é %d.\n",soma1, soma2);
        }
    }
}