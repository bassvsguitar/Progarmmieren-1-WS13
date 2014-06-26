package übung07;

public class Aufgabe03_parameteruebergabe {

	public static void main(String[] args) {
		
		/* bei Run Configurations unter Arguments 
		 * zwei Werte getrennt von einem Leerzeichen 
		 * eingeben und übernehmen
		 */
		
		int x = Integer.valueOf(args[0]);
		int y = Integer.valueOf(args[1]);
		System.out.println("Parameter x = " + x);
		System.out.println("Parameter y = " + y);
		System.out.println("Ergebnis der Multiplikation der x * y = " + x*y);
	} 
}
