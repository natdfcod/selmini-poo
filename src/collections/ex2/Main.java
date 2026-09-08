package collections.ex2;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Aluno> lista = new HashSet<>();
        lista.add(new Aluno(10, "Selmini"));
        lista.add(new Aluno(20, "Patrícia"));
        lista.add(new Aluno(10, "Selmini"));
        lista.add(new Aluno(30, "Age"));

        lista.forEach(aluno -> {
            System.out.println(aluno);
        });

    }



}
