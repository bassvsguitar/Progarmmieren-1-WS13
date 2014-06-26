package übung08;

public class Aufgabe01_car_specifications_extended{

	private String brand;
	private String model;
	private int    cubiccapacity;
	private int    horsepower;
	private int    maxspeed;
	private String color;
	private int    price;
	private int    seats;
	private String fuel;


	/*	Default-Werte
	 */

	public Aufgabe01_car_specifications_extended(){
		
//		this.brand 			= "default";
//		this.model 			= "default";
//		this.cubbiccapacity = 0000000;
//		this.horsepower 	= 0000000;
//		this.maxspeed 		= 0000000;
//		this.color 			= "default";
//		this.price 			= 0000000;
//		this.seats 			= 0000000;
//		this.fuel 			= "default";
	}
	
	public Aufgabe01_car_specifications_extended(String brand, 
									   String model, 
									   int cubiccapacity, 
									   int horsepower, 
									   int maxspeed, 
									   String color, 
									   int price, 
									   int seats, 
									   String fuel){
	
		this.brand 			= brand;
		this.model 			= model;
		this.setCubiccapacity(cubiccapacity);
		this.horsepower 	= horsepower;
		this.maxspeed 		= maxspeed;
		this.color 			= color;
		this.price 			= price;
		this.seats 			= seats;
		this.fuel 			= fuel;
		
	}
	public String getBrand()
	{
			return brand;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public String getModel(){
		
		return model;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public int getCubiccapacity()
	{
			return cubiccapacity;
	}
	public void setCubiccapacity(int cubiccapacity)
	{
		if(cubiccapacity > 0)
		{
			this.cubiccapacity = cubiccapacity;
		}
	}
	public int getHorsepower()
	{
			return horsepower;
	}
	public void setHorsepower(int horsepower)
	{
		if(horsepower > 0)
		{
			this.horsepower = horsepower;
		}
	}
	public int getMaxspeed()
	{
		return maxspeed;
	}
	public void setMaxspeed(int maxspeed)
	{
		if(maxspeed > 0)
		{
			this.maxspeed = maxspeed;
		}
	}
	public String getColor(){
			
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public int getPrice()
	{
			return price;
	}
	public void setPrice(int price)
	{
		if(price > 0)
		{
			this.price = price;
		}
	}
	public int getSeats()
	{
			return seats;
	}
	public void setSeats(int seats)
	{
		if(seats > 0)
		{
			this.seats = seats;
		}
	}
	public String getFuel(){
		
		return fuel;
	}
	public void setFuel(String fuel)
	{
		this.fuel = fuel;
	}
	@Override
	public String toString(){
		
		 return "Das Auto mit dem größten Hubraum ist: "
				+ "\n********************************************"
				+ "\nMarke:                 " + brand 
				+ "\nModel:                 " + model 
				+ "\nHubraum:               " + cubiccapacity + " cm³" 
				+ "\nLeistung:              " + horsepower + " PS"
				+ "\nHöchstgeschwindigkeit: " + maxspeed + " km/h"
				+ "\nFarbe:                 " + color
				+ "\nPreis:                 " + price + "€"
				+ "\nAnzahl der Sitze:      " + seats 
				+ "\nKraftstoff:            " + fuel;
	}
}

