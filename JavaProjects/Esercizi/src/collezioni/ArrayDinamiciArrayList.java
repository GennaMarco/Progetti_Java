package collezioni;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Vector;
import classi.*;

public class ArrayDinamiciArrayList {

	public static void main(String[] args) 
	{
	   // array dinamici
		
		ArrayList elenco = new ArrayList(4);   
        System.out.println("Dimensione: " + elenco.size());
        
        elenco.add(new Punto());
        elenco.add(new Punto(3.5,2.3));
        elenco.add(new Punto("R",-3.5,2.3));
        elenco.add(new Data(12,3,1999));
        elenco.add(new Cerchio(5.6));
        elenco.add(12.5);                  // il metodo add ha diversi overload
        elenco.add(45);
        elenco.add(false);
        elenco.add("Pino");
        elenco.add(new GregorianCalendar());
        elenco.add(0);
        
        System.out.println("Dimensione: " + elenco.size());
        
        for(int i = 0;i<elenco.size(); i++)
        	System.out.println(elenco.get(i));
        
        for(Object o : elenco)
        { 
        	Punto p = null;                  // p punta a null, anche di default
        	if(o instanceof Punto)           // stampa solo gli oggetti di tipo Punto, se o è istanza di Punto
        	{
        	   p=(Punto)o;	
        	   System.out.println(p.distanza());
            }
        }
        
        elenco.remove(false);
        for(int i = 0;i<elenco.size(); i++)
        	System.out.println(elenco.get(i));
        
        Object obj = elenco.remove(3);
        System.out.println("Elemento rimosso: " + obj);
        for(int i = 0;i<elenco.size(); i++)
        	System.out.println(elenco.get(i));
        
        elenco.set(3, new Persona("Pino", "Caluso"));          // il set sostituisce(sovrascrive) l'oggetto che si trova in posizione 3
        System.out.println("Elemento settato: " + obj);
        for(int i = 0;i<elenco.size(); i++)
        	System.out.println(elenco.get(i));
        
        elenco.add(3, new Persona("Rino", "Deluso"));          // l'add lo aggiunge senza sostituirlo
        for(int i = 0;i<elenco.size(); i++)
        	System.out.println(elenco.get(i));
        
        
	}

}
