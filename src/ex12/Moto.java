package ex12;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String placa, String marca, int cilindrada) {
        super(placa, marca);
        this.cilindradas = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCilindradas:" + this.cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
