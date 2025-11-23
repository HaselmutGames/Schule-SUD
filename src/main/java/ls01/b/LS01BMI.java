package ls01.b;

import java.util.Scanner;

public class LS01BMI {

	public static void main(String[] args) {
		double gewicht = 0.00;
		double groesse = 0.00;
		double BMI = 0.00;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Gewicht in kg bidde...");
		gewicht = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("nun Groesse in m");
		groesse = scanner.nextDouble();
		scanner.close();

		BMI = gewicht / Math.pow(groesse, 2);

		if (BMI < 18.5) {
			System.out.println("Untergewicht!! Kalorienvorgabe: 3000");
		} else if (BMI >= 18.5 && BMI < 25) {
			System.out.println("Normalgewicht :) Kalorienvorgabe 2000");
		} else if (BMI >= 25 && BMI < 30) {
			System.out.println("Leichtes Übergewicht -> Kalorienvorgabe 1800");
		} else if (BMI >= 30 && BMI < 40) {
			System.out.println("Starkes Übergewicht -> Kalorienvorgabe 1200");
		} else {
			System.out.println("Extremes Übergewicht -> Kalorienvorgabe 700");
		}

	}

}
