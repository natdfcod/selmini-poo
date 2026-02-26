package ex2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;

        //pegando dados
        System.out.println("Digite seu nome:");
        nome = sc.next();
        System.out.println("Digite sua idade");
        idade = sc.nextInt();

        //instanciando p1
        Paciente p1 = new Paciente(nome, idade);
        //jogando o vetor ja
        double[] intervalo = p1.calcularAlvo();

        //exibindo os metodos
        System.out.println("Paciente: "+nome);
        System.out.println("Sua frequancia cardiaca maxima é: "+p1.calcularFrequencia());
        System.out.printf("Seu alvo esta entre %.1f e %.1f\n", intervalo[0], intervalo[1]);



    }
}
