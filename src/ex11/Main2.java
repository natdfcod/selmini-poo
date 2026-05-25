package ex11;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Empregado> lista = new ArrayList<>();

        lista.add(new EmpregadoComissionado(1, "Nicolas", 10, 10));
        lista.add(new EmpregadoHorista(2, "kENNY", 10, 10));
        lista.add(0, new EmpregadoHorista(3, "amorim", 10, 10));

//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i).matricula);
//        }
        for (Empregado empregado : lista){
            System.out.println(empregado);
            System.out.println(empregado.calcularSalario());
        }
    }
}
