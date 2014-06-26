package übung03;

public class Aufgabe04_würfel {

	public static void main(String[] args) {
		
		int ergebnis = (int)(Math.random() * 6 + 1);
		
		if (ergebnis == 1){
			
			System.out.println("Es wurde eine 1 gewürfelt");
		}
		if (ergebnis == 2){
			
			System.out.println("Es wurde eine 2 gewürfelt");
		}
		if (ergebnis == 3){
			
			System.out.println("Es wurde eine 3 gewürfelt");
		}
		if (ergebnis == 4){
			
			System.out.println("Es wurde eine 4 gewürfelt");
		}
		if (ergebnis == 5){
			
			System.out.println("Es wurde eine 5 gewürfelt");
		}
		if (ergebnis == 6){
			
			System.out.println("Es wurde eine 6 gewürfelt");
		}

	}

}
