package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double valor;
        int qntd;

        System.out.print("Digite o nome do produto: ");
        nome = sc.next();
        System.out.print("Digite o valor do produto: R$ ");
        valor = sc.nextDouble();
        System.out.print("Digite a quantidade do produto: ");
        qntd = sc.nextInt();

        Produto p1 = new Produto(nome, valor, qntd);
        System.out.printf("%.2f", p1.valor);

        System.out.print("Digite o valor da procentagem:");

        p1.aumentaValor(sc.nextInt());
        System.out.printf("%.2f", p1.valor);
    }
}
