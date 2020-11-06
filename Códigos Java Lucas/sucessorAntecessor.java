/* Fazer um algoritmo que leia um número inteiro e escreva o seu antecessor e o
seu sucessor. */
import java.util.Scanner;

public class sucessorAntecessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int sucessor;
        int antecessor;

        System.out.println("Bem vindo ao programa de gerar o número sucessor e antecessor.\n");

        // Inserir um valor
        System.out.println("Digite um número: ");
        numero = input.nextInt();

        // Cálculo de valores
        sucessor = numero + 1;
        antecessor = numero - 1;

        System.out.printf("O número escolhido foi: %d\n",numero);
        System.out.printf("Seu antecessor é: %d\n",antecessor);
        System.out.printf("Seu sucessor é: %d\n",sucessor);
    }
}