package interfacce;

public class Test 
{

	public static void main(String[] args) 
	{
		Atleta a = new Atleta("Piero del colle", "Juvenilia", "Calcite");
		System.out.println(a);
		
		Calciatore c = new Calciatore("Del piero", "FIFA", "Calcio", "Juve", 56, 12, 36);
        System.out.println(c);
        
        Calciatore c2 = new Calciatore("Andre del mio", "PRO", "Calcio", "Milan", 26, 26, 36);
        System.out.println(c2);
        
        System.out.println("Classifica");
        if(c.mediaGol()>c2.mediaGol())
        {
        	System.out.println(c.getNominativo() + " P: " + c.mediaGol());
            System.out.println(c2.getNominativo() + " P: " + c2.mediaGol());
        }
        else
        {
        	System.out.println(c2.getNominativo() + " P: " + c2.mediaGol());
            System.out.println(c.getNominativo() + " P: " + c.mediaGol());
        }
        
        if(c.equals(c2))      // per confrontare 2 oggetti si utlizizza il metodo equals(obj), equals è un metodo della classe Object
          System.out.println("Gli oggetti c e c2 sono uguali");
        else
          System.out.println("Gli oggetti c e c2 sono diversi");
        
        Calciatore c3 = c2;  // in questo caso entrambi gli oggetti puntano alla stessa istanza, NON VUOLDIRE CHE SIA CLONATO L'OGGETTO, ATTENZIONE
        c3.setNominativo("Pino Oletto");
        System.out.println(c3);
        System.out.println(c2);
        
        Object o = c;    // casting implicito
        Calciatore c4 = null;
        try
        {
           c4 = (Calciatore)c2.clone();
        }
        catch(CloneNotSupportedException e)
        {
        	System.out.println("Errore! Oggetto non clonato");
        }
        
        if(c4.equals(c2))
        	System.out.println("Gli oggetti c4 e c2 sono uguali");
        else
        	System.out.println("Gli oggetti c4 e c2 sono diversi");
        
        if(c4 != null)
        {
        	c4.setNominativo("Dino Rinato");
        	c4.setNumPartite(4);
        }
        System.out.println(c4);
        
        System.out.println("\nClassifica");
        if(c.compareTo(c2) == 1)
        {
        	System.out.println(c.getNominativo() + " P: " + c.mediaGol());
            System.out.println(c2.getNominativo() + " P: " + c2.mediaGol());
        }
        else if(c.compareTo(c2) == -1)
        {
        	System.out.println(c2.getNominativo() + " P: " + c2.mediaGol());
            System.out.println(c.getNominativo() + " P: " + c.mediaGol());
        }
        else if(c.compareTo(c2) == 0)
        	System.out.println("Pari merito");
        else
        	System.out.println("Errore");
        
    }     
}
