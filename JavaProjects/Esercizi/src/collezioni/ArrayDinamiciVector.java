package collezioni;

import java.util.GregorianCalendar;
import java.util.Vector;
import classi.*;

public class ArrayDinamiciVector {

	public static void main(String[] args) 
	{
	   // array dinamici
		
		Vector elenco = new Vector(4, 3);  //primo parametro capacità di partenza, seondo parametro:ogni quanto aumenta la sua dim quando viene superata la capacita 
		// Vector è una classe che mi da la possibilità di creare un lista, mi da la possibilità di lavorare con un contenitore dinamico di oggetti
        System.out.println("Capacita: " + elenco.capacity());    // quando la dimensione superà la capacità, la capacità aumenta di 10
        System.out.println("Dimensione: " + elenco.size());
        
        elenco.add(new Punto());
        elenco.addElement(new Punto(3.5,2.3));
        elenco.addElement(new Punto("R",-3.5,2.3));
        elenco.add(new Data(12,3,1999));
        elenco.add(new Cerchio(5.6));
        elenco.add(12.5);                  // il metodo add ha diversi overload
        elenco.add(45);
        elenco.add(false);
        elenco.add("Pino");
        elenco.add(new GregorianCalendar());
        elenco.add(0);
        
        System.out.println("Capacita: " + elenco.capacity());
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
        
        elenco.set(3, new Persona("Pino", "Caluso"));          // il set sostituisce l'oggetto che si trova in posizione 3
        for(int i = 0;i<elenco.size(); i++)
        	System.out.println(elenco.get(i));
        
        elenco.add(3, new Persona("Rino", "Deluso"));          // l'add lo aggiunge dopo l'index specificato(3)
        for(int i = 0;i<elenco.size(); i++)
        	System.out.println(elenco.get(i));
        
        
	}

}
