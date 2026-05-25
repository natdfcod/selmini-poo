package ex15;

import ex15.forma.Forma;
import ex15.forma.formas.Cilindro;
import ex15.forma.formas.Circulo;
import ex15.ponto.Ponto;
import ex15.volume.Volume;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Forma> lista = new LinkedList<>();
        lista.add(new Circulo(2, new Ponto(2, 2)));
        lista.add(new Cilindro(3, 3, new Ponto(3,3)));
        lista.add(new Circulo(2, new Ponto(2, 2)));
        lista.add(new Cilindro(3, 3, new Ponto(3,3)));

        imprimir(lista);
    }

    private static void imprimir(List<Forma> lista) {
        for (Forma item : lista){
            System.out.println(item);
            System.out.printf("Área: %.1f\n",item.calcularArea());
            if (item instanceof Volume){
                System.out.printf("Volume: %.1f", ((Volume) item).calcularVolume());
            }
            System.out.println();

        }
    }
}
