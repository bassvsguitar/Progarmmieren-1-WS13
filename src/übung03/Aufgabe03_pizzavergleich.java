package �bung03;

import java.util.Scanner;

public class Aufgabe03_pizzavergleich {

	public static void main(String[] args) {
		
		Scanner scanner = new  Scanner(System.in);
		double fl�che1;
		double fl�che2;;
		double preis1;
		double preis2;
		int durchmesser1;
		int durchmesser2;
		int verh�ltnis1;
		int verh�ltnis2;
		
		System.out.print("Bitte geben Sie die erste gew�nschte Pizzagr��e ein: ");
		durchmesser1 = scanner.nextInt();
		System.out.print("Bitte geben Sie einen Preis ein: ");
		preis1 = scanner.nextDouble();
		fl�che1 = Math.PI * (durchmesser1 / 2) * ( durchmesser1 /2);
		verh�ltnis1 = (int) (fl�che1 / preis1);
		System.out.print("\n");
		
		System.out.print("Bitte geben Sie die n�chste gew�nschte Pizzagr��e ein: ");
		durchmesser2 = scanner.nextInt();
		System.out.print("Bitte geben Sie einen Preis ein: ");
		preis2 = scanner.nextDouble();
		fl�che2 = Math.PI * (durchmesser2 / 2) * (durchmesser2 / 2);
		verh�ltnis2 = (int) (fl�che2 / preis2);
		System.out.print("\n");
		
		System.out.println("Berechnung der Eingaben...");
		System.out.println("Ergebnis des Vergleiches");
		System.out.print("\n");
		
		if (verh�ltnis1 > verh�ltnis2){
			
			System.out.println("Die erste Pizza hat das bessere Gr��en/Preis-Verh�ltnis");
			System.out.println("Gr��e: " + durchmesser1 + " cm");
			System.out.println("Preis :" + preis1 + " �");
		}
		if (verh�ltnis1 < verh�ltnis2){
			
			System.out.println("Die zweite Pizza hat das bessere Gr��en/Preis-Verh�ltnis");
			System.out.println("Gr��e: " + durchmesser2 + " cm");
			System.out.println("Preis :" + preis2 + " �");
		}
		if (verh�ltnis1 == verh�ltnis2){
			
			System.out.println("Es ist kein besseres Gr��en/Preis-Verh�ltnis bei angegebenen Gr��en und Preisen festzustellen");
		}
		scanner.close();

	}

}
