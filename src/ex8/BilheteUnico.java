package ex8;

import java.util.Random;

public class BilheteUnico {
    int numeroBilhete;
    private double saldo;
    final static double TARIFA = 5.4;
    Usuario usuario;

    public BilheteUnico(Usuario usuario){
        Random random = new Random();
        this.numeroBilhete = random.nextInt(1000, 9999);
        this.saldo = 0;
        this.usuario = usuario;
    }

    public void carregar(double valor){
        if (valor <= 0){
            System.out.println("Valor incorreto");
            return;
        }
        this.saldo += valor;
        System.out.print("Valor carregado com sucesso!");
    }
    public boolean catraca(){
        double valorDebito = TARIFA;

        //verificação de tipo
        if (usuario.tipoTarifa.equalsIgnoreCase("estudante")||
        usuario.tipoTarifa.equalsIgnoreCase("professor")){
            valorDebito /= 2;
        }
        //verificação de saldo
        if (saldo <= valorDebito){
            saldo -= valorDebito;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
}
