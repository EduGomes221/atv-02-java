package atv02;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String x = sc.nextLine();
        System.out.println(x);

        System.out.println("Insira sua idade: ");
        int y = sc.nextInt();
        System.out.println(y);

        System.out.println("Insira sus altura: ");
        double z = sc.nextDouble();
        System.out.println(z);
        sc.close();
    }
}




