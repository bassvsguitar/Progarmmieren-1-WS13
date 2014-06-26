package übung03;

import java.util.Scanner;

public class Aufgabe01_einzelzeichen {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bitte geben Sie ein Zeichen oder eine Zahl ein: ");
		String line = scanner.nextLine();
		char c = line.charAt(0);
			
		if (c >= 'A' && c <= 'Z'){
			
			System.out.println("Es ist ein Großbuchstabe");	
		}
		if ((c >= '0' && c <='9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F')){
			
			System.out.println("Es ist eine hexadezimale Ziffer");
		}
		if (c == '0' || c == '1'){
			
			System.out.println("Es ist ein binäre Ziffer");
		}
		if (c >= '0' && c <= '7'){
			
			System.out.println("Es ist eine oktale Ziffer");
		}
		if (!((c >= 'A' && c<= 'Z') || (c >= '0' && c <='9' || c >= 'a' && c <= 'f'))){
			
			System.out.println("Ziffer ist unbekannt");
		}
		
		scanner.close();

	}

}
