import java.util.Random;

public class gerarTextoAutomatico {
    public static void main(String[] args) {
        System.out.println("\n\nBem vindo ao programa de gerar frases aleaórias!\n\n");
        
        String[] frases = {
            "Quero churros.",
            "Quero o almoço.",
            "Cade a Dolly?",
            "Não aceite nada de estranhos.",
            "Você já tem dívidas o suficiente para isso."
        };

        int numero = new Random().nextInt(4);

        System.out.printf("A frase do dia é: %s \n",frases[numero]);
    }
}