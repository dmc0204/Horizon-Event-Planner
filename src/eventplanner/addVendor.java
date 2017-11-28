/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventplanner;

import java.sql.SQLException;

/**
 *
 * @author Cooldev
 */
public class addVendor extends javax.swing.JFrame {

    /**
     * Creates new form addVendor
     */
    public addVendor() {
        initComponents();
    }
    
    public void addVendorClose(){
        
        this.setVisible(false);
        
    }
    
    public void addVendorOpen(){
    
        this.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addVendorBackButton = new javax.swing.JButton();
        addVendorLabel = new javax.swing.JLabel();
        addVendorNameInput = new javax.swing.JTextField();
        addVendorNameLabel = new javax.swing.JLabel();
        addVendorFnameInput = new javax.swing.JTextField();
        addVendorFnameLabel = new javax.swing.JLabel();
        addVendorLnameLabel = new javax.swing.JLabel();
        addVendorLnameInput = new javax.swing.JTextField();
        addVendorMediumLabel = new javax.swing.JLabel();
        addVendorMediumInput = new javax.swing.JTextField();
        addVendorStatusLabel = new javax.swing.JLabel();
        addVendorStatusInput = new javax.swing.JTextField();
        addVendorSubmitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addVendorBackButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addVendorBackButton.setText("Back");
        addVendorBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVendorBackButtonActionPerformed(evt);
            }
        });

        addVendorLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        addVendorLabel.setText("Add Vendor");

        addVendorNameLabel.setText("Name of Vendor:");

        addVendorFnameLabel.setText("First Name:");

        addVendorLnameLabel.setText("Last Name:");

        addVendorLnameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVendorLnameInputActionPerformed(evt);
            }
        });

        addVendorMediumLabel.setText("Type of Art:");

        addVendorStatusLabel.setText("Status:");

        addVendorSubmitButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addVendorSubmitButton.setText("Submit");
        addVendorSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVendorSubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(addVendorLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(addVendorStatusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addVendorStatusInput, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addVendorSubmitButton)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addVendorMediumLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(addVendorNameLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addVendorLnameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addVendorFnameLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addVendorFnameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(addVendorNameInput)
                            .addComponent(addVendorLnameInput)
                            .addComponent(addVendorMediumInput))))
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addVendorBackButton)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(addVendorLabel)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addVendorNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addVendorNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addVendorFnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addVendorFnameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addVendorLnameLabel)
                    .addComponent(addVendorLnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addVendorMediumLabel)
                    .addComponent(addVendorMediumInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addVendorStatusInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addVendorStatusLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addVendorBackButton)
                    .addComponent(addVendorSubmitButton))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addVendorBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVendorBackButtonActionPerformed

        addVendorClose(); //opening and closing the windows, allowing the user to go to the previous window. -DC
        viewVendor viewVendorUI = new viewVendor();
        viewVendorUI.viewVendorOpen();

       
    }//GEN-LAST:event_addVendorBackButtonActionPerformed

    private void addVendorLnameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVendorLnameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addVendorLnameInputActionPerformed

    private void addVendorSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVendorSubmitButtonActionPerformed

//Submit addStaff event. Going to pass the field data to variables to be passed to the database. -DC
        String vFnameIn = addVendorFnameInput.getText();
        String vLnameIn = addVendorLnameInput.getText();
        String vMediumIn = addVendorMediumInput.getText();
        String vNameIn = addVendorNameInput.getText();
        String vStatusIn = addVendorStatusInput.getText();
       
        

        String addVendorSQL = "INSERT into Vendors(vName, vFname, vLname, vMedium, vStatus, eID) VALUES (\"" + vNameIn + "\",\"" + vFnameIn + "\",\"" + vLnameIn + "\",\"" + vMediumIn + "\",\"" + vStatusIn + "\",\"" + dbWork.geteid() + "\")";

        try {
            dbWork.dbWorkAdd(dbWork.getLogin(), dbWork.getPassword(), addVendorSQL);
            System.out.println("Staff succesfully added."); //Stub feedback. Followed by copy and pasted back button code for the same object. -DC
            addVendorClose(); //closing add vendor Window. -DC
            viewVendor viewVendorUI = new viewVendor(); //Opening Vendor List Menu. -DC
            viewVendorUI.setVisible(true);
        } catch (ClassNotFoundException e) { //Catching Errors. -DC
            System.out.println("ClassNotFoundException");
        } catch (SQLException f) {
            System.out.println("SQLException");
        }


     
    }//GEN-LAST:event_addVendorSubmitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(addVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addVendor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVendorBackButton;
    private javax.swing.JTextField addVendorFnameInput;
    private javax.swing.JLabel addVendorFnameLabel;
    private javax.swing.JLabel addVendorLabel;
    private javax.swing.JTextField addVendorLnameInput;
    private javax.swing.JLabel addVendorLnameLabel;
    private javax.swing.JTextField addVendorMediumInput;
    private javax.swing.JLabel addVendorMediumLabel;
    private javax.swing.JTextField addVendorNameInput;
    private javax.swing.JLabel addVendorNameLabel;
    private javax.swing.JTextField addVendorStatusInput;
    private javax.swing.JLabel addVendorStatusLabel;
    private javax.swing.JButton addVendorSubmitButton;
    // End of variables declaration//GEN-END:variables
}
