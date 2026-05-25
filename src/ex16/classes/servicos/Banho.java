package ex16.classes.servicos;

import ex16.classes.Animal;
import ex16.classes.Servico;

public class Banho extends Servico {
    public Banho(String descricao, int duracao) {
        super(descricao, duracao);
    }
    public double calcularCusto(Animal a){
        return a.calcularPrecoBase()+(duracao * 0.5);
    }

}
