package model;

public class Editore 
{
   private String nome; 
   private String ragioneSociale;
   private Indirizzo indirizzo;
   private String telefono;
   private String sitoWeb;
   private String email;

   //COSTRUTTORI
   public Editore(){}

   public Editore(String nome ,String ragioneSociale, Indirizzo indirizzo, String telefono, String sitoWeb, String email) 
   {
	    this.nome = nome;
		this.ragioneSociale = ragioneSociale;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
		this.sitoWeb = sitoWeb;
		this.email = email;
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
    
	public String getRagioneSociale() 
	{
		return ragioneSociale;
	}
	
	public void setRagioneSociale(String ragioneSociale) 
	{
		this.ragioneSociale = ragioneSociale;
	}
	
	public Indirizzo getIndirizzo() 
	{
		return indirizzo;
	}
	
	public void setIndirizzo(Indirizzo indirizzo) 
	{
		this.indirizzo = indirizzo;
	}
	
	public String getTelefono() 
	{
		return telefono;
	}
	
	public void setTelefono(String telefono) 
	{
		this.telefono = telefono;
	}
	
	public String getSitoWeb() 
	{
		return sitoWeb;
	}
	
	public void setSitoWeb(String sitoWeb) 
	{
		this.sitoWeb = sitoWeb;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}

	//METODI
	@Override
	public String toString() 
	{
		return ""
				+ (nome != null ? "nome: " + nome + "\n" : "")
	            + (ragioneSociale != null ? "Ragione Sociale: " + ragioneSociale + "\n" : "")
				+ (indirizzo != null ? "Indirizzo: " + indirizzo + "\n" : "") 
				+ (telefono != null ? "telefono: " + telefono + "\n" : "")
				+ (sitoWeb != null ? "sitoWeb: " + sitoWeb + "\n" : "") 
				+ (email != null ? "email: " + email : "") 
				;
	}

	
	
}
