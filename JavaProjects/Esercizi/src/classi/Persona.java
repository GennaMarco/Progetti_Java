package classi;

import enumeration.Sesso;

public class Persona 
{
	//attributi
	private String nome;
	private String cognome;
	private Data dataNascita;
	private String luogoNascita;
	private Sesso sesso;
	
	
	
	public Persona() 
	{
	
	}
	
	

	public Persona(String nome, String cognome, Data dataNascita, String luogoNascita, Sesso sesso) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.sesso = sesso;
	}



	public Persona(String nome, String cognome) 
	{
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public Persona(String nome, String cognome, Data dataNascita, String luogoNascita) 
	{
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
	}
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getCognome() 
	{
		return cognome;
	}

	public void setCognome(String cognome) 
	{
		this.cognome = cognome;
	}

	public Data getDataNascita() 
	{
		return dataNascita;
	}

	public void setDataNascita(Data dataNascita) 
	{
		this.dataNascita = dataNascita;
	}

	public String getLuogoNascita() 
	{
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) 
	{
		this.luogoNascita = luogoNascita;
	}
	
	public Sesso getSesso() {
		return sesso;
	}

    public void setSesso(Sesso sesso) {
		this.sesso = sesso;
	}



	public int eta()
	{
		Data oggi = new Data(3, 2, 2017);
		
		//21/1/1993 - Andrea - eta = 24
		//24/04/1993 - Davide - eta = 23
		int e = oggi.getAnno() - dataNascita.getAnno();
		
		if(oggi.getMese()<dataNascita.getMese() || ((dataNascita.getMese()==oggi.getMese() && dataNascita.getGiorno() > oggi.getGiorno())))
			e--;
		return e;
	}

	@Override
	public String toString() 
	{
		return "Persona ["
				+ (nome != null ? "nome=" + nome : "")
				+ (cognome != null ?", cognome=" + cognome : "") 
				+ (dataNascita != null ? ", dataNascita=" + dataNascita.stampaLetterale() : "") 
				+ (luogoNascita != null ?", luogoNascita=" + luogoNascita : "")
				+ (dataNascita != null ?", età=" + eta() : "")
				+ (sesso != null ?", Sesso=" + sesso : "")
				+ "]";
	}
	
	

	
	
	
	
}
