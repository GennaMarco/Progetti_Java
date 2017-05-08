package compitiSelezione;

public class AziendaProdotti 
{

	public static void main(String[] args) 
	{
		/*
		 * fascie di sconto
		 * 0-3 0%
		 * 4-7 3%
		 * 8-11 7%
		 * 12-17 11%
		 * 18> 15%
		 * 
		 */
		double prezzo = 3;      // input
		int quantitaProd = 4;   // input
		int sconto = 0;          // 3%    3/100
		double totale = 0.00;    // output
		double subTot = 0.00;    // output
		double scontEff = 0.00;  // output
		
		if(prezzo < 0 || quantitaProd <= 0)
		{
			System.out.println("Errore, parametro/i non corretto/i");
		}
		else
		{
		   if(quantitaProd>=4 && quantitaProd<=7)
			  sconto = 3;
		   else if(quantitaProd>=8 && quantitaProd<=11)
			  sconto = 7;
		   else if(quantitaProd>=12 && quantitaProd<=17)
			  sconto = 11;
		   else if(quantitaProd>=18)
			  sconto = 15;
		
		   subTot = prezzo * quantitaProd;
		   scontEff = subTot * sconto / 100;
		   totale = subTot - scontEff;
		  
				   
		}
		
		System.out.println("Prezzo: " + prezzo + "€");
	    System.out.println("Quantità prodotti: " + quantitaProd);
	    System.out.println("Percentuale di sconto: " + sconto + "%");
	    System.out.println("Totale: " + totale + "€");
	    System.out.println("Subtotale: " + subTot + "€");
	    System.out.println("Sconto effettuato sul totale: " + scontEff + "€");
	}

}
