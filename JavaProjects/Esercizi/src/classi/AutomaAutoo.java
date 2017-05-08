package classi;

import enumeration.Alimentazione;

public class AutomaAutoo 
{
	private String marca;
	private String modello;
	private Alimentazione alimentazione; // benzina, diesel, gpl, metano, ibrida
	private int cilindrata;
	private String colore;
	private int velocita;
	
	public AutomaAutoo() 
	{
	}
	
	

	public AutomaAutoo(String marca, String modello, Alimentazione alimentazione, int cilindrata, String colore) 
	{
		this.marca = marca;
		this.modello = modello;
		this.alimentazione = alimentazione;
		this.cilindrata = cilindrata;
		this.colore = colore;
	}
	
	

	public AutomaAutoo(String marca, String modello, Alimentazione alimentazione, int cilindrata, String colore, int velocita) {
		this.marca = marca;
		this.modello = modello;
		this.alimentazione = alimentazione;
		this.cilindrata = cilindrata;
		this.colore = colore;
		this.velocita = velocita;
	}



	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public Alimentazione getAlimentazione() {
		return alimentazione;
	}

	public void setAlimentazione(Alimentazione alimentazione) {
		this.alimentazione = alimentazione;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public int getVelocita() {
		return velocita;
	}

    public void setVelocita(int velocita) {
		this.velocita = velocita;
	}



	//metodo con: velocità massima dell'auto: cilindrata/10
	public int velocitaMax()
	{
		int v = cilindrata/10;
		
		switch(alimentazione)
		{
		case BENZINA: v+= 50; break;
		case DIESEL: v+=30; break;
		case GPL: v+=10; break;
		case METANO: v-=20; break;
		case IBRIDA: v-=40; break;
		default: v+=0;
		}
		
		return v;
		
	}
	
	public void accelera()
	{
		velocita +=5;
		if(velocita>velocitaMax())
			velocita = velocitaMax();
	}
	
	public void frena()
	{
		velocita -=10;
		if(velocita<0)
			velocita=0;
	}

	@Override
	public String toString() {
		return "Auto [marca=" 
	            + marca + ", modello=" + modello 
	            + ", alimentazione=" + alimentazione 
	            + ", cilindrata=" + cilindrata 
	            + ", colore=" + colore 
	            + ", velocita Max=" + velocitaMax() 
	            + "]";
	}
	
	
	
	

	
	
	
	
	
	
	 
	
	
	
	
	
	
	
}
