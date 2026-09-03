package ex18;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Aluno> lista = new HashMap<>();
        lista.put(10,new Aluno(12,"Fernando"));
        lista.put(20,new Aluno(20,"Kenny"));
        lista.put(30,new Aluno(30,"gui"));

//        lista.forEach((rm, aluno) -> {
//            System.out.println(aluno);
//        });

        for(Map.Entry<Integer, Aluno> aluno : lista.entrySet()){
            System.out.println("Chave: " + aluno.getKey() + " - " + aluno.getValue());
        }

    }
}
