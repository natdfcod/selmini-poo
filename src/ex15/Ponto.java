package ex15;

public class Ponto {
    private int coordenadasX;
    private int getCoordenadasY;

    public Ponto(int coordenadasX, int getCoordenadasY) {
        this.coordenadasX = coordenadasX;
        this.getCoordenadasY = getCoordenadasY;
    }

    @Override
    public String toString() {
        return "Ponto{" +
                "coordenadasX=" + coordenadasX +
                ", getCoordenadasY=" + getCoordenadasY +
                '}';
    }

    public int getCoordenadasX() {
        return coordenadasX;
    }

    public void setCoordenadasX(int coordenadasX) {
        this.coordenadasX = coordenadasX;
    }

    public int getGetCoordenadasY() {
        return getCoordenadasY;
    }

    public void setGetCoordenadasY(int getCoordenadasY) {
        this.getCoordenadasY = getCoordenadasY;
    }
}
