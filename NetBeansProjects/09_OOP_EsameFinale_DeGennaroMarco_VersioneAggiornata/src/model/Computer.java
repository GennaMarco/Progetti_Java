/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



/**
 *
 * @author Marco de Gennaro 16/05/2017 Integrated Backend Services
 */
public class Computer 
{
    private Prodotto processore;
    private Prodotto memoria;
    private Prodotto hardDisk;
    private Prodotto monitor;
    private Prodotto tastiera;
    private Prodotto mouse;
 
    public Computer() {}

    public Prodotto getProcessore() {
        return processore;
    }

    public void setProcessore(Prodotto processore) {
        this.processore = processore;
    }

    public Prodotto getMemoria() {
        return memoria;
    }

    public void setMemoria(Prodotto memoria) {
        this.memoria = memoria;
    }

    public Prodotto getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(Prodotto hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Prodotto getMonitor() {
        return monitor;
    }

    public void setMonitor(Prodotto monitor) {
        this.monitor = monitor;
    }

    public Prodotto getTastiera() {
        return tastiera;
    }

    public void setTastiera(Prodotto tastiera) {
        this.tastiera = tastiera;
    }

    public Prodotto getMouse() {
        return mouse;
    }

    public void setMouse(Prodotto mouse) {
        this.mouse = mouse;
    }
    
    @Override
    public String toString() {
        return "" 
                + "Processore{ Codice:" + processore.getCodice()+ ", Nome:" + processore.getNome()+ ", Prezzo:€" + processore.getPrezzo() + " }"
                + "\nMemoria{ Codice:" + memoria.getCodice()+ ", Nome:" + memoria.getNome()+ ", Prezzo:€" + memoria.getPrezzo() + " }"
                + "\nHardDisk{ Codice:" + hardDisk.getCodice()+ ", Nome:" + hardDisk.getNome()+ ", Prezzo:€" + hardDisk.getPrezzo() + " }"
                + "\nMonitor{ Codice:" + monitor.getCodice()+ ", Nome:" + monitor.getNome()+ ", Prezzo:€" + monitor.getPrezzo() + " }"
                + "\nTastiera{ Codice:" + tastiera.getCodice()+ ", Nome:" + tastiera.getNome()+ ", Prezzo:€" + tastiera.getPrezzo() + " }"
                + "\nMouse{ Codice:" + mouse.getCodice()+ ", Nome:" + mouse.getNome()+ ", Prezzo:€" + mouse.getPrezzo() + " }"
                ;
    }

}
