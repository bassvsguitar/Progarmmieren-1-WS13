package übung03;

import java.util.Scanner;

public class Aufgabe02_modulo {

	public static void main(String[] args) {
		
		Scanner scanner = new  Scanner(System.in);
		System.out.print("Bitte geben Sie eine ganze Zahl x ein = ");
		int x = scanner.nextInt();
		System.out.print("Bitte geben Sie ein ganze Zahl y ein, durch die die Zahl x geteilt werden soll =");
		int y = scanner.nextInt();
		
		int ergebnis = x / y;
		int moduloergebnis = x % y;
		if (moduloergebnis == 0){ //Wenn das Ergbnis = 0 ist heißt das, dass die eingegebene Zahl durch 7 teilbar ist
			
			System.out.println(x + " : " + y + " = " + ergebnis);
			System.out.println("Diese Zahl ist durch" + y + " teilbar, der Rest dieser Divison beträgt " + moduloergebnis);
		}
		else{
			
			System.out.println(x + " : " + y + " = " + ergebnis);
			System.out.println("Diese Zahl ist nicht durch " + y + " teilbar, der Rest beträgt: " + moduloergebnis);
		}
		
		scanner.close();
	}

}
