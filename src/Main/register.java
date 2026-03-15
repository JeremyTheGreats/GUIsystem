package Main;

import config.Session;
import config.config;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class register extends javax.swing.JFrame {

    public register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        register = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jToggleButton7 = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        l = new javax.swing.JToggleButton();
        question = new javax.swing.JComboBox<>();
        answer = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(13, 59, 102));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SIGN UP");
        body.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 210, 60));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        body.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Answer");
        body.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, -1, -1));

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        body.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 270, 40));

        password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        body.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 270, 40));

        register.setBackground(new java.awt.Color(202, 240, 248));
        register.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        register.setForeground(new java.awt.Color(13, 59, 102));
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        body.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 140, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("I already have an account");
        body.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, 170, 30));

        jToggleButton7.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton7.setForeground(new java.awt.Color(13, 59, 102));
        jToggleButton7.setText("Login");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        body.add(jToggleButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, 120, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/regiter-removebg-preview.png"))); // NOI18N
        body.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 490, 390));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fullname");
        body.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, -1, -1));

        fullname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fullname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        body.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 270, 40));

        header.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 59, 102));
        jLabel1.setText("J");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("TECHNOLOGY");

        jToggleButton2.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(13, 59, 102));
        jToggleButton2.setText("Home");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
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
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 522, Short.MAX_VALUE)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jLabel11))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        body.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 60));

        question.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        question.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What was the name of your first pet?", "What is your mother's maiden name?", "What was the name of your elementary school?", "In what city were you born?", "What was the make of your first car?" }));
        question.setBorder(javax.swing.BorderFactory.createTitledBorder("Question"));
        question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionActionPerformed(evt);
            }
        });
        body.add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 440, 70));
        body.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, 270, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Password");
        body.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, -1, -1));

        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        jPanel1.setBackground(new java.awt.Color(127, 157, 177));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("© 2026 J-Tech. A Student Project by Jeremy Rabanes.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jLabel8)
                .addContainerGap(349, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 1000, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed

        login log = new login();
        log.setLocationRelativeTo(null);
        log.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed

        config con = new config();

        String name = fullname.getText().trim();
        String em = email.getText().trim();
        String pass = password.getText();

        // 1. Get the Question and Answer from your new UI components
        String ques = question.getSelectedItem().toString(); // From JComboBox
        String ans = answer.getText().trim();               // From JTextField

        String hash = config.hashPassword(pass);

        // 2. Updated validation to include the answer
        if (name.isEmpty() || em.isEmpty() || pass.isEmpty() || ans.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill out all blanks, including the Security Answer!");
            return;
        }

        String emailPattern = "^[A-Za-z0-9+_.-]+@(gmail\\.com|yahoo\\.com|outlook\\.com)$";

        if (!em.matches(emailPattern)) {
            JOptionPane.showMessageDialog(null, "Invalid email! Use @gmail.com, @yahoo.com, or @outlook.com only.");
            return;
        }

        // 3. Check if email already exists
        String check = "SELECT * FROM user_account WHERE email = ?";
        java.util.List<java.util.Map<String, Object>> find = con.fetchRecords(check, em);

        if (find.isEmpty()) {
            // 4. Updated SQL to include u_question and u_answer
            // Make sure these column names match your SQLite table exactly
            String sql = "INSERT INTO user_account (fullname, email, password, u_question, u_answer, role, Status, ImagePath) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            con.addRecord(sql, name, em, hash, ques, ans, "Staff", "Pending", "/image/profile.png");

            JOptionPane.showMessageDialog(null, "Registered Successfully!");

            login log = new login();
            log.setLocationRelativeTo(null);
            log.setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "The Email is already registered. Try another email!");

            fullname.setText("");
            email.setText("");
            password.setText("");
            answer.setText(""); // Clear the answer field too
        }
    }//GEN-LAST:event_registerActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed

        landing land = new landing();
        land.setLocationRelativeTo(null);
        land.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lActionPerformed

        login log = new login();
        log.setLocationRelativeTo(null);
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lActionPerformed

    private void questionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer;
    private javax.swing.JPanel body;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fullname;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton l;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> question;
    private javax.swing.JToggleButton register;
    // End of variables declaration//GEN-END:variables
}
