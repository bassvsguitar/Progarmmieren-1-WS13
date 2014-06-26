package übung06;

import java.util.Scanner;

public class Aufgabe02_sinus {

      	public static void main(String[] args) {
		
		System.out.println("Bitte geben Sie eine Wert für 'x' für sin(x) ein:");	
		Scanner scanner = new Scanner(System.in);
		int grad = scanner.nextInt();  //hier beliebige 'grad'-Zahl eingeben
		scanner.close();
		double intorad = grad*Math.PI/180;// 'grad' muss erst noch in Bogenmaß umgerechnet werden (deg in rad)
		double ergebnis = (sin(intorad));
		System.out.println("sin("+ grad +") = " + ergebnis +" (in deg)");
		double sinus = Math.sin(grad);   //mit Formel gerechnet
		System.out.println("sin("+ grad +") = " + sinus +" (in rad)");	//ACHTUNG: Formel rechnet in Rad! (2PI)
	}
	public static double sin(double x){
		
		double a = x;//Zähler
		double b = 1.0;//Nenner
		double c = x;//Summe
		double d = x;//Summand
		for(int i = 2; d > 1E-15 || d < -1E-15; i+=2)
		{
			a = a*x*x*(-1);
			b = b*i*(i-1);
			d = a/b;
			c = c + d;
		}
		return c;
	}
}
