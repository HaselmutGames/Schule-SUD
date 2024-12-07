/**
 * @author Hammoud Aldalati
 * @version 03.12.2024
 *
 * Implementierung der Klasse Rechteck mit 2 Attributen/Eigenschaften
 * laenge und breite
 * Entsprechend sind getter und setter fuer die Attribute vorhanden
 * Es sind Methoden zur Berechnung vom Umfang und von der Flaeche
 * */
package ls03.a;

public class Rechteck {
    private double laenge;
    private double breite;

    public double getLaenge() {
        return this.laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getBreite() {
        return this.breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double flaecheBerechnen(double laenge, double breite) {
        return laenge * breite;
    }

    public double umfangBerechnen(double laenge, double breite) {
        return 2 * laenge + 2 * breite;
    }
}