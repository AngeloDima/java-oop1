package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto Kart = new Prodotto("Kart", "Kart 125cc e 250cc", 32.70);
		System.out.println("Codice Prodotto = "+Kart.codice);
		Kart.printBasePrice(Kart.prezzo);
		Kart.printivaPrice(Kart.prezzo);
		Kart.printFullName(Kart.codice,  Kart.nome);
		
	}

}