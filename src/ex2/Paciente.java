package ex2;

public class Paciente {
    String nome;
    int idade;

    public Paciente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public int calcularFrequencia(){
        return 220-idade;
    }

    public double[] calcularAlvo(){
        double[] valores = new double[2];
        int fm = calcularFrequencia();
        valores[0] = fm * 0.5;
        valores[1] = fm * 0.85;
        return valores;
    }

}
