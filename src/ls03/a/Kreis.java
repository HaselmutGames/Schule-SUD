/**
 * @author Hammoud Aldalati
 * @version 03.12.2024
 *
 * Implementierung der Klasse Kreis mit 1 Attribut/Eigenschaft
 * radius
 * Entsprechend sind getter und setter fuer die Attribute vorhanden
 * Zur Berechnung von Flaeche und Umfang werden die Methoden aus der abstrakten Klasse FigurZweiDimensional implementiert
 * */
package ls03.a;

public class Kreis extends FigurZweiDimensional {
    private double radius;

    public Kreis(double radius) {
        setRadius(radius); // Ueberprueft den Radius direkt beim Erstellen
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Der Radius muss groeßer als 0 sein.");
        }
        this.radius = radius;
    }

    @Override
    public double berechneFlaeche() {
        return Math.PI * radius * radius; // π * r²
    }

    @Override
    public double berechneUmfang() {
        return 2 * Math.PI * radius; // 2 * π * r
    }

    @Override
    public String toString() {
        return "Kreis{" +
                "radius=" + radius +
                ", flaeche=" + berechneFlaeche() +
                ", umfang=" + berechneUmfang() +
                '}';
    }
}