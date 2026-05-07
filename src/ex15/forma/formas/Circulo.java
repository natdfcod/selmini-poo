package ex15.forma.formas;

import ex15.forma.Forma;
import ex15.ponto.Ponto;

public class Circulo extends Forma {
    private double raio;
    private Ponto ponto;

    public Circulo(double raio, Ponto ponto) {
        this.raio = raio;
        this.ponto = ponto;
    }

    public double calcularArea(){
        return Math.PI*raio*raio;
    }

    @Override
    public String toString() {
        String aux = "";
        aux += "Raio: " + raio + "\n";
        aux += ponto.toString();
        return aux;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }
}
