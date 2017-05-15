/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSlider;

/**
 *
 * @author Marco
 */
public class Ascensore implements Runnable 
{
    private int pianoCorrente;
    private int tempoMillisec;
    private int pianoDesiderato;
    private javax.swing.JLabel lblPiano;
    private ArrayList<javax.swing.JButton> listaBtn;
    private javax.swing.JSlider jsAscensore;

    public Ascensore(int pianoCorrente, int tempoMillisec, JLabel lblPiano, ArrayList<JButton> listaBtn, JSlider jsAscensore) 
    {
        this.pianoCorrente = pianoCorrente;
        this.tempoMillisec = tempoMillisec;
        this.lblPiano = lblPiano;
        this.listaBtn = listaBtn;
        this.jsAscensore = jsAscensore;
        SettaggiIniziali();
    }
    
    public void setPianoDesiderato(int pianoDesiderato) 
    {
        this.pianoDesiderato = pianoDesiderato;
        Thread t = new Thread(this);
        t.start();
    }
    
    @Override
    public void run() 
    {
        DisattivaBtn();
        if(pianoCorrente < pianoDesiderato)
        {
            while(pianoCorrente < pianoDesiderato)
            {
                listaBtn.get(pianoCorrente).setBackground(Color.YELLOW);
                try 
                {
                    Thread.sleep(tempoMillisec);
                } 
                catch (InterruptedException ex) 
                {
                    Logger.getLogger(Ascensore.class.getName()).log(Level.SEVERE, null, ex);
                }
                listaBtn.get(pianoCorrente).setBackground(new JButton().getBackground());
                lblPiano.setText("Piano: " + ++pianoCorrente);
                jsAscensore.setValue(pianoCorrente);
            }
        }
        else 
        {
            while(pianoCorrente > pianoDesiderato)
            {
                listaBtn.get(pianoCorrente).setBackground(Color.YELLOW);
                try 
                {
                    Thread.sleep(tempoMillisec);
                } 
                catch (InterruptedException ex) 
                {
                    Logger.getLogger(Ascensore.class.getName()).log(Level.SEVERE, null, ex);
                }
                listaBtn.get(pianoCorrente).setBackground(new JButton().getBackground());
                lblPiano.setText("Piano: " + --pianoCorrente);
                jsAscensore.setValue(pianoCorrente);
            }
        }
        listaBtn.get(pianoCorrente).setBackground(Color.GREEN);
        AttivaBtn();
    }
    
    private void SettaggiIniziali()
    {
        jsAscensore.setOrientation(JSlider.VERTICAL);
        jsAscensore.setEnabled(false);
        jsAscensore.setValue(pianoCorrente);
        lblPiano.setText("Piano: " + pianoCorrente);
        listaBtn.get(pianoCorrente).setBackground(Color.GREEN);
    }
    
    private void DisattivaBtn()
    {
        for(javax.swing.JButton btn : listaBtn)
            btn.setEnabled(false);
    }

    private void AttivaBtn() 
    {
       for(javax.swing.JButton btn : listaBtn)
            btn.setEnabled(true);
    }
}
