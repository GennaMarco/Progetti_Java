/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.MyLibrary;
import model.Persona;
import model.Sesso;

/**
 *
 * @author degennarom
 */
public class FormAggiungi extends javax.swing.JFrame {

     /**
     * Creates new form FormAggiungi
     */
    public FormAggiungi() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        rbMaschio.setActionCommand("Maschio");
        rbFemmina.setActionCommand("Femmina");
        rbAltro.setActionCommand("Altro");
        rbMaschio.doClick();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSesso = new javax.swing.ButtonGroup();
        lblNome = new javax.swing.JLabel();
        lblCognome = new javax.swing.JLabel();
        lblDataNascita = new javax.swing.JLabel();
        lblLuogoNascita = new javax.swing.JLabel();
        lblSesso = new javax.swing.JLabel();
        txtCognome = new javax.swing.JTextField();
        txtDataNascita = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtLuogoNascita = new javax.swing.JTextField();
        lblAggiungiPersona = new javax.swing.JLabel();
        btnSalva = new javax.swing.JButton();
        rbMaschio = new javax.swing.JRadioButton();
        rbFemmina = new javax.swing.JRadioButton();
        rbAltro = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNome.setText("Nome:");

        lblCognome.setText("Cognome:");

        lblDataNascita.setText("Data Nascita:");

        lblLuogoNascita.setText("Luogo Nascita:");

        lblSesso.setText("Sesso:");

        lblAggiungiPersona.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblAggiungiPersona.setText("Aggiungi persona");

        btnSalva.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalva.setText("Salva");
        btnSalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvaActionPerformed(evt);
            }
        });

        bgSesso.add(rbMaschio);
        rbMaschio.setText("Maschio");

        bgSesso.add(rbFemmina);
        rbFemmina.setText("Femmina");

        bgSesso.add(rbAltro);
        rbAltro.setText("Altro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(lblAggiungiPersona))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome)
                            .addComponent(lblCognome)
                            .addComponent(lblDataNascita)
                            .addComponent(lblLuogoNascita)
                            .addComponent(lblSesso))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbFemmina)
                            .addComponent(rbAltro)
                            .addComponent(btnSalva)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCognome, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDataNascita, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLuogoNascita, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(rbMaschio))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAggiungiPersona)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCognome)
                    .addComponent(txtCognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataNascita)
                    .addComponent(txtDataNascita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLuogoNascita)
                    .addComponent(txtLuogoNascita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMaschio)
                    .addComponent(lblSesso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbFemmina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbAltro)
                .addGap(18, 18, 18)
                .addComponent(btnSalva)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvaActionPerformed
        
        Persona p = new Persona();
        p.setNome(txtNome.getText());
        p.setCognome(txtCognome.getText());
        String[] data = txtDataNascita.getText().split("/");
        
        try{
            int giorno = Integer.parseInt(data[0]);
            int mese = Integer.parseInt(data[1]);
            int anno = Integer.parseInt(data[2]);
            GregorianCalendar dataNascita = new GregorianCalendar(anno, mese-1, giorno);
            p.setDataNascita(dataNascita);
        }catch(Exception e)
        {}
        
        p.setLuogoNascita(txtLuogoNascita.getText());
        
        switch(bgSesso.getSelection().getActionCommand())
        {
            case "Maschio":
                p.setSesso(Sesso.MASCHIO);
                break;
                
            case "Femmina":
                p.setSesso(Sesso.FEMMINA);
                break;
            
            case "Altro":
                p.setSesso(Sesso.ALTRO);
                break;
        }
        
        try{
            
            if(!p.getNome().isEmpty() 
               && !p.getCognome().isEmpty() 
               && !p.getLuogoNascita().isEmpty() 
               && !p.getDataNascita().toString().isEmpty()
              )
            {
                ArrayList<Persona> persone = MyLibrary.LeggiFile();
                persone.add(p);
                MyLibrary.ScriviFile(persone);
                JOptionPane.showMessageDialog(null,"Dati salvati con successo"); 
            }
            else
                JOptionPane.showMessageDialog(null,"Errore!\nControllare che i campi non siano vuoti");
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Errore!\nControllare che la data sia nel seguente formato:\n01/01/1900");
        }              
    }//GEN-LAST:event_btnSalvaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormAggiungi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAggiungi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAggiungi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAggiungi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAggiungi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSesso;
    private javax.swing.JButton btnSalva;
    private javax.swing.JLabel lblAggiungiPersona;
    private javax.swing.JLabel lblCognome;
    private javax.swing.JLabel lblDataNascita;
    private javax.swing.JLabel lblLuogoNascita;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSesso;
    private javax.swing.JRadioButton rbAltro;
    private javax.swing.JRadioButton rbFemmina;
    private javax.swing.JRadioButton rbMaschio;
    private javax.swing.JTextField txtCognome;
    private javax.swing.JTextField txtDataNascita;
    private javax.swing.JTextField txtLuogoNascita;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

}