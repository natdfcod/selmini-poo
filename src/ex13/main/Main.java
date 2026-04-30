package ex13.main;

import ex13.conta.Conta;
import ex13.contaCorrente.ContaCorrente;
import ex13.contaPoupanca.ContaPoupanca;

import javax.xml.transform.dom.DOMResult;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<>();

        lista.add(new ContaCorrente(1, 1000, 2000));
        lista.add(new ContaPoupanca(2, 500, 10));

        for (Conta conta : lista){
            conta.depositar(2000);
            System.out.println(conta.getSaldoDisponivel());
        }
    }
}
