/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import model.OperazioniPersone;
import model.Persona;
import model.Sesso;

/**
 *
 * @author Marco
 */
public class AggiornaPersona extends javax.swing.JInternalFrame {

    /**
     * Creates new form AggiornaPersona
     */
    public AggiornaPersona() {
        initComponents();
        
        rbMaschio.setActionCommand("Maschio");
        rbFemmina.setActionCommand("Femmina");
        rbAltro.setActionCommand("Altro");
        
        txtNome.setEditable(false);
        txtCognome.setEditable(false);
        txtDataNascita.setEditable(false);
        txtLuogoNascita.setEditable(false);
        btnAggiorna.setEnabled(false);
        rbMaschio.getModel().setEnabled(false);
        rbFemmina.getModel().setEnabled(false);
        rbAltro.getModel().setEnabled(false);
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
        btnAggiorna = new javax.swing.JButton();
        lblDataNascita = new javax.swing.JLabel();
        lblLuogoNascita = new javax.swing.JLabel();
        lblSesso = new javax.swing.JLabel();
        txtCognome = new javax.swing.JTextField();
        txtDataNascita = new javax.swing.JTextField();
        txtLuogoNascita = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        rbMaschio = new javax.swing.JRadioButton();
        lblAggiornaPersona = new javax.swing.JLabel();
        rbFemmina = new javax.swing.JRadioButton();
        txtPosizione = new javax.swing.JTextField();
        rbAltro = new javax.swing.JRadioButton();
        lblPosizione = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        btnCerca = new javax.swing.JButton();
        lblCognome = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        btnAggiorna.setText("Aggiorna");
        btnAggiorna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiornaActionPerformed(evt);
            }
        });

        lblDataNascita.setText("Data Nascita:");

        lblLuogoNascita.setText("Luogo Nascita:");

        lblSesso.setText("Sesso:");

        bgSesso.add(rbMaschio);
        rbMaschio.setText("Maschio");

        lblAggiornaPersona.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblAggiornaPersona.setText("Aggiorna persona");

        bgSesso.add(rbFemmina);
        rbFemmina.setText("Femmina");

        txtPosizione.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPosizioneMousePressed(evt);
            }
        });

        bgSesso.add(rbAltro);
        rbAltro.setText("Altro");

        lblPosizione.setText("Posizione:");

        lblNome.setText("Nome:");

        btnCerca.setText("Cerca");
        btnCerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaActionPerformed(evt);
            }
        });

        lblCognome.setText("Cognome:");

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
                            .addComponent(btnAggiorna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(41, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAggiorna, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaActionPerformed

        OperazioniPersone op = new OperazioniPersone();
        if(op.IsInt(txtPosizione))
        {
            Persona pOld = (Persona)op.CercaOggettoLista(Integer.parseInt(txtPosizione.getText()));
            if(pOld != null)
            {
                txtNome.setEditable(true);
                txtCognome.setEditable(true);
                txtDataNascita.setEditable(true);
                txtLuogoNascita.setEditable(true);
                btnAggiorna.setEnabled(true);
                rbMaschio.getModel().setEnabled(true);
                rbFemmina.getModel().setEnabled(true);
                rbAltro.getModel().setEnabled(true);
               
                txtNome.setText(pOld.getNome());
                txtCognome.setText(pOld.getCognome());
                GregorianCalendar dataNascita = pOld.getDataNascita();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                txtDataNascita.setText(sdf.format(dataNascita.getTime()));
                txtLuogoNascita.setText(pOld.getLuogoNascita());

                switch(pOld.getSesso())
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
                }
                btnAggiorna.setEnabled(true);
            }
            else
            {
                txtPosizione.setText("");
                JOptionPane.showMessageDialog(null,"Errore!\nNon esiste una persona in quella posizione");
            }
        }
        else
        {
            txtPosizione.setText("");
            JOptionPane.showMessageDialog(null,"Errore!\nInserire valore intero in posizione");
        }
    }//GEN-LAST:event_btnCercaActionPerformed

    private void btnAggiornaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiornaActionPerformed
        Persona pNew = new Persona();
        pNew.setNome(txtNome.getText());
        pNew.setCognome(txtCognome.getText());
        pNew.setLuogoNascita(txtLuogoNascita.getText());

        switch(bgSesso.getSelection().getActionCommand())
        {
            case "Maschio":
            pNew.setSesso(Sesso.MASCHIO);
            break;

            case "Femmina":
            pNew.setSesso(Sesso.FEMMINA);
            break;

            case "Altro":
            pNew.setSesso(Sesso.ALTRO);
            break;
        }
        OperazioniPersone op = new OperazioniPersone();
        if(op.IsDateFormat(txtDataNascita))
        {
            String[] data = txtDataNascita.getText().split("/");
            int [] dataInt = op.ParserizzaData(data);
            GregorianCalendar dataNascita = new GregorianCalendar(dataInt[0], dataInt[1]-1, dataInt[2]);
            pNew.setDataNascita(dataNascita);
            if(op.VerificaDatiCorretti(pNew))
                op.ModificaOggettoLista(Integer.parseInt(txtPosizione.getText()), pNew);
            else
                JOptionPane.showMessageDialog(null,"Errore!\nControllare che i campi non siano vuoti\nControllare il formato della data");
        }
        else if("".equals(txtDataNascita.getText()))
            JOptionPane.showMessageDialog(null,"Errore! Completare tutti i campi");
        else
            JOptionPane.showMessageDialog(null,"Errore! Formato della data deve essere il seguente: 01/01/2000");
    }//GEN-LAST:event_btnAggiornaActionPerformed

    private void txtPosizioneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPosizioneMousePressed
        btnAggiorna.setEnabled(false);
    }//GEN-LAST:event_txtPosizioneMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSesso;
    private javax.swing.JButton btnAggiorna;
    private javax.swing.JButton btnCerca;
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
