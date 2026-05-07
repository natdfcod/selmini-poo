package ex15.forma.formas;

import ex15.forma.Forma;
import ex15.ponto.Ponto;
import ex15.volume.Volume;

public class Cilindro extends Forma implements Volume {
    private double raio;
    private double altura;
    private Ponto ponto;

    public Cilindro(double raio, double altura, Ponto ponto) {
        this.raio = raio;
        this.altura = altura;
        this.ponto = ponto;
    }

    public double calcularArea(){
        return 2*Math.PI*raio*(raio+altura);
    }

    public double calcularVolume(){
        return Math.PI*raio*raio*altura;
    }

    @Override
    public String toString() {
        String aux = "";
        aux += "Raio: " + raio + "\n";
        aux += "Altura: " + altura + "\n";
        aux += ponto.toString();
        return aux;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }
}
