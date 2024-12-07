/**
 * @author Hammoud Aldalati
 * @version 03.12.2024
 *
 * Implementierung der Klasse Kreis mit 1 Attribut/Eigenschaft
 * radius
 * Entsprechend sind getter und setter fuer die Attribute vorhanden
 * Es sind Methoden zur Berechnung vom Umfang und von der Flaeche
 * */
package ls03.a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kreis {
    private double radius;
    private final Pattern regex = Pattern.compile("\\d+(\\.\\d*)?");
    private final Matcher matcher = regex.matcher(String.valueOf(radius));
    private final boolean isDecimal = matcher.find();

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if (isDecimal) {
            this.radius = radius;
        } else {
            System.out.println("radius is not correct, check your input");
        }
    }

    public double flaecheBerechnen(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public double umfangBerechnen(double radius) {
        return 2 * Math.PI * radius;
    }

}