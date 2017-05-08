package model;

public class Posizione 
{
   private int corridoio;
   private int stanza;
   private int armadio;
   private int scaffale;
   
   public Posizione(int corridoio, int stanza, int armadio, int scaffale) 
   {
	  this.corridoio = corridoio;
	  this.stanza = stanza;
	  this.armadio = armadio;
	  this.scaffale = scaffale;
   }

	public int getCorridoio() {
		return corridoio;
	}
	
	public void setCorridoio(int corridoio) {
		this.corridoio = corridoio;
	}
	
	public int getStanza() {
		return stanza;
	}
	
	public void setStanza(int stanza) {
		this.stanza = stanza;
	}
	
	public int getArmadio() {
		return armadio;
	}
	
	public void setArmadio(int armadio) {
		this.armadio = armadio;
	}
	
	public int getScaffale() {
		return scaffale;
	}
	
	public void setScaffale(int scaffale) {
		this.scaffale = scaffale;
	}
	
	@Override
	public String toString() {
		return "Posizione[corridoio=" + corridoio + ", stanza=" + stanza + ", armadio=" + armadio + ", scaffale="
				+ scaffale + "]";
	}
   
   
   
   
   
   
}
