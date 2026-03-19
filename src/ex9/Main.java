package ex9;

import java.util.Scanner;

public class Main {
    static Veiculo[] veiculos = new Veiculo[2];
    static Scanner sc = new Scanner(System.in);
    static int index;

    public static void main(String[] args) {
        int opcao;
        do {

        System.out.println("""
                #### Estacionamento ParkEasy ####
                [1] Entrada de veículo
                [2] Saída de veículo
                [3] Imprimir veículos estacionados
                [4] Imprimir a receita
                [5] Finalizar""");
        opcao = sc.nextInt();

        switch (opcao){
            case 1 -> entrada();
            case 2 -> saida();
            case 3 -> relatorio();
            case 4 -> receita();
            case 5 -> System.out.println("Até logo!");
            default -> System.out.println("Valor invalido!");
        }
        } while (opcao != 5);
    }

    private static void saida() {

    }

    private static void entrada() {
        System.out.println("Digite sua placa -> ");
        String placa = sc.next();
        for (int i = 0; i < index; i++) {
            if (placa.equalsIgnoreCase(veiculos[i].placa)){
                System.out.println("Placa já registrada!");
                return;
            }
        }
        System.out.print("Digite o modelo do veiculo -> ");
        String modelo = sc.next();
        System.out.print("Digite a marca -> ");
        String marca = sc.next();
        System.out.println("Digite se nome -> ");
        String nome = sc.next();
        System.out.println("Digite seu CPF -> ");
        long cpf = sc.nextLong();
        veiculos[index] = new Veiculo(marca, modelo, placa, new Proprietario(nome, cpf));
        index++;
        }


    }

}
