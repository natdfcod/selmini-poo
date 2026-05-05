package ex15;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Circulo> circulos = new ArrayList<>();
        ArrayList<Cilindro> cilindros = new ArrayList<>();

        circulos.add(new Circulo(5,new Ponto(0, 0)));
        circulos.add(new Circulo(1.5,new Ponto(2, 3)));
        circulos.add(new Circulo(10,new Ponto(-4, 7)));

        cilindros.add(new Cilindro(5, 10, new Ponto(0,0)));
        cilindros.add(new Cilindro(3, 7.5, new Ponto(1,1)));
        cilindros.add(new Cilindro(8, 2, new Ponto(2,-3)));

        //saida
        System.out.println("Circulos:");
        for(Circulo circulo : circulos){
            System.out.printf("Área: %.2f\n",circulo.calcularAreaBase());
        }
        System.out.println("******************************");
        System.out.println("Cilindros:");
        for (Cilindro cilindro : cilindros){
            System.out.printf("\nÁrea base: %.2f\nÁrea total: %.2f\nVolume: %.2f", cilindro.calcularAreaBase(), cilindro.calcularAreaTotal(), cilindro.calcularVolume());
        }
    }
}
