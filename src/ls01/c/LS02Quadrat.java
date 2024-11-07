package ls01.c;

import java.util.Scanner;

public class LS02Quadrat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Seitenlaenge eingeben: ");
		int seitenLaenge = scanner.nextInt();

		for(int i = 0; i < seitenLaenge; i++){
			for(int j = 0; j < seitenLaenge; j++){
				if(i == 0 || i == seitenLaenge - 1 || j == 0 || j == seitenLaenge - 1){
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}
