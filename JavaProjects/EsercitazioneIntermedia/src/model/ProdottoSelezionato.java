package model;

public class ProdottoSelezionato extends Prodotto {

	private int quantita;

	public ProdottoSelezionato() {
	}

	public ProdottoSelezionato(String codice, String nome, String descrizione, double prezzo, int quantita) {
		super(codice, nome, descrizione, prezzo);
		this.quantita = quantita;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	
	public double subTotale(){
		return super.getPrezzo()*quantita;
	}

	@Override
	public String toString() {
		return "" 
				+ (toString() != null ? toString() + ", " : "") 
				+ "quantita=" + quantita
				+ ", sub totale=" + subTotale();
	}
}
