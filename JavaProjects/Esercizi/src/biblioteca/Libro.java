package biblioteca;

public class Libro 
{
   //ATTRIBUTI
   private String titolo;
   private Autore autore;
   private Editore editore;
   private int pagine;
   private int annoPubblicazione;
   private Codice codisbn;
   private final double COSTOSTAMPA = 5.70;
   private final double PERPAGINA = 0.05;
   
   //COSTRUTTORI
   public Libro(String titolo, Autore autore, Editore editore, int pagine, int annoPubblicazione)
   {
	   this.titolo = titolo;
	   this.autore = autore;
	   this.editore = editore;
	   this.pagine = pagine;
	   this.annoPubblicazione = annoPubblicazione;
   }
   
   // ACCESSORS
   public String getTitolo() 
   {
	  return titolo;
   }

   public void setTitolo(String titolo) 
   {
	  this.titolo = titolo;
   }

   public Autore getAutore() 
   {
	  return autore;
   }

   public void setAutore(Autore autore) 
   {
	  this.autore = autore;
   }

   public Editore getEditore() 
   {
	  return editore;
   }

   public void setEditore(Editore editore) 
   {
	  this.editore = editore;
   }

   public int getPagine() 
   {
	  return pagine;
   }

   public void setPagine(int pagine) 
   {
	  this.pagine = pagine;
   }

   public int getAnnoPubblicazione() 
   {
	  return annoPubblicazione;
   }

   public void setAnnoPubblicazione(int annoPubblicazione) 
   {
	  this.annoPubblicazione = annoPubblicazione;
   }
   
   public Codice getCodisbn() 
   {
	  return codisbn;
   }

   public void setCodisbn(Codice codisbn) 
   {
	  this.codisbn = codisbn;
   }

   //METODI
   public double CalcolaCostoLibro()
   {
	   return (this.COSTOSTAMPA + (this.PERPAGINA * this.pagine));
   }
   
   public String StampaIsbn()
   {
	   Codice isbn = new Codice(this.editore.getNome(), this.titolo);
	   return isbn.CalcolaIsbn();
   }
   
   public String StampaLibro()
   {
      return StampaLibro("\n");
   }
   
   public String StampaLibro(String separatore)
   {
	   return    "LIBRO " + "\n" 
				 + "titolo => " + titolo + separatore 
				 + "autore => " + autore.StampaAutore() + " Segni vitali: " + (autore.IsAlive() == true?"Vivo":"Morto") + separatore
				 + "editore => " + editore.StampaEditore() + separatore
				 + "codice ISBN => " + StampaIsbn() + separatore
				 + "pagine => " + pagine + separatore
				 + "anno di pubblicazione => " + annoPubblicazione + separatore
				 + "costo libro => " + CalcolaCostoLibro() + "€"
				 ;
   }

   @Override
   public String toString() 
   {
	  return StampaLibro();
   }
}
