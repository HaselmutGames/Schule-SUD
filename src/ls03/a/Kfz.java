/**
 * @author Hammoud Aldalati
 * @version 03.12.2024
 *
 * Implementierung der Klasse Kfz Attributen/Eigenschaften
 * Entsprechend sind getter und setter fuer die Attribute vorhanden
 * -------------------------------------------------------------------------------------------
 * Attribute ohne Setter:
 * modell, tankgroesse - eines Fahrzeugs sind unveraenderliche Stammdaten
 * und sollten nach der Initialisierung nicht geaendert werden koennen!
 * tankinhalt, aktuelleGeschwindigkeit haben auch keinen Setter, weil
 * diese Attribute nur durch kontrollierte Methoden (tanken, fahren, beschleunigen, bremsen)
 * geaendert werden sollen und dadurch gewaehrleisten wir Datenintegritaet
 * -------------------------------------------------------------------------------------------
 * Attribut - maximalGeschwindigkeit:
 * Normalerweise ist die maximale Geschwindigkeit eine feste Eigenschaft, allerdings
 * durch z.B. ein Upgrade des Motors, koennte ein Setter sinnvoll sein
 * -------------------------------------------------------------------------------------------
 * Attribut - motorAn:
 * Der Status des Motors wird ueber die Methoden (motorStarten, motorStoppen) gesteuert.
 * */
package ls03.a;

public class Kfz {
    // Attribute
    private final String modell; // Unveraenderlich
    private final int tankgroesse; // Unveraenderlich
    private int tankinhalt; // Veraenderlich
    private int aktuelleGeschwindigkeit; // Veraenderlich
    private int maximaleGeschwindigkeit; // eher Unveraenderlich aber veraenderlich, falls erlaubt
    private boolean motorAn;

    // Konstruktor
    public Kfz(String modell, int tankgroesse, int maximaleGeschwindigkeit) {
        if (tankgroesse <= 0 || maximaleGeschwindigkeit <= 0) {
            throw new IllegalArgumentException("Tankgroesse und maximale Geschwindigkeit muessen groesser als 0 sein.");
        }
        if (modell == null || modell.isBlank()) {
            throw new IllegalArgumentException("Modell darf nicht leer sein.");
        }
        this.modell = modell;
        this.tankgroesse = tankgroesse;
        this.tankinhalt = tankgroesse; // Voller Tank bei Erstellung
        this.aktuelleGeschwindigkeit = 0;
        this.maximaleGeschwindigkeit = maximaleGeschwindigkeit;
        this.motorAn = false; // Motor ist aus bei Erstellung
    }

    // Getter fuer Stammdaten
    public String getModell() {
        return modell;
    }

    public int getTankgroesse() {
        return tankgroesse;
    }

    public int getMaximaleGeschwindigkeit() {
        return maximaleGeschwindigkeit;
    }

    // Optional: Setter fuer maximale Geschwindigkeit (falls notwendig)
    public void setMaximaleGeschwindigkeit(int maximaleGeschwindigkeit) {
        if (maximaleGeschwindigkeit <= 0) {
            throw new IllegalArgumentException("Die maximale Geschwindigkeit muss groesser als 0 sein.");
        }
        this.maximaleGeschwindigkeit = maximaleGeschwindigkeit;
    }

    // Getter fuer dynamische Attribute
    public int getTankinhalt() {
        return tankinhalt;
    }

    public int getAktuelleGeschwindigkeit() {
        return aktuelleGeschwindigkeit;
    }

    // Motor an- und ausschalten
    public void motorStarten() {
        motorAn = true;
    }

    public void motorStoppen() {
        motorAn = false;
        aktuelleGeschwindigkeit = 0;
    }

    // Beschleunigen
    public void beschleunigen(int geschwindigkeit) {
        if (!motorAn) {
            throw new IllegalStateException("Der Motor ist aus. Starten Sie den Motor zuerst.");
        }
        if (geschwindigkeit <= 0) {
            throw new IllegalArgumentException("Die Geschwindigkeit muss groesser als 0 sein.");
        }
        aktuelleGeschwindigkeit += geschwindigkeit;
        if (aktuelleGeschwindigkeit > maximaleGeschwindigkeit) {
            aktuelleGeschwindigkeit = maximaleGeschwindigkeit; // Begrenzung auf maximale Geschwindigkeit
        }
    }

    // Bremsen
    public void bremsen(int geschwindigkeit) {
        if (geschwindigkeit <= 0) {
            throw new IllegalArgumentException("Die Geschwindigkeit muss groesser als 0 sein.");
        }
        aktuelleGeschwindigkeit -= geschwindigkeit;
        if (aktuelleGeschwindigkeit < 0) {
            aktuelleGeschwindigkeit = 0; // Geschwindigkeit kann nicht negativ sein
        }
    }

    // Fahren
    public void fahren(int kilometer) {
        if (!motorAn) {
            throw new IllegalStateException("Der Motor ist aus. Starten Sie den Motor zuerst.");
        }
        if (kilometer <= 0) {
            throw new IllegalArgumentException("Die Kilometeranzahl muss groesser als 0 sein.");
        }
        int benoetigterKraftstoff = kilometer / 10; // Beispiel: Verbrauch 10 km pro Liter
        if (benoetigterKraftstoff > tankinhalt) {
            throw new IllegalStateException("Nicht genug Kraftstoff, um die Strecke zu fahren.");
        }
        tankinhalt -= benoetigterKraftstoff;
        System.out.println("Das Fahrzeug ist " + kilometer + " Kilometer gefahren.");
    }

    // Tanken
    public void tanken(int liter) {
        if (liter <= 0) {
            throw new IllegalArgumentException("Die Tankmenge muss groesser als 0 sein.");
        }
        tankinhalt += liter;
        if (tankinhalt > tankgroesse) {
            tankinhalt = tankgroesse; // Begrenzung auf maximale Tankgroesse
        }
    }

    // Stammdaten ausgeben
    @Override
    public String toString() {
        return "Modell: " + modell + ", Tankgroesse: " + tankgroesse + " Liter, Maximale Geschwindigkeit: "
                + maximaleGeschwindigkeit + " km/h";
    }

    // Status ausgeben
    public void status() {
        System.out.println("Motor: " + (motorAn ? "An" : "Aus") + ", Aktuelle Geschwindigkeit: "
                + aktuelleGeschwindigkeit + " km/h, Tankinhalt: " + tankinhalt + " Liter");
    }
}