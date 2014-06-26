package übung05;

import java.util.Scanner;

public class Aufgabe03_pi_rechteckannäherung {

	public static void main(String[] args) throws InterruptedException{
		
		System.out.print("Bitte geben Sie eine Anzahl von\nRechtecken für die Annäherung\nder Kreiszahl Pi an: ");
		Scanner scanner = new Scanner(System.in);
		double n = scanner.nextDouble();//Eingabe der Anzahl der maximalen Rechtecke
		scanner.close();
		double PI = 0;//Näherungswert für PI, PI = 0 ist die Initialisierung der Variable
		int z = 1;//Startwert des Zählers
		int r = 1;//Radius des Einheitskreises
		long millis = 500;
		
		/** 
		 * Die unten stehende if-else Anwendung ist nicht erforderlich, hatte ich für mich selbst eingebaut,
		 *  es gibt mir die einzelnen Werte der immer kleiner werdenden Rechtecke an bis zu einem Eingabewert
		 *  von 100, da sonst die Console eine ganze Weile braucht um mir letztendlich den Näherungswert für
		 *  Pi auszugeben 
		 *  */
		
		while (z < n) 
		{
			if(n >= 100){//Direkte Ausgabe des Näherungswertes für Pi wenn die Eingabe > 1000 ist
				
				PI = PI + 4 * (r / n * Math.sqrt((Math.pow(r, 2)-(Math.pow(z / n, 2)))));//allgemeine Formel zur Berechnung des Näherungswertes für Pi
				z++;
			}
			else{//Ausgabe mit Angabe über den Flächeninhalt der jeweiligen Rechtecke
			
				System.out.println("\nDer Flächeninhalt des \n" + z + ".Rechtecks beträgt:");
				double rect = (r / n * Math.sqrt((Math.pow(r, 2) - (Math.pow(z / n, 2)))));//Flächeninhalt der jeweiligen Rechtecke
				System.out.println(rect);
				PI = PI + 4 * ( r / n * Math.sqrt((Math.pow(r, 2) - (Math.pow(z / n, 2)))));
				z++;
				Thread.sleep(millis);
			}
		}
		System.out.print("\n");
		System.out.println("Die Annnäherung der Kreiszahl\nPi im Einheitskreis bei " + z + "\nRechtecken beträgt:\n\n" + PI);
	}
}
