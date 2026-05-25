package ex13.contaCorrente;

import ex13.conta.Conta;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numero, double saldoInicial, double limite) {
        super(numero, saldoInicial);
        this.limite = limite;
    }

    @Override
    public double getSaldoDisponivel() {
        return this.saldo + this.limite;
    }
}
