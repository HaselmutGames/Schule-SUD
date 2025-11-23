package ls01.b;

import java.util.Scanner;

public class LS01MonatsUmwandlung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Zahl
        System.out.print("Bitte geben Sie eine Zahl von 1 bis 12 ein: ");
        int monat = scanner.nextInt();

        // Array mit den Monatsnamen
        String[] monate = {
                "Januar", "Februar", "März", "April", "Mai", "Juni",
                "Juli", "August", "September", "Oktober", "November", "Dezember"
        };

        // Überprüfung der Eingabe und Ausgabe des Monatsnamens oder Fehlermeldung
        if (monat >= 1 && monat <= 12) {
            System.out.println("Der Monat ist: " + monate[monat - 1]);
        } else {
            System.out.println("Diesen Monat gibt es nicht.");
        }

        scanner.close();
    }
}
