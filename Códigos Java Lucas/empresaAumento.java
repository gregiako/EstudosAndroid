/* Uma empresa concederá um aumento de salário aos seus funcionários, variável
de acordo com o cargo, conforme a tabela abaixo. Faça um algoritmo que leia o
salário e o cargo de um funcionário (pelo código) e calcule o novo salário. Se o
cargo do funcionário não estiver na tabela, ele deverá, então, receber 40% de
aumento. Mostre o salário antigo, o novo salário e a diferença.

Código - Cargo - Percentual
101 - Gerente - 10%
102 - Engenheiro - 20%
103 - Técnico - 30% 
Se não estiver na tabela, terá aumento de 40%
*/

import java.util.Scanner;

public class empresaAumento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float salario;
        int codigo;
        float total;

        System.out.print("Qual o salário?: ");
        salario = input.nextFloat();

        System.out.print("Qual o cargo do funcionário?: ");
        codigo = input.nextInt();

        switch (codigo) {
            case 101:
                total = salario + (salario * 0.1f);
                System.out.printf("O cargo é Gerente.\nO total é de R$%.2f\n",total);
                break;

            case 102:
                total = salario + (salario * 0.2f);
                System.out.printf("O cargo é Engenheiro.\nO total é de R$%.2f\n",total);
                break;

            case 103:
                total = salario + (salario * 0.3f);
                System.out.printf("O cargo é Técnico.\nO total é de R$%.2f\n",total);
                break;

            default:
                total = salario + (salario * 0.4f);
                System.out.printf("Outros cargos.\nO total é de R$%.2f\n",total);
                break;
        }
    }
}