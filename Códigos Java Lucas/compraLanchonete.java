/* O cardápio de uma lanchonete é o seguinte:

Especificação (item) - Código - Preço
Cachorro quente - 100 - R$1,20
Bauru simples - 101 - R$1,30
Bauru com ovo - 102 - R$1,50
Hamburguer - 103 - R$1,20
Cheeseburguer - 104 - R$1,30
Refrigerante - 105 - R$1,00

Escrever um algoritmo que leia o código do item pedido, a quantidade e calcule
o valor a ser pago por aquele lanche. Considere que a cada execução somente
será calculado um item. */

import java.util.Scanner;

public class compraLanchonete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float total;
        int codigo;
        int quantidade;

        System.out.print("Qual o codigo do pedido?: ");
        codigo = input.nextInt();

        System.out.print("Qual a quantidade desejada: ");
        quantidade = input.nextInt();

        switch (codigo) {
            case 100:
                total = quantidade * 1.20f;
                System.out.printf("Cachorro quente.\nO total a pagar é de R$%.2f\n",total);
                break;

            case 101:
                total = quantidade * 1.30f;
                System.out.printf("Bauru simples.\nO total a pagar é de R$%.2f\n",total);
                break;

            case 102:
                total = quantidade * 1.50f;
                System.out.printf("Bauru com ovo.\nO total a pagar é de R$%.2f\n",total);
                break;
            
            case 103:
                total = quantidade * 1.20f;
                System.out.printf("Hamburguer.\nO total a pagar é de R$%.2f\n",total);
                break;

            case 104:
                total = quantidade * 1.30f;
                System.out.printf("Cheeseburguer.\nO total a pagar é de R$%.2f\n",total);
                break;

            case 105:
                total = quantidade * 1.00f;
                System.out.printf("Refrigerante.\nO total a pagar é de R$%.2f\n",total);
                break;

            default:
                System.out.println("Codigo inválido!");
        }
    }
}