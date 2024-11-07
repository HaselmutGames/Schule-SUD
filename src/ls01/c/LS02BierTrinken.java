package ls01.c;

import java.util.Random;
import java.util.Scanner;

public class LS02BierTrinken {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		double promille = 0;
		int eingabeZahl = 0;
		
		while (promille < 0.8) {
			int range = random.nextInt(1, 4);
			System.out.println("Rate eine Zahl zwischen 1 und 3");
			eingabeZahl = scanner.nextInt();
			if (eingabeZahl == range) {
				promille -= 0.02;
				System.out.println("Richtig! Promille sinkt auf " + promille);
			} else if (eingabeZahl != range) {
				promille += 0.05;
				System.out.println("Falsch! Du musst ein Bier trinken. Promille " + promille);
			}

		}
		scanner.close();
	}

}