package ls03.a;

public class MitarbeiterTest {
    public static void main(String[] args) {
        try {
            // Erstellen eines gueltigen Mitarbeiters
            Mitarbeiter mitarbeiter = new Mitarbeiter(1, "Hola Balou");
            // Ausgabe der Mitarbeiterinformationen
            System.out.println(mitarbeiter);

            mitarbeiter.setId(2);
            mitarbeiter.setName("Weiss ich net");
            System.out.println(mitarbeiter);
        } catch (IllegalArgumentException e) {
            System.err.println("Fehler: " + e.getMessage());
        }

        // Test mit ungültigen Werten
        try {
            Mitarbeiter fehlerhafterMitarbeiter = new Mitarbeiter(-1, "");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
