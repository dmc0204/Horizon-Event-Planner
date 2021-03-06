package eventplanner;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jvnet.substance.*;
import org.jvnet.substance.border.*;
import org.jvnet.substance.button.*;
import org.jvnet.substance.painter.*;
import org.jvnet.substance.theme.*;
import org.jvnet.substance.title.*;
import org.jvnet.substance.watermark.*;
/**
 *
 * @author Donovan Cummins - (Team Horizon)
 * @UI developer Zilin Li - (Team Horizon)
 */
public class addJobs extends javax.swing.JFrame {

    public addJobs() {
        initComponents();
        this.setLocationRelativeTo(null); //Professor Chen pointed this out during the demo, So I fixed it. -DC
    }

    public void addJobsClose(){
        this.setVisible(false);
    }
    
    public void addJobsOpen(){
        this.setVisible(true);
        this.setLocationRelativeTo(null); //Professor Chen pointed this out during the demo, So I fixed it. -DC
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addJobLabel = new javax.swing.JLabel();
        addJobsLogoLabel = new javax.swing.JLabel();
        addJobTitleInput = new javax.swing.JTextField();
        addJobTitleLabel = new javax.swing.JLabel();
        addJobDatetimeLabel = new javax.swing.JLabel();
        addJobDatetimeInput = new javax.swing.JTextField();
        addJobsSubmitButton = new javax.swing.JButton();
        addJobBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        addJobLabel.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        addJobLabel.setText("Add Job");

        addJobsLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventplanner/horizonlogoTiny.png"))); // NOI18N

        addJobTitleInput.setToolTipText("");

        addJobTitleLabel.setText("Title:");

        addJobDatetimeLabel.setText("Date and Time:");

        addJobsSubmitButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addJobsSubmitButton.setText("Submit");
        addJobsSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJobsSubmitButtonActionPerformed(evt);
            }
        });

        addJobBackButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addJobBackButton.setText("Back");
        addJobBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJobBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(addJobsSubmitButton)
                        .addGap(18, 18, 18)
                        .addComponent(addJobBackButton)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(addJobLabel)
                        .addGap(18, 18, 18)
                        .addComponent(addJobsLogoLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addJobDatetimeLabel)
                            .addComponent(addJobTitleLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addJobTitleInput, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addJobDatetimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(136, 136, 136)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addJobsLogoLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(addJobLabel)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJobTitleLabel)
                    .addComponent(addJobTitleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJobDatetimeLabel)
                    .addComponent(addJobDatetimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJobsSubmitButton)
                    .addComponent(addJobBackButton))
                .addGap(0, 39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addJobsSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJobsSubmitButtonActionPerformed

        String jTitleIn = addJobTitleInput.getText();//getting the input for the job to be added to the database. -DC
        String jDatetimeIn = addJobDatetimeInput.getText();

        String addJobSQL = "INSERT into jobs(jTitle, jDatetime, eID) VALUES (\"" + jTitleIn + "\",\"" + jDatetimeIn + "\",\"" + dbWork.geteid() + "\")"; //building the sql query to pass to the worker. -DC
        
        try {
            dbWork.dbWorkAdd(dbWork.getLogin(), dbWork.getPassword(), addJobSQL);
            System.out.println("Job succesfully added."); //Stub feedback. Followed by copy and pasted back button code for the same object. -DC
            addJobsClose(); //closing addJob Window. -DC
            viewJobs viewJobsUI = new viewJobs(); //Opening viewJob. -DC
            viewJobsUI.viewJobsOpen();
        } catch (ClassNotFoundException e) { //Catching Errors. -DC
            System.out.println("ClassNotFoundException");
        } catch (SQLException f) {
            System.out.println("SQLException");
        }

    }//GEN-LAST:event_addJobsSubmitButtonActionPerformed

    private void addJobBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJobBackButtonActionPerformed

        addJobsClose();
        viewJobs viewJobsUI = new viewJobs();
        viewJobsUI.viewJobsOpen();

     
    }//GEN-LAST:event_addJobBackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(addJobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addJobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addJobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addJobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {  
            
        UIManager.setLookAndFeel(new SubstanceLookAndFeel());  
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.AutumnSkin");
        SubstanceLookAndFeel.setCurrentTheme(new org.jvnet.substance.theme.SubstanceAquaTheme());//Set theme. -ZL
         SubstanceLookAndFeel.setCurrentButtonShaper(new StandardButtonShaper()); 
                               SubstanceLookAndFeel.setCurrentWatermark(new SubstanceNoneWatermark());  // Set watermark. -ZL
                               
                               SubstanceLookAndFeel.setCurrentBorderPainter(new org.jvnet.substance.border.ClassicInnerBorderPainter());  //Set border. -ZL
 
                               SubstanceLookAndFeel.setCurrentGradientPainter(new StandardGradientPainter());  //Render Settings. -ZL  
                             
                               SubstanceLookAndFeel.setCurrentTitlePainter(new MatteHeaderPainter()); //Set title. -ZL
  
    } catch (UnsupportedLookAndFeelException e) {  
        System.err.println("Something went wrong!");  
    }  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addJobs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJobBackButton;
    private javax.swing.JTextField addJobDatetimeInput;
    private javax.swing.JLabel addJobDatetimeLabel;
    private javax.swing.JLabel addJobLabel;
    private javax.swing.JTextField addJobTitleInput;
    private javax.swing.JLabel addJobTitleLabel;
    private javax.swing.JLabel addJobsLogoLabel;
    private javax.swing.JButton addJobsSubmitButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
