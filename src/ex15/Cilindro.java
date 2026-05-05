package ex15;

public class Cilindro extends Circulo{
    private double raio;
    private double altura;
    private Ponto ponto;

    public Cilindro(double raio, double altura, Ponto ponto) {
        super(raio, ponto);
        this.altura = altura;
    }

    public double calcularAreaTotal(){
        return 2*Math.PI*raio*(raio+altura);
    }

    public double calcularVolume(){
        return Math.PI*raio*raio*altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "raio=" + raio +
                ", altura=" + altura +
                ", ponto=" + ponto +
                '}';
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
