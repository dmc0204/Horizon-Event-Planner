/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventplanner;

import java.sql.SQLException;
import javax.swing.DefaultListModel;

/**
 *
 * @author dmc02
 */
public class viewStaff extends javax.swing.JFrame {

    /**
     * Creates new form viewStaff
     */
    public viewStaff() {
        initComponents();
        
        try { //this is my way of populating the staff list box with only the staff for the event the user selected. -DC

            //using defaultListModel to return the data of interest from the resultset. -DC
            DefaultListModel staffList = dbWork.dbWorkSelectStaff(dbWork.getLogin(), dbWork.getPassword(), "SELECT * FROM staff where eID =" + dbWork.geteid() + "");

            //populating the listbox with data in the defaultListModel. -DC
            viewStaffJlist.setModel(staffList);

            // while(eventsList.next()){ //My stub to see what is in the resultset. -DC
            //   System.out.println(eventsList.getString("eName"));                  
            // }  
            System.out.println("Events added to the list."); //Stub feedback. Followed by copy and pasted back button code for the same object. -DC

        } catch (ClassNotFoundException e) { //Catching Errors. -DC
            System.out.println("ClassNotFoundException viewEvents"); //Gotta catch'em all! -DC
        } catch (SQLException f) {//If at first you do not succeed... -DC
            System.out.println("SQLException viewEvents");//Blame it on your SQL Syntax. -DC
        }
        
    }

    public void viewStaffClose(){
        this.setVisible(false);
    }
    
    public void viewStaffOpen(){
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

        jScrollPane1 = new javax.swing.JScrollPane();
        viewStaffJlist = new javax.swing.JList<>();
        viewStaffLabel = new javax.swing.JLabel();
        viewStaffBackButton = new javax.swing.JButton();
        populateStaffButton = new javax.swing.JButton();
        viewStaffDeleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(viewStaffJlist);

        viewStaffLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        viewStaffLabel.setText("View Staff");

        viewStaffBackButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewStaffBackButton.setText("Back");
        viewStaffBackButton.setToolTipText("");
        viewStaffBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStaffBackButtonActionPerformed(evt);
            }
        });

        populateStaffButton.setText("Populate Staff");
        populateStaffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                populateStaffButtonActionPerformed(evt);
            }
        });

        viewStaffDeleteButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewStaffDeleteButton.setText("Delete");
        viewStaffDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStaffDeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(viewStaffBackButton)
                        .addGap(34, 34, 34)
                        .addComponent(populateStaffButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(viewStaffLabel)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewStaffDeleteButton)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewStaffLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewStaffBackButton)
                            .addComponent(populateStaffButton))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewStaffDeleteButton)
                        .addGap(81, 81, 81))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewStaffBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStaffBackButtonActionPerformed

        viewStaffClose(); //closing the view staff window and opening the manage events window. -DC
        manageEvents manageEventsUI = new manageEvents();
        manageEventsUI.manageEventsOpen();


        // TODO add your handling code here:
    }//GEN-LAST:event_viewStaffBackButtonActionPerformed

    private void populateStaffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_populateStaffButtonActionPerformed

         try {
        dbWork.staffPopulator();
        }catch (ClassNotFoundException e) {
            System.out.println(e);
        }catch (SQLException j){
            System.out.println(j);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_populateStaffButtonActionPerformed

    private void viewStaffDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStaffDeleteButtonActionPerformed

//Delete Button Event. Somehow I will take the selected element from the jList and use it to identify a record to delete in the database. -DC
        //String s = viewEventsJlist.getSelectedValue();
        int j = viewStaffJlist.getSelectedIndex(); //passing the selected index value to use to reference the right value in the dbWork staffID arraylist. -DC
        System.out.println(j);
       

        try { //Try Catch for the dbWorkDeleteEvent method. Passing selected index at the time delete is pressed and passing the delete command to the database. -DC
            dbWork.dbWorkDeleteStaff(dbWork.getLogin(), dbWork.getPassword(), dbWork.getSID(j));
           
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException during eventDelete.");
        } catch (SQLException f) {
            System.out.println("SQLException during eventDelete.");
        }

        try {

            //using defaultListModel to return the data of interest from the resultset. -DC
            DefaultListModel staffList = dbWork.dbWorkSelectStaff(dbWork.getLogin(), dbWork.getPassword(), "SELECT * FROM staff where eID =" + dbWork.geteid() + "");

            //populating the listbox with data in the defaultListModel. -DC
            viewStaffJlist.setModel(staffList);
            /*
             while(eventsList.next()){ //My stub to see what is in the resultset. -DC
               System.out.println(eventsList.getString("eName"));                  
             }  
            */
            System.out.println("Staff deleted from the list."); //Stub feedback. Followed by copy and pasted back button code for the same object. -DC

        } catch (ClassNotFoundException e) { //Catching Errors. -DC
            System.out.println("ClassNotFoundException viewEvents"); //Gotta catch'em all! -DC
        } catch (SQLException f) {//If at first you do not succeed... -DC
            System.out.println("SQLException viewEvents");//Blame it on your SQL Syntax. -DC
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_viewStaffDeleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(viewStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton populateStaffButton;
    private javax.swing.JButton viewStaffBackButton;
    private javax.swing.JButton viewStaffDeleteButton;
    private javax.swing.JList<String> viewStaffJlist;
    private javax.swing.JLabel viewStaffLabel;
    // End of variables declaration//GEN-END:variables
}
