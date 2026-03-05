package ex5;

public class SenhaAtendimento {
    static int controle = 100;
    String nome;
    int senha;

    public SenhaAtendimento(String nome){
        this.nome = nome;
        this.senha = controle++;
    }

    public String getDados(){
        return "Paciente: " + nome + " | " + "Senha #" + senha;
    }

}
