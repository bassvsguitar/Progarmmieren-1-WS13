package übung04;

import java.util.Scanner;

public class Aufgabe03_primzahlen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bitte geben Sie eine ganze Zahl ein : ");
		int zahl = scanner.nextInt();
		int limit; //Zahlenraum, in dem Zahlen untersuchet werden
		limit = zahl; //Zahlenraum ist die eingegebene Zahl die durch den Scanner eingelesen wird
		int nenner; //Durch diese Zahl wird dividiert                                                   
		int teiler; //Anzahl der Teiler                                                    
		int modulo; //Restwert nach der Divison                                
		                
		                        
		if (zahl == 1){	
			
			System.out.println("Die Zahl 1 ist keine Primzahl, da sie nur einen Teiler besitzt!"); 
		}                    
		else{
		    
			teiler = 0;
		    for (nenner = 1; nenner <= limit; nenner++){ //Nenner fängt bei 1 an, Maximum ist die eingegebene Zahl, Es wird in jedem Durchlauf +1 zum Nennerwert addiert
		    	
		    	modulo = zahl % nenner; //Überprüfung, ob Restwert entsteht, nenner addiert +1 und überprüft ob Restwert entsteht               
		    	if (modulo == 0) //wenn Modulo = 0 -> ein Teiler wurde gefunden 
		    	teiler++; //wenn sich erneut Modulo = 0 ergibt heißt dies = weiterer Teiler gefunden  
		    }
		    if (teiler == 2){ //Primzahl
		    	
		    	System.out.println(zahl+" ist eine Primzahl, da sie genau " + teiler + " Teiler hat");
		    	
		    }                    
		    else if (teiler > 2){ // keine Primzahl
		 
		    	System.out.println(zahl+" ist KEINE Primzahl da sie " + teiler + " Teiler hat");
		    }		    	
		}
		scanner.close();	
	}	

}


