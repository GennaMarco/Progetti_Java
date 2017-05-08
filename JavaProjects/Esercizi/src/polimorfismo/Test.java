package polimorfismo;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) 
	{
	   Amministrativo a1 = new Amministrativo("Gino A", 12, 50, Mansione.CONTABILE);
	   Amministrativo a2 = new Amministrativo("Gino B", 120, 30, Mansione.RISORSEUMANE);
	   Amministrativo a3 = new Amministrativo("Gino C", 12, 1000, Mansione.DIRETTORE);
	   
	   
	   Amministrativo[] elenco = new Amministrativo[3];   // array di oggetti
       elenco[0] = a1;
       elenco[1] = a2;
       elenco[2] = a3;
       System.out.println("Elenco amministrativi");
       for(int i=0;i<elenco.length; i++)
    	   System.out.println(elenco[i]);
       
       Operaio o1 = new Operaio("Dino A", 100, 12.50, Settore.LOGISTICA);
       Operaio o2 = new Operaio("Dino B", 90, 13.50, Settore.PRODUZIONE);
       Operaio o3 = new Operaio("Dino C", 80, 15.50, Settore.MANUTENZIONE);
       
       System.out.println("\nLista operai");
       Operaio[] lista = {o1, o2, o3};
       for(Operaio o : lista)
    	   System.out.println(o);
       
       OperaioSpecializzato os1 = new OperaioSpecializzato("Mino A", 100, 12.5, Settore.LOGISTICA, 1, 450);
       OperaioSpecializzato os2 = new OperaioSpecializzato("Mino B", 80, 15.5, Settore.PRODUZIONE, 2, 650);
       OperaioSpecializzato os3 = new OperaioSpecializzato("Mino C", 60, 20.5, Settore.MANUTENZIONE, 3, 350);
       
       System.out.println("\nLista operai Specializzati");
       OperaioSpecializzato[] listaSpecializzati = {os1, os2, os3};
       
       for(Operaio os : listaSpecializzati)
    	   System.out.println(os);
       
       ArrayList l = new ArrayList();
       l.add(a1);
       l.add(a2);
       l.add(a3);
       l.add(o1);
       l.add(o2);
       l.add(o3);
       l.add(os1);
       l.add(os2);
       l.add(os3);
       
       for(Object o : l)    // polimorfismo
       {
    	   Dipendente d = null;        // RICORDA: con le classi astratte puoi creare oggetti, ma non puoi istanziarli
    	   if(o instanceof Dipendente)
    	   {
    		  d =(Dipendente)o;
    	      System.out.println(d.getNominativo());     // POLIMORFISMO
    	   }
       }
       
       Integer n = new Integer(4);      // n in questo caso è un oggetto
       int n2 = 4;                       // n2 in questo caso è una normalissima variabile
       
    }

}
