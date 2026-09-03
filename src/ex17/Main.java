package ex17;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Aluno> lista = new HashSet<Aluno>();
        lista.add(new Aluno(10, "selmini"));
        lista.add(new Aluno(20, "patricia"));
        lista.add(new Aluno(10, "selmini"));
        lista.add(new Aluno(30, "kenny"));

        lista.forEach(aluno -> {
            System.out.println(aluno);
        });

    }
}
