package ls01.c;

import java.util.Random;
import java.util.Scanner;

public class LS02RateZahl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int anzahlRunden = 0;
        int zufallZahl = random.nextInt(0, 16);
        int eingabeZahl = -1;
        System.out.println("Geben Sie eine Zahl zwischen 0 und 15 ein!");

        while (eingabeZahl != zufallZahl) {
            eingabeZahl = scanner.nextInt();
            if(eingabeZahl < zufallZahl){
                System.out.println("Die eingegebene Zahl war zu klein");
            }
            if(eingabeZahl > zufallZahl){
                System.out.println("Die eingegebene Zahl war zu gross");
            }
            anzahlRunden += 1;
        }
        System.out.println("Zahl erraten! " + zufallZahl);
        System.out.println("Anzahl der gebrauchten Runden ist: " + anzahlRunden);
        scanner.close();
    }
}
