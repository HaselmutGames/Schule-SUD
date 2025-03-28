package ls04.mitarbeiter;

public class Manager extends Mitarbeiter {
    private double festgehalt;
    private double bonusProzent;

    public Manager(int id, String name, double festgehalt, double bonusProzent) {
        super(id, name);
        if(id < 1000 || id > 2999){
            throw new IllegalArgumentException("Manager-ID muss vierstellig und positiv sein.");
        }
        this.festgehalt = festgehalt;
        this.bonusProzent = bonusProzent;
    }

    @Override
    public double einkommen() {
        return festgehalt + (festgehalt * bonusProzent / 100);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "festgehalt=" + festgehalt +
                ", bonusProzent=" + bonusProzent +
                "} " + super.toString();
    }

}
