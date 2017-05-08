package abstractclass;

public abstract class Solido 
{
   private Materiale materiale;     // le classi astratte non ammettono istanze nel main, ma si possono creare gli oggetti, una classe abstract deve poter ereditare                          

   public Solido(Materiale materiale) 
   {
	  this.materiale = materiale;
   }

   public Materiale getMateriale() 
   {
	  return materiale;
   }

   public void setMateriale(Materiale materiale) 
   {
	  this.materiale = materiale;
   }
   
   public double peso()
   {
	  return materiale.getPesoSpecifico() * volume();
   }
   
   public abstract double volume();
   public abstract double superficeTotale();
   public abstract boolean isCostruibile();

   @Override
   public String toString() 
   {
	  return ""
	  		 + "\n  Peso = " + peso() + " Kg" 
	  		 + "\n  Volume = " + volume() + " m3"
	  		 + "\n  Superfice totale = " + superficeTotale() + " m2"
	  		 + "\n\n  Materiale" + materiale + " Kg/dm3"
	  		 ;
   }
}
