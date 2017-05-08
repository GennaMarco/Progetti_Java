/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 *
 * @author degennarom
 */
public class Persona implements Serializable  // importante per salvare i dati in binario su un file
{
    private String Nome;
    private String Cognome;
    private GregorianCalendar DataNascita;
    private String LuogoNascita;
    private Sesso Sesso;
    
    public Persona(){}
    
    public Persona(String Nome, String Cognome, GregorianCalendar DataNascita, String LuogoNascita, Sesso Sesso) 
    {
        this.Nome = Nome;
        this.Cognome = Cognome;
        this.DataNascita = DataNascita;
        this.LuogoNascita = LuogoNascita;
        this.Sesso = Sesso;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public void setCognome(String Cognome) {
        this.Cognome = Cognome;
    }

    public GregorianCalendar getDataNascita() {
        return DataNascita;
    }

    public void setDataNascita(GregorianCalendar DataNascita) {
        this.DataNascita = DataNascita;
    }

    public String getLuogoNascita() {
        return LuogoNascita;
    }

    public void setLuogoNascita(String LuogoNascita) {
        this.LuogoNascita = LuogoNascita;
    }

    public Sesso getSesso() {
        return Sesso;
    }

    public void setSesso(Sesso Sesso) {
        this.Sesso = Sesso;
    }

    public int eta()
    {
       GregorianCalendar cal = new GregorianCalendar();
	
       int a_oggi = cal.get(GregorianCalendar.YEAR);
       int m_oggi = cal.get(GregorianCalendar.MONTH);
       int g_oggi = cal.get(GregorianCalendar.DAY_OF_MONTH);

       int eta = a_oggi - DataNascita.get(GregorianCalendar.YEAR);

       if(m_oggi<DataNascita.get(GregorianCalendar.MONTH) 
         || (m_oggi==DataNascita.get(GregorianCalendar.MONTH) 
         && g_oggi < DataNascita.get(GregorianCalendar.DAY_OF_MONTH)))

               eta--;
       return eta;
    }
    
   @Override
   public boolean equals(Object obj) {
       
        if (this == obj)                    
		return true;
	if (obj == null)
		return false;
	if (this.getClass() != obj.getClass())   
		return false;
	
	Persona other;     
        other = (Persona) obj;
	if(this.Nome != other.Nome)
		return false;
	if(this.Cognome != other.Cognome)
		return false;
	if(this.DataNascita != other.DataNascita)
		return false;
	if (this.LuogoNascita != other.LuogoNascita)
		return false;
	if (this.Sesso != other.Sesso)
		return false;
        
	return true;
   }
    
    @Override
    public String toString() 
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String data = null;
        if(DataNascita != null)
            data = sdf.format(DataNascita.getTime());
        
        return "Persona" 
                + "\nNome: " + (Nome != null ? Nome : "") 
                + "\nCognome: " + (Cognome != null ? Cognome : "")
                + "\nDataNascita: " + (data != null ? data : "") 
                + "\nLuogoNascita: " + (LuogoNascita != null ? LuogoNascita : "") 
                + "\nSesso: " + (Sesso != null ? Sesso : "") 
                + "\nEta: " + (eta() != 0 ? eta() : 0)
                + "\n\n"
                ;
    }
}
