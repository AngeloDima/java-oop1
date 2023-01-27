
package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {
	
	int codice;
	String nome;
	String descrizione;
	double prezzo;
	double iva=22;
	
	
	private static final DecimalFormat Arro = new DecimalFormat("0.00");
	
	public Prodotto( String nome, String descrizione, double prezzo) {
		
		Random rand= new Random();
		this.codice = rand.nextInt(98765 + 1 - 1) + 1;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}
	public void printFullName(int codice, String nome) {
		String CodNom= codice + nome;
		System.out.println("Full name = " +  CodNom); 
	}
	
	public void printBasePrice(double price) {
		System.out.println("Prezzo base Prodotto = "+ Arro.format(price) + " $");
	}
	
	public void printivaPrice(double price) {
		double PriIva = price + price * iva / 100;
		System.out.println("Prezzo con Iva =  " + Arro.format(PriIva) + " $");
	}
	

	

	
	
	
	
}