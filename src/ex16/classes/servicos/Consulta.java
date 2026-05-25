package ex16.classes.servicos;

import ex16.classes.Animal;
import ex16.classes.Servico;

public class Consulta extends Servico {
    public Consulta(String descricao, int duracao) {
        super(descricao, duracao);
    }
    public double calcularCusto(Animal a) {
        return a.calcularPrecoBase() + 35;
    }
}
