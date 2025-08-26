package atv02;
import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        String r;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        do {
            System.out.println("Insira o seu nome: ");
            String nome = sc2.nextLine();
            System.out.println(nome);

            System.out.println("Insira a sua idade: ");
            int idade = sc.nextInt();
            System.out.println(idade);

            System.out.println("Para ver novamente digite 5: ");
            r = sc.next();
        } while (r.equalsIgnoreCase("5"));

    }
}