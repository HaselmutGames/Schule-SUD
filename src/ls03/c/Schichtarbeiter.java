package ls03.c;

public class Schichtarbeiter extends Mitarbeiter {
    private double stundenlohn;
    private int arbeitsstunden;

    public Schichtarbeiter(int id, String name, double stundenlohn, int arbeitsstunden) {
        super(id, name);
        this.stundenlohn = stundenlohn;
        this.arbeitsstunden = arbeitsstunden;
    }

    @Override
    public double einkommen() {
        return stundenlohn * arbeitsstunden;
    }
}
