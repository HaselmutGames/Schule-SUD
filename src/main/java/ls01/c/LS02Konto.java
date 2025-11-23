package ls01.c;

import java.util.Scanner;

public class LS02Konto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Initialer Kontostand
        double kontostand = 1000.0;

        // Maximaler Dispositionskredit eingeben lassen
        System.out.println("Bitte geben Sie den maximalen Dispositionskredit ein");
        double dispoKredit = scanner.nextDouble();

        while (true) {
            System.out.println("Aktueller Kontostand: " + kontostand + " €");
            System.out.println("Gebens Sie den Betrag ein, den Sie abheben moechten");
            double abhebenBetrag = scanner.nextDouble();

            // Pruefen, ob das Konto ueberzogen wuerde
            if(kontostand - abhebenBetrag < -dispoKredit){
                System.out.println("Abhebung abgelehnt! Der Betrag wuerde den maximalen Dispositionskredit ueberschreiten");
            } else {
                kontostand -= abhebenBetrag;
                System.out.println("Abhebung erfolgreich! Neuer Kontostand: " + kontostand + " €");
            }

            System.out.println("Moechten Sie eine weitere Abhebung vornehmen? (ja/nein): ");
            String weiter = scanner.next();
            if(!weiter.equalsIgnoreCase("ja")){
                break;
            }
        }
        System.out.println("Programm beendet. Der endgueltige Kontostand ist: " + kontostand + " €");
        scanner.close();
    }
}
