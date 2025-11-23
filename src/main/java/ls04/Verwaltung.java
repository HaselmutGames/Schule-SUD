package ls04;

import java.util.ArrayList;
import java.util.List;

import ls04.mitarbeiter.Bueroarbeiter;
import ls04.mitarbeiter.Manager;
import ls04.mitarbeiter.Mitarbeiter;
import ls04.mitarbeiter.Schichtarbeiter;

public class Verwaltung {
    private List<Mitarbeiter> mitarbeiterListe = new ArrayList<>();

    public Verwaltung() {
        this.mitarbeiterListe = new ArrayList<>();
    }

    public void neuerMitarbeiter(Mitarbeiter mitarbeiter) {
        mitarbeiterListe.add(mitarbeiter);
    }

    public void mitarbeiterEntlassen(int id) {
        mitarbeiterListe.removeIf(mitarbeiter -> mitarbeiter.getId() == id);
    }

    public void gehaltslisteErstellen() {
        double summe = 0;
        for (Mitarbeiter mitarbeiter : mitarbeiterListe) {
            System.out.println(mitarbeiter + ", Einkommen: " + mitarbeiter.einkommen());
            summe += mitarbeiter.einkommen();
        }
        System.out.println("Gesamtauszahlung: " + summe);
    }

    public static void main(String[] args) {
        Verwaltung verwaltung = new Verwaltung();

        Schichtarbeiter schichtarbeiter1 = new Schichtarbeiter(3001, "Hola", 15.0);
        Bueroarbeiter bueroarbeiter1 = new Bueroarbeiter(5002, "Hello", 3000.0);
        Manager manager1 = new Manager(2003, "Hallo", 5000.0, 10);

        verwaltung.neuerMitarbeiter(schichtarbeiter1);
        verwaltung.neuerMitarbeiter(bueroarbeiter1);
        verwaltung.neuerMitarbeiter(manager1);

        verwaltung.gehaltslisteErstellen();
    }
}
