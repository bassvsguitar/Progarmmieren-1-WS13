package übung07;

import java.util.Scanner;

public class Aufgabe02_kindersprache {
	
	public static void main(String[] args) {
		
		System.out.println("Bitte geben Sie einen Satz ein: ");
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		System.out.println(spielen(sentence));
		scanner.close();
	}

	public static String spielen(String sentence){
		
		char[] sentenceArray = sentence.toCharArray();
		
		int counter = sentenceArray.length;
		String newSentence;
		
		for(int i = 0; i < sentence.length(); i++)//Berechnung der Länge der neuen Arrays
		{
			switch(sentence.charAt(i))
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				counter+=2;
			}
		}
		char[] newArray = new char[counter];//neues kindersprache mit der Länge des "counter"
		int position = 0;
		
		for(int j = 0; j < sentenceArray.length; j++)
		{
			if (sentenceArray[j] == 'a')
			{
				newArray[position] = 'a';
				position++;
				newArray[position] = 'b';
				position++;
				newArray[position] = 'a';
				position++;
			}
			else if (sentenceArray[j] == 'e')
			{
				newArray[position] = 'e';
				position++;
				newArray[position] = 'b';
				position++;
				newArray[position] = 'e';
				position++;
			}
			
			else if (sentenceArray[j] == 'i')
			{
				newArray[position] = 'i';
				position++;
				newArray[position] = 'b';
				position++;
				newArray[position] = 'i';
				position++;
				
			}
			
			else if (sentenceArray[j] == 'o')
			{
				newArray[position] = 'o';
				position++;
				newArray[position] = 'b';
				position++;
				newArray[position] = 'o';
				position++;
			}
			
			else if (sentenceArray[j] == 'u')
			{
				newArray[position] = 'u';
				position++;
				newArray[position] = 'b';
				position++;
				newArray[position] = 'u';
				position++;
			}
			else if (sentenceArray[j] == ' ')
			{
				newArray[position] = ' ';
				position++;
			}
			else
			{
				newArray[position] = sentenceArray[j];
				position++;
			}
			
	
		}
		newSentence = String.valueOf(newArray);
		return newSentence;
	}	
	
}
