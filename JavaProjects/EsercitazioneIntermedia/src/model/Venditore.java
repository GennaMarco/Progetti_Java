package model;

public class Venditore extends Persona {

	//attributi
	private Settore settore;

	public Venditore() {
	}

	public Venditore(String nome, String cognome, double stipendio, Settore settore) {
		super(nome, cognome, stipendio);
		this.settore = settore;
	}

	public Settore getSettore() {
		return settore;
	}

	public void setSettore(Settore settore) {
		this.settore = settore;
	}

	@Override
	public double tredicesima() {
		return super.getStipendio()*2;
	}

	@Override
	public String toString() {
		return "" 
				+ (super.toString() != null ? super.toString() + ", " : "")
				+ (settore != null ? "settore=" + settore : "")
				;
	}
	
	
	
	
}
