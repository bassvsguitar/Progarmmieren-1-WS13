package �bung05;

import java.util.Scanner;

public class Aufgabe03_pi_rechteckann�herung {

	public static void main(String[] args) throws InterruptedException{
		
		System.out.print("Bitte geben Sie eine Anzahl von\nRechtecken f�r die Ann�herung\nder Kreiszahl Pi an: ");
		Scanner scanner = new Scanner(System.in);
		double n = scanner.nextDouble();//Eingabe der Anzahl der maximalen Rechtecke
		scanner.close();
		double PI = 0;//N�herungswert f�r PI, PI = 0 ist die Initialisierung der Variable
		int z = 1;//Startwert des Z�hlers
		int r = 1;//Radius des Einheitskreises
		long millis = 500;
		
		/** 
		 * Die unten stehende if-else Anwendung ist nicht erforderlich, hatte ich f�r mich selbst eingebaut,
		 *  es gibt mir die einzelnen Werte der immer kleiner werdenden Rechtecke an bis zu einem Eingabewert
		 *  von 100, da sonst die Console eine ganze Weile braucht um mir letztendlich den N�herungswert f�r
		 *  Pi auszugeben 
		 *  */
		
		while (z < n) 
		{
			if(n >= 100){//Direkte Ausgabe des N�herungswertes f�r Pi wenn die Eingabe > 1000 ist
				
				PI = PI + 4 * (r / n * Math.sqrt((Math.pow(r, 2)-(Math.pow(z / n, 2)))));//allgemeine Formel zur Berechnung des N�herungswertes f�r Pi
				z++;
			}
			else{//Ausgabe mit Angabe �ber den Fl�cheninhalt der jeweiligen Rechtecke
			
				System.out.println("\nDer Fl�cheninhalt des \n" + z + ".Rechtecks betr�gt:");
				double rect = (r / n * Math.sqrt((Math.pow(r, 2) - (Math.pow(z / n, 2)))));//Fl�cheninhalt der jeweiligen Rechtecke
				System.out.println(rect);
				PI = PI + 4 * ( r / n * Math.sqrt((Math.pow(r, 2) - (Math.pow(z / n, 2)))));
				z++;
				Thread.sleep(millis);
			}
		}
		System.out.print("\n");
		System.out.println("Die Annn�herung der Kreiszahl\nPi im Einheitskreis bei " + z + "\nRechtecken betr�gt:\n\n" + PI);
	}
}
