package test;

import java.util.ArrayList;

import model.*;

public class Test {

	public static void main(String[] args) {
		
		Venditore v1 = new Venditore("Pino","Delfino",1200,Settore.AUTO);
		
		Venditore v2 = null;
		try{
			v2 = (Venditore)v1.clone();
			v2.setNome("Rino");
			v2.setSettore(Settore.MOTO);
		}catch(CloneNotSupportedException e){
			System.out.println("Clonazione non supportata");
		}
		
		Venditore v3 = new Venditore("Gina","Verdi",1300,Settore.AUTO);
		
		ArrayList elencoVenditori = new ArrayList();
		elencoVenditori.add(v1);
		elencoVenditori.add(v2);
		elencoVenditori.add(v3);
		
		ResponsabileVenditore rv = new ResponsabileVenditore("Dino","Lorico",1520.35,Settore.AUTO,elencoVenditori);
		rv.aggiungiVenditore(new Venditore("Beppe","Fortino",1250,Settore.MOTO));
		System.out.println(rv);
		
		Meccanico m1 = new Meccanico("Antonio","La Testa",1350,Tipologia.CARROZZERIA);
		
		Meccanico m2 = null;
		
		try {
			m2 = (Meccanico)m1.clone();
			m2.setNome("");
			m2.setTipologia(Tipologia.MECCANICA);
		} catch (CloneNotSupportedException e) {			
			e.printStackTrace();
		}
				
		Prodotto p1 = new Prodotto("PP-111","Pasticche","Pasticche per i freni anteriori",12.50);
		Prodotto p2 = new Prodotto("PP-112","Olio motore","olio per motori",11.50);
		Prodotto p3 = new Prodotto("PP-113","Filtro","Filtro Olio",25.00);
		
		ArrayList psO1 = new ArrayList();
		psO1.add(new ProdottoScelto(p1,3));
		psO1.add(new ProdottoScelto(p2,4));
		psO1.add(new ProdottoScelto(p3,2));
		
		Ordine o1 = new Ordine();
		o1.setIdOrdine(1);
		o1.setVenditore(v1);		
		o1.setProdotti(psO1);
		System.out.println("\nStampa:\n"+o1.scontrino());
		
		ArrayList psO2 = new ArrayList();
		psO2.add(new ProdottoScelto(p1,30));
		psO2.add(new ProdottoScelto(p3,12));
		
		Ordine o2 = new Ordine();
		o2.setIdOrdine(2);
		o2.setVenditore(v2);		
		o2.setProdotti(psO2);
		
		ArrayList ordini = new ArrayList();
		ordini.add(o1);
		ordini.add(o2);
		
		System.out.println("\nCapo Officina: ");
		CapoOfficina co = new CapoOfficina("Alberto","Dei Nostri",1589.45,Tipologia.CARROZZERIA,ordini);
		System.out.println(co);
		
		
	}

}
