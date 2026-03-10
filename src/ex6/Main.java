package ex6;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static BilheteUnico bilhete;
    static {
        System.out.print("Digite seu nome: ");
        String nome = sc.next();
        System.out.print("Digite seu tipo de tarifa (Estudadnte, Professor ou Comum): ");
        String tipo = sc.next().toLowerCase();
        while (!(tipo.equals("estudadnte"))  && !(tipo.equals("professor")) && !(tipo.equals("comum"))){
            System.out.println("Valor incorreto de tipo!!");
            System.out.print("Digite um tipo valido (Estudadnte, Professor ou Comum): ");
            tipo = sc.next().toLowerCase();
        }
        bilhete = new BilheteUnico(nome, tipo);
    }
    public static void main(String[] args) {
        int resp;
        do {
            System.out.print("""
                    \n*******************
                    Nome: %s | Tipo: %s
                    Número do bilhete: %s
                    1 - Carregar Bilhete
                    2 - Consultar Saldo
                    3 - Passar na Catraca
                    4 - Finalizar
                    Digite sua opção:""".formatted(bilhete.nome, bilhete.tipo, bilhete.numeroBilhete));
            resp = sc.nextInt();
            switch (resp){
                case 1:
                    System.out.print("Digite o valor a ser carregado: R$");
                    bilhete.carregar(sc.nextDouble());
                    break;
                case 2:
                    System.out.printf("Seu saldo atual é de R$%.2f", bilhete.getSaldo());
                    break;
                case 3:
                    bilhete.catraca();
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
            }
        }while (resp != 4);
        System.out.println("Sistema finalizado!");
    }

}
