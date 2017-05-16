/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marco de Gennaro 16/05/2017 Integrated Backend Services
 */
public class MyLibrary 
{
    /**
    * Funzione che legge un file di testo(formato .cvs) e restituisce una lista di oggetti con oggetti di tipo Prodotto
    * @param: path
    */
    public static ArrayList LeggiFileTesto(String path)
   {
 
        String testo = "";
        ArrayList lista = new ArrayList();
   
        FileInputStream fis = null;
        Scanner sc = null;

        try {
                fis = new FileInputStream(path);
                sc = new Scanner(fis);

                while(sc.hasNextLine())   // se trova delle linee, allora leggilo
                  testo += (testo.length() > 0 ? "\n" : "") + sc.nextLine();  // legge l'intera linea

                String[] prodottistring = testo.split("\n");
                for(int i = 0; i<prodottistring.length; i++)
                {
                    String[] pezziprodottistring = prodottistring[i].split(";");
                    Prodotto p = new Prodotto();
                    p.setCodice(pezziprodottistring[0]);
                    p.setCategoria(pezziprodottistring[1]);
                    p.setNome(pezziprodottistring[2]);
                    p.setDescrizione(pezziprodottistring[3]);
                    p.setPrezzo(Double.parseDouble(pezziprodottistring[4]));
                    p.setGiacenza(Integer.parseInt(pezziprodottistring[5]));
                    lista.add(p);
                }

                sc.close();
                fis.close();

        } catch (FileNotFoundException e) {

                e.printStackTrace();

        } catch (IOException e) {

                e.printStackTrace();
        }
        
        return lista;
   }
   
   /**
    * Funzione che scrive un testo su un file di testo dove ogni \n indica il terminatore di riga
    * @param: testo
    * @param: pathtxt
    */
    public static void ScriviFileTesto(String pathtxt, String testo) 
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
}
