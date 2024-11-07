package ls02.b;

import java.util.Random;

public class Rollenspiel {
    public static void main(String[] args) {
        String[] eigenschaften = {"Intelligenz", "Staerke", "Ausdauer", "Geschicklichkeit", "Weisheit", "Intuition", "Charisma"};
        Random random = new Random();
        double[] prozentwerte = new double[eigenschaften.length];
        
        for(int i = 0; i < eigenschaften.length; i++){
            prozentwerte[i] = random.nextDouble();
            System.out.printf("%s: %.0f%%\n", eigenschaften[i], prozentwerte[i] * 100);
        }
    }
}
