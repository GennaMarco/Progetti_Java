/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class OperazioniPersone implements IOperazioniListeOggetti, IReadWriteFile 
{
    private ArrayList persone;
    private final String path = "oggetti.dat";
    private String pathtxt = "DatiPersone.txt";
    
    /**
    * Funzione che aggiunge un Oggetto alla lista con lettura e scrittura su file (dotata di controlli sulla lista e sul file)
    * @param: obj
    */
    @Override
    public void AggiungiOggettoLista(Object obj) 
    {
       if(obj instanceof Persona)
        {
            Persona pNew = (Persona)obj;
            persone = LeggiFile();
            if(!VerificaDatiEsistenti(pNew))
            {
                persone.add(pNew);
                if(!ControllaFileEsistente())
                    JOptionPane.showMessageDialog(null,"File appena creato!");
                ScriviFile(persone);
                JOptionPane.showMessageDialog(null,"Dati salvati con successo!");
            }
              else
                  JOptionPane.showMessageDialog(null,"Dati identici gia presenti!\nImpossibile aggiungere");
        }
    }

    /**
    * Funzione che legge una lista di oggetti e restituisce una stringa con il ToString() di ogni oggetto della lista
    * con lettura su file e controllo sull'esistenza del file
    * @return: testo
    */
    @Override
    public String LeggiListaOggetti() 
    {
        persone = LeggiFile();
        String testo = "";
        for(Object p : persone)
            if(p instanceof Persona)
                testo += "Posizione: " + persone.indexOf(p)+ "\n" + p.toString();
        
        if(!ControllaFileEsistente())
            JOptionPane.showMessageDialog(null,"File non esistente!");
        else if(testo == "")
            JOptionPane.showMessageDialog(null,"Lista vuota, ma file esistente!");
        
        return testo; 
    }
    
    /**
    * Funzione che cerca un oggetto in una lista in base all'indice con lettura su file
    * @param: index
    * @return: un oggetto se è presente nella lista
    *          null se non vi è nessun oggetto nella lista
    */
    @Override
    public Object CercaOggettoLista(int index) 
    {
         if(ControllaFileEsistente())
        {
            persone = LeggiFile();
            if(VerificaPosizione(index) && persone.get(index) instanceof Persona)
               return persone.get(index);
            else
               return null;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Errore!\nFile non esistente");
            return null;
        }  
    }

    /**
    * Funzione che modifica un oggetto presente nella lista in base all'indice con lettura e scrittura su file
    * @param: index
    * @param: obj(oggetto nuovo che sovrascriverà l'oggetto vecchio)
    */
    @Override
    public void ModificaOggettoLista(int index, Object obj) 
    {
        if(ControllaFileEsistente())
        {
            if(obj instanceof Persona)
            {
                Persona pNew = (Persona)obj;
                persone = LeggiFile();
                if(!VerificaDatiEsistenti(pNew))
                {
                    persone.set(index ,pNew);
                    ScriviFile(persone);
                    JOptionPane.showMessageDialog(null,"Dati salvati con successo!");
                }
                  else
                      JOptionPane.showMessageDialog(null,"Dati identici gia presenti!\nImpossibile aggiornare");
            }
        }
        else
            JOptionPane.showMessageDialog(null,"File non esistente");
    }
    
    /**
    * Funzione che elimina un oggetto presente nella lista in base all'indice con lettura e scrittura su file
    * @param: index
    */
    @Override
    public void EliminaOggettoLista(int index) 
    {
        persone = LeggiFile();
        persone.remove(index);
        ScriviFile(persone);
    }

    /**
    * Funzione che scrive una lista su un file di oggetti
    * @param: lista
    */
    @Override
    public void ScriviFile(ArrayList lista) 
    {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(lista);
            oos.flush(); 

            oos.close();
            fos.close();

            System.out.println("Dati salvati con successo");

        } 
        catch (FileNotFoundException e) {} 
        catch (IOException e) {}
    }

    /**
    * Funzione che legge un file di oggetti e restituisce una lista di oggetti
    * @return: automobili
    */
    @Override
    public ArrayList LeggiFile() 
    {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<Object> listaObject = new ArrayList();
        
        try {
                fis = new FileInputStream(path);
                ois = new ObjectInputStream(fis);
               
                Object obj = ois.readObject();
                if(obj instanceof ArrayList)
                    listaObject = (ArrayList)obj;
                
                ois.close();
                fis.close();
                
                System.out.println("Dati letti con successo");

        } 
        catch (FileNotFoundException e) {} 
        catch (IOException e) {} 
        catch (ClassNotFoundException e) {}
        
        return listaObject;
    }

    /**
    * Funzione che scrive un testo su un file di testo dove ogni \n indica il terminatore di riga
    * @param: testo
    */
    @Override
    public void ScriviFileTesto(String testo) 
    {
        FileWriter fw = null;  
        BufferedWriter bw = null;  
        String[] linee = testo.split("\n");
        try {
            fw = new FileWriter(pathtxt);
            bw = new BufferedWriter(fw);

            for(int i = 0; i<linee.length; i++)
            {
               bw.write(linee[i]);
               bw.newLine();
               bw.flush();
            }
            bw.close(); 
            fw.close(); 

            System.out.println("Dati salvati con successo su "+ pathtxt + "!");

        } catch (IOException e) {}
    }
    
    /**
    * Overload
    * Funzione che scrive un testo su un file di testo dove ogni \n indica il terminatore di riga
    * @param: testo
    * @param: pathtxt
    */
    public void ScriviFileTesto(String pathtxt, String testo) 
    {
        FileWriter fw = null;  
        BufferedWriter bw = null;  
        String[] linee = testo.split("\n");
        try {
            fw = new FileWriter(pathtxt);
            bw = new BufferedWriter(fw);

            for(int i = 0; i<linee.length; i++)
            {
               bw.write(linee[i]);
               bw.newLine();
               bw.flush();
            }
            bw.close(); 
            fw.close(); 

            System.out.println("Dati salvati con successo su "+ pathtxt + "!");

        } catch (IOException e) {}
    }
    
    /**
    * Funzione che verifica se vi è un oggetto uguale a quelli presenti nella lista
    * @param: pNew(oggetto che sarà confrontato con tutti gli altri oggetti della lista)
    * @return: true -> se vi è un oggetto uguale ad un oggetto della lista
    *          false -> se non vi è nessun oggetto uguale ad un oggetto della lista
    */
    private boolean VerificaDatiEsistenti(Persona pNew)
    {
        for(Object pOld : persone)
        {
            if(pOld instanceof Persona)
                if(pOld.equals(pNew))
                    return true;
        }
        return false;
    }
    
    /**
    * Funzione che verifica se un file è esistente ad un determinato path
    * @return: true -> se il file esiste
    *          false -> se il file non esiste
    */
    private boolean ControllaFileEsistente() 
    {
        File f = new File(path);
        return f.exists();
    }
    
    /**
    * Funzione che verifica se è presente un oggetto in una determinata lista in base all'index
    * @param: index
    * @return: true -> se vi è un oggetto all'index richiesto
    *         false -> se non vi è nessun oggetto(null) all'index richiesto
    */
    public boolean VerificaPosizione(int index)
    {
       if(persone.size() > index && index >= 0)
            return true; 
        else
            return false;    
    }
    
    /**
    * Funzione che verifica se i dati di un oggetto sono corretti
    * @param: p
    * @return: true -> se sono corretti
    *         false -> se sono errati
    */
    public boolean VerificaDatiCorretti(Persona p)
    {
            if(   !p.getNome().isEmpty() 
               && !p.getCognome().isEmpty() 
               && !p.getDataNascita().toString().isEmpty()
               && !p.getLuogoNascita().isEmpty()
              )
            return true;
        else
            return false;
    }
    
    /**
    * Funzione che verifica se il testo di una TextField contiene un valore intero
    * @param: txtCampo
    * @return: true -> se contiene un valore intero
    *         false -> se contine un valore diverso da un intero
    */
    public boolean IsDateFormat(javax.swing.JTextField txtCampo)
    {
        String[] data = txtCampo.getText().split("/");
        try
        {
            ParserizzaData(data);
        }
        catch(Exception e)
        {
            return false;
        } 
        return true;
    }
    
    public int[] ParserizzaData(String[] data)
    {
        int giorno = Integer.parseInt(data[0]);
        int mese = Integer.parseInt(data[1]);
        int anno = Integer.parseInt(data[2]);
        
        int[] dataInt = {anno, mese, giorno};
        
        return dataInt;
    }
    
    /**
    * Funzione che verifica se il testo di una TextField contiene un valore intero
    * @param: txtCampo
    * return: true -> se contiene un valore intero
    *         false -> se contine un valore diverso da un intero
    */
    public boolean IsInt(javax.swing.JTextField txtCampo)
    {
        try
        {
            Integer.parseInt(txtCampo.getText());
        }
        catch(Exception e)
        {
            return false;
        } 
        return true;
    }

    public ArrayList getPersone() {
        return persone;
    }

    public void setPersone(ArrayList persone) {
        this.persone = persone;
    }

    public String getPathtxt() {
        return pathtxt;
    }

    public void setPathtxt(String pathtxt) {
        this.pathtxt = pathtxt;
    }
}
