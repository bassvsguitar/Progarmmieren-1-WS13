package übung07;


public class Aufgabe01_car {

	public static void main(String[] args)
	{
		Aufgabe01_car_specifications Car1 = new Aufgabe01_car_specifications();
		Car1.brand = 		  "Mercedes-Benz";
		Car1.model = 		  "C63 AMG Coupé";
		Car1.cubiccapacity =  6208;
		Car1.color = 		  "weiß";
		Car1.horsepower = 	  457;
		Car1.maxspeed =       250;
		Car1.price =          83835;
		Car1.seats =          5;
		Car1.fuel =           "Benzin";
		
		Aufgabe01_car_specifications Car2 = new Aufgabe01_car_specifications();
		Car2.brand = 		  "Opel";
		Car2.model = 		  "Insignia OPC";
		Car2.cubiccapacity =  2792f;
		Car2.color = 		  "weiß";
		Car2.horsepower = 	  325;
		Car2.maxspeed =   	  250;
		Car2.price = 		  46615;
		Car2.seats = 		  5;
		Car2.fuel = 		  "Benzin";
		
		Aufgabe01_car_specifications Car3 = new Aufgabe01_car_specifications();
		Car1.brand = 		  "BMW";
		Car1.model = 		  "M3 Sedan";
		Car1.cubiccapacity =  2979;
		Car1.color =          "blau";
		Car1.horsepower =     431;
		Car1.maxspeed =       250;
		Car1.price =          80500;
		Car1.seats =          5;
		Car1.fuel =           "Benzin";
		
		System.out.println("Vergleich des Hubraums der folgenden Autos:");
		System.out.println("Mercedes-Benz C63 AMG Coupé");
		System.out.println("Opel Insignia OPC");
		System.out.println("BMW M3 Sedan");
		System.out.println("********************************************");
		System.out.println("Das Auto mit dem größten Hubraum ist:");
		
		if(Car1.cubiccapacity > Car2.cubiccapacity && Car1.cubiccapacity > Car3.cubiccapacity)
		{
			System.out.println("Mercedes-Benz C63 AMG Coupé");
		}
		else if(Car2.cubiccapacity > Car1.cubiccapacity && Car2.cubiccapacity > Car3.cubiccapacity)
		{
			System.out.println("Opel Insignia OPC");
		}
		else
		{
			System.out.println("BMW M3 Sedan");
		}
	}
}