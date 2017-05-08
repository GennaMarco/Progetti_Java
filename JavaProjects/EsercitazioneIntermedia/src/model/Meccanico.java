package model;

public class Meccanico extends Persona {

	private Tipologia tipologia;

	public Meccanico() {
	}

	public Meccanico(String nome, String cognome, double stipendio, Tipologia tipologia) {
		super(nome, cognome, stipendio);
		this.tipologia = tipologia;
	}

	public Tipologia getTipologia() {
		return tipologia;
	}

	public void setTipologia(Tipologia tipologia) {
		this.tipologia = tipologia;
	}

	@Override
	public double tredicesima() {
		return super.getStipendio()*2;
	}

	@Override
	public String toString() {
		return "" 
				+ (super.toString() != null ? super.toString() + ", " : "")
				+ (tipologia != null ? "tipologia=" + tipologia : "")
				;
	}
	
	
}
