package ex14.itemCardapio;

import java.text.DecimalFormat;

public abstract class ItemCardapio {
    protected String nome;
    protected double precoBase;

    public ItemCardapio(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public abstract double calcularValor();

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return nome + " - " + df.format(calcularValor());
    }
}
