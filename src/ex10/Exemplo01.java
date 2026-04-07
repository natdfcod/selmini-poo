package ex10;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Exemplo01 {
    public static void main(String[] args) {
//        showMessageDialog(null, "Olá");
//        showInputDialog("Qual é sua idade?");
//        showConfirmDialog(null, "Tem crtza?");
        int valor1, valor2, resultado;
        valor1 = parseInt(showInputDialog("Primeiro valor"));
        valor2 = parseInt(showInputDialog("Segundo valor"));
        resultado = valor1 + valor2;
        showMessageDialog(null, resultado);
    }
}
