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
            case 1 -> cadastrar();
            case 2 -> carregar();
            case 3 -> consultarSaldo();
            case 4 -> passarCatraca();
            case 5 -> System.out.println("Até breve!!");
            default -> System.out.println("Opção infvalida!");
        }
            System.out.println("\n#######################################");
       }while (opcao != 5);


    }

    private static void passarCatraca() {
        BilheteUnico bilheteUnico = pesquisar();
        if (bilheteUnico != null){
            if (bilheteUnico.catraca()){
                System.out.println("Passou na catraca!");
            } else {
            System.out.println("Saldo insuficiente!");
            }
            System.out.printf("Seu saldo atual é de R$ %.2f",bilheteUnico.getSaldo());
        }
    }

    private static void consultarSaldo() {
        BilheteUnico bilheteUnico = pesquisar();
        if (bilheteUnico != null){
            System.out.printf("Seu saldo atual é de R$ %.2f",bilheteUnico.getSaldo());
        }
    }

    private static void carregar() {
        double valor;
        BilheteUnico bilheteUnico = pesquisar();
        if (bilheteUnico != null){
            System.out.print("Quanto deseja carregar? ->");
            valor = sc.nextDouble();
            bilheteUnico.carregar(valor);
        }

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
        System.out.print("Qual CPF qur buscar? -> ");
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
