package interfacce;

public class Atleta implements IAtleta, INuotatore, IAtletaUniversale 
{
    //ATTRIBUTI
	private String nominativo;
	private String club;
	private String disciplina;
	
	//COSTRUTTORI
	public Atleta(){}

	public Atleta(String nominativo, String club, String disciplina) 
	{
	   this.nominativo = nominativo;
	   this.club = club;
	   this.disciplina = disciplina;
	}
    
	//ACCESSORS
	public String getNominativo() 
	{
	   return nominativo;
	}

	public void setNominativo(String nominativo) 
	{
	   this.nominativo = nominativo;
	}

	public String getClub() 
	{
	   return club;
	}

	public void setClub(String club) 
	{
	   this.club = club;
	}

	public String getDisciplina() 
	{
	   return disciplina;
	}

	public void setDisciplina(String disciplina) 
	{
	   this.disciplina = disciplina;
	}
    
	//METODI
	@Override
	public String corro() 
	{
	   return "sto correndo";
	}

	@Override
	public String salto() 
	{
	   return "sto saltando";
	}
	
	@Override
	public String nuoto() 
	{
	   return "sto nuotando";
	}
	
	@Override
	public String mangio() 
	{
	   return "sto mangiando";
	}

	@Override
	public String bevo() 
	{
	   return "sto bevendo";
	}
	
	

	@Override
	public String toString() 
	{
	   return "Atleta [" 
	           + (nominativo != null ? "nominativo=" + nominativo + ", " : "")
			   + (club != null ? "club=" + club + ", " : "")
			   + (disciplina != null ? "disciplina=" + disciplina + ", " : "")
			   + (corro() != null ? corro() + ", " : "") 
			   + (salto() != null ? salto() : ", ")
			   + (nuoto() != null ? nuoto() : ", ")
			   + (mangio() != null ? mangio() : ", ")
			   + (bevo() != null ? bevo() : "")
			   + "]";
	}

	
	
	
	
	
	
}
