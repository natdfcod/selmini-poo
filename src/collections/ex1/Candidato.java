package collections.ex1;

public class Candidato {
    private String nome;
    private double notaTecnica;
    private int anoExperiencia;

    public Candidato(String nome, double notaTecnica, int anoExperiencia) {
        this.nome = nome;
        this.notaTecnica = notaTecnica;
        this.anoExperiencia = anoExperiencia;
    }

    @Override
    public String toString() {
        return nome + " | " + notaTecnica + " | " + anoExperiencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaTecnica() {
        return notaTecnica;
    }

    public void setNotaTecnica(double notaTecnica) {
        this.notaTecnica = notaTecnica;
    }

    public int getAnoExperiencia() {
        return anoExperiencia;
    }

    public void setAnoExperiencia(int anoExperiencia) {
        this.anoExperiencia = anoExperiencia;
    }
}
