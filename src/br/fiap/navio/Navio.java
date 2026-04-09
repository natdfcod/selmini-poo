package br.fiap.navio;

import br.fiap.carga.Carga;

public class Navio {
    private double capacidade;
    private int index;
    private Carga [] carga;

    public Navio() {
        this.capacidade = 10.000;
        this.index = 0;
        this.carga = new Carga[20];
    }
    public boolean reservar(Carga carga){
        if (permitirReservar(carga.getPeso())){
            this.carga[index++] = carga;
            return true;
        }
        return false;
    }

    private boolean permitirReservar(double peso) {
        double total = 0;
        for (int i = 0; i < index; i++) {
            total += carga[i].getPeso();
        }
        return (total + peso) <= capacidade && index <= this.carga.length;
    }

}
