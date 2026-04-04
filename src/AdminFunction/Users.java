package AdminFunction;

import Main.EditProfile;
import Main.landing;
import Main.login;
import config.Session;
import config.config;
import java.awt.Color;
import javax.swing.JOptionPane;

public final class Users extends javax.swing.JFrame {

    public Users() {
        initComponents();

        config con = new config();

        Session s = Session.getInstance();

        name.setText(s.getFullname());
        email.setText(s.getEmail());

        con.setProfileIcon(Profile, s.getImagePath());

        display();
    }

    void display() {

        config con = new config();
        String sql = "SELECT id, fullname, email, role, Status FROM user_account";
        con.displayData(sql, table);

    }

    private void refreshTable() {

        config con = new config();
        String sql = "SELECT id, fullname, email, role, Status FROM user_account";
        con.displayData(sql, table);
    }

    public void getdata() {

        Session s = Session.getInstance();

        if (s.getId() == 0) {

            login log = new login();
            log.setVisible(true);
            this.dispose();
            JOptionPane.showMessageDialog(null, "Please Log in First to proceed!");

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        update1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        edit = new javax.swing.JLabel();
        Profile = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Products1 = new javax.swing.JLabel();
        product = new javax.swing.JPanel();
        Products = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        salesreport = new javax.swing.JPanel();
        SalesReport = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        salesreport1 = new javax.swing.JPanel();
        SalesReport1 = new javax.swing.JLabel();
        salesreport2 = new javax.swing.JPanel();
        sta = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        header1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton6 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        table.setBackground(new java.awt.Color(13, 59, 102));
        table.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setGridColor(new java.awt.Color(255, 255, 255));
        table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        table.setSelectionForeground(new java.awt.Color(13, 59, 102));
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
        jPanel3.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 120, -1));

