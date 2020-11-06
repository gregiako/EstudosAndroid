/* Faça um programa que exiba na tela todos os números entre 83 e 108 que sejam
divisíveis por 9. */

public class multiplosNove {
    public static void main(String[] args) {
        int i = 83;

        while (i <= 108) {
            if (i % 9 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}