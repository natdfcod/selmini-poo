package ex14.main;

import ex14.bebida.Bebida;
import ex14.itemCardapio.ItemCardapio;
import ex14.prato.Prato;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double total = 0;
        ArrayList<ItemCardapio> lista = new ArrayList<>();

        lista.add(new Prato("Macarrão", 50));
        lista.add(new Prato("Pizza", 70));
        lista.add(new Bebida("Martini", 40, true));
        lista.add(new Bebida("Coca-Cola", 10, false));

        for (ItemCardapio itemCardapio : lista) {
            System.out.println(itemCardapio);
            total += itemCardapio.calcularValor();
        }
        System.out.println("Total: " + total);
    }
}
