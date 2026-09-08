package collections.ex3;

import java.util.*;

public class GerenciadorMatricula {
    public static void main(String[] args) {
        Set<Aluno> estrutura = new HashSet<>();
        estrutura.add(new Aluno(10, "Selmini", "ti"));
        estrutura.add(new Aluno(20, "Patrícia", "adm"));
        estrutura.add(new Aluno(30, "Nicolas", "si"));

        System.out.println("\nLista Estrutura:");
        estrutura.forEach(aluno -> {
            System.out.println(aluno);
        });

        Set<Aluno> banco = new HashSet<>();
        banco.add(new Aluno(50, "Israel", "front"));
        banco.add(new Aluno(20, "Patrícia", "adm"));
        banco.add(new Aluno(60, "Evelyn", "java"));

        System.out.println("\nLista Banco:");
        banco.forEach(aluno -> {
            System.out.println(aluno);
        });

        //União
        Set<Aluno> uniao = new HashSet<>(estrutura);
        uniao.addAll(banco);

        System.out.println("\nUnião das listas:");
        uniao.forEach(aluno -> {
            System.out.println(aluno);
        });

        //Intercecção
        Set<Aluno> interseccao = new HashSet<>(estrutura);
        interseccao.retainAll(banco);

        System.out.println("\nInterseção das listas:");
        interseccao.forEach(aluno -> {
            System.out.println(aluno);
        });

        //Somente em Estrutura
        Set<Aluno> onlyEstrutura = new HashSet<>(estrutura);
        onlyEstrutura.removeAll(banco);

        //Ordenando
        List<Aluno> lista = new ArrayList<>(onlyEstrutura);
        lista.sort(Comparator.comparing(Aluno::getNome));

        System.out.println("\nSo te em Estrutura:");
        onlyEstrutura.forEach(aluno -> {
            System.out.println(aluno);
        });


        //Somente em Banco
        Set<Aluno> onlyBanco = new HashSet<>(banco);
        onlyBanco.removeAll(estrutura);

        System.out.println("\nSo te em Banco:");
        onlyBanco.forEach(aluno -> {
            System.out.println(aluno);
        });

    }
}
