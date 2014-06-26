package bonusübung;

import java.util.Scanner;

public class Aufgabe01_münze {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
		int x = scanner.nextInt();
		int y = 0; //Vorzeichen
		/*Betragbildung*/
		if (x <= 0)
		{
			y = -x;
		}
		else if (x >= 0)
		{
			y = x;
		}
		System.out.println("Der Wert des Betrags |" + x + "| = " + y);
		scanner.close();
		
		int ergebnis = (int)(Math.random()*2+1);
		if (ergebnis == 1)
		{
			System.out.println("Die Münze ist mit 'Kopf' auf der Oberseite gelandet");
		}
		if (ergebnis == 2)
		{
			System.out.println("Die Münze ist mit 'Zahl' auf der Oberseite gelandet");
		}
	}
	
}
