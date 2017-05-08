package model;

public class Meccanico extends Persona {
	
	private String tipologia;
	
    public Meccanico() {}
	
	public Meccanico(String nome, String cognome, double stipendio, String tipologia) 
	{
		super(nome, cognome, stipendio);
		this.tipologia = tipologia;
	}

	
	public String getTipologia() {
		return tipologia;
	}


    public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

    @Override
	public double tredicesima() {
		
		return getStipendio()*2;
	}

	@Override
	public String toString() {
		return "" 
	            + (super.toString() != null ? super.toString() + ", " : "")
				+ (tipologia != null ? "tipologia=" + tipologia : "")
				;
	}
	
	



	
}
