/* Leia nome, salário e categoria de um funcionário, se a categoria for igual a “m”
de mensalista, conceder 10% de aumento, se for igual a “h” de horista, conceder
20% de aumento, se não for “m” nem “h”, exibir a mensagem categoria inválida. */

import java.util.Scanner;

public class mensalistaHorista {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        float salario;
        float total;
        char categoria;

        System.out.print("Qual o nome do funcionário?: ");
        nome = input.nextLine();

        System.out.print("Qual o salário do funcionário?: ");
        salario = input.nextFloat();

        System.out.print("Qual a categoria (M ou H): ");
        categoria =  input.next().charAt(0);

        if (categoria == 'M') {
            total = salario + (salario * 0.1f);
            System.out.printf("%s.\nMensalista.\nO total é de R$%.2f",nome,total);
        }
        else if (categoria == 'H') {
            total = salario + (salario * 0.2f);
            System.out.printf("%s.\nHorista.\nO total é de R$%.2f",nome,total);
        }
        else {
            System.out.println("Categoria inválida.");
        }
    }
}