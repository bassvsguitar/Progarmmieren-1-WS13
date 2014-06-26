package übung05;

import java.util.Scanner;

public class Aufgabe01_dreieck {

	public static void main(String[] args) {
		
		print_triangle();//Aufruf der Methode print_triangle
	
}
public static void print_triangle(){
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Bitte geben Sie die Anzahl der Reihen an: ");
	int a = scanner.nextInt();
	scanner.close();
	System.out.print("\n");
	System.out.print("Ausgabe:");
	System.out.print("\n\n");
	
	int b = a;//Anzahl der Reihen
	char star = 42;//ASCII Stern
	char space = 32;//ASCII Leerzeichen
	String empty_space = new String();//Zeichenkette mit Leerzeichen
	String star_row = new String();//Zeichenkette mit Sternen

	while(b > 0)
	{
		b--;
		empty_space = " ";
		star_row = star_row + star + space;
		for(int i = 0; i < b; i++)
		{
			empty_space = empty_space + space;
		}
		System.out.println(space + empty_space + star_row);//Ausgabe des Dreiecks 
	}
}
}
