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
import model.Sesso;

/**
 *
 * @author degennarom
 */
public class FormAggiorna extends javax.swing.JFrame {
    /**
     * Creates new form FormAggiorna
     */
    public FormAggiorna() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        rbMaschio.setActionCommand("Maschio");
        rbFemmina.setActionCommand("Femmina");
        rbAltro.setActionCommand("Altro");
        txtNome.setEditable(false);
        txtCognome.setEditable(false);
        txtDataNascita.setEditable(false);
        txtLuogoNascita.setEditable(false);
        rbMaschio.getModel().setEnabled(false);
        rbFemmina.getModel().setEnabled(false);
        rbAltro.getModel().setEnabled(false);
        btnSalva.setEnabled(false);
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
        txtLuogoNascita = new javax.swing.JTextField();
        rbMaschio = new javax.swing.JRadioButton();
        rbFemmina = new javax.swing.JRadioButton();
        rbAltro = new javax.swing.JRadioButton();
        lblNome = new javax.swing.JLabel();
        lblCognome = new javax.swing.JLabel();
        lblDataNascita = new javax.swing.JLabel();
        lblLuogoNascita = new javax.swing.JLabel();
        lblSesso = new javax.swing.JLabel();
        txtCognome = new javax.swing.JTextField();
        txtDataNascita = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        lblAggiornaPersona = new javax.swing.JLabel();
        txtPosizione = new javax.swing.JTextField();
        lblPosizione = new javax.swing.JLabel();
        btnCerca = new javax.swing.JButton();
        btnSalva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        lblSesso.setText("Sesso:");

        lblAggiornaPersona.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblAggiornaPersona.setText("Aggiorna persona");

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

        btnSalva.setText("Salva");
        btnSalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lblAggiornaPersona))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCognome)
                            .addComponent(lblNome)
                            .addComponent(lblDataNascita)
                            .addComponent(lblLuogoNascita)
                            .addComponent(lblSesso)
                            .addComponent(lblPosizione))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCognome, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(txtDataNascita, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(txtLuogoNascita, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(rbMaschio)
                            .addComponent(rbFemmina)
                            .addComponent(rbAltro)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPosizione, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCerca))
                            .addComponent(btnSalva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAggiornaPersona)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btnSalva, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            txtNome.setEditable(true);
            txtCognome.setEditable(true);
            txtDataNascita.setEditable(true);
            txtLuogoNascita.setEditable(true);
            rbMaschio.getModel().setEnabled(true);
            rbFemmina.getModel().setEnabled(true);
            rbAltro.getModel().setEnabled(true);

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
                    rbMaschio.doClick();
                    break;

                case FEMMINA:
                    rbFemmina.doClick();
                    break;

                case ALTRO:
                    rbAltro.doClick();
                    break;
                default:
                    break;
            }
            btnSalva.setEnabled(true);
        }        
    }//GEN-LAST:event_btnCercaActionPerformed

    private void btnSalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvaActionPerformed

        Persona p = new Persona();
        p.setNome(txtNome.getText());
        p.setCognome(txtCognome.getText());
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
        
        if(MyLibrary.VerificaDatiCorretti(p, txtDataNascita))
        {
            ArrayList<Persona> persone = MyLibrary.LeggiFile();
            int index = Integer.parseInt(txtPosizione.getText());
            persone.set(index, p);
            MyLibrary.ScriviFile(persone);

            txtNome.setEditable(false);
            txtCognome.setEditable(false);
            txtDataNascita.setEditable(false);
            txtLuogoNascita.setEditable(false);
            rbMaschio.getModel().setEnabled(false);
            rbFemmina.getModel().setEnabled(false);
            rbAltro.getModel().setEnabled(false);

            JOptionPane.showMessageDialog(null,"Dati aggiornati con successo");
        }
    }//GEN-LAST:event_btnSalvaActionPerformed

    private void txtPosizioneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPosizioneMousePressed
        btnSalva.setEnabled(false);
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
            java.util.logging.Logger.getLogger(FormAggiorna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAggiorna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAggiorna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAggiorna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAggiorna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSesso;
    private javax.swing.JButton btnCerca;
    private javax.swing.JButton btnSalva;
    private javax.swing.JLabel lblAggiornaPersona;
    private javax.swing.JLabel lblCognome;
    private javax.swing.JLabel lblDataNascita;
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