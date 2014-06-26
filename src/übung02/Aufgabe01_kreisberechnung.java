package übung02;

import java.util.Scanner;

public class Aufgabe01_kreisberechnung {
	
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bitte geben Sie einen Wert für den Radius r ein!");
		System.out.print("r = ");
		int r = input.nextInt();
		
		double ergebnis1 = Math.PI * r * r; //Fläche
		double ergebnis2 = 2 * Math.PI * r; //Umfang
		double ergebnis3 = 4.0/3.0*Math.PI * r * r * r; //Volumen
		System.out.println("Die Kreisfläche bei einem Radius von" + " " + r + " " + "beträgt: " + ergebnis1);
		System.out.println("Der Kreisumfang bei einem Radius von" + " " + r + " " + "beträgt: " + ergebnis2);
		System.out.println("Würde man von einer Kugel ausgehen bei einem Radius von" + " " + r + " " + "würde dies folgendes Volumen ergeben: " + ergebnis3);
	
		input.close();
	}
}
