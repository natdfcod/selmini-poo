package ex13.contaPoupanca;

import ex13.conta.Conta;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(int numero, double saldoInicial, double taxaRendimento) {
        super(numero, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }
    public void aplicarRendimento(){
        saldo += saldo * taxaRendimento/100;
    }
}
