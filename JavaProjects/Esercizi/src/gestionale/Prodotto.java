package gestionale;

public class Prodotto 
{
	//ATTRIBUTI
	private String nome;
	private String codice;
	private String descrizione;
	private double prezzo;
	private int giacenza;
	
	//COSTRUTTORI
	public Prodotto(String nome, String codice, String descrizione, double prezzo) 
	{
		this.nome = nome;
		this.codice = codice;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.giacenza = 100;
	}
    
	public Prodotto(String nome, String codice, String descrizione, double prezzo, int giacenza) 
	{
		this.nome = nome;
		this.codice = codice;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.giacenza = giacenza;
	}

	//ACCESSORS
	public int getGiacenza() 
	{
	   return giacenza;
	}

	public void setGiacenza(int giacenza) 
	{
		this.giacenza = giacenza;
	}
	
	//METODI
	public void OrdinaProdotto(int quantita)
	{
	   if(quantita<=this.giacenza && this.giacenza>0 && quantita>0)
	     this.giacenza -= quantita;
	}
	
	private boolean IsScorta()
	{
	   if(this.giacenza>0 && this.giacenza<=10)
		  return true;
	   else 
		  return false;
	}
	
	public String StampaGiacenza()
	{
	   String msg = "Giacenza: " + giacenza; 	
	   if(IsScorta())
		 return msg + " -> Prodotto in scorta";
	   else
		 return (giacenza!=0 ? msg : msg +" -> Prodotto esaurito");
	}

	@Override
	public String toString() 
	{
	   return StampaGiacenza();
	}
}
