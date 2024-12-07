package ls03.a;

public class KreisRechteckTest {
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
    }
}
