package �bung02;

import java.util.Scanner;

public class Aufgabe01_kreisberechnung {
	
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bitte geben Sie einen Wert f�r den Radius r ein!");
		System.out.print("r = ");
		int r = input.nextInt();
		
		double ergebnis1 = Math.PI * r * r; //Fl�che
		double ergebnis2 = 2 * Math.PI * r; //Umfang
		double ergebnis3 = 4.0/3.0*Math.PI * r * r * r; //Volumen
		System.out.println("Die Kreisfl�che bei einem Radius von" + " " + r + " " + "betr�gt: " + ergebnis1);
		System.out.println("Der Kreisumfang bei einem Radius von" + " " + r + " " + "betr�gt: " + ergebnis2);
		System.out.println("W�rde man von einer Kugel ausgehen bei einem Radius von" + " " + r + " " + "w�rde dies folgendes Volumen ergeben: " + ergebnis3);
	
		input.close();
	}
}
