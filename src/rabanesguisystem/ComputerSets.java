
package rabanesguisystem;

import Build.HighEnd;
import Build.LowEnd;
import Build.MedEnd;
import config.Session;
import config.config;
import java.awt.Color;
import javax.swing.JOptionPane;




public class ComputerSets extends javax.swing.JFrame {
    
   
    
    
     public ComputerSets() {
        initComponents();
        
        config con = new config();
        
      
        Session s = Session.getInstance();
        

        
            if (s.getEmail() == null ){
                
                JOptionPane.showMessageDialog(this, "Please Log in First to proceed!");
                
                login log = new login();
                log.setVisible(true);
                this.dispose();
                
                return;
            }
        
        
 
      
    }
     
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        footer = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        header1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        Logout = new javax.swing.JToggleButton();
        body = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        product = new javax.swing.JPanel();
        Products = new javax.swing.JLabel();
        hover = new javax.swing.JPanel();
        text = new javax.swing.JLabel();
        hovertext = new javax.swing.JLabel();
        hover1 = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        hovertext1 = new javax.swing.JLabel();
        hovertext2 = new javax.swing.JLabel();
        hover2 = new javax.swing.JPanel();
        text2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(0, 119, 176));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        footer.setBackground(new java.awt.Color(127, 157, 177));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("© 2026 J-Tech. A Student Project by Jeremy Rabanes.");

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabel8)
                .addContainerGap(350, Short.MAX_VALUE))
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1000, 40));

        header1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 59, 102));
        jLabel3.setText("J");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("TECHNOLOGY");

        jToggleButton4.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton4.setForeground(new java.awt.Color(13, 59, 102));
        jToggleButton4.setText("Home");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton5.setForeground(new java.awt.Color(13, 59, 102));
        jToggleButton5.setText("About Us");

        Logout.setBackground(new java.awt.Color(255, 255, 255));
        Logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Logout.setForeground(new java.awt.Color(13, 59, 102));
        Logout.setText("Log out");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout header1Layout = new javax.swing.GroupLayout(header1);
        header1.setLayout(header1Layout);
        header1Layout.setHorizontalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 420, Short.MAX_VALUE)
                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addGroup(header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(header1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton4)
                            .addComponent(jToggleButton5)
                            .addComponent(Logout)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(header1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(13, 59, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        product.setBackground(new java.awt.Color(0, 119, 176));
        product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productMouseExited(evt);
            }
        });

        Products.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Products.setForeground(new java.awt.Color(255, 255, 255));
        Products.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Products.setText("Back");

        javax.swing.GroupLayout productLayout = new javax.swing.GroupLayout(product);
        product.setLayout(productLayout);
        productLayout.setHorizontalGroup(
            productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productLayout.createSequentialGroup()
                .addComponent(Products, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        productLayout.setVerticalGroup(
            productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Products, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(product, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 140, 50));

        body.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 580));

        hover.setBackground(new java.awt.Color(202, 240, 248));
        hover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        hover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hoverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hoverMouseExited(evt);
            }
        });
        hover.setLayout(null);

        text.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setText("Low End Set-up");
        hover.add(text);
        text.setBounds(0, 30, 220, 31);

        body.add(hover, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 220, 90));

        hovertext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hovertext.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        body.add(hovertext, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 390, 31));

        hover1.setBackground(new java.awt.Color(202, 240, 248));
        hover1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        hover1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hover1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hover1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hover1MouseExited(evt);
            }
        });
        hover1.setLayout(null);

        text1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text1.setText("Mid End Set-up");
        hover1.add(text1);
        text1.setBounds(0, 30, 220, 31);

        body.add(hover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 220, 90));

        hovertext1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hovertext1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        body.add(hovertext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 390, 31));

        hovertext2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hovertext2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        body.add(hovertext2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 390, 31));

        hover2.setBackground(new java.awt.Color(202, 240, 248));
        hover2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        hover2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hover2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hover2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hover2MouseExited(evt);
            }
        });
        hover2.setLayout(null);

        text2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text2.setText("High End Set-up");
        hover2.add(text2);
        text2.setBounds(0, 30, 220, 31);

        body.add(hover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 220, 90));

        jLabel2.setBackground(new java.awt.Color(13, 59, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(13, 59, 102));
        jLabel2.setText("Categories");
        body.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 170, -1));

        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed

        landing land = new landing();
        land.setLocationRelativeTo(null);
        land.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        
        login log = new login();
        log.setLocationRelativeTo(null);
        log.setVisible(true);
        Session.destroy();
        this.dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    private void hoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverMouseEntered
        
        hover.setBackground(new Color(13,59,102));
        
        text.setForeground(Color.white);
        hovertext.setText("Price Range: ₱18,000 – ₱25,000");
        
    }//GEN-LAST:event_hoverMouseEntered

    private void hoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverMouseExited
       
        hover.setBackground(new Color(202,240,248));
        
        text.setForeground(Color.black);
        hovertext.setText("");
    }//GEN-LAST:event_hoverMouseExited

    private void hover1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover1MouseEntered
        hover1.setBackground(new Color(13,59,102));
        
        text1.setForeground(Color.white);
        hovertext1.setText("Price Range: ₱35,000 – ₱55,000");
    }//GEN-LAST:event_hover1MouseEntered

    private void hover1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover1MouseExited
        hover1.setBackground(new Color(202,240,248));
        
        text1.setForeground(Color.black);
        hovertext1.setText("");
    }//GEN-LAST:event_hover1MouseExited

    private void hover2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover2MouseEntered
        hover2.setBackground(new Color(13,59,102));
        
        text2.setForeground(Color.white);
        hovertext2.setText("Price Range: ₱75,000 – ₱120,000");
    }//GEN-LAST:event_hover2MouseEntered

    private void hover2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover2MouseExited
        hover2.setBackground(new Color(202,240,248));
        
        text2.setForeground(Color.black);
        hovertext2.setText("");
    }//GEN-LAST:event_hover2MouseExited

    private void productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseClicked

        Staff sale = new Staff();
        sale.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productMouseClicked

    private void productMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseEntered
        product.setBackground(new Color(13,59,102));
    }//GEN-LAST:event_productMouseEntered

    private void productMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseExited
        product.setBackground(new Color(0,119,176));
    }//GEN-LAST:event_productMouseExited

    private void hoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverMouseClicked
        
        LowEnd low = new LowEnd();
        low.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_hoverMouseClicked

    private void hover1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover1MouseClicked
        
        MedEnd mid = new MedEnd();
        mid.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_hover1MouseClicked

    private void hover2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover2MouseClicked
        HighEnd high = new HighEnd();
        high.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_hover2MouseClicked

    
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
            java.util.logging.Logger.getLogger(ComputerSets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComputerSets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComputerSets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComputerSets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComputerSets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Logout;
    private javax.swing.JLabel Products;
    private javax.swing.JPanel body;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header1;
    private javax.swing.JPanel hover;
    private javax.swing.JPanel hover1;
    private javax.swing.JPanel hover2;
    private javax.swing.JLabel hovertext;
    private javax.swing.JLabel hovertext1;
    private javax.swing.JLabel hovertext2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JPanel product;
    private javax.swing.JLabel text;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    // End of variables declaration//GEN-END:variables
}
