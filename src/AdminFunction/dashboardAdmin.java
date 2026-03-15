package AdminFunction;

import Main.EditProfile;
import Main.landing;
import Main.login;
import config.Session;
import config.config;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class dashboardAdmin extends javax.swing.JFrame {

    public dashboardAdmin() {
        initComponents();

        Session s = Session.getInstance();
        config con = new config();

        name.setText(s.getFullname());
        email.setText(s.getEmail());
        count.setText(String.valueOf(con.getUserCount()));
        sum.setText(String.valueOf("₱ " + con.getTotalSalesAmount()));

        con.setProfileIcon(Profile, s.getImagePath());
        displayChart(Chart);
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

    public void displayChart(JPanel container) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        config db = new config();

        // 1. Fetch data from database
        String query = "SELECT category, SUM(price * stock) AS total_value FROM parts_inventory GROUP BY category";
        List<Map<String, Object>> records = db.fetchRecords(query);

        if (records != null && !records.isEmpty()) {
            for (Map<String, Object> row : records) {
                String category = row.get("category").toString();
                double value = Double.parseDouble(row.get("total_value").toString());

                // 2. Add real data to the dataset
                dataset.setValue(value, "Inventory Value", category);
            }
        } else {
            // Fallback if database is empty
            dataset.setValue(0, "Inventory Value", "No Data");
        }

        // 3. Create the Chart with a custom color theme
        JFreeChart barChart = ChartFactory.createBarChart(
                "Stock Value by Category",
                "Product Category",
                "Value (₱)",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false
        );

        // 4. Modernize the Look
        CategoryPlot plot = barChart.getCategoryPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinePaint(new Color(230, 230, 230)); // Soft gray lines

        // Set bar color to match your J-Tech blue
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, new Color(0, 81, 135));

        // 5. Display in Container
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(container.getWidth(), container.getHeight()));

        container.setLayout(new BorderLayout());
        container.removeAll();
        container.add(chartPanel, BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        edit = new javax.swing.JLabel();
        Profile = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Products1 = new javax.swing.JLabel();
        product = new javax.swing.JPanel();
        Products = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        salesreport = new javax.swing.JPanel();
        SalesReport = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        count = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        sum = new javax.swing.JLabel();
        Chart = new javax.swing.JPanel();
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

        jPanel2.setBackground(new java.awt.Color(13, 59, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("User");
        name.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        name.setName("name"); // NOI18N
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, 37));
        name.getAccessibleContext().setAccessibleName("lblUser");
        name.getAccessibleContext().setAccessibleDescription("User");

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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/user-removebg-preview-removebg-preview.png"))); // NOI18N
        user.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 0, -1, -1));

        Products1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Products1.setForeground(new java.awt.Color(255, 255, 255));
        Products1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Products1.setText("Users");
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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/product-removebg-preview.png"))); // NOI18N
        product.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, -1));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 600));

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(13, 59, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(13, 59, 102));
        jLabel2.setText("DASHBOARD");
        body.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 170, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Total Users :");

        count.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        count.setText("64");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(count, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(35, 35, 35)
                .addComponent(count, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        body.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 350, 180));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Total Sales : ");

        sum.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sum.setText("1,543,135.12 ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(sum, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(35, 35, 35)
                .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        body.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 340, 180));

        Chart.setLayout(new java.awt.BorderLayout());
        body.add(Chart, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 720, 300));

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

    private void userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseEntered
        user.setBackground(new Color (255,255,255));
        Products1.setForeground( new Color (13, 59, 102));
    }//GEN-LAST:event_userMouseEntered

    private void productMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseEntered
        product.setBackground(new Color (255,255,255));
        Products.setForeground( new Color (13, 59, 102));
    }//GEN-LAST:event_productMouseEntered

    private void salesreportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreportMouseEntered
        salesreport.setBackground(new Color (255,255,255));
        SalesReport.setForeground( new Color (13, 59, 102));
    }//GEN-LAST:event_salesreportMouseEntered

    private void userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseExited
        user.setBackground(new Color(0, 119, 176));
        Products1.setForeground( new Color (255,255,255));
    }//GEN-LAST:event_userMouseExited

    private void productMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseExited
        product.setBackground(new Color(0, 119, 176));
        Products.setForeground( new Color (255,255,255));
    }//GEN-LAST:event_productMouseExited

    private void salesreportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreportMouseExited
        salesreport.setBackground(new Color(0, 119, 176));
        SalesReport.setForeground( new Color (255,255,255));
    }//GEN-LAST:event_salesreportMouseExited

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        Users use = new Users();
        use.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userMouseClicked

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setText("EDIT");
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setText("");
    }//GEN-LAST:event_editMouseExited

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked

        EditProfile edit = new EditProfile();
        edit.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editMouseClicked

    private void productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseClicked
        Product pro = new Product();
        pro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        getdata();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void salesreportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreportMouseClicked
        Sales sa = new Sales();
        sa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salesreportMouseClicked

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
            java.util.logging.Logger.getLogger(dashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboardAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Chart;
    private javax.swing.JToggleButton Logout;
    private javax.swing.JLabel Products;
    private javax.swing.JLabel Products1;
    private javax.swing.JLabel Profile;
    private javax.swing.JLabel SalesReport;
    private javax.swing.JPanel body;
    private javax.swing.JLabel count;
    private javax.swing.JLabel edit;
    private javax.swing.JLabel email;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel name;
    private javax.swing.JPanel product;
    private javax.swing.JPanel salesreport;
    private javax.swing.JLabel sum;
    private javax.swing.JPanel user;
    // End of variables declaration//GEN-END:variables
}
