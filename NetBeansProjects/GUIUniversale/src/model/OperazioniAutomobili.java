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
public class OperazioniAutomobili implements IOperazioniListeOggetti, IReadWriteFile
{
    private ArrayList<Automobile> automobili;
    private final String path = "auto.dat";
    private String pathtxt = "DatiAutomobili.txt";

    public OperazioniAutomobili() {}
    
    /**
    * Funzione che aggiunge un Oggetto alla lista con lettura e scrittura su file (dotata di controlli sulla lista e sul file)
    * @param: obj
    */
    @Override
    public void AggiungiOggettoLista(Object obj) 
    {
        if(obj instanceof Automobile)
        {
            Automobile aNew = (Automobile)obj;
            automobili = LeggiFile();
            if(!VerificaDatiEsistenti(aNew))
            {
                automobili.add(aNew);
                if(!ControllaFileEsistente())
                    JOptionPane.showMessageDialog(null,"File appena creato!");
                ScriviFile(automobili);
                JOptionPane.showMessageDialog(null,"Dati salvati con successo!");
            }
              else
                  JOptionPane.showMessageDialog(null,"Dati identici gia presenti!\nImpossibile aggiungere");
        }
    }
    
    /**
    * Funzione che legge una lista di oggetti e restituisce una stringa con il ToString() di ogni oggetto della lista
    * con lettura su file
    * @return: testo
    */
    @Override
    public String LeggiListaOggetti() 
    {
        automobili = LeggiFile();
        String testo = "";
        for(Automobile a : automobili)
            if(a instanceof Automobile)
                testo += "Posizione: " + automobili.indexOf(a)+ "\n" + a.toString();
        
        
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
            automobili = LeggiFile();
            if(VerificaPosizione(index))
               return automobili.get(index);
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
            if(obj instanceof Automobile)
            {
                Automobile aNew = (Automobile)obj;
                automobili = LeggiFile();
                if(!VerificaDatiEsistenti(aNew))
                {
                    automobili.set(index ,aNew);
                    ScriviFile(automobili);
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
        automobili = LeggiFile();
        automobili.remove(index);
        ScriviFile(automobili);
    }
    
    /**
    * Funzione che verifica se i dati di un oggetto sono corretti
    * @param: a
    * return: true -> se sono corretti
    *         false -> se sono errati
    */
    public boolean VerificaDatiCorretti(Automobile a)
    {
        if(!a.getMarca().isEmpty() 
               && !a.getModello().isEmpty() 
               && !a.getColore().isEmpty()
               && (a.getCilindrata()>999 && a.getCilindrata()<3001) 
          )
            return true;
        else
            return false;
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
    
    /**
    * Funzione che verifica se è presente un oggetto in una determinata lista in base all'index
    * @param: index
    * return: true -> se vi è un oggetto all'index richiesto
    *         false -> se non vi è nessun oggetto(null) all'index richiesto
    */
    public boolean VerificaPosizione(int index)
    {
       if(automobili.size() > index && index >= 0)
            return true; 
        else
            return false;    
    }
    
    /**
    * Funzione che verifica se vi è un oggetto uguale a quelli presenti nella lista
    * @param: aNew(oggetto che sarà confrontato con tutti gli altri oggetti della lista)
    * return: true -> se vi è un oggetto uguale ad un oggetto della lista
    *         false -> se non vi è nessun oggetto uguale ad un oggetto della lista
    */
    private boolean VerificaDatiEsistenti(Automobile aNew)
    {
        for(Automobile aOld : automobili)
        {
            if(aOld.equals(aNew))
                return true;
        }
        return false;
    }
    
    /**
    * Funzione che verifica se un file è esistente ad un determinato path
    * return: true -> se il file esiste
    *         false -> se il file non esiste
    */
    private boolean ControllaFileEsistente() 
    {
        File f = new File(path);
        return f.exists();
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
        automobili = new ArrayList();
        try {
                fis = new FileInputStream(path);
                ois = new ObjectInputStream(fis);
               
                Object obj = ois.readObject();
                
                if(obj instanceof ArrayList)
                    automobili = (ArrayList)obj;
                
                ois.close();
                fis.close();
                
                System.out.println("Dati letti con successo");

        } 
        catch (FileNotFoundException e) {} 
        catch (IOException e) {} 
        catch (ClassNotFoundException e) {}
        
        return automobili;
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

    public String getPathtxt() {
        return pathtxt;
    }

    public void setPathtxt(String pathtxt) {
        this.pathtxt = pathtxt;
    }

    public ArrayList<Automobile> getAutomobili() {
        return automobili;
    }

    public void setAutomobili(ArrayList<Automobile> automobili) {
        this.automobili = automobili;
    }
    
    

    

    

    
    
    
    

    

    
    
}
