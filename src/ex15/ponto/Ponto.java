package ex15.ponto;

public class Ponto {
    private int coordenadasX;
    private int coordenadasY;

    public Ponto(int coordenadasX, int getCoordenadasY) {
        this.coordenadasX = coordenadasX;
        this.coordenadasY = getCoordenadasY;
    }

    @Override
    public String toString() {
        return "(" + coordenadasX + ", " + coordenadasY + ")";
    }

    public int getCoordenadasX() {
        return coordenadasX;
    }

    public void setCoordenadasX(int coordenadasX) {
        this.coordenadasX = coordenadasX;
    }

    public int getCoordenadasY() {
        return coordenadasY;
    }

    public void setCoordenadasY(int coordenadasY) {
        this.coordenadasY = coordenadasY;
    }
}
