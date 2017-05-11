/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author degennarom
 */
public class MyLibrary 
{
    public static void ScriviFile(ArrayList<Automobile> automobili)
    {
        String path = "auto.dat";
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(automobili);
            oos.flush(); 

            oos.close();
            fos.close();

            System.out.println("Dati salvati con successo");

        } 
        catch (FileNotFoundException e) {} 
        catch (IOException e) {}
		
    }
    
    public static ArrayList<Automobile> LeggiFile()
    {
        String path = "auto.dat";
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<Automobile> automobili = new ArrayList();
        
        try {
                fis = new FileInputStream(path);
                ois = new ObjectInputStream(fis);
               
                Object obj = ois.readObject();
                if(obj instanceof ArrayList)
                    automobili = (ArrayList<Automobile>)obj;
                
                ois.close();
                fis.close();
                
                System.out.println("Dati letti con successo");

        } 
        catch (FileNotFoundException e) {} 
        catch (IOException e) {} 
        catch (ClassNotFoundException e) {}
        return automobili;
    }
    
    public static boolean VerificaDatiCorretti(Automobile a, JTextField txtCilindrata)
    {
        if(!a.getMarca().isEmpty() 
               && !a.getModello().isEmpty() 
               && !a.getColore().isEmpty()
               && !txtCilindrata.getText().isEmpty() 
          )
        {
            try{
                int cilindrata = Integer.parseInt(txtCilindrata.getText());
                if(cilindrata < 0)
                    return false;
            }
            catch(Exception e)
            {
                return false;
            }
        }
        else
            return false;
        
        return true;
    }
    
    public static void ScriviFileTesto(String path, String testo)
    {
        FileWriter fw = null;  
        BufferedWriter bw = null;  
        String[] linee = testo.split("\n");
        try {
            fw = new FileWriter(path);
            bw = new BufferedWriter(fw);
            
            for(int i = 0; i<linee.length; i++)
            {
               bw.write(linee[i]);
               bw.newLine();
               bw.flush();
            }
            bw.close(); 
            fw.close(); 

            System.out.println("Dati salvati con successo su "+ path + "!");

        } catch (IOException e) {}
    }
    
    public static boolean VerificaPosizione(JTextField txtPosizione, ArrayList<Automobile> automobili)
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
        
        if(automobili.size() > index && index >= 0)
            return true; 
        else
        { 
            txtPosizione.setText("");
            JOptionPane.showMessageDialog(null,"Errore!\nNon esiste un'automobile in quella posizione");
            return false;
        }
    }
}
