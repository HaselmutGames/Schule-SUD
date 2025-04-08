package ls04.mitarbeiter;

public class Manager extends Mitarbeiter {
    private double festgehalt;
    private double bonusProzent;

    public Manager(int id, String name, double festgehalt, double bonusProzent) {
        super(id, name);
        if (!((id >= 1000 && id <= 2999) || (id >= 4000 && id <= 4999) || (id >= 6000 && id <= 9999))) { // Erlaubt:
                                                                                                         // 1000-2999,
                                                                                                         // 4000-4999,
                                                                                                         // 6000-9999
            throw new IllegalArgumentException(
                    "Manager-ID muss vierstellig und in einem erlaubten Bereich liegen (1000-2999, 4000-4999, 6000-9999).");
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
