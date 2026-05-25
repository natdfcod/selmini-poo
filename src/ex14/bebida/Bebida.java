package ex14.bebida;

import ex14.itemCardapio.ItemCardapio;

public class Bebida extends ItemCardapio {
    private boolean alcolica;

    public Bebida(String nome, double precoBase, boolean alcolica) {
        super(nome, precoBase);
        this.alcolica = alcolica;
    }

    @Override
    public double calcularValor() {
        if (alcolica) {
            return precoBase * 1.20;
        }
        return precoBase;
    }
}
