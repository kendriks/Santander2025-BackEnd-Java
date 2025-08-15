package ContaBancaria;

public class Conta {
    private double saldo;
    private double chequeEspecial;
    private double chequeEspecialUsado = 0;
    private boolean taxaCobrada = false;

    public Conta(double saldo) {
        this.saldo = saldo;
        this.chequeEspecial = calcularChequeEspecial();
    }

    double getSaldo() {
        return this.saldo;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
        this.chequeEspecial = calcularChequeEspecial();
    }

    double getChequeEspecial() {
        return this.chequeEspecial;
    }

    void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    void consultarSaldo() {
        System.out.println("o valor do saldo é igual a " + getSaldo());
    }

    public double getSaldoDisponivel() {
        return getSaldo() + chequeEspecial;
    }

    private double calcularChequeEspecial() {
        if (getSaldo() <= 500) {
            System.out.println("O valor do cheque especial é igual a  50");
            return 50;
        } else {
            System.out.println("O valor do cheque especial é igual a  " + getSaldo() * 0.5);
            return getSaldo() * 0.5;
        }
    }

    void consultarChequeEspecial() {
        double valorCheque = calcularChequeEspecial();
        System.out.println("O valor do cheque especial é igual a " + valorCheque);
    }

    void depositarDinheiro(int valor) {
        double deposito = this.saldo = getSaldo() + valor;
        this.chequeEspecial = calcularChequeEspecial();
        System.out.println("O seu novo saldo é " + deposito + " reais");
    }

    public void sacarDinheiro(int valor) {
        if (valor <= getSaldoDisponivel()) {
            saldo -= valor;
            if (saldo < 0) {
                chequeEspecialUsado = Math.abs(saldo);
            }
            System.out.println("Saque de R$" + valor + " realizado.");
            System.out.println("Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente(incluindo cheque especial)");

        }
    }

    public void pagarBoleto(int valor) {
        if (valor <= getSaldoDisponivel()) {
            this.saldo -= valor;
            System.out.println("Boleto de R$" + valor + " pago com sucesso.");

            if (chequeEspecialUsado > 0 && !taxaCobrada) {
                double taxa = chequeEspecial * 0.2;
                if (saldo >= taxa) {
                    saldo -= taxa;
                    taxaCobrada = true;
                    chequeEspecialUsado = 0;
                    System.out.println("Taxa de R$" + taxa + " foi cobrada pelo uso do cheque especial.");
                } else {
                    System.out.println("Taxa de cheque especial pendente: R$" + taxa);
                }
            }
        } else {
            System.out.println("Saldo insuficiente(incluindo cheque especial)");
        }
    }
}