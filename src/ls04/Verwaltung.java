package ls04;

import java.util.ArrayList;
import java.util.List;

import ls04.mitarbeiter.Mitarbeiter;

public class Verwaltung {
    private List<Mitarbeiter> mitarbeiterListe = new ArrayList<>();

    public Verwaltung() {
        this.mitarbeiterListe = new ArrayList<>();
    }

    public void neuerMitarbeiter(Mitarbeiter mitarbeiter){
        mitarbeiterListe.add(mitarbeiter);
    }

    public void mitarbeiterEntlassen(int id){
        mitarbeiterListe.removeIf(mitarbeiter  -> mitarbeiter.getId() == id);
    }

    public void gehaltslisteErstellen(){
        double summe = 0;
        for(Mitarbeiter mitarbeiter : mitarbeiterListe){
            System.out.println(mitarbeiter + ", Einkommen: " + mitarbeiter.einkommen());
            summe += mitarbeiter.einkommen();
        }
        System.out.println("Gesamtauszahlung: " + summe);
    }
}
