package AdminFunction;

import Main.EditProfile;
import Main.login;
import config.Session;
import config.config;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Sales extends javax.swing.JFrame {

    public Sales() {
        initComponents();

        Session s = Session.getInstance();
        config con = new config();

        name1.setText(s.getFullname());
        email1.setText(s.getEmail());

        con.setProfileIcon(Profile1, s.getImagePath());
        
        displayAllSales();
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

    public void displayAllSales() {
        config con = new config();

        String sql = "SELECT s.sale_id AS 'ID', u.fullname AS 'Cashier', "
                + "s.total_amount AS 'Amount', s.sale_date AS 'Date' "
                + "FROM sales s "
                + "JOIN user_account u ON s.u_id = u.id "
                + "ORDER BY s.sale_date DESC";

        con.displayData(sql, Sales);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        name1 = new javax.swing.JLabel();
        email1 = new javax.swing.JLabel();
        edit1 = new javax.swing.JLabel();
        Profile1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        user1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        Products2 = new javax.swing.JLabel();
        product1 = new javax.swing.JPanel();
        Products3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        salesreport2 = new javax.swing.JPanel();
        SalesReport2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        salesreport3 = new javax.swing.JPanel();
        SalesReport3 = new javax.swing.JLabel();
        log = new javax.swing.JPanel();
        SalesReport4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Sales = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        details = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        header1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Logout = new javax.swing.JToggleButton();

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

        jPanel3.setBackground(new java.awt.Color(13, 59, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name1.setText("User");
        name1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        name1.setName("name"); // NOI18N
        jPanel3.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, 37));

        email1.setForeground(new java.awt.Color(255, 255, 255));
        email1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email1.setText("email");
        jPanel3.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 230, 23));

        edit1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        edit1.setForeground(new java.awt.Color(255, 255, 255));
        edit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        edit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                edit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                edit1MouseExited(evt);
            }
        });
        jPanel3.add(edit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 100, 100));

        Profile1.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel3.add(Profile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, 100));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Admin");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 150, 30));

        user1.setBackground(new java.awt.Color(0, 119, 176));
        user1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user1MouseExited(evt);
            }
        });
        user1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/dash__1_-removebg-preview.png"))); // NOI18N
        user1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 0, -1, -1));

        Products2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Products2.setForeground(new java.awt.Color(255, 255, 255));
        Products2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Products2.setText("Dashboard");
        user1.add(Products2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 130, 50));

        jPanel3.add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 220, 50));

        product1.setBackground(new java.awt.Color(0, 119, 176));
        product1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product1MouseExited(evt);
            }
        });
        product1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Products3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Products3.setForeground(new java.awt.Color(255, 255, 255));
        Products3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Products3.setText("Products");
        product1.add(Products3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 130, 50));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/product-removebg-preview.png"))); // NOI18N
        product1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, -1));

        jPanel3.add(product1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 220, 50));

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

        SalesReport2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SalesReport2.setForeground(new java.awt.Color(255, 255, 255));
        SalesReport2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SalesReport2.setText("Sales Report");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/sales-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout salesreport2Layout = new javax.swing.GroupLayout(salesreport2);
        salesreport2.setLayout(salesreport2Layout);
        salesreport2Layout.setHorizontalGroup(
            salesreport2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesreport2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SalesReport2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        salesreport2Layout.setVerticalGroup(
            salesreport2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesreport2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(salesreport2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalesReport2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.add(salesreport2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 220, 50));

        salesreport3.setBackground(new java.awt.Color(0, 119, 176));
        salesreport3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesreport3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salesreport3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salesreport3MouseExited(evt);
            }
        });

        SalesReport3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SalesReport3.setForeground(new java.awt.Color(255, 255, 255));
        SalesReport3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SalesReport3.setText("Back");

        javax.swing.GroupLayout salesreport3Layout = new javax.swing.GroupLayout(salesreport3);
        salesreport3.setLayout(salesreport3Layout);
        salesreport3Layout.setHorizontalGroup(
            salesreport3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesreport3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(SalesReport3)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        salesreport3Layout.setVerticalGroup(
            salesreport3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesreport3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SalesReport3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(salesreport3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 220, 50));

        log.setBackground(new java.awt.Color(0, 119, 176));
        log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logMouseExited(evt);
            }
        });

        SalesReport4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SalesReport4.setForeground(new java.awt.Color(255, 255, 255));
        SalesReport4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SalesReport4.setText("Stock Log");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/log-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout logLayout = new javax.swing.GroupLayout(log);
        log.setLayout(logLayout);
        logLayout.setHorizontalGroup(
            logLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SalesReport4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        logLayout.setVerticalGroup(
            logLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(logLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SalesReport4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)))
        );

        jPanel3.add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, -1, -1));

        body.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 600));

        jLabel2.setBackground(new java.awt.Color(13, 59, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(13, 59, 102));
        jLabel2.setText("Details");
        body.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 170, -1));

        Sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Sales);

        body.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 730, 280));

        details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(details);

        body.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 730, 180));

        jLabel5.setBackground(new java.awt.Color(13, 59, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(13, 59, 102));
        jLabel5.setText("Sales Report");
        body.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 170, -1));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 676, Short.MAX_VALUE)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addGroup(header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(header1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Logout))
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

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed

        login log = new login();
        log.setLocationRelativeTo(null);
        log.setVisible(true);
        Session.destroy();
        this.dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        getdata();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void SalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalesMouseClicked
        
        int row = Sales.getSelectedRow();
        String t_id = Sales.getModel().getValueAt(row, 0).toString();

        
        String detailSql = "SELECT p_name AS 'Product', p_qty AS 'Qty', p_total AS 'Subtotal' "
                + "FROM sales_details WHERE sales_id = " + t_id;

        
        new config().displayData(detailSql, details);        
    }//GEN-LAST:event_SalesMouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked

    }//GEN-LAST:event_editMouseClicked

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
       
    }//GEN-LAST:event_editMouseExited

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        
    }//GEN-LAST:event_userMouseClicked

    private void userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseEntered
        
    }//GEN-LAST:event_userMouseEntered

    private void userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseExited
       
    }//GEN-LAST:event_userMouseExited

    private void productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseClicked
       
    }//GEN-LAST:event_productMouseClicked

    private void productMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseEntered
        
    }//GEN-LAST:event_productMouseEntered

    private void productMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseExited
        
    }//GEN-LAST:event_productMouseExited

    private void salesreportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreportMouseClicked
       
    }//GEN-LAST:event_salesreportMouseClicked

    private void salesreportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreportMouseEntered
        
    }//GEN-LAST:event_salesreportMouseEntered

    private void salesreportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreportMouseExited
        
    }//GEN-LAST:event_salesreportMouseExited

    private void salesreport1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreport1MouseClicked
        
    }//GEN-LAST:event_salesreport1MouseClicked

    private void salesreport1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreport1MouseEntered
        
    }//GEN-LAST:event_salesreport1MouseEntered

    private void salesreport1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreport1MouseExited
        
    }//GEN-LAST:event_salesreport1MouseExited

    private void edit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit1MouseClicked

        EditProfile edit = new EditProfile();
        edit.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_edit1MouseClicked

    private void edit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit1MouseEntered
        edit1.setText("EDIT");
    }//GEN-LAST:event_edit1MouseEntered

    private void edit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit1MouseExited
        edit1.setText("");
    }//GEN-LAST:event_edit1MouseExited

    private void user1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseClicked
        dashboardAdmin use = new dashboardAdmin();
        use.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_user1MouseClicked

    private void user1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseEntered
        user1.setBackground(new Color (255,255,255));
        Products2.setForeground( new Color (13, 59, 102));
    }//GEN-LAST:event_user1MouseEntered

    private void user1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseExited
        user1.setBackground(new Color(0, 119, 176));
        Products2.setForeground( new Color (255,255,255));
    }//GEN-LAST:event_user1MouseExited

    private void product1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product1MouseClicked
        Product pro = new Product();
        pro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_product1MouseClicked

    private void product1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product1MouseEntered
        product1.setBackground(new Color (255,255,255));
        Products3.setForeground( new Color (13, 59, 102));
    }//GEN-LAST:event_product1MouseEntered

    private void product1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product1MouseExited
        product1.setBackground(new Color(0, 119, 176));
        Products3.setForeground( new Color (255,255,255));
    }//GEN-LAST:event_product1MouseExited

    private void salesreport2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreport2MouseClicked
        Sales sa = new Sales();
        sa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salesreport2MouseClicked

    private void salesreport2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreport2MouseEntered
        salesreport2.setBackground(new Color (255,255,255));
        SalesReport2.setForeground( new Color (13, 59, 102));
    }//GEN-LAST:event_salesreport2MouseEntered

    private void salesreport2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreport2MouseExited
        salesreport2.setBackground(new Color(0, 119, 176));
        SalesReport2.setForeground( new Color (255,255,255));
    }//GEN-LAST:event_salesreport2MouseExited

    private void salesreport3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreport3MouseClicked
        dashboardAdmin dash = new dashboardAdmin();
        dash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salesreport3MouseClicked

    private void salesreport3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreport3MouseEntered
        salesreport3.setBackground(new Color(13, 59, 102));
    }//GEN-LAST:event_salesreport3MouseEntered

    private void salesreport3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreport3MouseExited
        salesreport3.setBackground(new Color(0, 119, 176));
    }//GEN-LAST:event_salesreport3MouseExited

    private void logMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logMouseClicked
        new Stocklog().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logMouseClicked

    private void logMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logMouseEntered
        log.setBackground(new Color (255,255,255));
        log.setForeground( new Color (13, 59, 102));
    }//GEN-LAST:event_logMouseEntered

    private void logMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logMouseExited
        log.setBackground(new Color(0, 119, 176));
        log.setForeground( new Color (255,255,255));
    }//GEN-LAST:event_logMouseExited

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
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Logout;
    private javax.swing.JLabel Products2;
    private javax.swing.JLabel Products3;
    private javax.swing.JLabel Profile1;
    private javax.swing.JTable Sales;
    private javax.swing.JLabel SalesReport2;
    private javax.swing.JLabel SalesReport3;
    private javax.swing.JLabel SalesReport4;
    private javax.swing.JPanel body;
    private javax.swing.JTable details;
    private javax.swing.JLabel edit1;
    private javax.swing.JLabel email1;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel log;
    private javax.swing.JLabel name1;
    private javax.swing.JPanel product1;
    private javax.swing.JPanel salesreport2;
    private javax.swing.JPanel salesreport3;
    private javax.swing.JPanel user1;
    // End of variables declaration//GEN-END:variables
}
