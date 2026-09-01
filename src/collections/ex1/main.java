package collections.ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        try {
            if (args[0].equals("--amanha")){
                System.out.println("oi Kenny");
            }
        }catch (Exception e){
            System.out.println("SO o gui");
        }
        List<Candidato> lista = new ArrayList<>();
        lista.add(new Candidato("Kenny", 5.3,5));
        lista.add(new Candidato("Gui", 4.5,2));
        lista.add(new Candidato("Nicolas", 5.3,2));
        lista.add(new Candidato("Selmini", 10,10));

        //ordenar
        lista.sort(Comparator.comparingDouble(Candidato::getNotaTecnica).reversed().thenComparingInt(Candidato::getAnoExperiencia).reversed().thenComparing(Candidato::getNome));

        //printar
        lista.forEach(canditato -> {
            System.out.println(canditato);
        });
    }
}
