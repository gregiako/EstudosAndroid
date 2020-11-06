/* Leia 5 idades e calcule a média entre as idades (usar uma variável para idade).*/

import java.util.Scanner;

public class mediaIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        int cont; // Contador.
        int somaIdades = 0;
        int media;
        
        for (cont = 0; cont < 5; cont++) {
            System.out.print("Insira uma idade: ");
            idade = input.nextInt();

            somaIdades += idade;
        }
        media = somaIdades / cont;

        System.out.printf("A média das idades é: %d\n",media);
    }
}