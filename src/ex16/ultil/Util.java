package ex16.ultil;

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
                    default -> showMessageDialog(null, "Digite somente números entre 1 e 5!!");
                }

            } catch (NumberFormatException e){
                showMessageDialog(null, "Digite somente números inteiros!!\n"+e.getMessage());
            }

        }while (opcao != 5);
    }
}

