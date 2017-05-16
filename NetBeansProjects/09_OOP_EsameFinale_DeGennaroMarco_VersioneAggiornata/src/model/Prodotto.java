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
public class Prodotto 
{
    private String codice;
    private String categoria;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int giacenza;

    public Prodotto() {}
   
    public Prodotto(String codice, String categoria, String nome, String descrizione, double prezzo, int giacenza) 
    {
        this.codice = codice;
        this.categoria = categoria;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.giacenza = giacenza;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getGiacenza() {
        return giacenza;
    }

    public void setGiacenza(int giacenza) {
        this.giacenza = giacenza;
    }

    @Override
    public String toString() {
        return ""
                + "Codice: " + codice 
                + "\nCategoria: " + categoria 
                + "\nNome: " + nome 
                + "\nDescrizione: " + descrizione 
                + "\nPrezzo: " + prezzo 
                + "\nGiacenza: " + giacenza
                ;
    }
}
