package ex11;

public class EmpregadoComissionado extends Empregado {
    double totalDeVendas;
    double comissao;

    public EmpregadoComissionado(long matricula, String nome, double totalDeVendas, double comissao) {
        super(matricula, nome);
        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }
    @Override
    public double calcularSalario(){
        return totalDeVendas * comissao / 100;
    }

    @Override
    public String toString() {
        return "EmpregadoComissionado{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", comissao=" + comissao +
                ", totalDeVendas=" + totalDeVendas +
                '}';
    }
}
