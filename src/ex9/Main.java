package ex9;

import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    static Veiculo[] veiculos = new Veiculo[10];
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
//            case 4 -> receita();
            case 5 -> System.out.println("Até logo!");
            default -> System.out.println("Valor invalido!");
        }
        } while (opcao != 5);
    }

    private static void relatorio() {
        for (int i = 0; i < index; i++) {
            System.out.printf("%d - Nome: %s | Placa: %s\n", i+1, veiculos[i].proprietario.nome, veiculos[i].placa);
        }
    }

    private static void saida() {
        String saida;
        long min;
        Veiculo veiculo = pesquisar();
        if (veiculo != null){
            System.out.println("Digite a hora de saída (ex: 09:30) -> ");
            saida = sc.next();
            veiculo.registro.fimStr = saida;
            min = veiculo.registro.calcularValor();
            System.out.printf("Placa: %s Modelo: %s Marca: %s\n", veiculo.placa, veiculo.modelo, veiculo.marca);
            System.out.printf("Entrada: %s | Saída: %s\n", veiculo.registro.inicioStr, veiculo.registro.fimStr);
            System.out.printf("Minutos ultilizados: %d\n", min);
            System.out.printf("Valor a pagar: %.2f\n", min * 0.75);
        }
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
        System.out.print("Digite o hora de entrada (ex: 11:50) -> ");
        String entrada = sc.next();
        System.out.print("Digite o modelo do veiculo -> ");
        String modelo = sc.next();
        System.out.print("Digite a marca -> ");
        String marca = sc.next();
        System.out.print("Digite se nome -> ");
        String nome = sc.next();
        System.out.print("Digite seu CPF -> ");
        long cpf = sc.nextLong();
        veiculos[index] = new Veiculo(marca, modelo, placa, new Proprietario(nome, cpf), new Registro(entrada, null));
        index++;
        }

    private static Veiculo pesquisar(){
        String placa;
        System.out.print("Qual placa da buscar? -> ");
        placa = sc.next();
        for (int i = 0; i < index; i++) {
            if (veiculos[i].placa.equalsIgnoreCase(placa)){
                return veiculos[i];
            }
        }
        System.out.println("Placa não encontrada");
        return null;

    }

}
