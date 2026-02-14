
package Build;

import config.Session;
import config.config;
import java.awt.Color;
import javax.swing.JOptionPane;
import rabanesguisystem.landing;
import rabanesguisystem.login;




public class Parts1 extends javax.swing.JFrame {
    
   
    
     public Parts1() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        table = new javax.swing.JTabbedPane();
        table2 = new javax.swing.JPanel();
        cpu2 = new javax.swing.JPanel();
        b6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cpu3 = new javax.swing.JPanel();
        b1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        cpu4 = new javax.swing.JPanel();
        b2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cpu5 = new javax.swing.JPanel();
        b3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cpu6 = new javax.swing.JPanel();
        b4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cpu7 = new javax.swing.JPanel();
        b5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        table1 = new javax.swing.JPanel();
        cpu8 = new javax.swing.JPanel();
        b7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cpu9 = new javax.swing.JPanel();
        b8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();

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

        jPanel2.setBackground(new java.awt.Color(0, 119, 176));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Motherboard");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 140, -1));

        jPanel4.setBackground(new java.awt.Color(0, 119, 176));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Memory");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 140, -1));

        jPanel5.setBackground(new java.awt.Color(0, 119, 176));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Processor");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 140, -1));

        jPanel6.setBackground(new java.awt.Color(0, 119, 176));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Graphics Card");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 140, -1));

        jPanel7.setBackground(new java.awt.Color(0, 119, 176));

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

        jPanel8.setBackground(new java.awt.Color(0, 119, 176));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Power Supply");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 140, -1));

