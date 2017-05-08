package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ordine 
{
   private int idOrdine;
   private GregorianCalendar data;
   private ArrayList<ProdottoScelto> prodotti;
   private Venditore venditore;
   
	public Ordine() 
	{
		data = new GregorianCalendar();
	}

	public Ordine(int idOrdine, GregorianCalendar data, ArrayList<ProdottoScelto> prodotti, Venditore venditore) 
	{
		this.idOrdine = idOrdine;
		this.data = data;
		this.prodotti = prodotti;
		this.venditore = venditore;
	}

	public int getIdOrdine() {
		return idOrdine;
	}

	public void setIdOrdine(int idOrdine) {
		this.idOrdine = idOrdine;
	}

	public GregorianCalendar getData() {
		return data;
	}

	public void setData(GregorianCalendar data) {
		this.data = data;
	}

	public ArrayList<ProdottoScelto> getProdotti() {
		return prodotti;
	}

	public void setProdotti(ArrayList<ProdottoScelto> prodotti) {
		this.prodotti = prodotti;
	}

	public Venditore getVenditore() {
		return venditore;
	}

	public void setVenditore(Venditore venditore) {
		this.venditore = venditore;
	}
	
	public int nProdotti()
	{
		int totaleProdOrdinati = 0;
		
		for(int i = 0; i<prodotti.size(); i++)
			totaleProdOrdinati += prodotti.get(i).getQuantita();
		
		return totaleProdOrdinati;
	}
	
	public double totale()
	{
		double totale = 0;
		
		for(int i = 0; i<prodotti.size(); i++)
			totale += prodotti.get(i).subTotale();
		
		return totale;
	}
	
	public String scontrino()
	{
		String elencoProdottiPerRiga = "";
		
		for(int i = 0; i<prodotti.size(); i++)
			elencoProdottiPerRiga += prodotti.get(i) + "\n";
		
		String scontrino = "\nidOrdine: " + idOrdine 
				           + "\nData Ordine= " + (data.get(Calendar.DAY_OF_MONTH)<10 ? "0" + data.get(Calendar.DAY_OF_MONTH) : data.get(Calendar.DAY_OF_MONTH)) 
				           + "/" +  ((data.get(Calendar.MONTH)+1)<10 ? "0" + (data.get(Calendar.MONTH)+1) : (data.get(Calendar.MONTH)+1))  
				           + "/" + (data.get(Calendar.YEAR)<10 ? "0" + data.get(Calendar.YEAR) : data.get(Calendar.YEAR))
                           + "\nOra Ordine= " + (data.get(Calendar.HOUR_OF_DAY)<10 ? "0" + data.get(Calendar.HOUR_OF_DAY) : data.get(Calendar.HOUR_OF_DAY))  
                           + ":" + (data.get(Calendar.MINUTE)<10 ? "0" + data.get(Calendar.MINUTE) : data.get(Calendar.MINUTE)) 
                           + ":" + (data.get(Calendar.SECOND)<10 ? "0" + data.get(Calendar.SECOND) : data.get(Calendar.SECOND)) 
                           + "\n" + elencoProdottiPerRiga
                           + "totale Scontrino=" + totale() 
                           ;
		
		return scontrino;
		
	}

	@Override
	public String toString() {
		return "\nOrdine(SCONTRINO)"
				+ "\n[\nTotale prodotti ordinati=" + nProdotti()
				+ (venditore != null ? "\nVenditore: " + venditore : "") 
				+ (scontrino() != null ? scontrino() : "") + "\n]\n"
				;
				
		
	}
	
	
	
	
	
	
    
	
   
}
