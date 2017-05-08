package compitiDadiEstrazioniNumeri;

public class EstrazioneLottoCittà 
{

	public static void main(String[] args) 
	{
		int e1, e2, e3, e4, e5, i;
		String citta[] = {"Bari", "Cagliari", "Genova", "Firenze", "Milano", "Napoli", "Roma", "Palermo", "Torino", "Venezia", "Nazionale"};
		
		for(i = 0;i<citta.length; i++)
		{
		
		   e1 = MyLibrary.estrazioneLotto();
			
	      do{
		       e2 = MyLibrary.estrazioneLotto();
		    
	      }while(e1 == e2); 
	    
	      do{
		       e3 = MyLibrary.estrazioneLotto();
		    
	      }while(e1 == e3 || e2 == e3);
	    
	      do{
		       e4 = MyLibrary.estrazioneLotto();
		    
	      }while(e1 == e4 || e2 == e4 || e3 == e4);
	    
	      do{
		       e5 = MyLibrary.estrazioneLotto();
		    
	      }while(e1 == e5 || e2 == e5 || e3 == e5 || e4 == e5);
	    
	      System.out.println("Enalotto " + citta[i] + ": "+ e1 + " " + e2 + " "+ e3 + " "+ e4 + " "+ e5);
		}
	    
	    
	}

}
