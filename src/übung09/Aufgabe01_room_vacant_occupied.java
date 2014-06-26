package übung09;


public class Aufgabe01_room_vacant_occupied {
	
	public static void main(String[] args){
		
		Aufgabe01_room_specifications Room1 = new Aufgabe01_room_specifications("I.2. 1", 150, false);
		Aufgabe01_room_specifications Room2 = new Aufgabe01_room_specifications("I.2.15",  50, false);
	
		Aufgabe01_lecture Lecture1 = new Aufgabe01_lecture("Mustervorlesung ", "Prof. Dr. Mustermann ", "Musterstudiengang WS13");
		Aufgabe01_lecture Lecture2 = new Aufgabe01_lecture("Mustervorlesung ", "Prof. Dr. Mustermann ", "Musterstudiengang SS14");
		
		for (int i = 1; i <= 2; i++)
		{
	
			if(Room1.getOccupied() == true)
			{
				System.out.println("\nRaum " + Room1.getID() + ": BELEGT");
				System.out.println("\nVeranstaltung: " + Lecture1.getLecture() + 
								   "\nDozent:        " + Lecture1.getLecturer() + 
								   "\nStudiengang:   " + Lecture1.getCourse());
				
			}
			else 
			{
				System.out.println("\nRaum " + Room1.getID() + ": FREI");
				System.out.println("\nVeranstaltung: null" +
						           "\nDozent:        null" + 
						           "\nStudiengang:   null");
			}
		    if (Room2.getOccupied() == true)
			{
				System.out.println("\nRaum " + Room2.getID() + ": BELEGT");
				System.out.println("\nVeranstaltung: " + Lecture2.getLecture() + 
						           "\nDozent:        " + Lecture2.getLecturer() + 
						           "\nStudiengang:   " + Lecture2.getCourse());
			}
			else
			{	
				System.out.println("\nRaum " + Room2.getID() + ": FREI");
				System.out.println("\nVeranstaltung: null" +
				                   "\nDozent:        null" + 
				                   "\nStudiengang:   null");
			}
			Room2.setOccupied(true);//Auswahl welcher Raum belegt werden soll
		}
	}
}
