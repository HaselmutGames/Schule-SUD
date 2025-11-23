package ls01.b;

import java.util.Scanner;

public class LS01BusTarif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Kilometerzahl
        System.out.print("Bitte geben Sie die Kilometeranzahl ein: ");
        int kilometer = scanner.nextInt();

        // Variable für den Fahrtarif
        double tarif;

        // Berechnung des Tarifs je nach Kilometeranzahl
        if (kilometer <= 20) {
            tarif = kilometer * 0.28;
        } else if (kilometer <= 50) {
            tarif = 20 * 0.28 + (kilometer - 20) * 0.25;
        } else {
            tarif = 20 * 0.28 + 30 * 0.25 + (kilometer - 50) * 0.20;
        }

        // Ausgabe des Ergebnisses mit einer Ausgabeanweisung
        System.out.printf("Der Fahrtarif beträgt: %.2f Euro%n", tarif);

        scanner.close();
    }
}
