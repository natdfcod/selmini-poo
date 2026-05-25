package ex16;

import ex16.classes.Atendimento;

import java.util.ArrayList;

public class PetShop {
    private ArrayList<Atendimento> lista;

    public PetShop() {
        this.lista = new ArrayList<>();
    }

    public void inserir(Atendimento atendimento){
        lista.add(atendimento);
    }
}
