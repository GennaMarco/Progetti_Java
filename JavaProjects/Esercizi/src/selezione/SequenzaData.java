package selezione;

public class SequenzaData 
{

	public static void main(String[] args) 
	{

      int giorno = 29;
      int mese = 2;
      int anno = 1596;        // 1582 fino al 2017
      
      String msg = "";
      
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
    	  msg = msg + (giorno < 10 ? "0":"") + giorno + "/";
	      msg = msg + (mese < 10 ? "0":"") + mese + "/";
	      msg = msg + anno;
      }
      System.out.println(msg);
      
      

	}

}
