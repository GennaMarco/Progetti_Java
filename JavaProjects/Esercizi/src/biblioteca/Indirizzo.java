package biblioteca;

public class Indirizzo 
{
   //ATTRIBUTI
   private String via;
   private int cap;
   private String citta;
   private String provincia;
   private String nazione;
   
   
   //COSTRUTTORI
   public Indirizzo(String via, int cap, String citta, String provincia, String nazione) 
   {
	  this.via = via;
	  this.cap = cap;
	  this.citta = citta;
	  this.provincia = provincia;
	  this.nazione = nazione;
   }

   //ACCESSORS
   public String getVia() 
   {
	  return via;
   }
   
   public void setVia(String via) 
   {
	  this.via = via;
   }
   
   public int getCap() 
   {
	  return cap;
   }
   
   public void setCap(int cap) 
   {
	  this.cap = cap;
   }
   
   public String getCitta() 
   {
	  return citta;
   }
   
   public void setCitta(String citta) 
   {
	  this.citta = citta;
   }
   
   public String getProvincia() 
   {
	  return provincia;
   }
   
   public void setProvincia(String provincia) 
   {
	  this.provincia = provincia;
   }
   
   public String getNazione() 
   {
	  return nazione;
   }
   
   public void setNazione(String nazione) 
   {
	  this.nazione = nazione;
   }
   
   
   
}
