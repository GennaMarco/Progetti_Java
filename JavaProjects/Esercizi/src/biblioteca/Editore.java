package biblioteca;

public class Editore 
{
   //ATTRIBUTI
   private String nome; 
   private Indirizzo indirizzo;
   private int telefono;
   private String email;
   private String sitoWeb;
   private String ragioneSociale;
   
   //COSTRUTTORI
   public Editore(String nome, Indirizzo indirizzo, int telefono, String email, String sitoWeb, String ragioneSociale) 
   {
	  this.nome = nome; 
	  this.indirizzo = indirizzo;
	  this.telefono = telefono;
	  this.email = email;
	  this.sitoWeb = sitoWeb;
	  this.ragioneSociale = ragioneSociale;
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
   
   public Indirizzo getIndirizzo() 
   {
	  return indirizzo;
   }
   
   public void setIndirizzo(Indirizzo indirizzo) 
   {
	  this.indirizzo = indirizzo;
   }
   
   public int getTelefono() 
   {
	  return telefono;
   }
   
   public void setTelefono(int telefono) 
   {
	  this.telefono = telefono;
   }
   
   public String getEmail() 
   {
	  return email;
   }
   
   public void setEmail(String email) 
   {
	  this.email = email;
   }
   
   public String getSitoWeb() 
   {
	  return sitoWeb;
   }
   
   public void setSitoWeb(String sitoWeb) 
   {
	this.sitoWeb = sitoWeb;
   }
   
   public String getRagioneSociale() 
   {
	return ragioneSociale;
   }
   
   public void setRagioneSociale(String ragioneSociale) 
   {
	  this.ragioneSociale = ragioneSociale;
   }
   
   //METODI
   public String StampaEditore()
   {
	  return this.nome + " " + this.ragioneSociale + " " + this.indirizzo.getNazione();
   }
	

}
