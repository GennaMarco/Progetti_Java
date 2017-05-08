package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public final class Ordine {

	private int idOrdine;
	private GregorianCalendar data;
	private ArrayList prodotti;
	private Venditore venditore;
	
	public Ordine() {
		data = new GregorianCalendar();
	}

	public Ordine(int idOrdine, GregorianCalendar data, ArrayList prodotti, Venditore venditore) {
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

	public ArrayList getProdotti() {
		return prodotti;
	}

	public void setProdotti(ArrayList prodotti) {
		this.prodotti = prodotti;
	}

	public Venditore getVenditore() {
		return venditore;
	}

	public void setVenditore(Venditore venditore) {
		this.venditore = venditore;
	}
	
	public int nProdotti(){
		return prodotti.size();
	}
	
	public double totale(){
		//scelgo la classe ProdottoScelto
		
		double totale=0;
		
		for(Object obj : prodotti){
			ProdottoScelto ps = null;
			if(obj instanceof ProdottoScelto){
				ps=(ProdottoScelto)obj;
				totale += ps.subTotale();
			}
			
		}
		
		return totale;
	}
	
	public String scontrino(){
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		
		
		String msg ="Scontrino: ";
		msg += "\ncodice: "+idOrdine;
		msg += "\ndata: " + sdf.format(data.getTime());
		msg += "\nvenditore: "+venditore.getNome()+" "+venditore.getCognome();
		
		msg += "\n\nelenco prodotti:\n";
		for(Object obj : prodotti)
		{
			ProdottoScelto ps = null;
			if(obj instanceof ProdottoScelto){
				ps = (ProdottoScelto)obj;
				msg += "codice: " + ps.getProdotto().getCodice();
				msg += ", prodotto: " + ps.getProdotto().getNome();
				msg += ", quantità: " + ps.getQuantita();
				msg += ", prezzo: " + ps.getProdotto().getPrezzo();
				msg += ", sub totale: " + ps.subTotale();
				msg += "\n";				
				
			}
			
		}
		
		msg += "totale: "+totale();
		return msg;
		
	}

	@Override
	public String toString() {
		return "Ordine [idOrdine=" + idOrdine + ", " + (data != null ? "data=" + data + ", " : "")
				+ (prodotti != null ? "prodotti=" + prodotti + ", " : "")
				+ (venditore != null ? "venditore=" + venditore + ", " : "") + "totale()=" + totale() + ", "
				+ (scontrino() != null ? "scontrino()=" + scontrino() : "") + "]";
	}
	
	
	
}
