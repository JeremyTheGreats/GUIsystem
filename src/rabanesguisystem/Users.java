
package rabanesguisystem;

import config.Session;
import config.config;
import java.awt.Color;
import javax.swing.JOptionPane;


public final class Users extends javax.swing.JFrame {
    
    
    public Users() {
        initComponents();
        
        config con = new config();
        
        Session s = Session.getInstance();
            
            if (s.getEmail() == null ){

                JOptionPane.showMessageDialog(null, "Please Log in First to proceed!");

                login log = new login();
                log.setVisible(true);
                this.dispose();

            }
        
        name.setText(s.getFullname());
        email.setText(s.getEmail());
        
        con.setProfileIcon(Profile, s.getImagePath());
        
        
        display();
    }

    void display(){
        
        config con = new config();
        String sql = "SELECT id, fullname, email, role, Status FROM user_account";
        con.displayData(sql, table);
        
    }
    
    private void refreshTable() {
        
        config con = new config();
        String sql = "SELECT id, fullname, email, role, Status FROM user_account";
        con.displayData(sql, table);
}


  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        edit1 = new javax.swing.JLabel();
        Profile = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JPanel();
        Users = new javax.swing.JLabel();
        product = new javax.swing.JPanel();
        Products = new javax.swing.JLabel();
        salesreport = new javax.swing.JPanel();
        SalesReport = new javax.swing.JLabel();
        setings = new javax.swing.JPanel();
        Setings = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        update = new javax.swing.JToggleButton();
        delete = new javax.swing.JToggleButton();
        find = new javax.swing.JTextField();
        search = new javax.swing.JToggleButton();
        Edit = new javax.swing.JToggleButton();
        refresh1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        header1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(13, 59, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("User");
        name.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        name.setName("name"); // NOI18N
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, 37));

        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email.setText("email");
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 230, 23));

        edit1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        edit1.setForeground(new java.awt.Color(255, 255, 255));
        edit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        edit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                edit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                edit1MouseExited(evt);
            }
        });
        jPanel2.add(edit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 100, 100));

        Profile.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel2.add(Profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 150, 30));

        user.setBackground(new java.awt.Color(0, 119, 176));
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userMouseExited(evt);
            }
        });

        Users.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Users.setForeground(new java.awt.Color(255, 255, 255));
        Users.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Users.setText("Dashboard");
        Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UsersMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout userLayout = new javax.swing.GroupLayout(user);
        user.setLayout(userLayout);
        userLayout.setHorizontalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Users)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        userLayout.setVerticalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Users, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 220, 50));

        product.setBackground(new java.awt.Color(0, 119, 176));
        product.addMouseListener(new java.awt.event.MouseAdapter() {
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
        Products.setText("Products");

        javax.swing.GroupLayout productLayout = new javax.swing.GroupLayout(product);
        product.setLayout(productLayout);
        productLayout.setHorizontalGroup(
            productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Products)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        productLayout.setVerticalGroup(
            productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Products, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(product, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 220, 50));

        salesreport.setBackground(new java.awt.Color(0, 119, 176));
        salesreport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salesreportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salesreportMouseExited(evt);
            }
        });

        SalesReport.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SalesReport.setForeground(new java.awt.Color(255, 255, 255));
        SalesReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SalesReport.setText("Sales Report");

        javax.swing.GroupLayout salesreportLayout = new javax.swing.GroupLayout(salesreport);
        salesreport.setLayout(salesreportLayout);
        salesreportLayout.setHorizontalGroup(
            salesreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesreportLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(SalesReport)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        salesreportLayout.setVerticalGroup(
            salesreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesreportLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SalesReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(salesreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 220, 50));

        setings.setBackground(new java.awt.Color(0, 119, 176));
        setings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setingsMouseExited(evt);
            }
        });

        Setings.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Setings.setForeground(new java.awt.Color(255, 255, 255));
        Setings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Setings.setText("Edit Profile");

        javax.swing.GroupLayout setingsLayout = new javax.swing.GroupLayout(setings);
        setings.setLayout(setingsLayout);
        setingsLayout.setHorizontalGroup(
            setingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setingsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Setings)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        setingsLayout.setVerticalGroup(
            setingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setingsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Setings, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(setings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 220, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 600));

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(13, 59, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(13, 59, 102));
        jLabel2.setText("Users Account");
        body.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 170, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 690, 430));

        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setText("Approve");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel3.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, -1));

        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 120, -1));

        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });
        find.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                findKeyTyped(evt);
            }
        });
        jPanel3.add(find, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 270, 30));

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel3.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 80, 30));

        Edit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Edit.setText("Refresh");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        jPanel3.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, -1));

        refresh1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refresh1.setText("Edit Profile");
        refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh1ActionPerformed(evt);
            }
        });
        jPanel3.add(refresh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 120, -1));

        body.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 730, 530));

        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1000, 600));

        jPanel1.setBackground(new java.awt.Color(127, 157, 177));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("© 2026 J-Tech. A Student Project by Jeremy Rabanes.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabel8)
                .addContainerGap(350, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1000, 40));

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

        jToggleButton6.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton6.setForeground(new java.awt.Color(13, 59, 102));
        jToggleButton6.setText("Log out");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
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
                .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jToggleButton6)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(header1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed

        landing land = new landing();
        land.setLocationRelativeTo(null);
        land.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed

        login log = new login();
        log.setLocationRelativeTo(null);
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void UsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersMouseEntered

        Users.setBackground(new Color(13,59,102));

    }//GEN-LAST:event_UsersMouseEntered

    private void userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseEntered
        user.setBackground(new Color(13,59,102));
    }//GEN-LAST:event_userMouseEntered

    private void userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseExited
        user.setBackground(new Color(0,119,176));
    }//GEN-LAST:event_userMouseExited

    private void productMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseEntered
        product.setBackground(new Color(13,59,102));
    }//GEN-LAST:event_productMouseEntered

    private void productMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseExited
        product.setBackground(new Color(0,119,176));
    }//GEN-LAST:event_productMouseExited

    private void salesreportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreportMouseEntered
        salesreport.setBackground(new Color(13,59,102));
    }//GEN-LAST:event_salesreportMouseEntered

    private void salesreportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreportMouseExited
        salesreport.setBackground(new Color(0,119,176));
    }//GEN-LAST:event_salesreportMouseExited

    private void setingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setingsMouseEntered
        setings.setBackground(new Color(13,59,102));
    }//GEN-LAST:event_setingsMouseEntered

    private void setingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setingsMouseExited
        setings.setBackground(new Color(0,119,176));
    }//GEN-LAST:event_setingsMouseExited

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
        String findings = find.getText();
        
        config con = new config();
        String sql = "SELECT id, fullname, email, role, Status FROM user_account WHERE fullname = '" + findings + "' OR email = '" + findings + "' OR id = '" + findings + "' ";
        con.displayData(sql, table);
        
    }//GEN-LAST:event_searchActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_findActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        config con = new config(); 
        Session s = Session.getInstance();
        
        int row = table.getSelectedRow();

            if (row < 0) {
                JOptionPane.showMessageDialog(this, "Please select a user to delete.");
                return;
            }

        int userId = Integer.parseInt(table.getValueAt(row, 0).toString());
        String selectedEmail = table.getValueAt(row, 2).toString();
        
            if ( selectedEmail.equals(s.getEmail())){

                JOptionPane.showMessageDialog(this, "You cannot delete your own ACCOUNT!");
                return;
            }
            
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to delete this user?",
                "Confirm Delete",
                JOptionPane.YES_NO_OPTION
        );

            if (confirm != JOptionPane.YES_OPTION) return;

        try {
            String del = "DELETE FROM user_account WHERE id = ?";
            con.deleteRecord(del, userId);

            JOptionPane.showMessageDialog(this, "Deleted successfully!");
            refreshTable();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Delete failed: " + e.getMessage());
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        
        dashboardAdmin ad = new dashboardAdmin();
        ad.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_userMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        Session s = Session.getInstance();
        
        int row = table.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Please select a user.");
                return;
            }

        int userId = Integer.parseInt(table.getValueAt(row, 0).toString());
        
        String selectedEmail = table.getValueAt(row, 2).toString();
           
            if (selectedEmail.equals(s.getEmail())) {
                JOptionPane.showMessageDialog(this, 
                    "You cannot change your own account status.");
                return;
            }
            
        String selectedStatus = table.getValueAt(row, 4).toString();

            if ( selectedStatus.equals("Approved")){
                JOptionPane.showMessageDialog(this, 
                    "The user you selected is already Approved!");
                return;
                
            }

        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to Approve this account?",
                "Confirm",
                JOptionPane.YES_NO_OPTION
        );

            if (confirm != JOptionPane.YES_OPTION) return;

        config con = new config();
        String sql = "UPDATE user_account SET Status = ? WHERE id = ?";
        con.updateRecord(sql, "Approved", userId);

        JOptionPane.showMessageDialog(this, "Account Approved successfully.");
        
        refreshTable();
    }//GEN-LAST:event_updateActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        
        refreshTable();
    }//GEN-LAST:event_EditActionPerformed

    private void findKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_findKeyTyped
        
        String findings = find.getText();
        
        config con = new config();
        String sql = "SELECT id, fullname, email, role, Status FROM user_account WHERE fullname LIKE ? OR email LIKE ? OR id LIKE ? ";
        
        con.displayData(sql, table, "%" +findings + "%", "%" +findings + "%" , "%" +findings + "%");
        
    }//GEN-LAST:event_findKeyTyped

    private void edit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit1MouseEntered
        edit1.setText("EDIT");
    }//GEN-LAST:event_edit1MouseEntered

    private void edit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit1MouseExited
        edit1.setText("");
    }//GEN-LAST:event_edit1MouseExited

    private void refresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refresh1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Edit;
    private javax.swing.JLabel Products;
    private javax.swing.JLabel Profile;
    private javax.swing.JLabel SalesReport;
    private javax.swing.JLabel Setings;
    private javax.swing.JLabel Users;
    private javax.swing.JPanel body;
    private javax.swing.JToggleButton delete;
    private javax.swing.JLabel edit1;
    private javax.swing.JLabel email;
    private javax.swing.JTextField find;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JLabel name;
    private javax.swing.JPanel product;
    private javax.swing.JToggleButton refresh1;
    private javax.swing.JPanel salesreport;
    private javax.swing.JToggleButton search;
    private javax.swing.JPanel setings;
    private javax.swing.JTable table;
    private javax.swing.JToggleButton update;
    private javax.swing.JPanel user;
    // End of variables declaration//GEN-END:variables
}
