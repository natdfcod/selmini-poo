package ex1;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        Conta conta = new Conta();

        System.out.println("Nome do titular:");
        conta.titular = sc.next();
        conta.numeroConta = rd.nextInt(1000, 9999);
        System.out.printf("Saldo incial: %.2f", conta.saldo);
        System.out.println("Digite o valor do deposito: ");
        conta.depositar(sc.nextDouble());
        System.out.println("Digite o valor de saque:");
        conta.sacar(sc.nextDouble());
        System.out.printf("Valor %.2f Conta: %d", conta.saldo, conta.numeroConta);
    }
}
