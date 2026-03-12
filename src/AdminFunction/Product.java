package AdminFunction;

import Main.EditProfile;
import Main.landing;
import Main.login;
import config.Session;
import config.config;
import java.awt.Color;
import java.awt.Graphics2D;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public final class Product extends javax.swing.JFrame {

    private String path;

    public Product() {
        initComponents();

        config con = new config();

        Session s = Session.getInstance();

        if (s.getEmail() == null) {

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

    void display() {

        config con = new config();
        String sql = "SELECT id, part_name, category, price, stock FROM parts_inventory";
        con.displayData(sql, Product);

    }

    public void getdata() {

        Session s = Session.getInstance();

        if (s.getId() == 0) {

            JOptionPane.showMessageDialog(null, "Please Log in First to proceed!");

            login log = new login();
            log.setVisible(true);
            this.dispose();

        }
    }

    private void clearFields() {
        name.setText("");
        price.setText("");
        Stock.setText("");
        cate.setSelectedIndex(0);
        // Reset your image label here if needed
    }

    private void processStockUpdate(boolean isAdding, int row) {
        try {
            // Get the ID from the selected row (Assuming ID is in Column 0)
            String id = Product.getValueAt(row, 0).toString();

            // Get the quantity the user typed in your Stock text field
            String input = JOptionPane.showInputDialog(null, "Enter the Quantity : ");

            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a quantity in the Stock field.");
                return;
            }

            int amount = Integer.parseInt(input);

            // If Deducting, turn the number negative (e.g., 5 becomes -5)
            int finalChange = isAdding ? amount : -amount;

            config con = new config();
            // Use p_stock = p_stock + ? so SQL handles the math correctly
            String sql = "UPDATE parts_inventory SET stock = stock + ? WHERE id = ?";

            con.updateRecord(sql, finalChange, id);

            JOptionPane.showMessageDialog(this, (isAdding ? "Added " : "Deducted ") + amount + " units successfully.");

            // Refresh your table to show the new stock levels
            display();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid whole number for the quantity.");
        }
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
        Users = new javax.swing.JLabel();
        product = new javax.swing.JPanel();
        Products = new javax.swing.JLabel();
        salesreport = new javax.swing.JPanel();
        SalesReport = new javax.swing.JLabel();
        salesreport1 = new javax.swing.JPanel();
        SalesReport1 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        tab = new javax.swing.JTabbedPane();
        table1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Product = new javax.swing.JTable();
        update = new javax.swing.JToggleButton();
        delete = new javax.swing.JToggleButton();
        find = new javax.swing.JTextField();
        search = new javax.swing.JToggleButton();
        Edit = new javax.swing.JToggleButton();
        delete1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        table2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cate = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        naaaaa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Stock = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Pic = new javax.swing.JLabel();
        save = new javax.swing.JButton();
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
        SalesReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SalesReport.setText("Back");

        javax.swing.GroupLayout salesreportLayout = new javax.swing.GroupLayout(salesreport);
        salesreport.setLayout(salesreportLayout);
        salesreportLayout.setHorizontalGroup(
            salesreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesreportLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(SalesReport)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        salesreportLayout.setVerticalGroup(
            salesreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesreportLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SalesReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(salesreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 220, 50));

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
        SalesReport1.setText("Sales Report");

        javax.swing.GroupLayout salesreport1Layout = new javax.swing.GroupLayout(salesreport1);
        salesreport1.setLayout(salesreport1Layout);
        salesreport1Layout.setHorizontalGroup(
            salesreport1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesreport1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(SalesReport1)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        salesreport1Layout.setVerticalGroup(
            salesreport1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesreport1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SalesReport1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(salesreport1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 220, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 600));

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Product);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 720, 460));

        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setText("Update Product");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel3.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setText("Delete Product");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 140, -1));
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
        jPanel3.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 150, -1));

        delete1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete1.setText("Add Product");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        jPanel3.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 140, -1));

        jLabel2.setBackground(new java.awt.Color(13, 59, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(13, 59, 102));
        jLabel2.setText("Products");

        javax.swing.GroupLayout table1Layout = new javax.swing.GroupLayout(table1);
        table1.setLayout(table1Layout);
        table1Layout.setHorizontalGroup(
            table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table1Layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(table1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                .addContainerGap())
        );
        table1Layout.setVerticalGroup(
            table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tab.addTab("tab1", table1);

        jPanel4.setBackground(new java.awt.Color(0, 119, 182));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Product Name");

        price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Category");

        cate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Processor", "Graphics Card", "Mother Board", "Memory", "Storage", "Power Supply", "Case", "Monitor" }));
        cate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cateActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Price");

        naaaaa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        naaaaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naaaaaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Stock");

        Stock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(naaaaa)
                    .addComponent(cate, 0, 327, Short.MAX_VALUE)
                    .addComponent(price)
                    .addComponent(Stock)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(naaaaa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Choose a Picture");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        save.setText("Save Product");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout table2Layout = new javax.swing.GroupLayout(table2);
        table2.setLayout(table2Layout);
        table2Layout.setHorizontalGroup(
            table2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(table2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(table2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(table2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(table2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        table2Layout.setVerticalGroup(
            table2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, table2Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        tab.addTab("tab2", table2);

        body.add(tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -30, 770, 630));

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

    private void UsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersMouseEntered

        Users.setBackground(new Color(13, 59, 102));

    }//GEN-LAST:event_UsersMouseEntered

    private void userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseEntered
        user.setBackground(new Color(13, 59, 102));
    }//GEN-LAST:event_userMouseEntered

    private void userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseExited
        user.setBackground(new Color(0, 119, 176));
    }//GEN-LAST:event_userMouseExited

    private void productMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseEntered
        product.setBackground(new Color(13, 59, 102));
    }//GEN-LAST:event_productMouseEntered

    private void productMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseExited
        product.setBackground(new Color(0, 119, 176));
    }//GEN-LAST:event_productMouseExited

    private void salesreportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreportMouseEntered
        salesreport.setBackground(new Color(13, 59, 102));
    }//GEN-LAST:event_salesreportMouseEntered

    private void salesreportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreportMouseExited
        salesreport.setBackground(new Color(0, 119, 176));
    }//GEN-LAST:event_salesreportMouseExited

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked

        dashboardAdmin ad = new dashboardAdmin();
        ad.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_userMouseClicked

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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        getdata();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void salesreport1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreport1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_salesreport1MouseEntered

    private void salesreport1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreport1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_salesreport1MouseExited

    private void salesreportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreportMouseClicked
        dashboardAdmin dash = new dashboardAdmin();
        dash.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_salesreportMouseClicked

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed

        tab.setSelectedIndex(1);

    }//GEN-LAST:event_delete1ActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void naaaaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naaaaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_naaaaaActionPerformed

    private void StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StockActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            try {
                // 1. Read and Resize the Image
                BufferedImage original = ImageIO.read(f);
                int width = 200;
                int height = 200;
                BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

                Graphics2D g2d = resized.createGraphics();
                g2d.drawImage(original, 0, 0, width, height, null);
                g2d.dispose();

                // 2. Define Project Paths
                String projectPath = System.getProperty("user.dir");
                String fileName = System.currentTimeMillis() + ".png";

                // TARGET 1: The Source Folder (Permanent Storage)
                java.io.File srcDir = new java.io.File(projectPath + "/src/Products");
                if (!srcDir.exists()) {
                    srcDir.mkdirs();
                }
                File savedFile = new File(srcDir, fileName);
                boolean success = ImageIO.write(resized, "png", savedFile);

                if (success) {
                    // Store only the filename for the database
                    path = fileName;

                    // Update the preview Label
                    Pic.setIcon(new ImageIcon(resized));

                    // TARGET 2: The Build Folder (For Immediate Display without Rebuilding)
                    // This is what prevents the "No Image Found" error for new items
                    java.io.File buildDir = new java.io.File(projectPath + "/build/classes/Products");
                    if (buildDir.exists()) {
                        ImageIO.write(resized, "png", new File(buildDir, fileName));
                    } else {
                        // If build/classes doesn't exist, try just /build/ (depends on NetBeans version)
                        java.io.File altBuildDir = new java.io.File(projectPath + "/build/Products");
                        if (altBuildDir.exists()) {
                            ImageIO.write(resized, "png", new File(altBuildDir, fileName));
                        }
                    }

                    JOptionPane.showMessageDialog(this, "Image uploaded and saved to project!");
                }

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Upload failed: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        config con = new config();

        // 1. Collect data from UI
        String pname = naaaaa.getText().trim();
        String category = cate.getSelectedItem().toString();
        String amount = price.getText().trim();
        String stock = Stock.getText().trim();

        // 2. Validation: Check if fields are empty
        if (pname.isEmpty() || amount.isEmpty() || stock.isEmpty() || path == null) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields and select an image!");
            return;
        }

        try {

            double d_price = Double.parseDouble(amount);
            int i_stock = Integer.parseInt(stock);

            String sql = "INSERT INTO parts_inventory (part_name, category, price, stock, image_path) VALUES (?, ?, ?, ?, ?)";
            con.addRecord(sql, pname, category, d_price, i_stock, path);

            JOptionPane.showMessageDialog(null, "Product Added Successfully!");

            clearFields();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Price must be a decimal and Stock must be a whole number!");
        }

    }//GEN-LAST:event_saveActionPerformed

    private void cateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cateActionPerformed

    private void productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseClicked
        tab.setSelectedIndex(0);
    }//GEN-LAST:event_productMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        int row = Product.getSelectedRow();

        // 1. Check if a row is selected
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Product from the table.");
            return;
        }

        // 2. Define your custom buttons
        Object[] options = {"Add Stock", "Deduct Stock", "Cancel"};

        // 3. Show the custom Option Dialog
        int response = JOptionPane.showOptionDialog(this,
                "Would you like to Add or Deduct stock for the selected product?",
                "Inventory Action",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // No custom icon
                options, // The button labels
                options[0]); // Default focus on first button

        if (response == 0) { // Add Stock clicked
            processStockUpdate(true, row);
        } else if (response == 1) { // Deduct Stock clicked
            processStockUpdate(false, row);
        }

    }//GEN-LAST:event_updateActionPerformed

    private void ProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductMouseClicked

    }//GEN-LAST:event_ProductMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        config con = new config();

        int row = Product.getSelectedRow();

        if (row < 0) {

            JOptionPane.showMessageDialog(this, "Please select a Product.");

            return;
        }

        int pid = Integer.parseInt(Product.getValueAt(row, 0).toString());

        int response = JOptionPane.showConfirmDialog(this,
                "Do you want to proceed with this action?",
                "Confirm Action",
                JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {

            String sql = "DELETE FROM parts_inventory WHERE id = ?";

            con.deleteRecord(sql, pid);

            display();

            JOptionPane.showMessageDialog(null, "Product has beed DELETED!");
        } else {

            return;
        }


    }//GEN-LAST:event_deleteActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed

        display();
    }//GEN-LAST:event_EditActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void salesreport1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesreport1MouseClicked
        Sales sa = new Sales();
        sa.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_salesreport1MouseClicked

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
            java.util.logging.Logger.getLogger(Product.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Edit;
    private javax.swing.JLabel Pic;
    private javax.swing.JTable Product;
    private javax.swing.JLabel Products;
    private javax.swing.JLabel Profile;
    private javax.swing.JLabel SalesReport;
    private javax.swing.JLabel SalesReport1;
    private javax.swing.JTextField Stock;
    private javax.swing.JLabel Users;
    private javax.swing.JPanel body;
    private javax.swing.JComboBox<String> cate;
    private javax.swing.JToggleButton delete;
    private javax.swing.JToggleButton delete1;
    private javax.swing.JLabel edit;
    private javax.swing.JLabel email;
    private javax.swing.JTextField find;
    private javax.swing.JPanel header1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JTextField naaaaa;
    private javax.swing.JLabel name;
    private javax.swing.JTextField price;
    private javax.swing.JPanel product;
    private javax.swing.JPanel salesreport;
    private javax.swing.JPanel salesreport1;
    private javax.swing.JButton save;
    private javax.swing.JToggleButton search;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JPanel table1;
    private javax.swing.JPanel table2;
    private javax.swing.JToggleButton update;
    private javax.swing.JPanel user;
    // End of variables declaration//GEN-END:variables
}
