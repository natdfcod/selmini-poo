package funcional.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empregado> lista = new ArrayList<>();
        lista.add(new Empregado("Nicolas", 1000, 1));
        lista.add(new Empregado("Selmini", 1500, 3));
        lista.add(new Empregado("Kenny", 700, 2));
        lista.add(new Empregado("Gui", 800, 2));

        List<Empregado> ajuste = lista.stream()
                .map(empregado -> {
                    double valor;
                    if(empregado.anosDeExperinecia() >= 5){
                        valor = empregado.anosDeExperinecia() * 1.20;
                    } else {
                        valor = empregado.salario() * 1.10;
                    }
                    return new Empregado(empregado.nome(), valor, empregado.anosDeExperinecia());
                })
                .sorted(Comparator.comparing(Empregado::nome))
                .toList();
        System.out.println(ajuste);

    }
}
