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
public class Cliente 
{
    private String nome;
    private String cognome;
    private String ragionesociale;
    private String indirizzo;
    private String cap;
    private String città;
    private String provincia;
    private String email;
    private String cellulare;
    private String telefono;
    private String codicefiscale;
    private String partitaiva;

    public Cliente() {
    }

    public Cliente(String nome, String cognome, String ragionesociale, String indirizzo, String cap, String città, String provincia, String email, String cellulare, String telefono, String codicefiscale, String partitaiva) 
    {
        this.nome = nome;
        this.cognome = cognome;
        this.ragionesociale = ragionesociale;
        this.indirizzo = indirizzo;
        this.cap = cap;
        this.città = città;
        this.provincia = provincia;
        this.email = email;
        this.cellulare = cellulare;
        this.telefono = telefono;
        this.codicefiscale = codicefiscale;
        this.partitaiva = partitaiva;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getRagionesociale() {
        return ragionesociale;
    }

    public void setRagionesociale(String ragionesociale) {
        this.ragionesociale = ragionesociale;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellulare() {
        return cellulare;
    }

    public void setCellulare(String cellulare) {
        this.cellulare = cellulare;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodicefiscale() {
        return codicefiscale;
    }

    public void setCodicefiscale(String codicefiscale) {
        this.codicefiscale = codicefiscale;
    }

    public String getPartitaiva() {
        return partitaiva;
    }

    public void setPartitaiva(String partitaiva) {
        this.partitaiva = partitaiva;
    }

    @Override
    public String toString() {
        return "" 
                + "Nome: " + nome 
                + "\nCognome: " + cognome 
                + "\nRagione sociale: " + ragionesociale 
                + "\nIndirizzo: " + indirizzo 
                + "\nCap: " + cap 
                + "\nCitta: " + città 
                + "\nProvincia: " + provincia 
                + "\nEmail: " + email 
                + "\nCellulare: " + cellulare 
                + "\nTelefono: " + telefono 
                + "\nCodice fiscale: " + codicefiscale 
                + "\nPartita iva: " + partitaiva 
                ;
    }
    
    
    
}
