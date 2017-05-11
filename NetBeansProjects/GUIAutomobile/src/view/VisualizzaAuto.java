/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Automobile;
import model.MyLibrary;

/**
 *
 * @author degennarom
 */
public class VisualizzaAuto extends javax.swing.JInternalFrame {
    
    private String testo;
    String path = "DatiAutomobili.txt"; 
    /**
     * Creates new form VisualizzaAuto
     */
    public VisualizzaAuto() {
        initComponents();
        
        ArrayList<Automobile> automobili = MyLibrary.LeggiFile();
        testo = "";
        for(Automobile a : automobili)
            testo += "Posizione: " + automobili.indexOf(a)+ "\n" + a.toString();
        
        txtaDatiAutomobili.setText(testo);
        txtaDatiAutomobili.setEditable(false);
        btnSalvaFile.setText("Salva dati su " + path);
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
        txtaDatiAutomobili = new javax.swing.JTextArea();
        lblDatiAutomobili = new javax.swing.JLabel();
        btnSalvaFile = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        txtaDatiAutomobili.setColumns(20);
        txtaDatiAutomobili.setRows(5);
        jScrollPane1.setViewportView(txtaDatiAutomobili);

        lblDatiAutomobili.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDatiAutomobili.setText("Dati Automobili");

        btnSalvaFile.setText("Salva su file.txt");
        btnSalvaFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvaFileActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvaFile, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDatiAutomobili, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvaFile, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDatiAutomobili, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvaFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvaFileActionPerformed
        MyLibrary.ScriviFileTesto(path, testo);
        JOptionPane.showMessageDialog(null,"Dati salvati su " + path + " con successo");
    }//GEN-LAST:event_btnSalvaFileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvaFile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDatiAutomobili;
    private javax.swing.JTextArea txtaDatiAutomobili;
    // End of variables declaration//GEN-END:variables
}