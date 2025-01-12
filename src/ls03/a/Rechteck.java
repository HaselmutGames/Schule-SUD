/**
 * @author Hammoud Aldalati
 * @version 03.12.2024
 *
 * Implementierung der Klasse Rechteck mit 2 Attributen/Eigenschaften
 * laenge und breite
 * Entsprechend sind getter und setter fuer die Attribute vorhanden
 * Zur Berechnung von Flaeche und Umfang werden die Methoden aus der abstrakten Klasse FigurZweiDimensional implementiert
 * */
package ls03.a;

public class Rechteck extends FigurZweiDimensional {
    private double laenge;
    private double breite;

    public Rechteck(double laenge, double breite) {
        setLaenge(laenge); // Ueberprüft die Laenge direkt beim Erstellen
        setBreite(breite); // Ueberprüft die Breite direkt beim Erstellen
    }

    // Copy-Konstruktor
    public Rechteck(Rechteck rechteck) {
        this.setLaenge(rechteck.getLaenge());
        this.setBreite(rechteck.getBreite());
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        if (laenge <= 0) {
            throw new IllegalArgumentException("Die Laenge muss groeßer als 0 sein.");
        }
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        if (breite <= 0) {
            throw new IllegalArgumentException("Die Breite muss groeßer als 0 sein.");
        }
        this.breite = breite;
    }

    @Override
    public double berechneFlaeche() {
        return laenge * breite; // Laenge * Breite
    }

    @Override
    public double berechneUmfang() {
        return 2 * (laenge + breite); // 2 * (Laenge + Breite)
    }

    @Override
    public String toString() {
        return "Rechteck{" +
                "laenge=" + laenge +
                ", breite=" + breite +
                ", flaeche=" + berechneFlaeche() +
                ", umfang=" + berechneUmfang() +
                '}';
    }
}