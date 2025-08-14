import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta conta = new Conta(600);

        boolean continuar = true;

        while(continuar) {
            System.out.println("Escolha uma operação: ");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Consultar cheque especial");
            System.out.println("3. Depositar dinheiro");
            System.out.println("4. Sacar dinheiro");
            System.out.println("5. Pagar um boleto");
            System.out.println("6. Verificar se a conta está usando cheque especial");

            int option = scanner.nextInt();

            switch (option) {
                case 1: {
                    conta.consultarSaldo();
                    break;
                }

                case 2: {
                    conta.consultarChequeEspecial();
                    break;
                }

                case 3: {
                    System.out.println("Digite o valor do depósito");
                    int valorDeposito = scanner.nextInt();
                    conta.depositarDinheiro(valorDeposito);
                    break;
                }

                case 4: {
                    System.out.println("Digite o valor a ser sacado");
                    int valorSaque = scanner.nextInt();
                    conta.sacarDinheiro(valorSaque);
                    break;
                }

                case 5: {
                    System.out.println("Digite o valor do boleto");
                    int valorBoleto = scanner.nextInt();
                    conta.pagarBoleto(valorBoleto);
                    break;
                }

                case 6: {
                    if(conta.getSaldo() < 0) {
                        System.out.println("A conta está usando o cheque especial");
                    } else {
                        System.out.println("A conta não está usando o cheque especial");
                    }
                    break;
                }

                case 0: {
                    continuar = false;
                    System.out.println("Sessão encerrada");
                    break;
                }

                default: {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }

        scanner.close();
    }
}
