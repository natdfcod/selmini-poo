package ex11;

public class Main {
    public static void main(String[] args) {
        Empregado[] empregados = new Empregado[4];
        empregados[0] = new EmpregadoComissionado(1234567890, "Nicolas", 350000, 20);
        empregados[1] = new EmpregadoComissionado(98765432, "Amorim", 20000, 20);
        empregados[2] = new EmpregadoHorista(434324342, "Kenny", 170, 20);
        empregados[3] = new EmpregadoHorista(752423432, "Lucas", 160, 40);

        for(Empregado e : empregados){
            System.out.println(e.matricula);
            System.out.println(e.nome);
            System.out.println(e.calcularSalario());
            System.out.println();

        }
    }
}
