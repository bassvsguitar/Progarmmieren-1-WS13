package �bung06;


import java.util.Scanner;

public class Aufgabe01_rekursion {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie einen Wert f�r die Basis ein:");
		int a = scanner.nextInt();//Eingabewert Basis
		System.out.println("Bitte geben Sie einen Wert f�r den Exponenten ein:");
		int b = scanner.nextInt();//Eingabewert Exponent
		scanner.close();
	
		System.out.println("Die Potenz der Basis " + a + " mit dem Exponenten " + b + " betr�gt:\n" + potenz(a, b));
		
	}
	public static long potenz(int x, int n){
		
		long ergebnis;
		if (n == 0)
		return 1;
		ergebnis = x*potenz(x, n-1);
		return ergebnis;
		
	}
}
