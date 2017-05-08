package model;

public class Venditore extends Persona 
{
    private String settoreVendite;
	
	public Venditore() {}

    public Venditore(String nome, String cognome, double stipendio, String settoreVendite) 
	{
		super(nome, cognome, stipendio);
		this.settoreVendite = settoreVendite;
		
	}

    public String getSettoreVendite() {
		return settoreVendite;
	}


	public void setSettoreVendite(String settoreVendite) {
		this.settoreVendite = settoreVendite;
	}


	@Override
	public double tredicesima() 
	{
	   return 2*getStipendio();
	}

	@Override
	public String toString() {
		return "" 
	            + (super.toString() != null ? super.toString() + ", " : "")
				+ (settoreVendite != null ? "settoreVendite=" + settoreVendite : "")
				;
	}
	
	

}
