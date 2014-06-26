package übung04;

public class Aufgabe04_reihenberechnung {

public static void main(String[] args) throws InterruptedException{ //throws InterruptedException erzwingt die Pause
		
		System.out.println("Reihenberechnung mit Abbruchbedingung wenn ein Glied der Reihe den Wert 0.00001 erreicht");
		double summe = 0; //Initialisierung 
		double summand;
		int k = 1; // Anfangswert für die Variable ist 1, siehe Übung
		long millis = 1000; //gibt Dauer in Millisekunden an
		System.out.println("Die einzelnen Glieder der Reihe:");
		
		do
		{
			summand = (double) (1.0 / Math.pow(k, 2)); //Reihenberechnung (rechnet NUR die Reihenglieder aus, die Multiplikation ist nicht Teil der Reihe)
			summe += summand;
			k++;
			System.out.println(summand);
			Thread.sleep(millis); //Schlaf-/Pausenfunktion, Dauer siehe "long millis"
		}
		while (summand > 0.00001); //Abbruch wenn ein Reihenglied kleiner als 1E-5 ist
		System.out.println("Summe der Reihe bis zur angegebenen Abbruchbedingung: " + 6 * summe); //Die Summe der Reihe bis zum Abbruchwert wird mit 6 multipliziert, siehe Übung
	}

}
