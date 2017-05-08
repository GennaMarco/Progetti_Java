package model;

public class ProdottoScelto {

	private Prodotto prodotto;
	private int quantita;
	
	public ProdottoScelto() {
	}

	public ProdottoScelto(Prodotto prodotto, int quantita) {
		this.prodotto = prodotto;
		this.quantita = quantita;
	}

	public Prodotto getProdotto() {
		return prodotto;
	}

	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	
	public double subTotale(){
		return prodotto.getPrezzo()*quantita;
	}

	@Override
	public String toString() {
		return "" 
				+ (prodotto != null ? prodotto + ", " : "") 
				+ "quantita=" + quantita
				+ ", sub totale=" + subTotale();
	}
	
	
}
