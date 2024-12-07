package ls03.a;

public class MitarbeiterTest {
    public static void main(String[] args) {
        try {
            // Erstellen eines gueltigen Mitarbeiters
            Mitarbeiter mitarbeiter = new Mitarbeiter();
            mitarbeiter.setId(1);
            mitarbeiter.setName("Hola Balou");

            // Ausgabe der Mitarbeiterinformationen
            System.out.println(mitarbeiter);

            // Testen einer ungueltigen ID
            Mitarbeiter ungueltigerMitarbeiter = new Mitarbeiter();
            ungueltigerMitarbeiter.setId(-5); // Sollte eine Exception werfen
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler: " + e.getMessage());
        }

        try {
            // Testen eines ungueltigen Namens
            Mitarbeiter ungueltigerName = new Mitarbeiter();
            ungueltigerName.setName(""); // Sollte eine Exception werfen
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }

}
