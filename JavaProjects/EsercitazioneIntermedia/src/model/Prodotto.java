package model;

public class Prodotto {

	private String codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	
	public Prodotto() {
	}

	public Prodotto(String codice, String nome, String descrizione, double prezzo) {
		this.codice = codice;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Prodotto [" + (codice != null ? "codice=" + codice + ", " : "")
				+ (nome != null ? "nome=" + nome + ", " : "")
				+ (descrizione != null ? "descrizione=" + descrizione + ", " : "") 
				+ "prezzo=" + prezzo + "]";
	}
	
	
}
