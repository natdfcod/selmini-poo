package ex7;

public class MonitorEnergia {
    double[] consumo;
    int cont = 0;

    public MonitorEnergia(int tamanho) {
        this.consumo = new double[tamanho];
    }
    public void registroEnergiaPorDia(double valor){
        if (cont < consumo.length) {
            this.consumo[cont] = valor;
            cont++;
        }
    }

    public double calcularMedia(){
        double soma = 0;
        for (int i = 0; i < cont; i++) {
            soma += consumo[i];
        }
        return soma/cont;
    }

    public double calcularMedia(int inicio, int termino){
        double soma = 0;
        for (int i = inicio-1; i < termino-1; i++) {
            soma += consumo[i];

        }
        return soma/(termino-inicio);
    }
}
