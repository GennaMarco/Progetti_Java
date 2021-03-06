package model;

public abstract class Persona implements Cloneable{

	//attributi
	private String nome;
	private String cognome;
	private double stipendio;
	
	public Persona() {
	}

	public Persona(String nome, String cognome, double stipendio) {
		this.nome = nome;
		this.cognome = cognome;
		this.stipendio = stipendio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
	public abstract double tredicesima();

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		if(nome==null || cognome==null)
			throw new CloneNotSupportedException();	
		return super.clone();
	}

	@Override
	public String toString() {
		return "" 
				+ (nome != null ? "nome=" + nome + ", " : "")
				+ (cognome != null ? "cognome=" + cognome + ", " : "") 
				+ "stipendio=" + stipendio 
				+ ", tredicesima=" + tredicesima()
				;
	}
	
	
	
	
	
	
	
	
	
}
