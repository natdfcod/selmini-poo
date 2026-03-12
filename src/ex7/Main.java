package ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MonitorEnergia monitor = new MonitorEnergia(10);
        int dia = 1;

        do {
            System.out.printf("Digite a valor do dia %d: ", dia);
            dia = sc.nextInt();
            monitor.registroEnergiaPorDia(dia);
        } while (dia != 0);

        System.out.printf("%.2f",monitor.calcularMedia());
        System.out.printf("\n%.2f",monitor.calcularMedia(1, 2));




    }
}
