package übung04;

import java.util.Scanner;

public class Aufgabe02_freier_fall {

public static void main(String[] args) throws InterruptedException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Falldauer in Sekunden ein:");
		int t = scanner.nextInt(); //time
		float g = 9.80665f; //gravity
		long millis = 1000;
		for (int i = 0; i <= t; i+=5)	
		{
			float d = (float) ((g/2)*Math.pow(i,2)); //distance equation
			float d2 = 0; //initializing temporary distance
			d2 = d2 + d; //distance after each second past
			System.out.println("Nach" + " " + i + " " + "Sekunde(n) sind" + " " + d2 + " " + "Meter zurückgelegt worden");
			Thread.sleep(millis);
		}
		scanner.close();
	}
}

