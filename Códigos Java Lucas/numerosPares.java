/* Fazer um programa para encontrar todos os pares entre 1 e 100. */

public class numerosPares {
    public static void main(String[] args) {
        for (int numero = 1; numero < 101; numero++){
            if (numero % 2 == 0){
                System.out.printf("O número %d é par.\n", numero);
            }
        }
    }
}