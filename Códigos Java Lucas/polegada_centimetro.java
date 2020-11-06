/* Ler uma medida em polegadas e imprimir a equivalente em centímetros,
sabendo que 2.54 cm equivale a 1 polegada. */

import java.util.Scanner;

public class polegada_centimetro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float polegada;
        float centimetro;

        System.out.println("Digite um valor para a medida em polegadas: ");
        polegada = input.nextFloat();

        // Cálculo de valores
        centimetro = polegada * 2.54f;

        System.out.printf("O valor em polegada é de %.2f\n",polegada);
        System.out.printf("E seu valor em centímetros é de %.2f\n", centimetro);
    }
}