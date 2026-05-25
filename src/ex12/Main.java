package ex12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> lista = new ArrayList<>();

        lista.add(new Carro("jdkjf", "Honda", 4));
        lista.add(new Carro("ieria", "Hyundai", 2));
        lista.add(new Moto("oiihu", "Honda", 4));

        for (Veiculo veiculo : lista){
            System.out.println(veiculo);
            System.out.println();
        }
    }
}
