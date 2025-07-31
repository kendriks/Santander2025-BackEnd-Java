package Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do triângulo: ");
        int base = scanner.nextInt();

        System.out.println("Digite a aultura do triangulo: ");
        int altura = scanner.nextInt();

        int areaTriangulo = base * altura;

        System.out.println("A área do triângulo é igual a " + areaTriangulo);

    }
}
