/**
 * @author Hammoud Aldalati
 * @version 03.12.2024
 * @version 12.01.2025 
 *
 * * Implementierung der Klasse Rechteck
 * 
 * * Die Klasse Rechteck erbt von der abstrakten Klasse FigurZweiDimensional
 * * zur Berechnung von Flaeche und Umfang werden die Methoden aus der abstrakten Klasse FigurZweiDimensional implementiert
 * 
 * * Die Klasse Rechteck hat 2 Attribute: laenge und breite
 * 
 * * Die Klasse Rechteck hat 2 Konstruktoren:
 * * 1. Konstruktor: Rechteck(double laenge, double breite)
 * * 2. Copy-Konstruktor: Rechteck(Rechteck rechteck)
 * 
 * * Die Klasse Rechteck hat 2 getter und 2 setter Methoden:
 * * 1. getter: getLaenge()
 * * 2. getter: getBreite()
 * * 3. setter: setLaenge(double laenge)
 * * 4. setter: setBreite(double breite)
 * 
 * * Die Klasse Rechteck hat 3 Methoden:
 * * 1. Methode: berechneFlaeche() - berechnet die Flaeche des Rechtecks
 * * 2. Methode: berechneUmfang() - berechnet den Umfang des Rechtecks
 * * 3. Methode: toString() - gibt die Attribute des Rechtecks als String zurueck
 * 
 * * Fehlerbehandlung:  Ueberprueft die Laenge und Breite direkt beim Erstellen
 *      * Wenn die Laenge oder Breite kleiner oder gleich 0 ist, wird eine IllegalArgumentException geworfen
 *
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