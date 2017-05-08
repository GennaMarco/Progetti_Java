package model;

public class Indirizzo 
{
	private Tipo tipo;
	private String nome;
	private String civico;
	private int cap;
	private Provincia provincia;
	
	//COSTRUTTORI
	public Indirizzo() {}
	
	public Indirizzo(Tipo tipo, String nome, String civico, int cap, Provincia provincia) 
	{
		this.tipo = tipo;
		this.nome = nome;
		this.civico = civico;
		this.cap = cap;
		this.provincia = provincia;
	}
    
	//ACCESSORS
	public Tipo getTipo() 
	{
		return tipo;
	}

	public void setTipo(Tipo tipo) 
	{
		this.tipo = tipo;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getCivico() 
	{
		return civico;
	}

	public void setCivico(String civico) 
	{
		this.civico = civico;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) 
	{
		this.cap = cap;
	}

	public Provincia getProvincia() 
	{
		return provincia;
	}

	public void setProvincia(Provincia provincia) 
	{
		this.provincia = provincia;
	}

	@Override
	public String toString() 
	{
		return "" 
	            + (tipo != null ? tipo : "") 
				+ (nome != null ? " " + nome : "")
				+ (civico != null ? " "+ civico + "\n" : "") 
				+ "cap: " + cap + "\n"
				+ (provincia != null ? "provincia: " + provincia : "") 
				;
	}
	
	
	
	

	
	
	
	
	
}
