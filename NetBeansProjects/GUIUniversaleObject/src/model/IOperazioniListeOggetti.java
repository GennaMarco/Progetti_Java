/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Marco
 */
public interface IOperazioniListeOggetti 
{
    public void AggiungiOggettoLista(Object obj);
    
    public String LeggiListaOggetti();
    
    public Object CercaOggettoLista(int index);
    
    public void ModificaOggettoLista(int index, Object obj);
    
    public void EliminaOggettoLista(int index);
}
