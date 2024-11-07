package ls01.b;

import java.util.Scanner;

public class LS01Zahlenumwandlung {

	public static void main(String[] args) {
		int zahl = 0;
		String zahlText = "";

		Scanner scanner = new Scanner(System.in);

		System.out.println("eine Zahl zwischen 0 und 10");
		zahl = scanner.nextInt();
		scanner.nextLine();

		switch (zahl) {
		case (0):
			zahlText = "null";
			break;
		case (1):
			zahlText = "eins";
			break;
		case (2):
			zahlText = "zwei";
			break;
		case (3):
			zahlText = "drei";
			break;
		case (4):
			zahlText = "vier";
			break;
		case (5):
			zahlText = "fuenf";
		case (6):
			zahlText = "sechs";
			break;
		case (7):
			zahlText = "sieben";
			break;
		case (8):
			zahlText = "acht";
			break;
		case (9):
			zahlText = "neun";
			break;
		case (10):
			zahlText = "zehn";
			break;
		}
		System.out.println("Eingabe: " + zahl + "\tAusgabe: " + zahlText);
		
		scanner.close();
	}

}
