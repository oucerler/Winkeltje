package Pakket01;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineWinkel
{
	public static void main(String[] args)
	{
		DeWinkel winkel = new DeWinkel();
		winkel.starten();//OO context
	}
}
class DeWinkel
{
	ArrayList<Boeken> boeken = new ArrayList();
	ArrayList<Speelgoed> speelgoed = new ArrayList();
	//ga ik in mijn winkel een lijst maken met de producten die ik verkoop of een lijst met elke fysiek product?
	Kassa kassa = new Kassa();
	Winkelmandje winkelmandje = new Winkelmandje();
	Verlanglijstje verlanglijstje = new Verlanglijstje();
	BoekenweekKorting bwKorting = new BoekenweekKorting();
	
	DeWinkel()
	//als DeWinkel gemaakt wordt wil ik dat de producten toegevoegd worden aan de beschikbare producten
	//dus IN DE CONSTRUCTOR toevoegen! boeken.add etc
	{
		boeken.add(new Boeken("Turks Fruit", "Jan Wolkers", 1999));
		boeken.add(new Boeken("Jurassic Park", "Michael Chrichton", 1500));
		boeken.add(new Boeken("Moby Dick", "Herman Melville", 1750));
		speelgoed.add(new Speelgoed("LEGO Brickbank", 10251, 15995));
		speelgoed.add(new Speelgoed("LEGO Ghostbusters Firehouse HQ", 75827, 35995));
		speelgoed.add(new Speelgoed("LEGO Parisian Restaurant", 10243, 15999));
		//die details LEGO enzo zijn de signatures
	}
	
	void starten()
	{
		System.out.println("Welkom in de winkel! Kies p om onze producten te zien. Kies w om uw winkelwagentje te zien. Kies v om uw verlanglijstje te bekijken.");
		Scanner scanner = new Scanner (System.in);
		String scKeuze1 = scanner.nextLine();
		try
		{
			if (scKeuze1.equals("p"))
			{
				System.out.println("Wilt u onze boeken zien? Kies 'b'. Wilt u ons speelgoed zien? Kies 's'.");
				Scanner scanner2 = new Scanner (System.in);
				String scKeuze2 = scanner.nextLine();
				try
				{
					if (scKeuze2 == "b")
						laatboekenzien();
					if (scKeuze2 == "s")
						laatspeelgoedzien();
					//bij deze twee gaat hij niet naar de methoden die ik oproep. Graag feedback.
				}
				catch (Exception e)
				{
					System.out.println("Verkeerde input");
				}
			}
		}
		catch (Exception e)
		{
			System.out.println("Verkeerde input");
		}
	}
	void toevoegenWinkemandje()
	{
		
	}
	void toevoegenVerlanglijstje()
	{
		
	}
	void laatboekenzien()
	{
		System.out.println("Deze boeken zijn te koop:");
		for(Boeken b : boeken)
		{
			System.out.println(b);
		}
	}
	void laatspeelgoedzien()
	{
		System.out.println("Wij hebben het volgende in ons aanbod:");		
		for(Speelgoed s : speelgoed)
		{
			System.out.println(s);
		}
	}
		
}