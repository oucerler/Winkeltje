package Pakket01;

import java.util.ArrayList;
import java.util.Scanner;

public class Boeken
{
	static ArrayList<Boeken> boeken = new ArrayList();
	String titel;
	String auteur;
	int prijs;
	
	Boeken(String titel, String auteur, int prijs)
	{
		this.titel = titel;
		this.auteur = auteur;
		this.prijs = prijs;
	}
	
	public String toString()
	{
		return titel + " van " + auteur + " kost " + prijs;
	}
	
	static void toonBoeken()
	{
		Scanner scanner = new Scanner(System.in);
		String invoer = scanner.nextLine();
		System.out.println("Deze boeken zijn te koop:");
		for(Boeken b : boeken)
		{
			System.out.println(b);
		}
	}
	
}
