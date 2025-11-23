package ls04.kfz;

public class Bus extends Kfz{
    private int maxiamlePassagiere;
    private String fahrer;

    public Bus(String modell, int tankgroesse, int verbrauchPro100km, int maximalePassagiere, String fahrer) {
        super(modell, tankgroesse, verbrauchPro100km);
        if (maximalePassagiere <= 0) {
            throw new IllegalArgumentException("Maximale Passagiere muss groesser als 0 sein.");
        }
        this.maxiamlePassagiere = maximalePassagiere;
        this.fahrer = fahrer;
    }
}
