package ex11;

public class EmpregadoHorista extends Empregado {
    int horasTrabalhadas;
    double valorDaHora;

    public EmpregadoHorista(long matricula, String nome, int totalDeHorasTrabalhados, double valorDaHora) {
        super(matricula, nome);
        horasTrabalhadas = totalDeHorasTrabalhados;
        this.valorDaHora = valorDaHora;
    }
    public double calcularSalario(){
        return horasTrabalhadas * valorDaHora;
    }
}
