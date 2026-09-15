package funcional.ex1;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Nicolas", "Kenny", "Gui", "Laura");

        List<String> nomesOrdenados = lista.stream()
                .filter(nome -> nome.startsWith("A"))
                .map(nome -> nome.toUpperCase())
                .sorted()
                .toList();

        nomesOrdenados.forEach(System.out::println);

    }
}
