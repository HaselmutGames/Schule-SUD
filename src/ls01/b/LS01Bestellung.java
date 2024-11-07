package ls01.b;

import java.util.Scanner;

public class LS01Bestellung {

    public static void main(String[] args) {
        int bestellMenge = 0;
        double preis = 0.00;
        double bestellWert = 0.00;
        double versandKosten = 0.00;
        double rechnungsBetrag = 0.00;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bestellmenge bidde...");
        bestellMenge = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nun Preis!");
        preis = scanner.nextDouble();

        bestellWert = bestellMenge * preis;

        if (bestellWert < 100) {
            versandKosten = 5.50;
        } else if (bestellWert >= 100 && bestellWert < 200) {
            versandKosten = 3.00;
        } else {

        }
        rechnungsBetrag = bestellWert + versandKosten;

        System.out.println("Besellwert: " + bestellWert + "\t Versandkosten: " + versandKosten + "\t Rechnungsbetrag: "
                + rechnungsBetrag);
        scanner.close();
    }

}
