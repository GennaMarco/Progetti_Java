/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author degennarom
 */
public class Automobile implements Serializable{
    
    private String marca;
    private String modello;
    private int cilindrata;
    private Alimentazione alimentazione;
    private String colore;

    public Automobile() {}
    
    public Automobile(String marca, String modello, int cilindrata, Alimentazione alimentazione, String colore) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.alimentazione = alimentazione;
        this.colore = colore;
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

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public Alimentazione getAlimentazione() {
        return alimentazione;
    }

    public void setAlimentazione(Alimentazione alimentazione) {
        this.alimentazione = alimentazione;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }
    
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.marca);
        hash = 97 * hash + this.cilindrata;
        hash = 97 * hash + Objects.hashCode(this.alimentazione);
        hash = 97 * hash + Objects.hashCode(this.colore);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Automobile other = (Automobile) obj;
        if (this.cilindrata != other.cilindrata) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modello, other.modello)) {
            return false;
        }
        if (!Objects.equals(this.colore, other.colore)) {
            return false;
        }
        if (this.alimentazione != other.alimentazione) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "" 
                + "Marca: " + marca 
                + "\nModello: " + modello 
                + "\nCilindrata: " + cilindrata 
                + "\nAlimentazione: " + alimentazione 
                + "\nColore: " + colore
                + "\nVelocità max: " + velocitaMax() + " km/h"
                + "\n\n"
                ;
    }
}
