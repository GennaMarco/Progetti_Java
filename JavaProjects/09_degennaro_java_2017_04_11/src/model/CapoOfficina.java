package model;

import java.util.ArrayList;

public class CapoOfficina extends Meccanico 
{
   private ArrayList<Ordine> ordini;

	public CapoOfficina() {}

	public CapoOfficina(String nome, String cognome, double stipendio, String tipologia, ArrayList<Ordine> ordini) 
	{
		super(nome, cognome, stipendio, tipologia);
		this.ordini = ordini;
		
	}

	public ArrayList<Ordine> getOrdini() {
		return ordini;
	}

	public void setOrdini(ArrayList<Ordine> ordini) {
		this.ordini = ordini;
	}
	
	public void aggiungiOrdine(Ordine ordine)
	{
		ordini.add(ordine);
	}
	
	public int nOrdini()
	{
		return ordini.size();
	}
	
	public double importoOrdini()
	{
		double importo = 0;
		
		for(int i = 0; i< ordini.size(); i++)
			importo += ordini.get(i).totale();
		return importo;
			
	}
	
	public double tredicesima()
	{
		return super.tredicesima() + (importoOrdini()*5/100);
	}

	@Override
	public String toString() {
		return "CapoOfficina: " 
	            + (super.toString() != null ? super.toString() + ", " : "")
				+ (ordini != null ? "\nordini:" + ordini : "") 
				;
	}

	
}
