package �bung05;

import java.util.Scanner;

public class Aufgabe02_fakult�t {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bitte geben Sie einen Wert ein: ");
		int a = scanner.nextInt();
		scanner.close();
		System.out.println("Die Summe der Fakult�t von " + a + " betr�gt: " + summe(a));
	}
	public static long summe(int n){
		
		if (n == 0) 
		return 1;
		return n * summe(n-1);
	}
}
