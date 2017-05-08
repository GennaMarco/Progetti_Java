package model;

import java.util.ArrayList;

public class ResponsabileVenditori extends Venditore 
{
   ArrayList<Venditore> venditori;
   private final int giorniLavorativiMensili = 24;

   public ResponsabileVenditori() {}

   public ResponsabileVenditori(String nome, String cognome, double stipendio, String settoreVendite, ArrayList<Venditore> venditori) 
   {
	super(nome, cognome, stipendio, settoreVendite);
	this.venditori = venditori;
   }

	public ArrayList<Venditore> getVenditori() {
		return venditori;
	}
	
	public void setVenditori(ArrayList<Venditore> venditori) {
		this.venditori = venditori;
	}
	
	public void aggiungiVenditore(Venditore venditore)
	{
		venditori.add(venditore);
	}
	
	public Venditore restituisciVenditore(int index)
	{
		Object obj = venditori.get(index);
		
		Venditore v = null;
		if(obj instanceof Venditore)
			v = (Venditore)obj;
		
		return v;
	}
	
	public void cancellaVenditore(int index)
	{
		venditori.remove(index);
	}
	
	public double tredicesima()
	{
		double bonus = 0;
		
		for(Object obj : venditori)
		{
		   Venditore v = null;
		   if(obj instanceof Venditore)
		   {
			  v = (Venditore)obj;
			  bonus += v.getStipendio()/giorniLavorativiMensili*15/100;
		   }
		}
		
		return super.tredicesima()+bonus;
	}

	@Override
	public String toString() {
		return "Responsabile Venditori: " 
	            + (super.toString() != null ? super.toString() + "\n" : "")
				+ (venditori != null ? "venditori affidati" + venditori : "")  
				;
	}
	
	
	
	
	
	
   
   
   
   
   
   
   
   
}
