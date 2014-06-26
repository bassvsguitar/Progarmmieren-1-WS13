package bonusübung;

import java.util.Scanner;

public class Aufgabe02_speisekarte {

	public static void main(String[] args) {
		/*Gericht-Auswahl*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Helloween-Special");
		System.out.println("Auf dem Menü für heute stehen Ihnen folgende Gerichte zur Auswahl:\n" + "1: Blutunterlaufene Zombieaugen\n" + "2: Draculas Zähne\n" + "3: Zombiefinger\n");
		System.out.println("Bitte wählen Sie das gewünschte Gericht durch Eingabe der entsprechenden Nummer: ");
		int dish = scanner.nextInt();
		
		/*Getränke-Auswahl*/
		System.out.print("Für das von Ihnen ausgewählte Gericht stehen Ihnen folgende Getränke zur Auswahl:\n");
		
		if (dish == 1)
		{
			System.out.print("1: Flasche Blut, Jahrgang 2005\n" + "2: Drachenaugenbowle\n");
		}
		if (dish == 2)
		{
			System.out.print("1: Bloody Mary\n" + "2: Blut Bowle\n");
		}
		if (dish == 3)
		{
			System.out.print("1: Hextentrank\n" + "2: Schneckensaft\n");
		}
		
		System.out.println("Bitte wählen Sie Ihr Getränk durch Eingabe der entsprechnden Nummer: ");
		int drink = scanner.nextInt(); 
		
		/*Bezahloptionen*/
		System.out.println("Sie haben folgende Bezahloptionen zur Auswahl:\n" + "1: In bar\n" + "2: EC-Karte\n" + "3: Kreditkarte\n");
		System.out.print("Bitte wählen Sie Ihre gewünschte Bezahloption durch Eingabe der entsprechenden Nummer:\n");
		int payment = scanner.nextInt();
		
		/*Zusammenfassung*/
		System.out.println("***********************************************************************\n");
		System.out.println("Zusammenfassung Ihrer Auswahl und Bezahloption:\n");
		
		if (dish == 1)
		{
			System.out.println("Gericht: Blutunterlaufene Zombieaugen\n");
			if (drink == 1)
			{
				System.out.println("Getränk: Flasche Blut, Jahrgang 2005\n");
			}
			else if (drink == 2)
			{
				System.out.println("Getränk: Drachenaugenbowle\n");
			}
			if (payment == 1)
			{
				System.out.println("Bezahlung: In bar\n");
			}
			if (payment == 2)
			{
				System.out.println("Bezahlung: Mit EC-Karte\n");
			}
			if (payment == 3)
			{
				System.out.println("Bezahlung: Mit Kreditkarte\n");
			}
		}

		else if (dish == 2)
		{
			System.out.println("Gericht: Draculas Zähne\n");
			if (drink == 1)
			{
				System.out.println("Getränk: Bloody Mary\n");
			}
			else if (drink == 2)
			{
				System.out.println("Getränk: Blutbowle\n");
			}
			if (payment == 1)
			{
				System.out.println("Bezahlung: In bar\n");
			}
			if (payment == 2)
			{
				System.out.println("Bezahlung: Mit EC-Karte\n");
			}
			if (payment == 3)
			{
				System.out.println("Bezahlung: Mit Kreditkarte\n");
			}
		}
		else if (dish == 3)
		{
			System.out.println("Gericht: Zombiefinger\n");
			if (drink == 1)
			{
				System.out.println("Getränk: Hexentrank\n");
			}
			else if (drink == 2)
			{
				System.out.println("Getränk: Schneckensaft\n");
			}
			if (payment == 1)
			{
				System.out.println("Bezahlung: In bar\n");
			}
			if (payment == 2)
			{
				System.out.println("Bezahlung: Mit EC-Karte\n");
			}
			if (payment == 3)
			{
				System.out.println("Bezahlung: Mit Kreditkarte\n");
			}
		}	
		scanner.close();
		System.out.println("Ihre Bestellung wurde entgegengenommen, haben Sie einen Moment Geduld, vielen Dank");
		}
	}

