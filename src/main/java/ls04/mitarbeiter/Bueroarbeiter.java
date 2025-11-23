package ls04.mitarbeiter;

public class Bueroarbeiter extends Mitarbeiter {
    private double festgehalt;

    public Bueroarbeiter(int id, String name, double festgehalt) {
        super(id, name);
        if(id < 5000 || id > 5999){
            throw new IllegalArgumentException("Büroarbeiter-ID muss mit 5 beginnen und vierstellig sein.");
        }
        this.festgehalt = festgehalt;
    }

    @Override
    public double einkommen() {
        return festgehalt;
    }
}
