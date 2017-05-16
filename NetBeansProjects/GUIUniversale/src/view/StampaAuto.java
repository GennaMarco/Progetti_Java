/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import model.Automobile;
import model.OperazioniAutomobili;

/**
 *
 * @author degennarom
 */
public class StampaAuto extends javax.swing.JInternalFrame {
    
    private String pathtxt;
    private String testo;
    private OperazioniAutomobili oa;
    private Automobile aOld;
    /**
     * Creates new form StampaAuto
     */
    public StampaAuto() {
        initComponents();
        //inizializzo i la txtarea e il button come non cliccabili e non modificabili
        txtaDatiAutomobile.setEditable(false);
        btnStampa.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDatiAutomobile = new javax.swing.JTextArea();
        lblPosizione = new javax.swing.JLabel();
        txtPosizione = new javax.swing.JTextField();
        btnCerca = new javax.swing.JButton();
        btnStampa = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        txtaDatiAutomobile.setColumns(20);
        txtaDatiAutomobile.setRows(5);
        jScrollPane1.setViewportView(txtaDatiAutomobile);

        lblPosizione.setText("Posizione:");

        btnCerca.setText("Cerca");
        btnCerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaActionPerformed(evt);
            }
        });

        btnStampa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnStampa.setText("Stampa su file.txt");
        btnStampa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStampaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStampa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPosizione)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPosizione, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCerca))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 128, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPosizione)
                    .addComponent(txtPosizione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStampa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaActionPerformed
        
        /*istanzio un oggetto di tipo OperazioniAutomobili che dovrà operare per cercare un'auto nella lista(sarà letta da file).
          successivamente stampo i dati dell'auto trovata in una textArea*/
        oa = new OperazioniAutomobili();
        if(oa.IsInt(txtPosizione))
        {
            aOld = (Automobile)oa.CercaOggettoLista(Integer.parseInt(txtPosizione.getText()));
            if(aOld != null)
            {
                pathtxt = aOld.getMarca() + "_" + aOld.getModello() + "_" + oa.getAutomobili().indexOf(aOld) + ".txt";
                txtaDatiAutomobile.setText(aOld.toString());
                btnStampa.setEnabled(true);
                btnStampa.setText("Salva su " + pathtxt);
            }
            else
            {
                txtPosizione.setText("");
                JOptionPane.showMessageDialog(null,"Non esiste un auto in quella posizione");
            }
        }
        else
        {
            txtPosizione.setText("");
            JOptionPane.showMessageDialog(null,"Inserire valore intero");
        }
    }//GEN-LAST:event_btnCercaActionPerformed

    private void btnStampaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStampaActionPerformed
        testo = txtaDatiAutomobile.getText();
        GregorianCalendar dataOggi = new GregorianCalendar();
        
        SimpleDateFormat sdfData = new SimpleDateFormat("dd/MM/yyyy");
        String data = null;
        data = sdfData.format(dataOggi.getTime());
        
        SimpleDateFormat sdfOra = new SimpleDateFormat("HH:mm:ss");
        String ora = null;
        ora = sdfOra.format(dataOggi.getTime());
        
        //i path dei file di testo non ammettono caratteri speciali come '/' e ':' , quindi splitto data e ora nei due array
        String []arrayData = data.split("/");
        String []arrayOra = ora.split(":");
        
        //preparo il path della singola automobile con la sua marca, modello, posizione, data e ora di stampa
        testo = "Data di stampa: " + data + " " + ora + "\n" + testo;
        pathtxt = ""
                + aOld.getMarca() + "_" + aOld.getModello() 
                + "_" + oa.getAutomobili().indexOf(aOld) 
                + "_" + arrayData[0] + arrayData[1] + arrayData[2] 
                + "_" + arrayOra[0] + arrayOra[1] + arrayOra[2]
                + ".txt";
        
        oa.ScriviFileTesto(pathtxt, testo);
        btnStampa.setEnabled(false);
        JOptionPane.showMessageDialog(null,"Dati salvati su " + pathtxt + " con successo!");
    }//GEN-LAST:event_btnStampaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerca;
    private javax.swing.JButton btnStampa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPosizione;
    private javax.swing.JTextField txtPosizione;
    private javax.swing.JTextArea txtaDatiAutomobile;
    // End of variables declaration//GEN-END:variables
}
