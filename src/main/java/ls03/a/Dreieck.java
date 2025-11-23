package ls03.a;

public class Dreieck extends FigurZweiDimensional {
    private double seiteA;
    private double seiteB;
    private double seiteC;

    // Konstruktor
    public Dreieck(double seiteA, double seiteB, double seiteC) {
        if (!istKonstruierbar(seiteA, seiteB, seiteC)) {
            throw new IllegalArgumentException(
                    "Das Dreieck kann mit den gegebenen Seitenlängen nicht konstruiert werden.");
        }
        this.seiteA = seiteA;
        this.seiteB = seiteB;
        this.seiteC = seiteC;
    }

    // Überprüft, ob das Dreieck konstruierbar ist
    private boolean istKonstruierbar(double a, double b, double c) {
        // Dreiecksungleichung: Die Summe zweier Seiten muss stets größer als die dritte
        // Seite sein
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Getter für die Seiten
    public double getSeiteA() {
        return seiteA;
    }

    public double getSeiteB() {
        return seiteB;
    }

    public double getSeiteC() {
        return seiteC;
    }

    @Override
    // Berechnet den Umfang des Dreiecks
    public double berechneUmfang() {
        return seiteA + seiteB + seiteC;
    }

    @Override
    // Berechnet die Fläche des Dreiecks
    public double berechneFlaeche() {
        double s = berechneUmfang() / 2; // Halber Umfang
        return Math.sqrt(s * (s - seiteA) * (s - seiteB) * (s - seiteC));
    }

    // toString-Methode zur Darstellung
    @Override
    public String toString() {
        return String.format("Dreieck mit Seitenlängen: a=%.2f, b=%.2f, c=%.2f", seiteA, seiteB, seiteC);
    }
}
