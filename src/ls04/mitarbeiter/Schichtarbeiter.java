package ls04.mitarbeiter;

public class Schichtarbeiter extends Mitarbeiter {
    private double stundenlohn;
    private int arbeitsstunden;

    public Schichtarbeiter(int id, String name, double stundenlohn) {
        super(id, name);
        if (id < 3000 || id > 3999) {
            throw new IllegalArgumentException("Schichtarbeiter-ID muss mit 3 beginnen und vierstellig sein.");
        }
        this.stundenlohn = stundenlohn;
    }

    public void arbeite() {
        this.arbeitsstunden += 8;
    }

    public void arbeite(int stunden) {
        if (stunden < 0) {
            throw new IllegalArgumentException("Arbeitsstunden können nicht negativ sein.");
        }
        this.arbeitsstunden += stunden;
    }

    @Override
    public double einkommen() {
        return stundenlohn * arbeitsstunden;
    }
}
