package ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MonitorEnergia monitor = new MonitorEnergia(10);

        monitor.registroEnergiaPorDia(2);
        monitor.registroEnergiaPorDia(2);
        monitor.registroEnergiaPorDia(4);

        System.out.printf("%.2f",monitor.calcularMedia());
        System.out.printf("\n%.2f",monitor.calcularMedia(1, 2));




    }
}
