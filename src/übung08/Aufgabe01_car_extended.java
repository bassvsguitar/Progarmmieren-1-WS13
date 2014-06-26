package übung08;

public class Aufgabe01_car_extended {

	public static void main(String[] args)
	{
		Aufgabe01_car_specifications_extended Car1 = new Aufgabe01_car_specifications_extended();
		Car1.setBrand("Mercedes-Benz");
		Car1.setModel("C63 AMG Coupé");
		Car1.setCubiccapacity(6208);
		Car1.setColor("weiß");
		Car1.setHorsepower(457);
		Car1.setMaxspeed(250);
		Car1.setPrice(83835);
		Car1.setSeats(5);
		Car1.setFuel("Benzin");
		
		Aufgabe01_car_specifications_extended Car2 = new Aufgabe01_car_specifications_extended();
		Car2.setBrand("Opel");
		Car2.setModel("Insignia OPC");
		Car2.setCubiccapacity(2792);
		Car2.setColor("weiß");
		Car2.setHorsepower(325);
		Car2.setMaxspeed(250);
		Car2.setPrice(46615);
		Car2.setSeats(5);
		Car2.setFuel("Benzin");
		
		Aufgabe01_car_specifications_extended Car3 = new Aufgabe01_car_specifications_extended();
		Car3.setBrand("BMW");
		Car3.setModel("M3 Sedan");
		Car3.setCubiccapacity(2979);
		Car3.setColor("blau");
		Car3.setHorsepower(431);
		Car3.setMaxspeed(250);
		Car3.setPrice(80500);
		Car3.setSeats(5);
		Car3.setFuel("Benzin");
		
		Aufgabe01_car_specifications_extended Car4 = compare(Car1, Car2, Car3);
		
		System.out.println("Vergleich des Hubraums der folgenden Autos:");
		System.out.println("");
		System.out.println("Mercedes-Benz C63 AMG Coupé (" + Car1.getCubiccapacity() + " cm³)");
		System.out.println("Opel Insignia OPC           (" + Car2.getCubiccapacity() + " cm³)");
		System.out.println("BMW M3 Sedan                (" + Car3.getCubiccapacity() + " cm³)");
		System.out.println("********************************************");
		System.out.println(Car4);
	}
		
		public static Aufgabe01_car_specifications_extended compare(Aufgabe01_car_specifications_extended Car1, 
														  Aufgabe01_car_specifications_extended Car2, 
														  Aufgabe01_car_specifications_extended Car3){
		
		if(Car1.getCubiccapacity() > Car2.getCubiccapacity() && Car1.getCubiccapacity() > Car3.getCubiccapacity())
		{
			return Car1;
		}
		else if(Car2.getCubiccapacity() > Car1.getCubiccapacity() && Car2.getCubiccapacity() > Car3.getCubiccapacity())
		{
			return Car2;
		}
		else
		{
			return Car3;
		}
	}
}