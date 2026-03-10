package ex6;

import java.io.StringReader;
import java.util.Random;

public class BilheteUnico {
    int numeroBilhete;
    String nome;
    private double saldo;
    final static double TARIFA = 5.40;
    String tipo;

    public BilheteUnico(String nome, String tipo){
        Random random = new Random();
        this.nome = nome;
        this.tipo = tipo;
        this.saldo = 0;
        this.numeroBilhete = random.nextInt(1000, 9999);
    }

    public void carregar(double valor){
        if (valor <= 0){
            System.out.println("Valor incorreto");
            return;
        }
        this.saldo += valor;
        System.out.print("Valor carregado com sucesso!");
    }
    public void catraca(){
        double valorDebito;

        if (tipo.equalsIgnoreCase("estudante")  || tipo.equalsIgnoreCase("professor")){
            valorDebito = TARIFA / 2;
        } else {
            valorDebito = TARIFA;
        }
        if(this.saldo > valorDebito){
            this.saldo -= valorDebito;
            System.out.printf("Passou na catraca!! Valor: %.2f | Saldo: %.2f\n", valorDebito, this.saldo);
        } else {
            System.out.printf("Saldo insuficiente: %.2f\n", this.saldo);
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
