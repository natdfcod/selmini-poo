package ex16.ultil;

import ex16.PetShop;
import ex16.classes.Animal;
import ex16.classes.Atendimento;
import ex16.classes.Servico;
import ex16.classes.animais.Cachorro;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.*;

public class Util {
    public void menu(){
        int opcao = 1;
        String aux = """
                [1] Cadastrar animal
                [2] Registrar serviço
                [3] Calcular conta total
                [4] Exibir relatório
                [5] Finalizar
                """;
        do {
            try{
                opcao = parseInt(showInputDialog(aux));
                switch (opcao){
                    case 1 -> cadastrarAnimal();
                    default -> showMessageDialog(null, "Digite somente números entre 1 e 5!!");
                }

            } catch (NumberFormatException e){
                showMessageDialog(null, "Digite somente números inteiros!!\n"+e.getMessage());
            }

        }while (opcao != 5);
    }

    private void cadastrarAnimal() {
        String nome = "";
        double peso = 0;
        int opcao;
        String aux = """
                Qual animal deseja cadastrar:
                [1] Cachorro
                [2] Gato
                [3] Passaro
                [4] Voltar
                """;
        do {
            opcao = parseInt(showInputDialog(aux));
            if(opcao<1 || opcao>4){
                showMessageDialog(null, "Opção invalida!!");
            } else {
                nome = showInputDialog("Nome do pet:");
                peso = parseInt(showInputDialog("Peso do pet:"));
            }
            switch (opcao){
                PetShop petShop = new PetShop();
                case 1 -> petShop.inserir(new Atendimento(new Cachorro(nome, peso), new Servico()));
            }
        } while (opcao != 4);

    }
}

