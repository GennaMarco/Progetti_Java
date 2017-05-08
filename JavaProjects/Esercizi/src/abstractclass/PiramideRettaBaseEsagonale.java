package abstractclass;

public class PiramideRettaBaseEsagonale extends Solido 
{
   private double latoBase;
   private double altezza;
	   
   public PiramideRettaBaseEsagonale(Materiale materiale, double latoBase, double altezza) 
   {
      super(materiale);
	  this.latoBase = latoBase;
	  this.altezza = altezza;
   }
   
   public double apotema()
   {
	  return Math.sqrt(Math.pow(latoBase, 2) + Math.pow(altezza, 2));
   }
   
   public double apotemaBase()
   {
	  return (latoBase*Math.sqrt(3))/2;
   }
   
   public double perimetroBase()
   {
	   return latoBase*6;
   }
   
   public double superficeBase()
   {
	   return (perimetroBase()*apotemaBase())/2;
   }
   
   public double superficeLaterale() 
   {
      return (perimetroBase()*apotema())/2;
   }
   
   @Override
   public double superficeTotale() 
   {
   	  return superficeLaterale()+superficeBase();
   }
   
   @Override
   public double volume() 
   {
      return (superficeBase()*altezza)/3;
   }
   
   @Override
   public boolean isCostruibile() 
   {
      return latoBase>0 && altezza>0;
   }

   @Override
   public String toString() 
   {
	   if(!isCostruibile())
	  		  return "Dati Inseriti non validi ai fini della costruzione della piramide";
	   
      return "Piramide\n{\n"
    		 + "  lato base = " + latoBase + " m"
    		 + "\n  altezza = " + altezza + " m"
			 + (super.toString() != null ? super.toString() + "\n" : "")
			 + "}\n"
			 ;
   }
}
