package Q4;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Infome o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        while(true) {
            System.out.println("Digite o múltiplo!");
            int multiplo = scanner.nextInt();

            if(multiplo % primeiroNumero == 0) {
                continue;
            }

            if(multiplo < primeiroNumero) {
                break;
            }
        }
    }
}
