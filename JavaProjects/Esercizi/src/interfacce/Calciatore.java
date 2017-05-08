package interfacce;

public class Calciatore extends Atleta implements Cloneable, Comparable 
{
   private String squadra;
   private int numPettorina;
   private int numPartite;
   private int numGol;
   
   
   public Calciatore(String nominativo, String club, String disciplina, String squadra, int numPettorina, int numPartite, int numGol) 
   {
	  super(nominativo, club, disciplina);
	  this.squadra = squadra;
	  this.numPettorina = numPettorina;
	  this.numPartite = numPartite;
	  this.numGol = numGol;
   }
   

   public String getSquadra() {
	return squadra;
   }
 
   public void setSquadra(String squadra) {
	this.squadra = squadra;
   }

   public int getNumPettorina() {
	return numPettorina;
   }

   public void setNumPettorina(int numPettorina) {
	this.numPettorina = numPettorina;
   }

   public int getNumPartite() {
	return numPartite;
   }

   public void setNumPartite(int numPartite) {
	this.numPartite = numPartite;
   }

   public int getNumGol() {
	return numGol;
   }

   public void setNumGol(int numGol) {
	this.numGol = numGol;
   }
   
   public double mediaGol()
   {
	  return (double)numGol/numPartite;   
   }
   
   //metodo clone
   @Override
   protected Object clone() throws CloneNotSupportedException      // è possibile che non sia possibile gestire la clonazione dell'oggetto, throws gestisce l'eccezione di tipo CloneNotSupportedException
   {
	  return super.clone();
   }


   @Override
   public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + numGol;
	result = prime * result + numPartite;
	result = prime * result + numPettorina;
	result = prime * result + ((squadra == null) ? 0 : squadra.hashCode());
	return result;
   }




   @Override
   public boolean equals(Object obj) {
	if (this == obj)                    // se l'oggetto che sto passando è uguale a questa istanza (this)
		return true;
	if (obj == null)
		return false;
	if (this.getClass() != obj.getClass())   // la getClass ritorna il tipo dell'oggetto
		return false;
	
	Calciatore other = (Calciatore) obj;     // l'oggetto è un istanza di calciatore, è necessario il casting dell'oggetto
	if(this.getNominativo() != other.getNominativo())
		return false;
	if(this.getClub() != other.getClub())
		return false;
	if(this.getDisciplina() != other.getDisciplina())
		return false;
	if (this.numGol != other.numGol)
		return false;
	if (this.numPartite != other.numPartite)
		return false;
	if (this.numPettorina != other.numPettorina)
		return false;
	return true;
   }

   @Override
   public int compareTo(Object obj) 
   {
   	  // => 1 se maggiore
	  // => 0 se uguale
	  // => -1 se minore
	  // => -2 in tutti gli altri casi
	   
	   if(obj == null)
		   return -2;
	   if(obj.getClass()!=this.getClass())
		   return -2;
	   
	   Calciatore other = (Calciatore)obj;
	   if(other.mediaGol()<this.mediaGol())
		   return 1;
	   else if(other.mediaGol()>this.mediaGol())
		   return -1;
	   return 0;
   }

   @Override
   public String toString() 
   {
	return "Calciatore [" 
            + (squadra != null ? "squadra=" + squadra + ", " : "") 
            + "numPettorina=" + numPettorina
			+ ", numPartite=" + numPartite + ", numGol=" + numGol 
			+ ", mediaGol()=" + mediaGol() + ", "
			+ (getNominativo() != null ? "getNominativo()=" + getNominativo() + ", " : "")
			+ (getClub() != null ? "getClub()=" + getClub() + ", " : "")
			+ (getDisciplina() != null ? "getDisciplina()=" + getDisciplina() + ", " : "")
			+ (corro() != null ? "corro()=" + corro() + ", " : "")
			+ (salto() != null ? "salto()=" + salto() + ", " : "")
			+ (mangio() != null ? "mangio()=" + mangio() + ", " : "") 
			+ (bevo() != null ? "bevo()=" + bevo() : "")
			+ "]";
   }





   
   
   
}
