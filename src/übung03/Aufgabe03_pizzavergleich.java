package übung03;

import java.util.Scanner;

public class Aufgabe03_pizzavergleich {

	public static void main(String[] args) {
		
		Scanner scanner = new  Scanner(System.in);
		double fläche1;
		double fläche2;;
		double preis1;
		double preis2;
		int durchmesser1;
		int durchmesser2;
		int verhältnis1;
		int verhältnis2;
		
		System.out.print("Bitte geben Sie die erste gewünschte Pizzagröße ein: ");
		durchmesser1 = scanner.nextInt();
		System.out.print("Bitte geben Sie einen Preis ein: ");
		preis1 = scanner.nextDouble();
		fläche1 = Math.PI * (durchmesser1 / 2) * ( durchmesser1 /2);
		verhältnis1 = (int) (fläche1 / preis1);
		System.out.print("\n");
		
		System.out.print("Bitte geben Sie die nächste gewünschte Pizzagröße ein: ");
		durchmesser2 = scanner.nextInt();
		System.out.print("Bitte geben Sie einen Preis ein: ");
		preis2 = scanner.nextDouble();
		fläche2 = Math.PI * (durchmesser2 / 2) * (durchmesser2 / 2);
		verhältnis2 = (int) (fläche2 / preis2);
		System.out.print("\n");
		
		System.out.println("Berechnung der Eingaben...");
		System.out.println("Ergebnis des Vergleiches");
		System.out.print("\n");
		
		if (verhältnis1 > verhältnis2){
			
			System.out.println("Die erste Pizza hat das bessere Größen/Preis-Verhältnis");
			System.out.println("Größe: " + durchmesser1 + " cm");
			System.out.println("Preis :" + preis1 + " €");
		}
		if (verhältnis1 < verhältnis2){
			
			System.out.println("Die zweite Pizza hat das bessere Größen/Preis-Verhältnis");
			System.out.println("Größe: " + durchmesser2 + " cm");
			System.out.println("Preis :" + preis2 + " €");
		}
		if (verhältnis1 == verhältnis2){
			
			System.out.println("Es ist kein besseres Größen/Preis-Verhältnis bei angegebenen Größen und Preisen festzustellen");
		}
		scanner.close();

	}

}
