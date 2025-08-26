package atv02;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String r;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Caso escolha 1: café da manhã, caso escolha 2: Almoço - ");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Café da manhã servido das 6:00hrs às 10:00hrs");
                    break;

                case 2 :
                    System.out.println("Nosso restaurante abrirá a partir das 13:00hrs");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
            System.out.println("Para ver novamente digite 5: ");
            r = sc.next();
        } while(r.equalsIgnoreCase("5"));
    }
}
