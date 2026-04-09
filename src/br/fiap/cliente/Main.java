package br.fiap.cliente;

public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente(1, "Selmini Selmini");
        System.out.println(c.getCliente());
        c.setCliente("Selmini Junior");
        System.out.println(c.getCliente());
    }
}
