package ex16.classes.animais;

import ex16.classes.Animal;

public class Passaro extends Animal {
    public Passaro(String nome, double peso) {
        super(nome, peso);
    }
    public double calcularPrecoBase(){
        return 30;
    }

}
