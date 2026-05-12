package ex16;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class PetShop {
    public class Main {
        public static void main(String[] args) {


            int opcao;
            do {
                String aux = "";
                aux += "[1] Cadastrar animal\n";
                aux += "[2] Registrar serviço\n";
                aux += "[3] Calcular conta tota\n";
                aux += "[4] Exibir relatório\n";
                aux += "[5] Finalizar\n";
                opcao = parseInt(showInputDialog(aux));


            } while (opcao != 5);
        }
    }

}
