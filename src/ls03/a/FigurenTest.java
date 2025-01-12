package ls03.a;

public class FigurenTest {
    public static void main(String[] args) {

        // Test Fehlerbehandlung fuer die Klasse Kreis
        System.out.println("---- Test fuer Kreis ----");
        try {
            Kreis kreis = new Kreis(5.0);
            System.out.println("Gueltiger Kreis: " + kreis);

            // Teste Flaeche und Umfang
            System.out.println("Flaeche: " + kreis.berechneFlaeche());
            System.out.println("Umfang: " + kreis.berechneUmfang());
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler bei Kreis-Radius: " + e.getMessage());
        }

        try {
            // Teste ungueltigen Radius
            Kreis ungueltigerKreis = new Kreis(-2.0); // Sollte eine Exception werfen
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler bei Kreis-Radius: " + e.getMessage());
        }

        try {
            // Teste Kreis mit Radius 0
            Kreis nullRadiusKreis = new Kreis(0); // Sollte eine Exception werfen
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler bei Kreis-Radius: " + e.getMessage());
        }

        // Test für die Klasse Rechteck
        System.out.println("---- Test für Rechteck ----");
        try {
            Rechteck rechteck = new Rechteck(4.0, 3.0);
            System.out.println("Gueltiges Rechteck: " + rechteck);

            // Teste ungueltige Laenge
            Rechteck ungueltigeLaenge = new Rechteck(-4.0, 3.0); // Sollte eine Exception werfen
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler bei Rechteck-Laenge: " + e.getMessage());
        }

        try {
            // Teste ungueltige Breite
            Rechteck ungueltigeBreite = new Rechteck(4.0, 0); // Sollte eine Exception werfen
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler bei Rechteck-Breite: " + e.getMessage());
        }

        try {
            // Teste Rechteck mit gültigen Werten
            Rechteck gueltigesRechteck = new Rechteck(5.5, 2.2);
            System.out.println("Flaeche: " + gueltigesRechteck.berechneFlaeche());
            System.out.println("Umfang: " + gueltigesRechteck.berechneUmfang());
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler: " + e.getMessage());
        }

        // Teste Copy-Konstruktor für Kreis
        System.out.println("---- Test für Copy-Konstruktor von Kreis ----");
        try {
            Kreis originalKreis = new Kreis(3.0);
            Kreis kopierterKreis = new Kreis(originalKreis);
            System.out.println("Originaler Kreis: " + originalKreis);
            System.out.println("Kopierter Kreis: " + kopierterKreis);
            System.out.println("Sind die beiden Kreise unterschiedlich? " + (originalKreis != kopierterKreis));
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler bei Kreis-Radius: " + e.getMessage());
        }

        // Teste Copy-Konstruktor für Rechteck
        System.out.println("---- Test für Copy-Konstruktor von Rechteck ----");
        try {
            Rechteck originalRechteck = new Rechteck(6.0, 4.0);
            Rechteck kopiertesRechteck = new Rechteck(originalRechteck);
            System.out.println("Originales Rechteck: " + originalRechteck);
            System.out.println("Kopiertes Rechteck: " + kopiertesRechteck);
            System.out.println("Sind die beiden Rechtecke unterschiedlich? " + (originalRechteck != kopiertesRechteck));
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler bei Rechteck: " + e.getMessage());
        }

        // Test Fehlerbehandlung fuer die Klasse Dreieck
        System.out.println("---- Test fuer Dreieck ----");
        try {
            Dreieck dreieck = new Dreieck(3, 4, 5);
            System.out.println(dreieck);
            System.out.println("Umfang: " + dreieck.berechneUmfang());
            System.out.println("Fläche: " + dreieck.berechneFlaeche());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        try {
            Dreieck ungueltigesDreieck = new Dreieck(1, 2, 3); // Ungültiges Dreieck
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}