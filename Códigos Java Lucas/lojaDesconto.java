/* Uma loja fornece 10% de desconto para funcionários e 5% de desconto para
clientes vips. Faça um programa que calcule o valor total a ser pago por uma
pessoa. O programa deverá ler o valor total da compra efetuada e um código que
identifique se o comprador é um cliente comum (1), funcionário (2) ou vip (3). */

import java.util.Scanner;

public class lojaDesconto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigo;
        float valor;
        float total_pagar;

        System.out.println("### MENU ###\nCodigo - Tipo Cliente - Desconto\n");
        System.out.println("1 - Cliente Comum - Sem desconto\n2 - Funcionário - 10 porcento\n3 - VIP - 5 por cento\n");

        System.out.print("Qual valor a pagar? ");
        valor = input.nextFloat();

        System.out.print("Qual o codigo do cliente? ");
        codigo = input.nextInt();

        // Cálculo de valores
        switch (codigo) {
            case 1:
                System.out.printf("Sem desconto. O valor a pagar é de R$%.2f\n",valor);
                break;

            case 2:
                total_pagar = valor - (valor * 0.1f);
                System.out.print("O cliente é funcionário. Desconto de 10 por cento.\n");
                System.out.printf("Valor total a pagar é de R$%.2f",total_pagar);
                break;

            case 3:
                total_pagar = valor - (valor * 0.05f);
                System.out.print("O cliente é VIP. Desconto de 5 por cento.\n");
                System.out.printf("Valor total a pagar é de R$%.2f",total_pagar);
                break;

            default:
            System.out.printf("Sem desconto, pois o código do cliente não existe. O valor a pagar é de R$%.2f\n",valor);
            break;
        }
    }
}