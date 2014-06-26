package bonusübung;

public class Aufgabe03_countdown {

	public static void main (String[] args) throws InterruptedException{
		
		long millis = 1000;
		for (int i = 15; i >= 0; i--)
		{
			System.out.println(i);
			Thread.sleep(millis);
		}
	}
}
