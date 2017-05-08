package model;

import java.util.Arrays;
import java.util.Random;

public class Mazzo 
{
   private Carta[] mazzo;    // associazione tra la classe carta e la classe mazzo, 1:N  AsA, genera una dipendenza, la classe mazzo dipende dalla variazione della classe carta
   
   public Mazzo()
   {
	  Seme[] s = Seme.values();       // in questo modo s è diventato un array di semi
	  Valore[] v = Valore.values();
	  mazzo = new Carta[s.length * v.length];   
   }
   
   public void crea()
   {
	  int k = 0; 
	  for(Seme s : Seme.values())
		  for(Valore v : Valore.values())
			  mazzo[k++] = new Carta(v, s);
   }
   
   public void mescola()
   {
	  mescola(150);
   }
   
   public void mescola(int numeroMescolamenti)
   {
	  Random r = new Random();
	  
	  int posizione1, posizione2;
	  
	  for(int i = 0; i<numeroMescolamenti; i++)
	  {
	     posizione1 = r.nextInt(mazzo.length);
	  
	     do{
		    posizione2 = r.nextInt(mazzo.length);
		  
	     }while(posizione1 == posizione2);
	  
	  
	     Carta temporale = mazzo[posizione1];
	     mazzo[posizione1] = mazzo[posizione2];
	     mazzo[posizione2] = temporale;
	  }
   }

   @Override
   public String toString() 
   {
	   String msg = "";
	   for(Carta c : mazzo)
		   msg += (msg != "" ? "\n" : "") + c;
	   
	  return msg;
   }
   
   
   
   
}
