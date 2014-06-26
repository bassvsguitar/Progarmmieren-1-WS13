package übung02;

import java.util.Scanner;

public class Aufgabe04_zeitberechnung {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bitte geben sie die aktuelle Uhrzeit in hh:mm:ss an!\n");
		System.out.print("Stunden: ");
		int x = input.nextInt();
		System.out.print("Minuten: ");
		int y = input.nextInt();
		System.out.print("Sekunden: ");
		int z = input.nextInt();
		
		float ergebnis1;
		float ergebnis2;
		float ergebnis3;
		float tag = 86400f;
		float stunde = tag / 24;
		float minute = stunde / 60;
		float sekunde = minute / 60;
		ergebnis1 = x * stunde  + y * minute + z * sekunde;
		ergebnis2 = tag - ergebnis1;
		ergebnis3 = (ergebnis1 / tag) * 100;
		
		System.out.print("\n");
		System.out.println("Aktuelle Uhrzeit: " + x + "h " + y + " min " + z + "sec");
		System.out.println("Anzahl der Sekunden seit Mitternacht: " + ergebnis1);
		System.out.println("Anzahl der verbliebenen Sekunden für diesen Tag: " + ergebnis2);
		System.out.println(ergebnis3 + " % des Tages sind vergangen");
		
		input.close();
	}

}
