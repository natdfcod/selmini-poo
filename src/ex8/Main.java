package ex8;

import java.util.Scanner;

public class Main {
    static BilheteUnico[] bilhete = new BilheteUnico[2];
    static Scanner sc = new Scanner(System.in);
    static int index;
    public static void main(String[] args) {
        int opcao;
        do {
        System.out.println("""
                [1] Cadastrar bilhete
                [2] Carregar bilhete
                [3] Consultar saldo
                [4] Passar na catraca
                [5] Finalizar:""");
        opcao = sc.nextInt();
        switch (opcao){
            case 1:
                cadastrar();
                break;
            case 2:

        }
       }while (opcao != 5);


    }
    public static void cadastrar(){

        if (index < bilhete.length){
            System.out.print("Digite o seu nome --> ");
            String nome = sc.next();
            System.out.print("Digite o seu CPF --> ");
            long cpf = sc.nextLong();
            System.out.print("Digite o seu tipo de tarifa (estudante, professor ou comum) --> ");
            String tipo = sc.next();
            bilhete[index] = new BilheteUnico(new Usuario(nome, cpf, tipo));
            index++;
        } else {
            System.out.println("Erro ao gerar o bilhete! Procure um posto de atendimento ");
        }
    }
    public static BilheteUnico pesquisar(){
        long cpf;
        System.out.print("Qual CPF qur buscar?");
        cpf = sc.nextLong();
        for (int i = 0; i < index; i++) {
            if (bilhete[i].usuario.cpf == cpf){
                return bilhete[i];
            }
        }
        System.out.println("CPF não encontrado");
        return null;


    }
}
