package übung02;

import java.util.Scanner;

public class Aufgabe03_tausch {
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bitte geben sie Werte für x und y ein!");
		
		System.out.print("x = ");
		int x = input.nextInt();
		System.out.print("y = ");
		int y = input.nextInt();
		
		/*vor dem Tausch*/
		System.out.println("\nVorher...");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		/*Tausch*/
		System.out.println("\nTausch...");
		int temp;
		temp = x;
		x = y;
		y = temp;
		
		/*nach dem Tausch*/
		System.out.println("\nNachher...");	
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		input.close();
		
	}
}
