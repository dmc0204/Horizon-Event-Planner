/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventplanner;

/**
 *
 * @author Cooldev
 */
public class manageEvents extends javax.swing.JFrame {

    /**
     * Creates new form manageEvents
     */
    public manageEvents() {
        initComponents();
    }

    public void manageEventsClose(){
        this.setVisible(false);
    }
    
    public void manageEventsOpen(){
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

        jButton1 = new javax.swing.JButton();
        manageEventsJlist = new javax.swing.JScrollPane();
        manageEventJlist = new javax.swing.JList<>();
        manageEventsViewButton = new javax.swing.JButton();
        manageEventsBackButton = new javax.swing.JButton();
        manageEventsLabel = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        manageEventJlist.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        manageEventJlist.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Vendors", "Staff", "Jobs", "Sponsors" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        manageEventsJlist.setViewportView(manageEventJlist);

        manageEventsViewButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        manageEventsViewButton.setText("View");
        manageEventsViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEventsViewButtonActionPerformed(evt);
            }
        });

        manageEventsBackButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        manageEventsBackButton.setText("Back");
        manageEventsBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEventsBackButtonActionPerformed(evt);
            }
        });

        manageEventsLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        manageEventsLabel.setText("Manage Event");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(manageEventsJlist, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(manageEventsViewButton))
                            .addComponent(manageEventsLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(manageEventsBackButton)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(manageEventsLabel)
                        .addGap(29, 29, 29)
                        .addComponent(manageEventsJlist, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(manageEventsViewButton)
                        .addGap(67, 67, 67)))
                .addComponent(manageEventsBackButton)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageEventsViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEventsViewButtonActionPerformed

    int eventChild = manageEventJlist.getSelectedIndex(); //User selects one of four choices and this is the index value of that selection. -DC
    
    /*
    Vendors = 0
    Staff = 1
    Jobs = 2
    Sponsors = 3
    */
    
    if(eventChild <= 0){
        //Use Case 8 and Use Case 9: AddVendor:RemoveVendor -DC
        
        manageEventsClose();
        viewVendor viewVendorUI = new viewVendor();
        viewVendorUI.viewVendorOpen();
        System.out.println("View Vendors");
    }else if(eventChild <= 1){
        //Use Case 4 and Use Case 5: AddStaff:RemoveStaff -DC
        
        manageEventsClose(); //User selected staff. Closing the manage window, opening the view staff window. -DC
        viewStaff viewStaffUI = new viewStaff();
        viewStaffUI.viewStaffOpen();
        System.out.println("View Staff");
        
        
        
    }else if(eventChild <= 2){
        //Use Case 6 and Use Case 7: AddJob:RemoveJob -DC
        
        manageEventsClose(); //closing the manage UI and opening the appropriate child UI. -DC
        viewJobs viewJobsUI = new viewJobs();
        viewJobsUI.viewJobsOpen();        
        System.out.println("View Jobs");
        
        
    }else if(eventChild <= 3) {
        //Use Case 8 and Use Case 9: AddSponsor:RemoveSponsor -DC
        System.out.println("View Sponsors");
    }
    
     
    }//GEN-LAST:event_manageEventsViewButtonActionPerformed

    private void manageEventsBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEventsBackButtonActionPerformed

        manageEventsClose(); //back button. just flipping visiblility between ui objects. -DC
        viewEvents viewEventsUI = new viewEvents();
        viewEventsUI.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_manageEventsBackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(manageEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageEvents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JList<String> manageEventJlist;
    private javax.swing.JButton manageEventsBackButton;
    private javax.swing.JScrollPane manageEventsJlist;
    private javax.swing.JLabel manageEventsLabel;
    private javax.swing.JButton manageEventsViewButton;
    // End of variables declaration//GEN-END:variables
}
