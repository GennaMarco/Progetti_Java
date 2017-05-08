/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.*;
import java.util.ArrayList;


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
                    persone = (ArrayList)obj;
                
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
}
