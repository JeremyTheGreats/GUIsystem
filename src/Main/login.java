
package Main;

import AdminFunction.dashboardAdmin;
import StaffFuction.Staff;
import config.Session;
import config.config;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {

 
    public login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        signin = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jToggleButton7 = new javax.swing.JToggleButton();
        header = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        l = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        footer = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(13, 59, 102));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login-removebg-preview.png"))); // NOI18N
        body.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 500, 370));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOGIN");
        body.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 160, 60));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        body.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 260, 270, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        body.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 350, 270, -1));

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        body.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 270, 40));

        password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        body.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 270, 40));

        signin.setBackground(new java.awt.Color(202, 240, 248));
        signin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        signin.setForeground(new java.awt.Color(13, 59, 102));
        signin.setText("Sign in");
        signin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });
        body.add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 140, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("I don't have an account");
        body.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, 170, 30));

        jToggleButton7.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton7.setForeground(new java.awt.Color(13, 59, 102));
        jToggleButton7.setText("Sign up");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        body.add(jToggleButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, 120, 30));

        header.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(13, 59, 102));
        jLabel9.setText("J");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("TECHNOLOGY");

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(13, 59, 102));
        jToggleButton1.setText("Home");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        l.setBackground(new java.awt.Color(255, 255, 255));
        l.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l.setForeground(new java.awt.Color(13, 59, 102));
        l.setText("Login");
        l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 522, Short.MAX_VALUE)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel10))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        body.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 60));

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(13, 59, 102));
        jToggleButton2.setText("Forgot Password");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        body.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 160, 30));

        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        footer.setBackground(new java.awt.Color(127, 157, 177));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("© 2026 J-Tech. A Student Project by Jeremy Rabanes.");

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel8)
                .addContainerGap(348, Short.MAX_VALUE))
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(20, 20, 20))
        );

        getContentPane().add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1000, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        
        register reg = new register();
        reg.setLocationRelativeTo(null);
        reg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed
        
        config con = new config();
        
        String em = email.getText();
        String pass = password.getText();
        String hash = con.hashPassword(pass);
        
        
        if ( em.isEmpty() || pass.isEmpty() ){
            
            JOptionPane.showMessageDialog(null, "Enter the email & password to proceed!");
            
            email.setText("");
            password.setText("");
            
            return;
        }
        
        String sql = "SELECT * FROM user_account WHERE email = ? AND password = ? ";
        
        List<Map<String, Object>> find = con.fetchRecords(sql, em, hash);
            
            if (find.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Email or Password is wrong! Try again");

                email.setText("");
                password.setText("");

                return;
            }
        
        Session ses = Session.getInstance();
        
        ses.setId((int) find.get(0).get("id"));
        ses.setFullname(find.get(0).get("fullname").toString());
        ses.setEmail(find.get(0).get("email").toString());
        ses.setRole(find.get(0).get("role").toString());
        ses.setStatus(find.get(0).get("Status").toString());
        ses.setImagePath(find.get(0).get("ImagePath").toString());
        
        if (ses.getRole().equalsIgnoreCase("Admin")) {

            dashboardAdmin dash = new dashboardAdmin();
            dash.setVisible(true);
            this.dispose();

        } 
        else if (ses.getRole().equalsIgnoreCase("Staff")) {

            if (ses.getStatus().equalsIgnoreCase("Approved")) {

                Staff staff = new Staff();
                staff.setVisible(true);
                this.dispose();

            } 
            else {
                JOptionPane.showMessageDialog(null, "Your account is not approved yet.");
            }
 
        }
        
        
    }//GEN-LAST:event_signinActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        landing land = new landing();
        land.setLocationRelativeTo(null);
        land.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lActionPerformed

        login log = new login();
        log.setLocationRelativeTo(null);
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        
        new ForgotPassword().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

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
    private javax.swing.JPanel body;
    private javax.swing.JTextField email;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton l;
    private javax.swing.JPasswordField password;
    private javax.swing.JToggleButton signin;
    // End of variables declaration//GEN-END:variables
}
