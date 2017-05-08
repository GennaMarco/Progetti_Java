package model;

import java.util.ArrayList;

public class ResponsabileVenditore extends Venditore {

	private ArrayList venditori;

	public ResponsabileVenditore() {
	}

	public ResponsabileVenditore(String nome, String cognome, double stipendio, Settore settore, ArrayList venditori) {
		super(nome, cognome, stipendio, settore);
		this.venditori = venditori;
	}

	public ArrayList getVenditori() {
		return venditori;
	}

	public void setVenditori(ArrayList venditori) {
		this.venditori = venditori;
	}
	
	public void aggiungiVenditore(Venditore venditore){
		venditori.add(venditore);
	}
	
	public Venditore restituisciVenditore(int index){
		
		Object obj = venditori.get(index);
		
		Venditore v = null;
		if(obj instanceof Venditore)
			v = (Venditore)obj;
		
		return v;
	}
	
	public void cancellaVenditore(int index){
		venditori.remove(index);
	}
	
	@Override
	public double tredicesima(){
		
		//giorni lavorativi: 24
		final int giorni = 24;
		
		double bonus = 0; 
		for(Object obj : venditori){
			Venditore v = null;
			if(obj instanceof Venditore){
				v = (Venditore)obj;
				bonus += v.getStipendio()/giorni*15/100;
				}
		}
		
		return super.tredicesima()+bonus;
	}

	@Override
	public String toString() {
		
		String txt = "Elenco venditori: ";
		for(Object obj : venditori){
			Venditore v = null;
			if(obj instanceof Venditore){
				v = (Venditore)obj;
				txt += (txt.length()!=0 ? "\n":"") + v.getCognome()+ " "+ v.getNome() + ", " + v.getSettore() + ", "+ v.getStipendio();
			}
		}
		
		return "" 				
				+ (super.toString() != null ? super.toString() : "")
				+ (venditori != null ? "\n\n" + txt : "")
				;
	}
	
	
}
