/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author degennarom
 */
public class MyLibrary 
{
    public static void ScriviFile(ArrayList<Persona> persone)
    {
        String path = "dati.dat";
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
                fos = new FileOutputStream(path);
                oos = new ObjectOutputStream(fos);
                
                oos.writeObject(persone);
                oos.flush(); // svuota il buffer
                
                oos.close();
                fos.close();

                System.out.println("Dati salvati con successo");

        } catch (FileNotFoundException e) {

                e.printStackTrace();
        } catch (IOException e) {

                e.printStackTrace();
        }
		
    }
    
    public static ArrayList<Persona> LeggiFile()
    {
        String path = "dati.dat";
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<Persona> persone = new ArrayList();
                
        try {
                fis = new FileInputStream(path);
                ois = new ObjectInputStream(fis);
               
                Object obj = ois.readObject();
                if(obj instanceof ArrayList)
                    persone = (ArrayList<Persona>)obj;
                
                ois.close();
                fis.close();
                
                System.out.println("Dati letti con successo");

        } catch (FileNotFoundException e) {

                e.printStackTrace();

        } catch (IOException e) {

                e.printStackTrace();

        } catch (ClassNotFoundException e) {

                e.printStackTrace();
        }
        return persone;
    }
    
    public static boolean VerificaDatiCorretti(Persona p, JTextField txtDataNascita)
    {
        if(!txtDataNascita.getText().isEmpty()
               && !p.getNome().isEmpty() 
               && !p.getCognome().isEmpty() 
               && !p.getLuogoNascita().isEmpty()
          )
        {
            try{
                String[] data = txtDataNascita.getText().split("/");
                int giorno = Integer.parseInt(data[0]);
                int mese = Integer.parseInt(data[1]);
                int anno = Integer.parseInt(data[2]);
                GregorianCalendar dataNascita = new GregorianCalendar(anno, mese-1, giorno);
                p.setDataNascita(dataNascita); 
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Errore!\nFormato della data errato\nFormato corretto: dd/mm/yyyy");
                return false;
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Errore!\nCompletare tutti i campi");
            return false;
        }
        return true;
    }
    
    public static boolean VerificaPosizione(JTextField txtPosizione, ArrayList<Persona> persone)
    {
        int index = 0;
       
        try
        {
            index = Integer.parseInt(txtPosizione.getText());
        }catch(Exception e)
        {
            txtPosizione.setText("");
            JOptionPane.showMessageDialog(null,"Errore!\nInserire un valore numerico");
            return false;
        }
        if(persone.size() > index)
            return true; 
        else
        { 
            txtPosizione.setText("");
            JOptionPane.showMessageDialog(null,"Errore!\nNon esiste una persona in quella posizione");
            return false;
        }
    }
}
