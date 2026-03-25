package ex9;

import java.util.Scanner;

public class Main {
    static Veiculo[] veiculos = new Veiculo[10];
    static Registro[] registros = new Registro[20];
    static Scanner sc = new Scanner(System.in);
    static int indexVeiculo;
    static int indexRegistro;
    static double receitaDia;
    static String ultimaPlacaPesquisada;

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
                case 3 -> estacionados();
                case 4 -> receita();
                case 5 -> System.out.println("Até logo!");
                default -> System.out.println("Valor invalido!");
            }
        } while (opcao != 5);
    }

    private static void receita() {
        System.out.printf("Receita do dia até agora foi de R$ %.2f\n", receitaDia);
    }

    private static void estacionados() {
        if(indexRegistro > 0) {
            for (int i = 0; i < indexRegistro; i++) {
                System.out.println("""
                        --------------
                        Placa: %s
                        Marca: %s
                        Modelo: %s
                        Nome: %s
                        Entrada: %s
                        """.formatted(registros[i].veiculo.placa, registros[i].veiculo.marca, registros[i].veiculo.modelo, registros[i].veiculo.proprietario.nome, registros[i].inicioStr));
            }
        } else {
            System.out.println("Nenhum registro encontrado!");}
    }

    private static void entrada() {

        Veiculo veiculo = pesquisarVeiculo();

        if (veiculo == null) {
            System.out.print("Digite o modelo do veiculo -> ");
            String modelo = sc.next();
            System.out.print("Digite a marca -> ");
            String marca = sc.next();
            System.out.print("Digite se nome -> ");
            String nome = sc.next();
            System.out.print("Digite seu CPF -> ");
            long cpf = sc.nextLong();
            veiculos[indexVeiculo] =  new Veiculo(marca, modelo, ultimaPlacaPesquisada, new Proprietario(nome, cpf));
            veiculo = veiculos[indexVeiculo];
            indexVeiculo++;
        } else if (existeEssaPlacaNoRegistro(veiculo)) {
            System.out.println("Esse carro ja está estacionado!");
            return;
        }
        System.out.print("Digite o hora de entrada (ex: hh:mm) -> ");
        String entrada = sc.next();
        registros[indexRegistro++] = new Registro(entrada, veiculo);
    }

    private static void saida() {
        String saida;
        long min;
        double valor;
        Registro registro = pesquisarRegistro();
        if (registro != null){
            System.out.print("Digite a hora de saída (ex: hh:mm) -> ");
            saida = sc.next();
            registro.fimStr = saida;
            min = registro.calcularValor();
            valor = min * 0.75;
            receitaDia += valor;
            System.out.println("---------------------------------");
            System.out.printf("Placa: %s Modelo: %s Marca: %s\n", registro.veiculo.placa, registro.veiculo.modelo, registro.veiculo.marca);
            System.out.printf("Entrada: %s | Saída: %s\n", registro.inicioStr, registro.fimStr);
            System.out.printf("Minutos ultilizados: %d\n", min);
            System.out.printf("Valor a pagar: %.2f\n", valor);
            System.out.println("---------------------------------");
            registros = retirarRegistro(registro);
            indexRegistro--;
        }

    }

    private static Registro[] retirarRegistro(Registro registro) {
        Registro[] registrosAtualizado = new Registro[20];
        int cont = 0;
        for (int i = 0; i < indexRegistro; i++) {
            if (registros[i] != registro) {
                registrosAtualizado[cont++] = registros[i];
            }
        }
        return registrosAtualizado;
    }

    private static boolean existeEssaPlacaNoRegistro(Veiculo veiculo) {
        for (int i = 0; i < indexRegistro; i++) {
            if (registros[i].veiculo.placa.equals(veiculo.placa)) {
                return true;
            }
        }
        return false;
    }
    private static Veiculo pesquisarVeiculo(){
        String placa;
        System.out.print("Informe a placa -> ");
        placa = sc.next();
        ultimaPlacaPesquisada = placa;
        for (int i = 0; i < indexVeiculo; i++) {
            if (veiculos[i].placa.equalsIgnoreCase(placa)){
                return veiculos[i];
            }
        }
        System.out.println("Placa não encontrada");
        return null;

    }
    private static Registro pesquisarRegistro(){
        String placa;
        System.out.print("Informe a placa -> ");
        placa = sc.next();
        ultimaPlacaPesquisada = placa;
        for (int i = 0; i < indexRegistro; i++) {
            if (registros[i].veiculo.placa.equalsIgnoreCase(placa)){
                return registros[i];
            }
        }
        System.out.println("Placa não encontrada");
        return null;

    }


}
