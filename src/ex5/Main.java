package ex5;

public class Main {
    public static void main(String[] args) {
        SenhaAtendimento p1 = new SenhaAtendimento("Nicolas");
        SenhaAtendimento p2 = new SenhaAtendimento("Amorim");
        SenhaAtendimento p3 = new SenhaAtendimento("Kenny");

        System.out.println(p1.getDados());
        System.out.println(p2.getDados());
        System.out.println(p3.getDados());

        System.out.println(SenhaAtendimento.controle);

    }
}
