package model;

import java.util.ArrayList;

public class CapoOfficina extends Meccanico {

	private ArrayList ordini;

	public CapoOfficina() {
	}

	public CapoOfficina(String nome, String cognome, double stipendio, Tipologia tipologia, ArrayList ordini) {
		super(nome, cognome, stipendio, tipologia);
		this.ordini = ordini;
	}

	public ArrayList getOrdini() {
		return ordini;
	}

	public void setOrdini(ArrayList ordini) {
		this.ordini = ordini;
	}
	
	public void aggiungiOrdine(Ordine ordine){
		ordini.add(ordine);
	}
	
	public int nOrdini(){
		return ordini.size();
	}

	@Override
	public double tredicesima() {
		
		double bonus = 0;
		
		for(Object obj : ordini){
			Ordine o = null;
			if(obj instanceof Ordine){
				o = (Ordine)obj;
				bonus += o.totale()*5/100;
			}
				
		}
				
		return super.tredicesima()+bonus;
	}

	@Override
	public String toString() {
		
		String txt = "\n\nelenco ordini: ";
		for(Object obj : ordini){
			Ordine o = null;
			if(obj instanceof Ordine){
				o = (Ordine)obj;
				txt += (txt.length()!=0 ? "\n":"") + "codice: "+o.getIdOrdine()+", totale: "+o.totale();
			}
		}
		
		
		return "" + (super.toString() != null ? super.toString() + ", " : "")
				+ "n° ordini: " + nOrdini()
				+ (ordini != null ? "" + txt : "") 				
				;
	}
	
	
}
