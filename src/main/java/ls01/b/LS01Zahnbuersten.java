package ls01.b;

import java.util.Scanner;

public class LS01Zahnbuersten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Konstanten
        final double PREIS_ZAHNBÜRSTE = 2.50;
        final int MENGE_RABATT_5_PROZENT = 500;
        final int MENGE_RABATT_10_PROZENT = 20000;
        final double RABATT_5_PROZENT = 0.05;
        final double RABATT_10_PROZENT = 0.10;
        final double RABATT_WEICH_KINDER = 0.05;
        final double RABATT_KINDER = 0.02;
        final double RABATT_WEICH_NORMAL_GROSS = 0.01;
        final double ZUSCHLAG_HART_NORMAL = 0.025;
        final double ZUSCHLAG_HART_GROSS = 0.05;

        // Eingaben
        System.out.print("Geben Sie die Bestellmenge ein: ");
        int bestellmenge = scanner.nextInt();
        scanner.nextLine();  // Puffer leeren

        System.out.print("Geben Sie die Kategorie der Borsten ein (weich, mittelhart, hart): ");
        String borstenKategorie = scanner.nextLine().toLowerCase();

        System.out.print("Geben Sie die Griffbezeichnung ein (groß, normal, kinder): ");
        String griffBezeichnung = scanner.nextLine().toLowerCase();

        // Preisberechnung
        double preis = PREIS_ZAHNBÜRSTE * bestellmenge;
        double rabatt = 0;

        // Mengenrabatt
        if (bestellmenge >= MENGE_RABATT_10_PROZENT) {
            rabatt = RABATT_10_PROZENT;
        } else if (bestellmenge >= MENGE_RABATT_5_PROZENT) {
            rabatt = RABATT_5_PROZENT;
        }

        double rabattierterPreis = preis * (1 - rabatt);

        // Zusätzliche Rabatte und Zuschläge
        if (borstenKategorie.equals("weich") && griffBezeichnung.equals("kinder")) {
            rabattierterPreis *= (1 - RABATT_WEICH_KINDER);
        } else if (griffBezeichnung.equals("kinder")) {
            rabattierterPreis *= (1 - RABATT_KINDER);
        } else if (borstenKategorie.equals("weich") && (griffBezeichnung.equals("normal") || griffBezeichnung.equals("groß"))) {
            rabattierterPreis *= (1 - RABATT_WEICH_NORMAL_GROSS);
        } else if (borstenKategorie.equals("hart") && griffBezeichnung.equals("normal")) {
            rabattierterPreis *= (1 + ZUSCHLAG_HART_NORMAL);
        } else if (borstenKategorie.equals("hart") && griffBezeichnung.equals("groß")) {
            rabattierterPreis *= (1 + ZUSCHLAG_HART_GROSS);
        }

        // Ergebnisse anzeigen
        double gesamtRabatt = preis - rabattierterPreis;
        System.out.printf("Der Gesamtpreis nach Rabatten beträgt: %.2f Euro\n", rabattierterPreis);
        System.out.printf("Der Gesamtrabatt beträgt: %.2f Euro\n", gesamtRabatt);

        scanner.close();
    }
}
