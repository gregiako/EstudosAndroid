import java.util.Scanner;

public class variaveis {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;

        // Informando uma String
        System.out.println("Informe o seu nome, guri: ");
        nome = entrada.nextLine();

        // Informando um inteiro
        System.out.println("Informe sua idade, brow: ");
        idade = entrada.nextInt();

        // Exibindo os valores
        System.out.println(nome);
        System.out.println(idade);

        // Estrutura condicional
        if (nome != "Lucas" && idade < 18) {
            System.out.println("Tu não é o cara, vei. E ainda é de menor.");
        }
        else if (nome != "Lucas" && idade >= 18) {
            System.out.println("Tu não é o cara, vei. Pelo menos é maior de idade.");
        }
        else if (nome == "Lucas" && idade < 18) {
            System.out.println("Tu é o cara, meu chapa. Mas é menor de idade.");
        }
        else if (nome == "Lucas" && idade >= 18) {
            System.out.println("Tu é o cara, meu chapa. E ainda é maior de idade. TAMO JUNTO!");
        }
    }
}