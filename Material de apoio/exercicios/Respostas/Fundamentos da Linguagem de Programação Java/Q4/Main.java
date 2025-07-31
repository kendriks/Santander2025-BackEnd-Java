package Q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa :");
        String nomePessoa1 = scanner.nextLine();

        System.out.println("Digite o nome da segunda pessoa :");
        String nomePessoa2 = scanner.nextLine();

        System.out.println("Digite a idade da primeira pessoa :");
        int idadePessoa1 = scanner.nextInt();

        System.out.println("Digite a idade da segunda pessoa :");
        int idadePessoa2 = scanner.nextInt();

        int diferencaIdade = idadePessoa1 - idadePessoa2;
        if (diferencaIdade < 0) {
            diferencaIdade = diferencaIdade * -1;
        }

        System.out.println("A diferença de idade entre " + nomePessoa1 + " e " + nomePessoa2 + " é de " + diferencaIdade);
    }
}
