package ex16.classes.animais;

import ex16.classes.Animal;

public class Gato extends Animal {
    String pelo;
    public Gato(String nome, double peso, String pelo) {
        super(nome, peso);
        this.pelo = pelo;
    }
    @Override
    public double calcularPrecoBase(){
        if (pelo.equalsIgnoreCase("curto")){
            return 45;
        }
        return 65;
    }
}
