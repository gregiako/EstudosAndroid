/* Faça o algoritmo que leia o valor de uma conta de luz (CL) e, caso o valor seja
maior que R$ 150,00, apresente a mensagem: “Você está gastando muito”. Caso
contrário exiba a mensagem: “Seu gasto foi normal”. */

import java.util.Scanner;

public class contaLuz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float cl;

        System.out.print("Quais foram seus gastos com energia?: ");
        cl = input.nextFloat();

        if (cl > 150) {
            System.out.println("Você está gastando muito!");
        }
        else {
            System.out.println("Seu gasto foi normal.");
        }
    }
}