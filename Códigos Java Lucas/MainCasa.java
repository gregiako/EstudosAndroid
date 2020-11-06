import java.util.Scanner;

public class MainCasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Casa casa = new Casa();
        casa.setCor("Branca");
        casa.setTamanho(10);

        System.out.println(casa.getCor()); 
        System.out.println(casa.getTamanho());       
    }
}
