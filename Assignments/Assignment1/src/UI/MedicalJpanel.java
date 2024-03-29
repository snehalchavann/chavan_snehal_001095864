/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Person;
import javax.swing.JOptionPane;

/**
 *
 * @author snehalchavan
 */
public class MedicalJpanel extends javax.swing.JPanel {

    /**
     * Creates new form MedicalJpanel
     */
    Person person;
    public MedicalJpanel(Person person) {
        initComponents();
        this.person = person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel_medical = new javax.swing.JPanel();
        lblMedical = new javax.swing.JLabel();
        lbl_allergy1 = new javax.swing.JLabel();
        lbl_recordno = new javax.swing.JLabel();
        lbl_allergy2 = new javax.swing.JLabel();
        lbl_allergy3 = new javax.swing.JLabel();
        txt_recordno = new javax.swing.JTextField();
        txt_allergy3 = new javax.swing.JTextField();
        txt_allergy1 = new javax.swing.JTextField();
        txt_allergy2 = new javax.swing.JTextField();
        btnMedicalsave = new javax.swing.JButton();

        setBackground(new java.awt.Color(243, 219, 219));

        jpanel_medical.setBackground(new java.awt.Color(243, 219, 219));

        lblMedical.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        lblMedical.setText("Medical Record");

        lbl_allergy1.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        lbl_allergy1.setText("Allergy 1");

        lbl_recordno.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        lbl_recordno.setText("Record Number");

        lbl_allergy2.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        lbl_allergy2.setText("Allergy 2");

        lbl_allergy3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        lbl_allergy3.setText("Allergy 3");

        btnMedicalsave.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnMedicalsave.setText("Save");
        btnMedicalsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicalsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanel_medicalLayout = new javax.swing.GroupLayout(jpanel_medical);
        jpanel_medical.setLayout(jpanel_medicalLayout);
        jpanel_medicalLayout.setHorizontalGroup(
            jpanel_medicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_medicalLayout.createSequentialGroup()
                .addGroup(jpanel_medicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel_medicalLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(lblMedical))
                    .addGroup(jpanel_medicalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpanel_medicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_recordno)
                            .addComponent(lbl_allergy1)
                            .addComponent(lbl_allergy2)
                            .addComponent(lbl_allergy3))
                        .addGap(36, 36, 36)
                        .addGroup(jpanel_medicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_recordno, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_allergy2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_allergy1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_allergy3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMedicalsave, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        jpanel_medicalLayout.setVerticalGroup(
            jpanel_medicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_medicalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMedical)
                .addGap(13, 13, 13)
                .addGroup(jpanel_medicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_recordno)
                    .addComponent(txt_recordno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanel_medicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_allergy1)
                    .addComponent(txt_allergy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanel_medicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_allergy2)
                    .addComponent(txt_allergy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanel_medicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_allergy3)
                    .addComponent(txt_allergy3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnMedicalsave)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel_medical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jpanel_medical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMedicalsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicalsaveActionPerformed
        // TODO add your handling code here:
        person.setRecordno(txt_recordno.getText());
        person.setAllergy1(txt_allergy1.getText());
        person.setAllergy2(txt_allergy2.getText());
        person.setAllergy3(txt_allergy3.getText());
        JOptionPane.showMessageDialog(this, "Medical record saved.");
        clearSelection();
    }//GEN-LAST:event_btnMedicalsaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMedicalsave;
    private javax.swing.JPanel jpanel_medical;
    private javax.swing.JLabel lblMedical;
    private javax.swing.JLabel lbl_allergy1;
    private javax.swing.JLabel lbl_allergy2;
    private javax.swing.JLabel lbl_allergy3;
    private javax.swing.JLabel lbl_recordno;
    private javax.swing.JTextField txt_allergy1;
    private javax.swing.JTextField txt_allergy2;
    private javax.swing.JTextField txt_allergy3;
    private javax.swing.JTextField txt_recordno;
    // End of variables declaration//GEN-END:variables

    private void clearSelection() {
        txt_allergy1.setText("");
        txt_allergy2.setText("");
        txt_allergy3.setText("");
        txt_recordno.setText("");
    }
}
