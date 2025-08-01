package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o seu nome!");
        String nome = scanner.nextLine();

        System.out.println("Digite o número da conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência!");
        int agenciaConta = scanner.nextInt();

        System.out.println("Digite o saldo da conta!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
