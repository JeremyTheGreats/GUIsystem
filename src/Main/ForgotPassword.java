package Main;

import config.config;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class ForgotPassword extends javax.swing.JFrame {

    private String temporaryOtp = "";

    public ForgotPassword() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Question = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        check = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jToggleButton7 = new javax.swing.JToggleButton();
        header = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        l = new javax.swing.JToggleButton();
        send = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        otp = new javax.swing.JPasswordField();
        footer = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(13, 59, 102));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Forgot Password");
        body.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 410, 60));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Email");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        body.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 270, -1));

        Question.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Question.setForeground(new java.awt.Color(255, 255, 255));
        Question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Question.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        body.add(Question, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 380, 60));

        Email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        body.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 270, 40));

        check.setBackground(new java.awt.Color(202, 240, 248));
        check.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        check.setForeground(new java.awt.Color(13, 59, 102));
        check.setText("Check");
        check.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        body.add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 140, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("I don't have an account");
        body.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, 170, 30));

        jToggleButton7.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton7.setForeground(new java.awt.Color(13, 59, 102));
        jToggleButton7.setText("Sign up");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        body.add(jToggleButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 570, 120, 30));

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

        send.setBackground(new java.awt.Color(202, 240, 248));
        send.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        send.setForeground(new java.awt.Color(13, 59, 102));
        send.setText("Search");
        send.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        body.add(send, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Forgot-removebg-preview.png"))); // NOI18N
        body.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 480, 450));

        otp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        otp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otpActionPerformed(evt);
            }
        });
        body.add(otp, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 270, 40));

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

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed

        String email = Email.getText().trim();
        String answerInput = otp.getText().trim();
        config conf = new config();

        // 1. Initial Presence Validation
        if (email.isEmpty() || answerInput.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Identity verification required. Please provide your email and security answer.",
                    "Validation Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // 2. Security Verification
            String sql = "SELECT * FROM user_account WHERE email = ? AND u_answer = ?";
            java.util.List<java.util.Map<String, Object>> result = conf.fetchRecords(sql, email, answerInput);

            if (result != null && !result.isEmpty()) {
                // 3. SUCCESS FLOW
                JPasswordField pf = new JPasswordField();
                Object[] message = {"Identity Verified.\n\nPlease enter your new password:", pf};

                int action = JOptionPane.showConfirmDialog(this, message, "Secure Password Reset",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

                if (action == JOptionPane.OK_OPTION) {
                    String newPass = new String(pf.getPassword());

                    // Password Policy Check
                    if (newPass.trim().length() < 6) {
                        JOptionPane.showMessageDialog(this,
                                "Password security failure: Password must be at least 6 characters long.",
                                "Security Policy",
                                JOptionPane.ERROR_MESSAGE);
                        return; // Stops here so they can click 'Check' again without re-typing the answer
                    }

                    // Encrypted Update
                    String hashedPass = config.hashPassword(newPass);
                    String updateSql = "UPDATE user_account SET password = ? WHERE email = ?";
                    conf.updateRecord(updateSql, hashedPass, email);

                    JOptionPane.showMessageDialog(this, "Account security updated. Returning to Login.");

                    // ONLY REDIRECT TO LOGIN ON SUCCESS
                    new login().setVisible(true);
                    this.dispose();
                }

            } else {
                // 4. WRONG ANSWER FLOW
                JOptionPane.showMessageDialog(this,
                        "Authentication failed. Please verify your security answer.",
                        "Security Error",
                        JOptionPane.ERROR_MESSAGE);

                otp.setText(""); // Clears the wrong answer
                otp.requestFocus(); // Puts cursor back so they can type again immediately

                // DO NOT dispose() or open login() here. Let them try again.
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "A system error occurred. Please contact support.");
            e.printStackTrace();
        }
    }//GEN-LAST:event_checkActionPerformed

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

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        String emailInput = Email.getText().trim();
        config conf = new config();

        // 1. Check if the input field is empty first
        if (emailInput.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your email to find your account.", "Input Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // 2. Search for the question tied to the email
            String sql = "SELECT u_question FROM user_account WHERE email = ?";
            java.util.List<java.util.Map<String, Object>> user = conf.fetchRecords(sql, emailInput);

            if (!user.isEmpty()) {
                // Account found!
                String fetchedQuestion = user.get(0).get("u_question").toString();
                Question.setText(fetchedQuestion);

                // Helpful: Move cursor to the answer field automatically
                otp.requestFocus();
            } else {
                // 3. ACCOUNT NOT FOUND VALIDATION
                JOptionPane.showMessageDialog(this, "No account found with that email address.", "Account Error", JOptionPane.ERROR_MESSAGE);

                // Clear the question label/field so it stays clean
                Question.setText("");
                Email.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_sendActionPerformed

    private void otpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otpActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JLabel Question;
    private javax.swing.JPanel body;
    private javax.swing.JToggleButton check;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton l;
    private javax.swing.JPasswordField otp;
    private javax.swing.JToggleButton send;
    // End of variables declaration//GEN-END:variables
}
