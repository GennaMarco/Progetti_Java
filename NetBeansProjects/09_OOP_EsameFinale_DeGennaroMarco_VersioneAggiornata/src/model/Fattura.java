/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;


/**
 *
 * @author Marco de Gennaro 16/05/2017 Integrated Backend Services
 */
public class Fattura 
{
    private String codice;
    private Computer computer;
    private Cliente cliente;
    private GregorianCalendar data;
    
    public Fattura() {}

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public GregorianCalendar getData() {
        return data;
    }

    public void setData(GregorianCalendar data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    
    public double CalcolaPrezzo()
    {
        return computer.getMemoria().getPrezzo()
                +computer.getHardDisk().getPrezzo()
                +computer.getProcessore().getPrezzo()
                +computer.getMonitor().getPrezzo()
                +computer.getTastiera().getPrezzo()
                +computer.getMouse().getPrezzo();
    }
    
    public double CalcolaPrezzoConIva()
    {
        return CalcolaPrezzo() + (CalcolaPrezzo()*22/100);
    }
    
    private String FormattaData()
    {
        SimpleDateFormat sdfData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdfData.format(data.getTime());
    }
    
    /**
    * Funzione che verifica se i dati di un oggetto sono stati compilati
    * @param: c
    * @return: true -> se sono corretti
    *         false -> se sono errati
    */
    public boolean VerificaDatiObbligatori(Cliente c)
    {
            if(   !c.getNome().isEmpty() 
               && !c.getCognome().isEmpty() 
               && !c.getCellulare().isEmpty()
               && !c.getCap().isEmpty()
               && !c.getCodicefiscale().isEmpty()
               && !c.getEmail().isEmpty()
               && !c.getIndirizzo().isEmpty() 
               && !c.getProvincia().isEmpty()
               && !c.getCittà().isEmpty() 
              )
            return true;
        else
            return false;
    }
    
    @Override
    public String toString() 
    {
        return ""
                + "Data di stampa: " + FormattaData()
                + "\nCodice: " + codice 
                + "\nPrezzo con iva: €" + CalcolaPrezzoConIva()
                + "\nPrezzo: €" + CalcolaPrezzo() 
                + "\nCliente: " + cliente 
                + "\nComputer: " + computer
                ;
    }
    
    
    
    
}
