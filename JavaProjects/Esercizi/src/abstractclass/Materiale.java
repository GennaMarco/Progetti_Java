package abstractclass;

public class Materiale 
{
   //ATTRIBUTI
   private String nome;
   private double pesoSpecifico;
   
   
   //COSTRUTTORE
   public Materiale(String nome, double pesoSpecifico) 
   {
	  this.nome = nome;
	  this.pesoSpecifico = pesoSpecifico;
   }

   //ACCESSORS
   public String getNome() 
   {
	  return nome;
   }
   
   public void setNome(String nome) 
   {
	  this.nome = nome;
   }
   
   public double getPesoSpecifico() 
   {
	  return pesoSpecifico;
   }
   
   public void setPesoSpecifico(double pesoSpecifico) 
   {
	  this.pesoSpecifico = pesoSpecifico;
   }

   @Override
   public String toString() 
   {
	  return ""
			 + "\n  Nome: " + nome
             + "\n  Peso specifico: " + pesoSpecifico
             ;
   }
}
