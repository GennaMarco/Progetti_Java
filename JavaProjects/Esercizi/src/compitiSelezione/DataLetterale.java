package compitiSelezione;

public class DataLetterale 
{

	public static void main(String[] args) 
	{
	   int giorno = 29;         // input
	   int mese = 2;           // input
	   int anno = 2016;        // input 
	      
	   String msg = "";        // output
	   String mexLet = "";     // output
	      
	   if(giorno<1 || giorno >31 || mese<1 || mese>12 || anno<1582 || anno>2017)
	   {
	      msg = "Errore";
	   }
	   else if ((mese == 11 || mese == 4 || mese == 6 || mese ==9) && giorno == 31)
	   {
		  msg = "Errore";  
	   }
	   else if (mese == 2 && giorno >29)
	   {
	  	  msg = "Errore";  
	   }
	   else if (mese == 2 && giorno == 29 && anno % 4 != 0)
	   {
	   	  msg = "Errore";  
	   }
	   else if (mese == 2 && giorno == 29 && anno % 100 == 0 && anno % 400!= 0)
	   {
          msg = "Errore"; 
	   }
	   else
	   { 
	      if(mese == 1)
	       	 mexLet = "Gennaio";
          else if(mese == 2)
	    	 mexLet = "Febbraio";
    	  else if(mese == 3)
	    	 mexLet = "Marzo";
	      else if(mese == 4)	
		     mexLet = "Aprile";
          else if(mese == 5)
		     mexLet = "Maggio";
	      else if(mese == 6)
		     mexLet = "Giugno";
	      else if(mese == 7)
		     mexLet = "Luglio";
          else if(mese == 8)
	         mexLet = "Agosto";
          else if(mese == 9)
	         mexLet = "Settembre";
          else if(mese == 10)
		     mexLet = "Ottobre";
	      else if(mese == 11)
		     mexLet = "Novembre";
	      else if(mese == 12)
		     mexLet = "Dicembre";
	      
	      msg = "Data: " + giorno + " " + mexLet + " " + anno;
	    }
	      
	    System.out.println(msg);  

	}

}
