package ls03.c;

public class Main {
    public static void main(String[] args) {
        Mitarbeiter schichtarbeiter = new Schichtarbeiter(1, "Alice", 15.0, 160); // Stundenlohn: 15, Stunden: 160

        // Polymorphietest
        System.out.println(schichtarbeiter + ", Einkommen: " + schichtarbeiter.einkommen());
    }
}
