package Q1;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número!");
        int numero = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            int multiplicacao = numero * i;

            System.out.println(numero + " * " + i + " = " + multiplicacao);
        }
    }
}
