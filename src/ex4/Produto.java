package ex4;

public class Produto {
    String nome;
    double valor;
    int qntd;

    public Produto(String nome, double valor, int qntd){
        this.nome = nome;
        this.valor = valor;
        this.qntd = qntd;
    }

    public void aumentaValor(double porcentagem){
        this.valor*= (1+(porcentagem / 100));
    }
}
