/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inf;

import inf.admin.Admindashboard1;
import inf.hrassitant.assistantdashboard;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author amanm
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        unamebox = new javax.swing.JTextField();
        pwordbox = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        Loginbutton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\amanm\\Downloads\\oop - Copy\\image\\giphy.gif")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 430));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 430));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOGIN");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, -1));

        unamebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameboxActionPerformed(evt);
            }
        });
        jPanel3.add(unamebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 190, 30));

        pwordbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwordboxActionPerformed(evt);
            }
        });
        jPanel3.add(pwordbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 190, 30));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setPreferredSize(new java.awt.Dimension(140, 48));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Loginbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\amanm\\Downloads\\oop - Copy\\image\\LOGIN-3.gif")); // NOI18N
        Loginbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginbuttonMouseClicked(evt);
            }
        });
        Loginbutton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                LoginbuttonComponentHidden(evt);
            }
        });
        jPanel5.add(Loginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 50));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 170, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 330, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pwordboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwordboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwordboxActionPerformed

    private void LoginbuttonComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_LoginbuttonComponentHidden
    }//GEN-LAST:event_LoginbuttonComponentHidden

private boolean authenticate(String username, String password) {
    try (Scanner scanner = new Scanner(new File("employee.txt"))) {
        boolean found = false;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.startsWith("Username: " + username)) {
                // If the username is found, check the next line for the password
                if (scanner.hasNextLine()) {
                    String nextLine = scanner.nextLine();
                    if (nextLine.startsWith("Password: " + password)) {
                        found = true; // Username and password match
                        break;
                    }
                }
            }
        }
        return found;
    } catch (FileNotFoundException ex) {
        ex.printStackTrace(); // Handle file not found error appropriately
        return false;
    }
}
   
    private void LoginbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginbuttonMouseClicked
        String uname;
    String pword;

    uname = unamebox.getText();
    pword = pwordbox.getText();

    if (uname.isEmpty() || pword.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Username or password cannot be empty.");
    } else if (uname.equals("admin") && pword.equals("123")) {
        Admindashboard1 m1 = new Admindashboard1();
        m1.setVisible(true);
        this.dispose();
    } else if (uname.equals("cashier") && pword.equals("123")) {
        assistantdashboard m2 = new assistantdashboard();
        m2.setVisible(true);
        this.dispose();
    } else if (authenticate(uname, pword)) { // Check against data in the file
        assistantdashboard m2 = new assistantdashboard();
        m2.setVisible(true);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(null, "Wrong password or username.");
    }

    }//GEN-LAST:event_LoginbuttonMouseClicked

    private void unameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameboxActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Loginbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField pwordbox;
    private javax.swing.JTextField unamebox;
    // End of variables declaration//GEN-END:variables
}
