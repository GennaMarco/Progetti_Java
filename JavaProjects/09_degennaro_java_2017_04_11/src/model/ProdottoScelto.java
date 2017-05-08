package model;

public class ProdottoScelto extends Prodotto 
{
   private int quantita;

   public ProdottoScelto(int codice, String prodotto, String descrizione, double prezzo, int quantita) 
	{
		super(codice, prodotto, descrizione, prezzo);
		this.quantita = quantita;
	}



	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	
	public double subTotale()
	{
		return quantita*super.getPrezzo();
	}

    @Override
	public String toString() {
		return "" 
	            + (super.toString() != null ? super.toString() + ", " : "")
				+ "quantita=" + quantita 
				;
	}
	
	
	
}
