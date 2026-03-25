package ex9;

import java.time.Duration;
import java.time.LocalTime;

public class Registro {
    Veiculo veiculo;
    String inicioStr;
    String fimStr;

    public Registro(String inicioStr, Veiculo veiculo) {
        this.inicioStr = inicioStr;
        this.veiculo = veiculo;

    }
    public long calcularValor(){
        LocalTime inicio = LocalTime.parse(inicioStr);
        LocalTime fim = LocalTime.parse(fimStr);
        return Duration.between(inicio, fim).toMinutes();

    }

}
