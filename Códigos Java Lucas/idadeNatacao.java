/* Elabore um algoritmo que dada a idade de um nadador classifica-o em uma das
seguintes categorias:
infantil A = 5 - 7 anos
infantil B = 8-10 anos
juvenil A = 11-13 anos
juvenil B = 14-17 anos
adulto = maiores de 18 anos */

import java.util.Scanner;

public class idadeNatacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;

        System.out.print("Qual a idade do nadador?: ");
        idade = input.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Infantil A.");
        }
        else if (idade >= 8 && idade <= 10){
            System.out.println("Infantil B.");
        }
        else if (idade >= 11 && idade <= 13){
            System.out.println("Juvenil A.");
        }
        else if (idade >= 14 && idade <= 17){
            System.out.println("Juvenil B.");
        }
        else if (idade >= 18){
            System.out.println("Adulto.");
        }
        else {
            System.out.println("Idade incorreta!");
        }
    }
}