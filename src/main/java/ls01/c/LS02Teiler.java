package ls01.c;

import java.util.Scanner;

public class LS02Teiler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ganze Zahl eingeben: ");
        int zahl = scanner.nextInt();

        System.out.print("Die Zahl " + zahl + " ist durch ");

        for(int i = 1; i <= zahl; i++){
            if(zahl % i == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println("teilbar.");
        scanner.close();
    }
    
}
