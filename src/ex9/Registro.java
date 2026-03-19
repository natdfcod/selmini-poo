package ex9;

import java.time.Duration;
import java.time.LocalTime;

public class Registro {
    String inicioStr;
    String fimStr;

    public Registro(String inicioStr, String fimStr) {
        this.inicioStr = inicioStr;
        this.fimStr = fimStr;
    }
    public long calcularValor(){
        LocalTime inicio = LocalTime.parse(inicioStr);
        LocalTime fim = LocalTime.parse(fimStr);
        return Duration.between(inicio, fim).toMinutes();

    }

}
