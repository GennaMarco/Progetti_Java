package biblioteca;

public class Autore 
{
    //ATTRIBUTI
	private String nome;
	private String cognome;
	private String dataNascita;
	private String luogoNascita;
	private String dataMorte;
	private String luogoMorte;
	
	//COSTRUTTORI
	public Autore(String nome, String cognome, String dataNascita, String luogoNascita) 
    {
	   this.nome = nome;
	   this.cognome = cognome;
	   this.dataNascita = dataNascita;
	   this.luogoNascita = luogoNascita;
	}
	
	public Autore(String nome, String cognome, String dataNascita, String luogoNascita, String dataMorte, String luogoMorte) 
	{
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.dataMorte = dataMorte;
		this.luogoMorte = luogoMorte;
	}
    
    //ACCESSORS
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

	public String getDataNascita() 
	{
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) 
	{
		this.dataNascita = dataNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) 
	{
		this.luogoNascita = luogoNascita;
	}

	public String getDataMorte() {
		return dataMorte;
	}

	public void setDataMorte(String dataMorte) 
	{
		this.dataMorte = dataMorte;
	}

	public String getLuogoMorte() 
	{
		return luogoMorte;
	}

	public void setLuogoMorte(String luogoMorte) 
	{
		this.luogoMorte = luogoMorte;
	}

	//METODI
	public boolean IsAlive()
    {
       return (this.dataMorte == null || this.dataMorte == "") && (this.luogoMorte == null ||this.luogoMorte == "");
    }
    
	public String StampaAutore()
    {
       return this.nome.charAt(0) + ". "+ this.cognome;
    }
}
