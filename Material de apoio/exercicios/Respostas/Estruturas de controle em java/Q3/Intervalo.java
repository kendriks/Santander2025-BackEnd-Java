package Q3;

import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o menor número inteiro do intervalo");
        int menorNumero = scanner.nextInt();

        System.out.println("Digite o maior número inteiro do intervalo");
        int maiorNumero = scanner.nextInt();

        System.out.println("Deseja exibir os números ímpares ou pares?");
        var option = scanner.next();

        switch (option) {
            case "pares": {
                int i = maiorNumero;

                while(i >= menorNumero) {
                    if(i % 2 == 0) {
                        System.out.println(i);
                        i -= 2;
                    } else {
                        i -= 1;
                    }
                }
            } break;

            case "impares": {
                int i = maiorNumero;

                while(i >= menorNumero) {
                    if(i % 2 != 0) {
                        System.out.println(i);
                        i -= 2;
                    } else {
                        i -= 1;
                    }
                }
            } break;
        }
    }
}