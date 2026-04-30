package ex13.conta;

public class Conta {
    protected int numero;
    protected double saldo;

    public Conta(int numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public double getSaldoDisponivel() {
        return saldo;
    }
}
