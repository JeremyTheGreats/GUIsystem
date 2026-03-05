package Parts;

import Main.login;
import StaffFuction.Staff;
import config.Session;
import config.config;
import java.awt.Color;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Payment extends javax.swing.JFrame {

    private List<Map<String, Object>> checkoutList;
    private double grandTotal = 0;

    public Payment() {
        initComponents();
    }

    public Payment(List<Map<String, Object>> items) {
        initComponents();
        this.checkoutList = items;

        // Set up the Table Columns
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Product Name", "Quantity", "Price", "Total"});
        table.setModel(model);

        // Populate the table with chosen items
        for (Map<String, Object> item : checkoutList) {
            String name = item.get("name").toString();
            int qty = Integer.parseInt(item.get("quantity").toString());
            double total = Double.parseDouble(item.get("total").toString());

            // Calculate unit price for display (Total / Quantity)
            double unitPrice = total / qty;

            model.addRow(new Object[]{name, qty, unitPrice, total});
        }

        // Generate the text-based receipt and calculate totals
        generateReceipt();
    }

    private void generateReceipt() {
        StringBuilder receipt = new StringBuilder();
        grandTotal = 0;

        Session se = Session.getInstance();

        String customerName = (se.getFullname() != null) ? se.getFullname() : "Guest";

        receipt.append("========================================\n");
        receipt.append("             J-TECHNOLOGY               \n");
        receipt.append("           OFFICIAL RECEIPT             \n");
        receipt.append("========================================\n");
        receipt.append(" Cashier  : " + customerName + "\n");
        receipt.append(" Date     : " + new java.util.Date() + "\n");
        receipt.append("----------------------------------------\n");
        receipt.append(String.format("%-20s %-5s %-10s\n", "Item", "Qty", "Total"));
        receipt.append("---------------------------------------------------------------------\n");

        for (Map<String, Object> item : checkoutList) {
            String name = item.get("name").toString();
            if (name.length() > 18) {
                name = name.substring(0, 15) + "...";
            }

            int qty = Integer.parseInt(item.get("quantity").toString());
            double total = Double.parseDouble(item.get("total").toString());

            grandTotal += total;
            receipt.append(String.format("%-20s %-5d ₱%-10.2f\n", name, qty, total));

        }

        double vatableSales = grandTotal / 1.12;
        double vatAmount = grandTotal - vatableSales;

        receipt.append("---------------------------------------------------------------------\n");
        receipt.append(String.format("%-25s ₱%-10.2f\n", "VAT-able Sales:", vatableSales));
        receipt.append(String.format("%-25s ₱%-10.2f\n", "VAT Amount (12%):", vatAmount));
        receipt.append(String.format("%-25s ₱%-10.2f\n", "GRAND TOTAL:", grandTotal));
        receipt.append("========================================\n");

        receipt.append("\n       Thank you for shopping!          \n");

        txtReceipt.setText(receipt.toString());
        lblTotalAmount.setText("₱" + String.format("%.2f", grandTotal));
    }

    private void updateFinalReceipt(double cash, double change) {

        generateReceipt();

        StringBuilder finalInfo = new StringBuilder();
        finalInfo.append(String.format("%-25s ₱%-10.2f\n", "CASH RECEIVED:", cash));
        finalInfo.append(String.format("%-25s ₱%-10.2f\n", "CHANGE:", change));
        finalInfo.append("========================================\n\n");
        finalInfo.append("        Thank you for shopping!");

        String currentReceipt = txtReceipt.getText().replace("Thank you for shopping!", "");
        txtReceipt.setText(currentReceipt + finalInfo.toString());
    }

    private void saveTransactionToDatabase(double cash, double change) {

        config db = new config();
        Session session = Session.getInstance();
        int userId = session.getId();

        
        String salesSql = "INSERT INTO sales (u_id, total_amount, cash_received, cash_change, sale_date) "
                + "VALUES (?, ?, ?, ?, DATETIME('now', 'localtime'))";
        db.addRecord(salesSql, userId, grandTotal, cash, change);

    
        int salesId = db.getLastSaleID();

        if (salesId != -1) {
            for (Map<String, Object> item : checkoutList) {
                String name = item.get("name").toString();
                int qty = Integer.parseInt(item.get("quantity").toString());
                double total = Double.parseDouble(item.get("total").toString());

             
                String detailsSql = "INSERT INTO sales_details (sales_id, p_name, p_qty, p_total) VALUES (?, ?, ?, ?)";
                db.addRecord(detailsSql, salesId, name, qty, total);

           
                String updateStockSql = "UPDATE parts_inventory SET stock = stock - ? WHERE part_name = ?";
                db.updateRecord(updateStockSql, qty, name);
            }

            JOptionPane.showMessageDialog(this, "Transaction successful! Stock updated.");
            btnProceed.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Error: Could not retrieve Sales ID.");
        }
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

        header1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Logout = new javax.swing.JToggleButton();
        footer = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReceipt = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblTotalAmount = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCashReceived = new javax.swing.JTextField();
        btnProceed = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        lblChange = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 677, Short.MAX_VALUE)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addGroup(header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(header1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jLabel4)))
                    .addGroup(header1Layout.createSequentialGroup()
                        .addComponent(Logout)
                        .addGap(15, 15, 15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 60));

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

        body.setBackground(new java.awt.Color(202, 240, 248));
        body.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        body.setForeground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(13, 59, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 59, 102));
        jLabel1.setText("CHECKOUT / PAYMENT");
        body.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 240, 50));

        txtReceipt.setColumns(20);
        txtReceipt.setRows(5);
        jScrollPane1.setViewportView(txtReceipt);

        body.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 300, 590));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Total Amount");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 40));

        lblTotalAmount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTotalAmount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(lblTotalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 270, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Cash Recieved");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, 40));

        txtCashReceived.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(txtCashReceived, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 270, 40));

        btnProceed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnProceed.setText("Proceed");
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });
        jPanel2.add(btnProceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 170, 50));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Change");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, 40));

        lblChange.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblChange.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(lblChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 170, 50));

        body.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 530, 210));

        jPanel1.setBackground(new java.awt.Color(13, 59, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 119, 176));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Back");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 140, -1));

        body.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 580));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(table);

        body.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 530, 320));

        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        Staff sale = new Staff();
        sale.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        jPanel7.setBackground(new Color(13, 59, 102));
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        jPanel7.setBackground(new Color(0, 119, 176));
    }//GEN-LAST:event_jPanel7MouseExited

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed

        login log = new login();
        log.setLocationRelativeTo(null);
        log.setVisible(true);
        Session.destroy();
        this.dispose();

    }//GEN-LAST:event_LogoutActionPerformed

    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
        try {
            double cash = Double.parseDouble(txtCashReceived.getText());

            if (cash < grandTotal) {
                JOptionPane.showMessageDialog(this, "Insufficient Cash!");
                return;
            }

            double change = cash - grandTotal;
            lblChange.setText("₱" + String.format("%.2f", change));

            // 1. Update the visual receipt
            updateFinalReceipt(cash, change);

            // 2. Save everything to the database (Sale + All Items)
            saveTransactionToDatabase(cash, change);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid cash amount.");
        }
    }//GEN-LAST:event_btnProceedActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        getdata();
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Logout;
    private javax.swing.JPanel body;
    private javax.swing.JToggleButton btnProceed;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChange;
    private javax.swing.JLabel lblTotalAmount;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCashReceived;
    private javax.swing.JTextArea txtReceipt;
    // End of variables declaration//GEN-END:variables
}
