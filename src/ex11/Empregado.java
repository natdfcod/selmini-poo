package ex11;

public abstract class Empregado {
    long matricula;
    String nome;

    public Empregado(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Empregado{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }
}
