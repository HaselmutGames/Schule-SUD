package ls03.a;

public class KfzTest {
    public static void main(String[] args) {
        // Ein neues Fahrzeug erstellen
        Kfz auto = new Kfz("BMW 3er", 60, 240);

        // Stammdaten anzeigen
        System.out.println("Stammdaten des Fahrzeugs:");
        System.out.println(auto.toString());

        // Motor starten und beschleunigen
        auto.motorStarten();
        System.out.println("\nMotor gestartet.");

        auto.beschleunigen(50);
        System.out.println(
                "Aktuelle Geschwindigkeit nach Beschleunigung: " + auto.getAktuelleGeschwindigkeit() + " km/h");

        // Weitere Beschleunigung
        auto.beschleunigen(100);
        System.out.println("Aktuelle Geschwindigkeit nach weiterer Beschleunigung: " + auto.getAktuelleGeschwindigkeit()
                + " km/h");

        // Bremsen
        auto.bremsen(30);
        System.out.println("Aktuelle Geschwindigkeit nach Bremsen: " + auto.getAktuelleGeschwindigkeit() + " km/h");

        // Fahren (Verbrauch von Kraftstoff)
        auto.fahren(100);
        System.out.println("Tankinhalt nach 100 km Fahrt: " + auto.getTankinhalt() + " Liter");

        // Tanken
        auto.tanken(20);
        System.out.println("Tankinhalt nach dem Tanken: " + auto.getTankinhalt() + " Liter");

        // Den Status des Fahrzeugs anzeigen
        System.out.println("\nFahrzeugstatus:");
        auto.status();

        // Motor stoppen
        auto.motorStoppen();
        System.out.println("\nMotor gestoppt.");
        auto.status();
    }
}