        update1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update1.setText("Disapproved");
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });
        jPanel3.add(update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, -1));

        body.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 730, 530));

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

        edit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        jPanel2.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 100, 100));

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
        user.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/dash__1_-removebg-preview.png"))); // NOI18N
        user.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 0, -1, -1));

        Products1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Products1.setForeground(new java.awt.Color(255, 255, 255));
        Products1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Products1.setText("Dashboard");
        user.add(Products1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 130, 50));

        jPanel2.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 220, 50));

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
        product.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Products.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Products.setForeground(new java.awt.Color(255, 255, 255));
        Products.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Products.setText("Products");
        product.add(Products, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 130, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/product-removebg-preview.png"))); // NOI18N
        product.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, -1));

        jPanel2.add(product, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 220, 50));

        salesreport.setBackground(new java.awt.Color(0, 119, 176));
        salesreport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesreportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salesreportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salesreportMouseExited(evt);
            }
        });

        SalesReport.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SalesReport.setForeground(new java.awt.Color(255, 255, 255));
        SalesReport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SalesReport.setText("Sales Report");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/sales-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout salesreportLayout = new javax.swing.GroupLayout(salesreport);
        salesreport.setLayout(salesreportLayout);
        salesreportLayout.setHorizontalGroup(
            salesreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesreportLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SalesReport, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        salesreportLayout.setVerticalGroup(
            salesreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesreportLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(salesreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalesReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.add(salesreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 220, 50));

        salesreport1.setBackground(new java.awt.Color(0, 119, 176));
        salesreport1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesreport1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salesreport1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salesreport1MouseExited(evt);
            }
        });

        SalesReport1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SalesReport1.setForeground(new java.awt.Color(255, 255, 255));
        SalesReport1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SalesReport1.setText("Back");

        javax.swing.GroupLayout salesreport1Layout = new javax.swing.GroupLayout(salesreport1);
        salesreport1.setLayout(salesreport1Layout);
        salesreport1Layout.setHorizontalGroup(
            salesreport1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesreport1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(SalesReport1)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        salesreport1Layout.setVerticalGroup(
            salesreport1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesreport1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SalesReport1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(salesreport1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 220, 50));

        salesreport2.setBackground(new java.awt.Color(0, 119, 176));
        salesreport2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesreport2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salesreport2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salesreport2MouseExited(evt);
            }
        });

        sta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sta.setForeground(new java.awt.Color(255, 255, 255));
        sta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sta.setText("Stock Log");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/log-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout salesreport2Layout = new javax.swing.GroupLayout(salesreport2);
        salesreport2.setLayout(salesreport2Layout);
        salesreport2Layout.setHorizontalGroup(
            salesreport2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesreport2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        salesreport2Layout.setVerticalGroup(
            salesreport2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesreport2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(salesreport2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)))
        );

        jPanel2.add(salesreport2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, -1, -1));

        body.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 600));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 676, Short.MAX_VALUE)
                .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addGroup(header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(header1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jToggleButton6))
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

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed

        login log = new login();
        log.setLocationRelativeTo(null);
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton6ActionPerformed

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

        if (selectedEmail.equals(s.getEmail())) {

            JOptionPane.showMessageDialog(this, "You cannot delete your own ACCOUNT!");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to delete this user?",
                "Confirm Delete",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            String del = "DELETE FROM user_account WHERE id = ?";
            con.deleteRecord(del, userId);

            JOptionPane.showMessageDialog(this, "Deleted successfully!");
            refreshTable();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Delete failed: " + e.getMessage());
        }
    }//GEN-LAST:event_deleteActionPerformed

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

        if (selectedStatus.equals("Approved")) {
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

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

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

        con.displayData(sql, table, "%" + findings + "%", "%" + findings + "%", "%" + findings + "%");

    }//GEN-LAST:event_findKeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        getdata();
    }//GEN-LAST:event_formWindowActivated

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
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

        if (selectedStatus.equals("Disapproved")) {
            JOptionPane.showMessageDialog(this,
                    "The user you selected is already Disapproved!");
            return;

        }

        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to Disapproved this account?",
                "Confirm",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        config con = new config();
        String sql = "UPDATE user_account SET Status = ? WHERE id = ?";
        con.updateRecord(sql, "Disapproved", userId);

        JOptionPane.showMessageDialog(this, "Account Disapproved successfully.");

        refreshTable();
    }//GEN-LAST:event_update1ActionPerformed

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked

        EditProfile edit = new EditProfile();
        edit.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editMouseClicked

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setText("EDIT");
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setText("");
    }//GEN-LAST:event_editMouseExited

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        dashboardAdmin use = new dashboardAdmin();
        use.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userMouseClicked

    private void userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseEntered
        user.setBackground(new Color (255,255,255));
        Products1.setForeground( new Color (13, 59, 102));
    }//GEN-LAST:event_userMouseEntered

    private void userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseExited
        user.setBackground(new Color(0, 119, 176));
        Products1.setForeground( new Color (255,255,255));
    }//GEN-LAST:event_userMouseExited

    private void productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseClicked
        Product pro = new Product();
        pro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productMouseClicked

    private void productMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseEntered
        product.setBackground(new Color (255,255,255));
        Products.setForeground( new Color (13, 59, 102));
    }//GEN-LAST:event_productMouseEntered

    private void productMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseExited
        product.setBackground(new Color(0, 119, 176));
        Products.setForeground( new Color (255,255,255));
    }//GEN-LAST:event_productMouseExited

    private void salesreportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreportMouseClicked
        Sales sa = new Sales();
        sa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salesreportMouseClicked

    private void salesreportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreportMouseEntered
        salesreport.setBackground(new Color (255,255,255));
        SalesReport.setForeground( new Color (13, 59, 102));
    }//GEN-LAST:event_salesreportMouseEntered

    private void salesreportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreportMouseExited
        salesreport.setBackground(new Color(0, 119, 176));
        SalesReport.setForeground( new Color (255,255,255));
    }//GEN-LAST:event_salesreportMouseExited

    private void salesreport1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreport1MouseClicked
        dashboardAdmin dash = new dashboardAdmin();
        dash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salesreport1MouseClicked

    private void salesreport1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreport1MouseEntered
        salesreport1.setBackground(new Color(13, 59, 102));
    }//GEN-LAST:event_salesreport1MouseEntered

    private void salesreport1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreport1MouseExited
        salesreport1.setBackground(new Color(0, 119, 176));
    }//GEN-LAST:event_salesreport1MouseExited

    private void salesreport2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreport2MouseClicked
        new Stocklog().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salesreport2MouseClicked

    private void salesreport2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreport2MouseEntered
        salesreport2.setBackground(new Color (255,255,255));
        sta.setForeground( new Color (13, 59, 102));
    }//GEN-LAST:event_salesreport2MouseEntered

    private void salesreport2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreport2MouseExited
       salesreport2.setBackground(new Color(0, 119, 176));
        sta.setForeground( new Color (255,255,255));
    }//GEN-LAST:event_salesreport2MouseExited

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
    private javax.swing.JLabel Products1;
    private javax.swing.JLabel Profile;
    private javax.swing.JLabel SalesReport;
    private javax.swing.JLabel SalesReport1;
    private javax.swing.JPanel body;
    private javax.swing.JToggleButton delete;
    private javax.swing.JLabel edit;
    private javax.swing.JLabel email;
    private javax.swing.JTextField find;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JLabel name;
    private javax.swing.JPanel product;
    private javax.swing.JPanel salesreport;
    private javax.swing.JPanel salesreport1;
    private javax.swing.JPanel salesreport2;
    private javax.swing.JToggleButton search;
    private javax.swing.JLabel sta;
    private javax.swing.JTable table;
    private javax.swing.JToggleButton update;
    private javax.swing.JToggleButton update1;
    private javax.swing.JPanel user;
    // End of variables declaration//GEN-END:variables
}
