package ls01.c;

import java.util.Scanner;

public class LS02Primzahlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ganze Zahl eingeben: ");
        long zahl = scanner.nextLong();
        boolean istPrimzahl = true;

        if(zahl <= 1){
            istPrimzahl = false;
        } else {
            for(long teiler = 2; teiler * teiler <= zahl; teiler++){
                if(zahl % teiler == 0){
                    istPrimzahl = false;
                    break;
                }
            }
        }
        if(istPrimzahl){
            System.out.println(zahl + " ist eine Primzahl!");
        } else {
            System.out.println(zahl + " ist keine Primzahl!");
        }
        scanner.close();
    }
}
