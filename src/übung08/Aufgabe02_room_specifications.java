package übung08;

public class Aufgabe02_room_specifications {
	
	private String id; 		 //Kennung
	private int capacity;	 //Anzahl der Plätze 
	private boolean occupied;//belegt


	public Aufgabe02_room_specifications(String id, int capacity, boolean occupied){
		
		this.id = id;
		this.capacity = capacity;
		this.occupied = occupied;

	}

	public String getID(){
		
		return id;
	}

	public void setID(String id){
		
		this.id = id;
	}

	public int getCapacity(){
		
		return capacity;
	}

	public void setCapacity(int capacity){
		
		this.capacity = capacity;
	}

	public boolean getOccupied(){
		
		return occupied;
	}

	public void setOccupied(boolean occupied){
		
		this.occupied = occupied;
	}
	@Override
	public String toString(){
		
		 return "Raum " + id; 
	}
}
	

