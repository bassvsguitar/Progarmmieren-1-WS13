package übung09;

public class Aufgabe01_room_specifications {
		
		private String 		  id;//Kennung
		private int 	   seats;//Anzahl der Plätze 
		private boolean occupied;//belegt
		
		
				
		public Aufgabe01_room_specifications(String id, int seats, boolean occupied){
			
			this.id             = id;
			this.seats       = seats;
			this.occupied = occupied;

		}
		
		public String getID(){
			
			return id;
		}

		public void setID(String id){
			
			this.id = id;
		}

		public int getSeats(){
			
			return seats;
		}

		public void set(int seats){
			
			this.seats = seats;
		}
		

		public boolean getOccupied(){
			
			if(occupied == true)
			{

				return occupied;
			}
			else
			{
				return occupied;
			}
		}

		public void setOccupied(boolean occupied){
			
			this.occupied = occupied;
		}
		@Override
		public String toString(){
			
			 return "Raum " + id;
		}
	}