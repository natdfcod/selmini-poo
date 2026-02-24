package ex1;

public class Conta {

    //atributos
    String titular;
    int numeroConta;
    double saldo;

    //metodo para depositar
    public void depositar(double valor){
        saldo += valor;
    }
    //sacar
    public void sacar(double valor){
        saldo -= valor;
    }
}
