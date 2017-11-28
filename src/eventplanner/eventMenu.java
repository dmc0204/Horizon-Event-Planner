/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventplanner;

import java.sql.SQLException;

/**
 *
 * @author Donovan Cummins
 */
public class eventMenu extends javax.swing.JFrame {

    /**
     * Creates new form eventMenu
     */
    public eventMenu() {
        initComponents();
    }

    public void eventMenuClose() { //method for setting visibility of the Event Menu. -DC

        this.setVisible(false);

    }

    public void eventMenuOpen() { //method for setting visibility of the Event Menu. -DC

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

        labelEventMenuLogo = new javax.swing.JLabel();
        createEventButton = new javax.swing.JButton();
        viewEventButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelEventMenuLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cooldev\\Desktop\\Horizon\\EventPlanner\\horizonlogologinTest.png")); // NOI18N

        createEventButton.setText("Create Event");
        createEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEventButtonActionPerformed(evt);
            }
        });

        viewEventButton.setText("View Events");
        viewEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEventButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createEventButton)
                .addGap(34, 34, 34)
                .addComponent(viewEventButton)
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(labelEventMenuLogo)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelEventMenuLogo)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createEventButton)
                    .addComponent(viewEventButton))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEventButtonActionPerformed

        //Create Event Button Click Event. -DC
        eventMenuClose(); //making the Event Menu invisible. -DC

        createEvent createEventUI = new createEvent();
        createEventUI.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_createEventButtonActionPerformed

    private void viewEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEventButtonActionPerformed

        eventMenuClose(); //Closing Event Menu. -DC
        viewEvents viewEventsUI = new viewEvents();//Constructing View Events jframe. -DC
        viewEventsUI.setVisible(true);

    }//GEN-LAST:event_viewEventButtonActionPerformed

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
            java.util.logging.Logger.getLogger(eventMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eventMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eventMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eventMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eventMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createEventButton;
    private javax.swing.JLabel labelEventMenuLogo;
    private javax.swing.JButton viewEventButton;
    // End of variables declaration//GEN-END:variables
}
