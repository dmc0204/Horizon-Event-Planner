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
public class viewJobs extends javax.swing.JFrame {

    /**
     * Creates new form viewJobs
     */
    public viewJobs() { 
        initComponents();
        
        try { //this is my way of populating the staff list box with only the staff for the event the user selected. -DC

            //using defaultListModel to return the data of interest from the resultset. -DC
            DefaultListModel jobsList = dbWork.dbWorkSelectJobs(dbWork.getLogin(), dbWork.getPassword(), "SELECT * FROM jobs where eID =" + dbWork.geteid() + "");

            //populating the listbox with data in the defaultListModel. -DC
            viewJobsJlist.setModel(jobsList);
            
            System.out.println("Job added to the list."); //Stub feedback. Followed by copy and pasted back button code for the same object. -DC

        } catch (ClassNotFoundException e) { //Catching Errors. -DC
            System.out.println("ClassNotFoundException viewJobs"); //Gotta catch'em all! -DC
        } catch (SQLException f) {//If at first you do not succeed... -DC
            System.out.println("SQLException viewJobs");//Blame it on your SQL Syntax. -DC
        }
        
    }
    
    public void viewJobsClose(){ //method for closing viewJobs. -DC
        
        this.setVisible(false);
        
    }
    
    public void viewJobsOpen(){ //method for opening viewJobs. -DC
        
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
        viewJobsJlist = new javax.swing.JList<>();
        viewJobsLabel = new javax.swing.JLabel();
        viewJobsBackButton = new javax.swing.JButton();
        viewJobsDeleteButton = new javax.swing.JButton();
        viewJobsAddButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(viewJobsJlist);

        viewJobsLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewJobsLabel.setText("View Jobs");

        viewJobsBackButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewJobsBackButton.setText("Back");
        viewJobsBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJobsBackButtonActionPerformed(evt);
            }
        });

        viewJobsDeleteButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewJobsDeleteButton.setText("Delete");
        viewJobsDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJobsDeleteButtonActionPerformed(evt);
            }
        });

        viewJobsAddButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewJobsAddButton.setText("Add");
        viewJobsAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJobsAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewJobsLabel)
                .addGap(177, 177, 177))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewJobsDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewJobsAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(viewJobsBackButton)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewJobsLabel)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewJobsAddButton)
                        .addGap(18, 18, 18)
                        .addComponent(viewJobsDeleteButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(viewJobsBackButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewJobsBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJobsBackButtonActionPerformed

    viewJobsClose(); //going from viewJobs to manageEvents UI. -DC
    manageEvents manageEventsUI = new manageEvents();
    manageEventsUI.manageEventsOpen();
        
    }//GEN-LAST:event_viewJobsBackButtonActionPerformed

    private void viewJobsDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJobsDeleteButtonActionPerformed

        int j = viewJobsJlist.getSelectedIndex(); //passing the selected index value to use to reference the right value in the dbWork staffID arraylist. -DC
        System.out.println(j);
       

        try { //Try Catch for the dbWorkDeleteEvent method. Passing selected index at the time delete is pressed and passing the delete command to the database. -DC
            dbWork.dbWorkDeleteJobs(dbWork.getLogin(), dbWork.getPassword(), dbWork.getJID(j));
           
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException during jobDelete.");
        } catch (SQLException f) {
            System.out.println("SQLException during jobDelete.");
        }
        
        try { //this is my way of populating the staff list box with only the staff for the event the user selected. -DC

            //using defaultListModel to return the data of interest from the resultset. -DC
            DefaultListModel jobsList = dbWork.dbWorkSelectJobs(dbWork.getLogin(), dbWork.getPassword(), "SELECT * FROM jobs where eID =" + dbWork.geteid() + "");

            //populating the listbox with data in the defaultListModel. -DC
            viewJobsJlist.setModel(jobsList);
            
            System.out.println("Job added to the list."); //Stub feedback. Followed by copy and pasted back button code for the same object. -DC

        } catch (ClassNotFoundException e) { //Catching Errors. -DC
            System.out.println("ClassNotFoundException viewJobs"); //Gotta catch'em all! -DC
        } catch (SQLException f) {//If at first you do not succeed... -DC
            System.out.println("SQLException viewJobs");//Blame it on your SQL Syntax. -DC
        }

    }//GEN-LAST:event_viewJobsDeleteButtonActionPerformed

    private void viewJobsAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJobsAddButtonActionPerformed

        viewJobsClose(); //opening the addJobs UI. -DC
        addJobs addJobsUI = new addJobs();
        addJobsUI.addJobsOpen();

        // TODO add your handling code here:
    }//GEN-LAST:event_viewJobsAddButtonActionPerformed

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
            java.util.logging.Logger.getLogger(viewJobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewJobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewJobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewJobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewJobs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewJobsAddButton;
    private javax.swing.JButton viewJobsBackButton;
    private javax.swing.JButton viewJobsDeleteButton;
    private javax.swing.JList<String> viewJobsJlist;
    private javax.swing.JLabel viewJobsLabel;
    // End of variables declaration//GEN-END:variables
}
