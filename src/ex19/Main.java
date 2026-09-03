package ex19;

import ex18.Aluno;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Frase -> ");
        String frase = sc.nextLine();
        Map<Character, Integer> mapa = new HashMap<>();

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (Character.isLetter(caracter)) {
                mapa.put(caracter, mapa.getOrDefault(caracter, 0) + 1);
            }
        }
        System.out.println(mapa);
    }
}
