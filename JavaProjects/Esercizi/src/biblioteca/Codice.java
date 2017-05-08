package biblioteca;

public class Codice 
{
   //ATTRIBUTI
   private final String PREFISSOEAN = "978";
   private String editore;
   private String titolo;
   
   //COSTRUTTORE
   public Codice(String editore, String titolo) 
   {
	  this.editore = editore;
	  this.titolo = titolo;
   }
   
   //METODI
   public String CalcolaIsbn()
   { 
	  return this.PREFISSOEAN + "-" + this.editore.hashCode() + this.titolo.hashCode();
   }
}
