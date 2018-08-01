package Pakket01;

import java.util.ArrayList;

class OnlineWinkel
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
	//ga ik in mijn winkel een lijst maken met de producten die ik verkoop of een lijst met elke fysiek product?
	ArrayList<Speelgoed> speelgoed = new ArrayList();
	Kassa kassa = new Kassa();
	Winkelmandje winkelmandje = new Winkelmandje();
	Verlanglijstje verlanglijstje = new Verlanglijstje();
	BoekenweekKorting bwKorting = new BoekenweekKorting();
	
	void starten()
	{
		System.out.println("Hallo in starten winkel");
	}
		
}