package ex14.prato;

import ex14.itemCardapio.ItemCardapio;

public class Prato extends ItemCardapio {
    public Prato(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularValor() {
        return precoBase * 1.10;
    }
}
