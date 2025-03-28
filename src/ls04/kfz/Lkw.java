package ls04.kfz;

public class Lkw extends Kfz{
    private int ladeflaeche;
    private int aktuelleLadung;

    public Lkw(String modell, int tankgroesse, int verbrauchPro100km, int ladelfaeche) {
        super(modell, tankgroesse, verbrauchPro100km);
        if (ladeflaeche <= 0) {
            throw new IllegalArgumentException("Ladeflaeche muss groesser als 0 sein.");
        }
        this.ladeflaeche = ladelfaeche;
        this.aktuelleLadung = 0; // Initialisierung der aktuellen Ladung
    }
}
