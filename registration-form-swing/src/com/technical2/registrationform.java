/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.technical2;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author marcolata
 */
public class registrationform extends javax.swing.JFrame {
    
    

    /*
     * Creates new form registrationform
     */
    public registrationform() {
      
        initComponents();
    }
    
    public void clear(){
        /*This function clears the application text and radio fields when called*/
        nameText.setText("");
        addressText.setText("");
        emailText.setText("");
        contactText.setText("");
        maleRadio.setSelected(false);
        femaleRadio.setSelected(false);
        
        
    }
    
    public void close(){
        /*This function closes the application when called*/
        WindowEvent closeWindow = new WindowEvent (this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        genderButtons = new javax.swing.ButtonGroup();
        titleLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        courseLabel = new javax.swing.JLabel();
        courseOptions = new javax.swing.JComboBox<>();
        genderLabel = new javax.swing.JLabel();
        yearOptions = new javax.swing.JComboBox<>();
        yearLabel = new javax.swing.JLabel();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        addressLabel = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        contactText = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField4.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jTextField4.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        titleLabel.setFont(new java.awt.Font("Carlito", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Registration Form");

        nameLabel.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        nameLabel.setText("Name:");

        nameText.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        courseLabel.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        courseLabel.setText("Course:");

        courseOptions.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        courseOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSCS-SE", "BSCS-AI", "BSCS-DA", "BSCS-CYSEC", "BSIT", "BSCE", "MMA" }));
        courseOptions.setToolTipText("");
        courseOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseOptionsActionPerformed(evt);
            }
        });

        genderLabel.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        genderLabel.setText("Gender:");

        yearOptions.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        yearOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "other" }));

        yearLabel.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        yearLabel.setText("Year:");

        genderButtons.add(maleRadio);
        maleRadio.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        maleRadio.setText("Male");
        maleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioActionPerformed(evt);
            }
        });

        genderButtons.add(femaleRadio);
        femaleRadio.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        femaleRadio.setText("Female");
        femaleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioActionPerformed(evt);
            }
        });

        addressLabel.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        addressLabel.setText("Address:");

        addressText.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        emailText.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        emailLabel.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        emailLabel.setText("Email:");

        contactLabel.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        contactLabel.setText("Contact Number:");

        contactText.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        registerButton.setBackground(new java.awt.Color(153, 153, 255));
        registerButton.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        registerButton.setText("REGISTER");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(153, 153, 255));
        clearButton.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(153, 153, 255));
        exitButton.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(registerButton)
                                .addGap(12, 12, 12)
                                .addComponent(clearButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(courseLabel)
                                    .addComponent(nameLabel)
                                    .addComponent(yearLabel)
                                    .addComponent(addressLabel)
                                    .addComponent(emailLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameText)
                                    .addComponent(courseOptions, 0, 277, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(yearOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(genderLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(femaleRadio)
                                            .addComponent(maleRadio)))
                                    .addComponent(addressText)
                                    .addComponent(emailText)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(contactLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contactText)))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseLabel)
                    .addComponent(courseOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearLabel)
                    .addComponent(genderLabel)
                    .addComponent(maleRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(femaleRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactLabel)
                    .addComponent(contactText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void courseOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseOptionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseOptionsActionPerformed

    private void maleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioActionPerformed

    private void femaleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRadioActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        String textPrompt;
        
        if (nameText.getText().equals("") ){
           textPrompt = "Please fill out the name section.";
           JOptionPane.showMessageDialog(null,textPrompt);
           
           }
    
        else if (addressText.getText().equals("") ){
           textPrompt ="Please fill out the address section.";
           JOptionPane.showMessageDialog(null,textPrompt);
           
        } 
        
        else if(!maleRadio.isSelected() && !femaleRadio.isSelected()){
            textPrompt = "Please state your gender.";
            JOptionPane.showMessageDialog(null,textPrompt);
            
        }
  
        else if (emailText.getText().equals("") ){
            textPrompt = "Please fill out the email section.";
            JOptionPane.showMessageDialog(null,textPrompt);
            
        }
        else if (contactText.getText().equals("") ){
            textPrompt = "Please fill out the contact number section.";
            JOptionPane.showMessageDialog(null,textPrompt);
            

        } else 
        {textPrompt = "Registered successfully!";

         JOptionPane.showMessageDialog(null,textPrompt);
         clear();
         
        }
        
    }//GEN-LAST:event_registerButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        close();
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressText;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JTextField contactText;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JComboBox<String> courseOptions;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton exitButton;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.ButtonGroup genderButtons;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JComboBox<String> yearOptions;
    // End of variables declaration//GEN-END:variables
}
