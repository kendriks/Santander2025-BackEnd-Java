package Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o ano do seu nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = 2025 - anoNascimento;

        System.out.println("Olá, " + nome + " você tem " + idade + " anos");
    }
}
