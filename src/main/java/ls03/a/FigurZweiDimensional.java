/**
 * @author Hammoud
 * @version 03.12.2024
 *
 * Um Gemeinsamkeiten zu abstrahieren, kann eine Basisklasse FigurZweiDimensional erstellt werden,
 * von der die Klassen Kreis, Rechteck und Dreieck erben können
 * */
package ls03.a;

public abstract class FigurZweiDimensional {

    public abstract double berechneFlaeche();

    public abstract double berechneUmfang();
}
