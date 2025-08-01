package Q2;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite o seu peso");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if(imc <= 18.5) {
            System.out.println("Você está abaixo do peso");
        } else if(imc >= 18.6 && imc <= 24.9) {
            System.out.println("Você está no peso ideal");
        } else if(imc >= 25.0 && imc <= 29.9) {
            System.out.println("Você está levemente acima do peso");
        } else if(imc >= 30.0 && imc <= 34.9) {
            System.out.println("Você está em obesidade grau I");
        } else if(imc >= 35.0 && imc <= 39.9) {
            System.out.println("Você está em obesidade grau II(Severa");
        } else {
            System.out.println("Você está em obesidade grau III(Mórbida)");
        }
    }
}
