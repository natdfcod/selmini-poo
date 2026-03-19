package ex9;

public class Veiculo {
    String marca;
    String modelo;
    String placa;
    Proprietario proprietario;
    Registro registro;

    public Veiculo(String marca, String modelo, String placa, Proprietario proprietario, Registro registro) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.proprietario = proprietario;
        this.registro = registro;
    }
}
