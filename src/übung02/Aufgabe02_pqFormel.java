package übung02;

import java.util.Scanner;

public class Aufgabe02_pqFormel {

	public static void main(String[] args){
			
		Scanner input = new Scanner(System.in);
		float x1;
		float x2;
		
		System.out.println("Bitte geben Sie Werte für p und q ein");
		System.out.print("p = ");
		float p = input.nextFloat();
		System.out.print("q = ");
		float q = input.nextFloat();
		
		/*Die Summe der Wurzel darf nicht negativ sein*/
		x1 = (float) (-p / 2 - Math.sqrt(Math.pow((p / 2), 2) - q)); 
		x2 = (float) (-p / 2 + Math.sqrt(Math.pow((p / 2), 2) - q));
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
			
		input.close();
	}

}


