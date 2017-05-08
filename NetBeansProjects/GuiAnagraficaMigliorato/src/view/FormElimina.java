/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.MyLibrary;
import model.Persona;

/**
 *
 * @author degennarom
 */
public class FormElimina extends javax.swing.JFrame {
 
    /** Creates new form FormElimina */
    public FormElimina() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        btnElimina.setEnabled(false);
        txtNome.setEditable(false);
        txtCognome.setEditable(false);
        txtDataNascita.setEditable(false);
        txtLuogoNascita.setEditable(false);
        rbMaschio.getModel().setEnabled(false);
        rbFemmina.getModel().setEnabled(false);
        rbAltro.getModel().setEnabled(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSesso = new javax.swing.ButtonGroup();
        lblSesso = new javax.swing.JLabel();
        txtCognome = new javax.swing.JTextField();
        txtDataNascita = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        lblEliminaPersona = new javax.swing.JLabel();
        txtPosizione = new javax.swing.JTextField();
        lblPosizione = new javax.swing.JLabel();
        btnCerca = new javax.swing.JButton();
        btnElimina = new javax.swing.JButton();
        txtLuogoNascita = new javax.swing.JTextField();
        rbMaschio = new javax.swing.JRadioButton();
        rbFemmina = new javax.swing.JRadioButton();
        rbAltro = new javax.swing.JRadioButton();
        lblNome = new javax.swing.JLabel();
        lblCognome = new javax.swing.JLabel();
        lblDataNascita = new javax.swing.JLabel();
        lblLuogoNascita = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSesso.setText("Sesso:");

        lblEliminaPersona.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblEliminaPersona.setText("Elimina persona");

        txtPosizione.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPosizioneMousePressed(evt);
            }
        });

        lblPosizione.setText("Posizione:");

        btnCerca.setText("Cerca");
        btnCerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaActionPerformed(evt);
            }
        });

        btnElimina.setText("Elimina");
        btnElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaActionPerformed(evt);
            }
        });

        bgSesso.add(rbMaschio);
        rbMaschio.setText("Maschio");

        bgSesso.add(rbFemmina);
        rbFemmina.setText("Femmina");

        bgSesso.add(rbAltro);
        rbAltro.setText("Altro");

        lblNome.setText("Nome:");

        lblCognome.setText("Cognome:");

        lblDataNascita.setText("Data Nascita:");

        lblLuogoNascita.setText("Luogo Nascita:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblEliminaPersona))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCognome)
                            .addComponent(lblNome)
                            .addComponent(lblDataNascita)
                            .addComponent(lblLuogoNascita)
                            .addComponent(lblSesso)
                            .addComponent(lblPosizione))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCognome)
                            .addComponent(txtNome)
                            .addComponent(txtDataNascita)
                            .addComponent(txtLuogoNascita)
                            .addComponent(rbMaschio)
                            .addComponent(rbFemmina)
                            .addComponent(rbAltro)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPosizione, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCerca))
                            .addComponent(btnElimina, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEliminaPersona)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPosizione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPosizione)
                    .addComponent(btnCerca))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCognome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataNascita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataNascita))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLuogoNascita)
                    .addComponent(txtLuogoNascita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSesso)
                    .addComponent(rbMaschio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbFemmina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAltro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnElimina, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaActionPerformed
        
        ArrayList<Persona> persone = MyLibrary.LeggiFile();
        if(MyLibrary.VerificaPosizione(txtPosizione, persone))
        {
            int index = Integer.parseInt(txtPosizione.getText());
            Persona p = persone.get(index);
            txtNome.setText(p.getNome());
            txtCognome.setText(p.getCognome());

            GregorianCalendar dataNascita = p.getDataNascita();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String data = null;
            if(dataNascita != null)
                data = sdf.format(dataNascita.getTime());
            txtDataNascita.setText(data);
            txtLuogoNascita.setText(p.getLuogoNascita());

            switch(p.getSesso())
            {
                case MASCHIO:
                    rbMaschio.getModel().setEnabled(true);
                    rbMaschio.doClick();
                    rbMaschio.getModel().setEnabled(false);
                break;

                case FEMMINA:
                    rbFemmina.getModel().setEnabled(true);
                    rbFemmina.doClick();
                    rbFemmina.getModel().setEnabled(false);
                    break;

                case ALTRO:
                    rbAltro.getModel().setEnabled(true);
                    rbAltro.doClick();
                    rbAltro.getModel().setEnabled(false);
                    break;
                default:
                break;
            }
            btnElimina.setEnabled(true);
        }
    }//GEN-LAST:event_btnCercaActionPerformed

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed
       
        ArrayList<Persona> persone = MyLibrary.LeggiFile();
        int index = Integer.parseInt(txtPosizione.getText());
        persone.remove(index);
        MyLibrary.ScriviFile(persone);
        txtNome.setText("");
        txtCognome.setText("");
        txtDataNascita.setText("");
        txtLuogoNascita.setText("");
        bgSesso.clearSelection();
        JOptionPane.showMessageDialog(null,"Dati eliminati con successo");
             
    }//GEN-LAST:event_btnEliminaActionPerformed

    private void txtPosizioneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPosizioneMousePressed
       btnElimina.setEnabled(false);
    }//GEN-LAST:event_txtPosizioneMousePressed

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
            java.util.logging.Logger.getLogger(FormElimina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormElimina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormElimina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormElimina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormElimina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSesso;
    private javax.swing.JButton btnCerca;
    private javax.swing.JButton btnElimina;
    private javax.swing.JLabel lblCognome;
    private javax.swing.JLabel lblDataNascita;
    private javax.swing.JLabel lblEliminaPersona;
    private javax.swing.JLabel lblLuogoNascita;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPosizione;
    private javax.swing.JLabel lblSesso;
    private javax.swing.JRadioButton rbAltro;
    private javax.swing.JRadioButton rbFemmina;
    private javax.swing.JRadioButton rbMaschio;
    private javax.swing.JTextField txtCognome;
    private javax.swing.JTextField txtDataNascita;
    private javax.swing.JTextField txtLuogoNascita;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPosizione;
    // End of variables declaration//GEN-END:variables

}