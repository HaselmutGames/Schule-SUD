package ls01.a;
import java.util.Locale;
import java.util.Scanner;

public class TastaturEingabe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

		System.out.println("Gönn mal ein Zeichen");
		char myChar = scanner.next().charAt(0);
		System.out.println("Dein Alter bidde!");
		int myInt = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Dein Gehalt");
		double myDouble = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Gib mal einen Satz");
		String myString = scanner.nextLine();
		System.out.println(myChar + " " + myString + " " + myInt + " " + myDouble);
		scanner.close();
	}

}
