package ex12;

public abstract class Veiculo {
    protected String placa;
    protected String marca;

    public Veiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Placa: "+this.placa+"\nMarca: "+this.marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
