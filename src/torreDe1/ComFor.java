package torreDe1;

public class ComFor {
    public static String[] lista = new String[]{" "," "," "," "," "," "," "," "," "," " };
    static void main() {
        imprimir("1");
    }

    private static void imprimir(String i) {
        for (int j = 9; j >= 0; j--) {
            lista[j] = i;
            for (String a : lista) {
                System.out.print(a);
            }
            System.out.println();

        }
    }
}
