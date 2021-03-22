/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.border.Border;

/**
 *
 * @author harshikag
 */
public class EmployerFeedback extends javax.swing.JPanel {

    String CompanyName;
    ImageIcon northeasternLogo = new ImageIcon("husky.png");
    HashMap<String, Double> roleHiredPercentage;
    String popularCourse;

    /**
     * Creates new form EmployerFeedback
     */
    public EmployerFeedback(String popCourse) {
        popularCourse = popCourse;
        initComponents();
        jLabel6.setIcon(northeasternLogo);
        Border blackline = BorderFactory.createLineBorder(Color.black);
        roleHiredPercentage = new HashMap<String, Double>();
        jPanel1.setBorder(blackline);
        popCourseLabel.setText("The most popular course based on the percentage of students who have taken up this is " + popularCourse);
//        getListOfProfile();
    }

    private void getListOfProfile() {
        String[] profileList = {"--None--", "Amazon", "Google",
            "Facebook"};

        JComboBox profiles = new JComboBox(profileList);
        profiles.setSelectedIndex(0);
        profiles.setBounds(275, 200, 240, 41);
        profiles.setBackground(Color.white);
        add(profiles);

        profiles.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                // Get the source of the component, which is our combo
                // box.
                JComboBox profiles = (JComboBox) event.getSource();

                // Print the selected items and the action command.
                CompanyName = profiles.getSelectedItem().toString();
                System.out.println("Selected Item  = " + CompanyName);
            }
        });
    }

