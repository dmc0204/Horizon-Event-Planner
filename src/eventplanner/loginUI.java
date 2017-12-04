package eventplanner;
import java.sql.*;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
public class loginUI extends javax.swing.JFrame {
    /**
     * Creates new form loginUI
     */
    int count = 5;
    public loginUI() {
        initComponents();
        
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
    }

    public void loginUIClose() { //method within the object to close the thing after login. -DC

        this.setVisible(false); //making this invisible. This being the loginUI jframe. -DC

    }

    public void loginUIOpen() {

        this.setVisible(true); //making this visible. This being the loginUI jframe. -DC

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        loginUILogoLabel = new javax.swing.JLabel();
        loginUsernameInput = new javax.swing.JTextField();
        loginPasswordInput = new javax.swing.JPasswordField();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        loginEnterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Event Planner");
        setBackground(new java.awt.Color(255, 255, 255));

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setMaximumSize(new java.awt.Dimension(402, 282));

        loginUILogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventplanner/horizonlogoTiny.png"))); // NOI18N

        loginUsernameInput.setToolTipText("");

        labelUsername.setText("Username:");

        labelPassword.setText("Password:");

        loginEnterButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        loginEnterButton.setText("Enter");
        loginEnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginEnterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(loginUILogoLabel))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(loginEnterButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                .addComponent(labelUsername)
                                .addGap(18, 18, 18)
                                .addComponent(loginUsernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                .addComponent(labelPassword)
                                .addGap(18, 18, 18)
                                .addComponent(loginPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginUILogoLabel)
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginUsernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPassword))
                .addGap(14, 14, 14)
                .addComponent(loginEnterButton)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginEnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginEnterButtonActionPerformed
        /*
        
        This is the event when the login enter button is clicked. -DC
        
         */

        String dbName = loginUsernameInput.getText(); //passing the login field text to a string variable -DC
        String dbPass = loginPasswordInput.getText(); //passing the password field text to a string variable -DC
        Boolean dbConnected = false;        
       
        try {
            dbConnected = dbWork.dbWorkLogin(dbName, dbPass);
            if (dbConnected = true) {
                System.out.println("Login = " + dbName + "  Password = " + dbPass); //my stub to make sure it is working -DC        
                loginUIClose(); //setting login window invisible. -DC        
                eventMenu eventMenuGUI = new eventMenu(); //constructing eventMenu GUI -DC   
                eventMenuGUI.setVisible(true); //making the new jframe visible -DC          
            }
             if(dbConnected = false){
               /*
                 count--; //Attempts decrease by 1. -ZL
                 JOptionPane.showMessageDialog(null, "Username does not match password, " + count + " attempts "+ "left" ); //Pop up dialog, tell the user the number of times left. -ZL
                 loginUsernameInput.setText(""); //Set username field. -ZL
                 loginPasswordInput.setText(""); //Set text field. -ZL
                 */
            }
        } catch (ClassNotFoundException e) { //catching exception if there is a jdbc driver error with the database connection. -DC
            System.out.println("ClassNotFoundException");
        } catch (SQLException f) { //catching exceptoin if there is a login error with the database. Maybe wrong login or password. -DC
            System.out.println("SQLException");
                count--; //Attempts decrease by 1. -ZL
                 JOptionPane.showMessageDialog(null, "Username does not match password, " + count + " attempts "+ "left" ); //Pop up dialog, tell the user the number of times left. -ZL
                 loginUsernameInput.setText(""); //Set username field. -ZL
                 loginPasswordInput.setText(""); //Set text field. -ZL
        }
if(count == 0)
              {
                  
                   JOptionPane.showMessageDialog(null, "Username does not match password, 0 attempts left. Program will be closed" ); // Pop up dialog when no chances left. -ZL
                    System.exit(0); //User interface closed
              }       
    }//GEN-LAST:event_loginEnterButtonActionPerformed
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
            java.util.logging.Logger.getLogger(loginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JButton loginEnterButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField loginPasswordInput;
    private javax.swing.JLabel loginUILogoLabel;
    private javax.swing.JTextField loginUsernameInput;
    // End of variables declaration//GEN-END:variables
}
