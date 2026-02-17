package Parts;

import config.Session;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class ItemCard extends JPanel {

    private DisplayProducts parentPage;

    public ItemCard(String name, String price, String imgName, DisplayProducts parent) {
        this.parentPage = parent;

        // Setup Card Design
        setLayout(new BorderLayout(5, 5));
        setPreferredSize(new Dimension(220, 330));
        setBackground(Color.WHITE);
        setBorder(new LineBorder(new Color(230, 230, 230), 1));

        // Image Section
        JLabel imgLabel = new JLabel();
        imgLabel.setHorizontalAlignment(SwingConstants.CENTER);
        try {
            ImageIcon icon = new ImageIcon("src/Products/" + imgName);
            Image img = icon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            imgLabel.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            imgLabel.setText("No Image");
        }

        // Bottom Info Section
        JPanel bottomPanel = new JPanel(new BorderLayout(5, 5));
        bottomPanel.setBackground(Color.WHITE);
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));

        JLabel lblName = new JLabel("<html><b>" + name + "</b></html>");
        JLabel lblPrice = new JLabel("₱" + price);
        lblPrice.setForeground(new Color(238, 77, 45));
        lblPrice.setFont(new Font("SansSerif", Font.BOLD, 16));

        JButton btnCart = new JButton("Add to Item");
        btnCart.setBackground(new Color(40, 167, 69));
        btnCart.setForeground(Color.WHITE);
        btnCart.setFocusPainted(false);

        // ACTION LISTENER: Updated to transfer data to Parent List instead of SQL
        btnCart.addActionListener(e -> {
            Session s = Session.getInstance();
            if (s.getId() == 0) {
                JOptionPane.showMessageDialog(null, "Please login first!");
                return;
            }

            String input = JOptionPane.showInputDialog(null, "Quantity for " + name + ":", "1");

            if (input != null && !input.trim().isEmpty()) {
                try {
                    int qty = Integer.parseInt(input.trim());
                    if (qty > 0) {
                        // 1. Create a data map for this item
                        Map<String, Object> itemData = new HashMap<>();
                        itemData.put("name", name);
                        itemData.put("price", Double.parseDouble(price));
                        itemData.put("quantity", qty);
                        itemData.put("total", Double.parseDouble(price) * qty);

                        // 2. Add to the parent's temporary cart list
                        parentPage.cartItems.add(itemData);

                        // 3. Update the UI count on the parent frame
                        parentPage.updateCartUI();

                        JOptionPane.showMessageDialog(null, name + " added to temporary list!");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid numeric quantity!");
                }
            }
        });

        JPanel textPanel = new JPanel(new GridLayout(2, 1));
        textPanel.setBackground(Color.WHITE);
        textPanel.add(lblName);
        textPanel.add(lblPrice);

        bottomPanel.add(textPanel, BorderLayout.CENTER);
        bottomPanel.add(btnCart, BorderLayout.SOUTH);

        add(imgLabel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }
}
