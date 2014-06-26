package übung04;

public class Aufgabe01_einmaleins {

public static void main(String[] args) throws InterruptedException { //throws InterruptedException erzwingt die Pause
		
		System.out.println("Das kleine Einmaleins\n");
		long millis = 1000; //gibt Dauer in Millisekunden an
		int x;
		int result;
		
		for (int i = 1; i <= 10; i++) //variabler Produzent (= Name der Operanden bei einer Multiplikation) i, Startwert = 1; Endwert = 10 
		{
			for (x = 1; x <= 10; x++) //variabler Produzent x, Startwert = 1; Endwert = 10
			{	
				result = i * x; 
				System.out.println(i + " x " + x + " = " + result); //Ausgabe
				Thread.sleep(millis); //Schlaf-/Pausenfunktion, Dauer siehe "long millis"
			}
			
			System.out.print("\n");
		}
	}
}
