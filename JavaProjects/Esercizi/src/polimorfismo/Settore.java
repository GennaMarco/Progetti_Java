package polimorfismo;

public enum Settore 
{
   PRODUZIONE(250.00), LOGISTICA(145.65), MANUTENZIONE(185.50);    // tipo di enumeration personalizzato
	
   private double valore;
   
   public double getValore()
   {
	  return valore;
   }
	
   Settore(double valore)    // costruttore di un enum
   {
      this.valore = valore;	
   }
}