//    private boolean validatetext(){
//        StringBuilder errorText = new StringBuilder();
//
//        if(FLCrackedInterviewField.getText().length() == 0){
//          errorText.append("Full stack developer hiring count is required\n");
//          field1.setBackground(Color.red);
//        }
//
//        if(textField2.getText().length() == 0){
//          errorText.append("Textfield 2 is mandatory");
//          field2.setBackground(Color.red);
//        }
//
//        // Show the errorText in a message box, or in a label, or ...
//
//        return errorText.lenght() == 0;
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FLAppliedField = new javax.swing.JTextField();
        TitleLabel = new javax.swing.JLabel();
        FLDeveloperLabel = new javax.swing.JLabel();
        DataAnalystLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        DataAnalystCrackedInterviewField = new javax.swing.JTextField();
        DataAnalystAppliedField = new javax.swing.JTextField();
        FLCrackedInterviewField = new javax.swing.JTextField();
        MLEngineerLabel = new javax.swing.JLabel();
        MLAppliedField = new javax.swing.JTextField();
        MLCrackedInterviewField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MLResult = new javax.swing.JLabel();
        analystResult = new javax.swing.JLabel();
        FinalResult = new javax.swing.JLabel();
        sdeResult = new javax.swing.JLabel();
        TitleLabel1 = new javax.swing.JLabel();
        popCourseLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        FLAppliedField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FLAppliedFieldActionPerformed(evt);
            }
        });

        TitleLabel.setBackground(new java.awt.Color(23, 171, 172));
        TitleLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TitleLabel.setText("Percentage of hiring for different roles");

        FLDeveloperLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FLDeveloperLabel.setText("Full Stack Developer");

        DataAnalystLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DataAnalystLabel.setText("Data Analyst/Engineer");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setText("jLabel6");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("STUDENT MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        SubmitButton.setBackground(new java.awt.Color(0, 0, 0));
        SubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Machine Learning Engineer / Data Science Engineer :");

        DataAnalystCrackedInterviewField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataAnalystCrackedInterviewFieldActionPerformed(evt);
            }
        });

        DataAnalystAppliedField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataAnalystAppliedFieldActionPerformed(evt);
            }
        });

        FLCrackedInterviewField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FLCrackedInterviewFieldActionPerformed(evt);
            }
        });

        MLEngineerLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MLEngineerLabel.setText("ML/ Data Science Engineer");

        MLAppliedField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MLAppliedFieldActionPerformed(evt);
            }
        });

        MLCrackedInterviewField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MLCrackedInterviewFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("No of Student Applications");

        jLabel2.setText("Neu Students who cleared all rounds");

        TitleLabel1.setBackground(new java.awt.Color(23, 171, 172));
        TitleLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TitleLabel1.setText("Most Popular Course");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MLResult, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FinalResult, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sdeResult, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(analystResult, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(MLEngineerLabel)
                                        .addComponent(DataAnalystLabel))
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(FLAppliedField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(127, 127, 127)
                                            .addComponent(jLabel8))
                                        .addComponent(DataAnalystAppliedField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(MLAppliedField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2)
                                    .addGap(125, 125, 125)))
                            .addComponent(TitleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(popCourseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(FLDeveloperLabel)
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DataAnalystCrackedInterviewField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FLCrackedInterviewField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MLCrackedInterviewField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FLDeveloperLabel)
                    .addComponent(FLAppliedField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FLCrackedInterviewField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataAnalystLabel)
                    .addComponent(DataAnalystAppliedField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataAnalystCrackedInterviewField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MLEngineerLabel)
                    .addComponent(MLAppliedField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MLCrackedInterviewField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(SubmitButton)
                .addGap(8, 8, 8)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(sdeResult, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MLResult, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(analystResult, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FinalResult, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(popCourseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FLAppliedFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FLAppliedFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FLAppliedFieldActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed

        if (FLCrackedInterviewField.getText().isEmpty() || FLAppliedField.getText().isEmpty() || DataAnalystAppliedField.getText().isEmpty() || DataAnalystCrackedInterviewField.getText().isEmpty() || MLCrackedInterviewField.getText().isEmpty() || MLAppliedField.getText().isEmpty()) {
            sdeResult.setText("Kindly enter all the fields to view the result");
        } else if ((Double.parseDouble(FLCrackedInterviewField.getText()) > Double.parseDouble(FLAppliedField.getText())) || (Double.parseDouble(DataAnalystCrackedInterviewField.getText()) > Double.parseDouble(DataAnalystAppliedField.getText())) || (Double.parseDouble(MLCrackedInterviewField.getText()) > Double.parseDouble(MLAppliedField.getText()))) {
            sdeResult.setText("Applicants should be greater than hired");
        } else {
            this.roleHiredPercentage.put("SDE", (Double.parseDouble(FLCrackedInterviewField.getText()) / Double.parseDouble(FLAppliedField.getText())) * Double.parseDouble("100"));
            this.roleHiredPercentage.put("DA", (Double.parseDouble(DataAnalystCrackedInterviewField.getText()) / Double.parseDouble(DataAnalystAppliedField.getText())) * Double.parseDouble("100"));
            this.roleHiredPercentage.put("ML", (Double.parseDouble(MLCrackedInterviewField.getText()) / Double.parseDouble(MLAppliedField.getText())) * Double.parseDouble("100"));
            sdeResult.setText("SDE   " + this.roleHiredPercentage.get("SDE") + "%");
            MLResult.setText("ML   " + this.roleHiredPercentage.get("ML") + "%");
            analystResult.setText("DA   " + this.roleHiredPercentage.get("DA") + "%");
            String highest = "none";
            if (this.roleHiredPercentage.get("SDE") > this.roleHiredPercentage.get("DA")) {
                if (this.roleHiredPercentage.get("SDE") > this.roleHiredPercentage.get("ML")) {
                    highest = "Software Developer Engineer";
                } else {
                    highest = "Machine Leaning Engineer";
                }
            } else if (this.roleHiredPercentage.get("DA") > this.roleHiredPercentage.get("ML")) {
                highest = "Data Analyst";
            } else if (this.roleHiredPercentage.get("ML") > this.roleHiredPercentage.get("DA")) {
                highest = "Machine Learning Engineer";
            }

            FinalResult.setText("Student with " + highest + " role were hired the most");
        }

    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void DataAnalystCrackedInterviewFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataAnalystCrackedInterviewFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataAnalystCrackedInterviewFieldActionPerformed

    private void DataAnalystAppliedFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataAnalystAppliedFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataAnalystAppliedFieldActionPerformed

    private void FLCrackedInterviewFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FLCrackedInterviewFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FLCrackedInterviewFieldActionPerformed

    private void MLAppliedFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MLAppliedFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MLAppliedFieldActionPerformed

    private void MLCrackedInterviewFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MLCrackedInterviewFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MLCrackedInterviewFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DataAnalystAppliedField;
    private javax.swing.JTextField DataAnalystCrackedInterviewField;
    private javax.swing.JLabel DataAnalystLabel;
    private javax.swing.JTextField FLAppliedField;
    private javax.swing.JTextField FLCrackedInterviewField;
    private javax.swing.JLabel FLDeveloperLabel;
    private javax.swing.JLabel FinalResult;
    private javax.swing.JTextField MLAppliedField;
    private javax.swing.JTextField MLCrackedInterviewField;
    private javax.swing.JLabel MLEngineerLabel;
    private javax.swing.JLabel MLResult;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel TitleLabel1;
    private javax.swing.JLabel analystResult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel popCourseLabel;
    private javax.swing.JLabel sdeResult;
    // End of variables declaration//GEN-END:variables
}
