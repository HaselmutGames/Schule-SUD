package ls01.a;

public class GanzzahlBerechnung {

	public static void main(String[] args) {
		int zahl = 16;
		int tempErgebnis = 0;
		String ergebnis = "";
		int rest = 0;
		tempErgebnis = zahl / 2;
		rest = zahl % 2;
		ergebnis = "" + rest;
		tempErgebnis /= 2;
		rest = tempErgebnis % 2;
		ergebnis = ergebnis + rest;
		tempErgebnis /= 2;
		rest = tempErgebnis % 2;
		ergebnis = ergebnis + rest;
		tempErgebnis /= 2;
		rest = tempErgebnis % 2;
		ergebnis = rest + ergebnis;
		System.out.print(ergebnis);

	}

}
