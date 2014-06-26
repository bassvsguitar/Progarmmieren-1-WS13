package übung08;


public class Aufgabe02_room_vacant_occupied {

	public static void main(String[] args){
		
		Aufgabe02_room_specifications Room1 = new Aufgabe02_room_specifications("I.2. 1", 150, false);
		Aufgabe02_room_specifications Room2 = new Aufgabe02_room_specifications("I.2.15",  50, false);
	
		for (int i = 1; i <= 2; i++)
		{
	
			if(Room1.getOccupied() == true)
			{
				System.out.println(Room1 + ": BELEGT");
			}
			else
			{
				System.out.println(Room1 + ": FREI");
			}
			if (Room2.getOccupied() == true)
			{
				System.out.println(Room2 + ": BELEGT");
			}
			else
			{	
				System.out.println(Room2 + ": FREI");
			}
			Room1.setOccupied(true);
		}
	}
}
