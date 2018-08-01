package Pakket01;

import java.util.ArrayList;
import java.util.Scanner;

public class Speelgoed
//nu even public, want er komen zo nog genre enzo bij, maar eerst maar eens geen rode strepen
{
	static ArrayList<Speelgoed> speelgoed = new ArrayList();
	String naam;
	int serienr;
	int prijs;
	
	Speelgoed(String naam, int serienr, int prijs)
	{
		this.naam = naam;
		this.serienr = serienr;
		this.prijs = prijs;
		//om shadowing te voorkomen
	}
	
	public String toString()
	{
		return naam + " met serienummer " + serienr + " kost " + prijs;
	}
	
	static void toonSpeelgoed()
	{
		System.out.println("Wij hebben het volgende in ons aanbod:");
		Scanner scanner = new Scanner (System.in);
		String invoer = scanner.nextLine();
		
		for(Speelgoed s : speelgoed)
		{
			System.out.println(s);
		}
	}
}