        body.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 580));

        table2.setBackground(new java.awt.Color(255, 255, 255));
        table2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cpu2.setBackground(new java.awt.Color(255, 255, 255));
        cpu2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "AMD Ryzen 7 5800X", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        cpu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpu2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cpu2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cpu2MouseExited(evt);
            }
        });
        cpu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b6.setBackground(new java.awt.Color(255, 255, 255));
        b6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpu2.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 140, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Products/cpu6 (1).png"))); // NOI18N
        cpu2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 16, -1, 179));

        table2.add(cpu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 250, 240));

        cpu3.setBackground(new java.awt.Color(255, 255, 255));
        cpu3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "AMD Ryzen 3 3200G", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        cpu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpu3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cpu3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cpu3MouseExited(evt);
            }
        });
        cpu3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpu3.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 140, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Products/cpu1 (1).png"))); // NOI18N
        cpu3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 26, -1, 179));
        cpu3.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, -1, -1));

        table2.add(cpu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 240));

        cpu4.setBackground(new java.awt.Color(255, 255, 255));
        cpu4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "AMD Ryzen 5 3400G", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        cpu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpu4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cpu4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cpu4MouseExited(evt);
            }
        });
        cpu4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b2.setBackground(new java.awt.Color(255, 255, 255));
        b2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpu4.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 140, 60));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Products/cpu2 (1).png"))); // NOI18N
        cpu4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 26, -1, 179));

        table2.add(cpu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 250, 240));

        cpu5.setBackground(new java.awt.Color(255, 255, 255));
        cpu5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "AMD Ryzen 5 3500X", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        cpu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpu5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cpu5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cpu5MouseExited(evt);
            }
        });
        cpu5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpu5.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 140, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Products/cpu3 (1).png"))); // NOI18N
        cpu5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 26, -1, 179));

        table2.add(cpu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 250, 240));

        cpu6.setBackground(new java.awt.Color(255, 255, 255));
        cpu6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "AMD Ryzen 5 5500", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        cpu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpu6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cpu6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cpu6MouseExited(evt);
            }
        });
        cpu6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b4.setBackground(new java.awt.Color(255, 255, 255));
        b4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpu6.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 140, 60));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Products/cpu4 (1).png"))); // NOI18N
        cpu6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 26, -1, 179));

        table2.add(cpu6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 250, 240));

        cpu7.setBackground(new java.awt.Color(255, 255, 255));
        cpu7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "AMD Ryzen 5 5600G", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        cpu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpu7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cpu7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cpu7MouseExited(evt);
            }
        });
        cpu7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b5.setBackground(new java.awt.Color(255, 255, 255));
        b5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpu7.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 140, 60));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Products/cpu5 (1).png"))); // NOI18N
        cpu7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 26, -1, 179));

        table2.add(cpu7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 250, 240));

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton1.setText("Next");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        table2.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 180, -1));

        table.addTab("tab1", table2);

        table1.setBackground(new java.awt.Color(255, 255, 255));
        table1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cpu8.setBackground(new java.awt.Color(255, 255, 255));
        cpu8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Intel Core i7 12700K", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        cpu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpu8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cpu8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cpu8MouseExited(evt);
            }
        });
        cpu8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b7.setBackground(new java.awt.Color(255, 255, 255));
        b7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpu8.add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 140, 60));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Products/cpu8 (1).png"))); // NOI18N
        cpu8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 26, -1, 179));

        table1.add(cpu8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 250, 240));

        cpu9.setBackground(new java.awt.Color(255, 255, 255));
        cpu9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "AMD Ryzen 9 7900X", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        cpu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpu9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cpu9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cpu9MouseExited(evt);
            }
        });
        cpu9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b8.setBackground(new java.awt.Color(255, 255, 255));
        b8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpu9.add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 140, 60));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Products/cpu7 (1).png"))); // NOI18N
        cpu9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 26, -1, 179));

        table1.add(cpu9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 250, 240));

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton2.setText("Back");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        table1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 180, -1));

        table.addTab("tab2", table1);

        body.add(table, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -30, 830, 630));

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

    private void cpu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu2MouseClicked
        b6.setForeground(Color.red);
    }//GEN-LAST:event_cpu2MouseClicked

    private void cpu2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu2MouseEntered
        cpu2.setBackground(new Color (127,157,177));
        b6.setText("Buy");
    }//GEN-LAST:event_cpu2MouseEntered

    private void cpu2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu2MouseExited
        cpu2.setBackground(new Color (255,255,255));
        b6.setText("");
    }//GEN-LAST:event_cpu2MouseExited

    private void cpu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu3MouseClicked
        b1.setForeground(Color.red);
    }//GEN-LAST:event_cpu3MouseClicked

    private void cpu3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu3MouseEntered
        cpu3.setBackground(new Color (127,157,177));
        b1.setText("Buy");
    }//GEN-LAST:event_cpu3MouseEntered

    private void cpu3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu3MouseExited
        cpu3.setBackground(new Color (255,255,255));
        b1.setText("");
    }//GEN-LAST:event_cpu3MouseExited

    private void cpu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu4MouseClicked
        b2.setForeground(Color.red);
    }//GEN-LAST:event_cpu4MouseClicked

    private void cpu4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu4MouseEntered
        cpu4.setBackground(new Color (127,157,177));
        b2.setText("Buy");
    }//GEN-LAST:event_cpu4MouseEntered

    private void cpu4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu4MouseExited
        cpu4.setBackground(new Color (255,255,255));
        b2.setText("");
    }//GEN-LAST:event_cpu4MouseExited

    private void cpu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu5MouseClicked
        b3.setForeground(Color.red);
    }//GEN-LAST:event_cpu5MouseClicked

    private void cpu5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu5MouseEntered
        cpu5.setBackground(new Color (127,157,177));
        b3.setText("Buy");
    }//GEN-LAST:event_cpu5MouseEntered

    private void cpu5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu5MouseExited
        cpu5.setBackground(new Color (255,255,255));
        b3.setText("");
    }//GEN-LAST:event_cpu5MouseExited

    private void cpu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu6MouseClicked
        b4.setForeground(Color.red);
    }//GEN-LAST:event_cpu6MouseClicked

    private void cpu6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu6MouseEntered
        cpu6.setBackground(new Color (127,157,177));
        b4.setText("Buy");
    }//GEN-LAST:event_cpu6MouseEntered

    private void cpu6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu6MouseExited
        cpu6.setBackground(new Color (255,255,255));
        b4.setText("");
    }//GEN-LAST:event_cpu6MouseExited

    private void cpu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu7MouseClicked
        b5.setForeground(Color.red);
    }//GEN-LAST:event_cpu7MouseClicked

    private void cpu7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu7MouseEntered
        cpu7.setBackground(new Color (127,157,177));
        b5.setText("Buy");
    }//GEN-LAST:event_cpu7MouseEntered

    private void cpu7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu7MouseExited
        cpu7.setBackground(new Color (255,255,255));
        b5.setText("");
    }//GEN-LAST:event_cpu7MouseExited

    private void cpu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu8MouseClicked
        b7.setForeground(Color.red);
    }//GEN-LAST:event_cpu8MouseClicked

    private void cpu8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu8MouseEntered
        cpu8.setBackground(new Color (127,157,177));
        b7.setText("Buy");
    }//GEN-LAST:event_cpu8MouseEntered

    private void cpu8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu8MouseExited
        cpu8.setBackground(new Color (255,255,255));
        b7.setText("");
    }//GEN-LAST:event_cpu8MouseExited

    private void cpu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu9MouseClicked
        b8.setForeground(Color.red);
    }//GEN-LAST:event_cpu9MouseClicked

    private void cpu9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu9MouseEntered
        cpu9.setBackground(new Color (127,157,177));
        b8.setText("Buy");
    }//GEN-LAST:event_cpu9MouseEntered

    private void cpu9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu9MouseExited
        cpu9.setBackground(new Color (255,255,255));
        b8.setText("");
    }//GEN-LAST:event_cpu9MouseExited

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        table.setSelectedIndex(1);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        table.setSelectedIndex(0);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Parts1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parts1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parts1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parts1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Parts1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Logout;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel b5;
    private javax.swing.JLabel b6;
    private javax.swing.JLabel b7;
    private javax.swing.JLabel b8;
    private javax.swing.JPanel body;
    private javax.swing.JPanel cpu2;
    private javax.swing.JPanel cpu3;
    private javax.swing.JPanel cpu4;
    private javax.swing.JPanel cpu5;
    private javax.swing.JPanel cpu6;
    private javax.swing.JPanel cpu7;
    private javax.swing.JPanel cpu8;
    private javax.swing.JPanel cpu9;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JTabbedPane table;
    private javax.swing.JPanel table1;
    private javax.swing.JPanel table2;
    // End of variables declaration//GEN-END:variables
}
