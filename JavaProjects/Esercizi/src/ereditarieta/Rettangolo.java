package ereditarieta;

public class Rettangolo extends Quadrilatero        // extends si utilizza per ereditare dalla classe "Quadrilatero"
{
   // IsA = per ereditiare da una superclasse          AsA = associazioni	
   public Rettangolo(double base, double altezza)
   {
	  super(base,altezza,base,altezza);               // per recuperare il costruttore della superclasse, cioè il "Quadrilatero"   
	  super.lato1 = base;
   }
   
   public double area()
   {
	   return super.getLato1() * super.getLato2();    // super si utlizza per far riferimento agli elementi della superclasse
   }
   
   public double diagonale()
   {
	  return Math.sqrt(Math.pow(getLato1(), 2) + Math.pow(getLato2(), 2));   
   }

   @Override
   public String toString() 
   {
	  return "Rettangolo "
	  		+ "[base=" + getLato1() 
	  		+ ", altezza=" + getLato2() 
	  		+ ", perimetro=" + perimetro()
			+ ", area=" + area() 
			+ ", diagonale=" + diagonale() + "]";
}
   
   
}
