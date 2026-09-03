package ex17;

import java.util.Objects;

public class Aluno {
    private int rm;
    private String nome;

    public Aluno(int rm, String nome) {
        this.rm = rm;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return rm == aluno.rm;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rm);
    }

    @Override
    public String toString() {
        return
                "| rm: " + rm + " | nome: " + nome + " |";
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
