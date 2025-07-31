package Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado ");
        int lado = scanner.nextInt();

        int area = lado * lado;

        System.out.println("A área do Quadrado é igual a " + area);
    }
}