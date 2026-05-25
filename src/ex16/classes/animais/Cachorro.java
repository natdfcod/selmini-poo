package ex16.classes.animais;

import ex16.classes.Animal;

public class Cachorro extends Animal {

    public Cachorro(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public double calcularPrecoBase(){
        if(peso <= 10){
            return 40;
        }
        if (peso <= 25){
            return 60;
        }
        return 85;
    }
}
