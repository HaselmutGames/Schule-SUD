package ls01.b;

import java.util.Scanner;

public class LS01Kindergeld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Anzahl der Kinder
        System.out.print("Bitte geben Sie die Anzahl der Kinder ein: ");
        int kinder = scanner.nextInt();

        // Eingabe des Einkommens
        System.out.print("Bitte geben Sie Ihr Einkommen ein: ");
        int einkommen = scanner.nextInt();

        // Variable für das Gesamtkindergeld
        int kindergeld = 0;

        // Kindergeld-Berechnung
        for (int i = 1; i <= kinder; i++) {
            if (einkommen < 45000) {
                if (i == 1) kindergeld += 70;
                else if (i == 2) kindergeld += 130;
                else if (i == 3) kindergeld += 220;
                else kindergeld += 240;
            } else {
                if (i == 1) kindergeld += 70;
                else if (i == 2) kindergeld += 70;
                else if (i == 3) kindergeld += 140;
                else kindergeld += 140;
            }
        }

        // Ausgabe des Gesamtkindergeldes
        System.out.println("Das Gesamtkindergeld beträgt: " + kindergeld + " Euro.");

        scanner.close();
    }
}

