package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import net.proteanit.sql.DbUtils;

public class config {

    public static Connection connectDB() {
        Connection con = null;
        try {
            Class.forName("org.sqlite.JDBC"); // Load the SQLite JDBC driver
            con = DriverManager.getConnection("jdbc:sqlite:Database.db"); // Establish connection
            System.out.println("Connection Successful");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Failed: " + e);
        }
        return con;
    }

    public void addRecord(String sql, Object... values) {
        try (Connection conn = connectDB();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            for (int i = 0; i < values.length; i++) {
                pstmt.setObject(i + 1, values[i]);
            }

            pstmt.executeUpdate();
            System.out.println("Record added successfully!");
        } catch (SQLException e) {
            System.out.println("Error adding record: " + e.getMessage());
        }
    }

    public void viewRecords(String sqlQuery, String[] columnHeaders, String[] columnNames) {
        // Check that columnHeaders and columnNames arrays are the same length
        if (columnHeaders.length != columnNames.length) {
            System.out.println("Error: Mismatch between column headers and column names.");
            return;
        }

        try (Connection conn = this.connectDB();
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery()) {

            // Print the headers dynamically
            StringBuilder headerLine = new StringBuilder();
            headerLine.append("--------------------------------------------------------------------------------\n| ");
            for (String header : columnHeaders) {
                headerLine.append(String.format("%-20s | ", header)); // Adjust formatting as needed
            }
            headerLine.append("\n--------------------------------------------------------------------------------");

            System.out.println(headerLine.toString());

            // Print the rows dynamically based on the provided column names
            while (rs.next()) {
                StringBuilder row = new StringBuilder("| ");
                for (String colName : columnNames) {
                    String value = rs.getString(colName);
                    row.append(String.format("%-20s | ", value != null ? value : "")); // Adjust formatting
                }
                System.out.println(row.toString());
            }
            System.out.println("--------------------------------------------------------------------------------");

        } catch (SQLException e) {
            System.out.println("Error retrieving records: " + e.getMessage());
        }
    }

    //-----------------------------------------------
    // UPDATE METHOD
    //-----------------------------------------------
    public void updateRecord(String sql, Object... values) {
        try (Connection conn = this.connectDB(); // Use the connectDB method
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Loop through the values and set them in the prepared statement dynamically
            for (int i = 0; i < values.length; i++) {
                if (values[i] instanceof Integer) {
                    pstmt.setInt(i + 1, (Integer) values[i]); // If the value is Integer
                } else if (values[i] instanceof Double) {
                    pstmt.setDouble(i + 1, (Double) values[i]); // If the value is Double
                } else if (values[i] instanceof Float) {
                    pstmt.setFloat(i + 1, (Float) values[i]); // If the value is Float
                } else if (values[i] instanceof Long) {
                    pstmt.setLong(i + 1, (Long) values[i]); // If the value is Long
                } else if (values[i] instanceof Boolean) {
                    pstmt.setBoolean(i + 1, (Boolean) values[i]); // If the value is Boolean
                } else if (values[i] instanceof java.util.Date) {
                    pstmt.setDate(i + 1, new java.sql.Date(((java.util.Date) values[i]).getTime())); // If the value is Date
                } else if (values[i] instanceof java.sql.Date) {
                    pstmt.setDate(i + 1, (java.sql.Date) values[i]); // If it's already a SQL Date
                } else if (values[i] instanceof java.sql.Timestamp) {
                    pstmt.setTimestamp(i + 1, (java.sql.Timestamp) values[i]); // If the value is Timestamp
                } else {
                    pstmt.setString(i + 1, values[i].toString()); // Default to String for other types
                }
            }

            pstmt.executeUpdate();
            System.out.println("Record updated successfully!");
        } catch (SQLException e) {
            System.out.println("Error updating record: " + e.getMessage());
        }
    }

    // Add this method in the config class
    public void deleteRecord(String sql, Object... values) {
        try (Connection conn = this.connectDB();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Loop through the values and set them in the prepared statement dynamically
            for (int i = 0; i < values.length; i++) {
                if (values[i] instanceof Integer) {
                    pstmt.setInt(i + 1, (Integer) values[i]); // If the value is Integer
                } else {
                    pstmt.setString(i + 1, values[i].toString()); // Default to String for other types
                }
            }

            pstmt.executeUpdate();
            System.out.println("Record deleted successfully!");
        } catch (SQLException e) {
            System.out.println("Error deleting record: " + e.getMessage());
        }
    }

    public java.util.List<java.util.Map<String, Object>> fetchRecords(String sqlQuery, Object... values) {
        java.util.List<java.util.Map<String, Object>> records = new java.util.ArrayList<>();

        try (Connection conn = this.connectDB();
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery)) {

            for (int i = 0; i < values.length; i++) {
                pstmt.setObject(i + 1, values[i]);
            }

            ResultSet rs = pstmt.executeQuery();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (rs.next()) {
                java.util.Map<String, Object> row = new java.util.HashMap<>();
                for (int i = 1; i <= columnCount; i++) {
                    row.put(metaData.getColumnName(i), rs.getObject(i));
                }
                records.add(row);
            }

        } catch (SQLException e) {
            System.out.println("Error fetching records: " + e.getMessage());
        }

        return records;
    }

// Method to hash passwords using SHA-256
    public static String hashPassword(String password) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes(java.nio.charset.StandardCharsets.UTF_8));

            // Convert byte array to hex string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashedBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println("Error hashing password: " + e.getMessage());
            return null;
        }
    }

    public void displayData(String sql, javax.swing.JTable table, Object... values) {
        try (Connection conn = connectDB();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Set the parameters for the search
            for (int i = 0; i < values.length; i++) {
                pstmt.setObject(i + 1, values[i]);
            }

            try (ResultSet rs = pstmt.executeQuery()) {

                table.setModel(DbUtils.resultSetToTableModel(rs));
            }

        } catch (SQLException e) {
            System.out.println("Error filtering data: " + e.getMessage());
        }
    }

    public void setProfileIcon(javax.swing.JLabel label, String path) {
        try {
            // 1. Handle Null or Empty Path (Default Picture)
            if (path == null || path.trim().isEmpty()) {
                label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/profile.png")));
                return;
            }

            // 2. Try loading from Build/JAR Resources (Standard)
            java.net.URL url = getClass().getResource(path.startsWith("/") ? path : "/" + path);

            if (url != null) {
                label.setIcon(new javax.swing.ImageIcon(url));
                return;
            }

            // 3. Fallback: Try loading from Physical File (For NEWLY changed pics)
            // This looks in your src/image folder directly
            String projectPath = System.getProperty("user.dir");

            // If path is "image/pic.png", this creates ".../src/image/pic.png"
            java.io.File f = new java.io.File(projectPath + "/src/" + path);

            // Also check the build folder directly as a secondary fallback
            java.io.File fBuild = new java.io.File(projectPath + "/build/classes/" + path);

            if (f.exists()) {
                label.setIcon(new javax.swing.ImageIcon(f.getAbsolutePath()));
            } else if (fBuild.exists()) {
                label.setIcon(new javax.swing.ImageIcon(fBuild.getAbsolutePath()));
            } else {
                // 4. Final Fallback: If everything fails, show the default profile
                System.out.println("Profile image not found at: " + path);
                label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/profile.png")));
            }

        } catch (Exception e) {
            // Safe fallback to prevent app crash if resources are missing
            try {
                label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/profile.png")));
            } catch (Exception ex) {
                label.setText("No Image");
            }
        }
    }

    public int getLastSaleID() {
        int id = -1;

        String sql = "SELECT MAX(sale_id) FROM sales";

        try (Connection conn = connectDB();
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery()) {

            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching last ID: " + e.getMessage());
        }
        return id;
    }

    public double getTotalUserSales(int userId) {
        double total = 0;

        String sql = "SELECT SUM(total_amount) FROM sales WHERE u_id = ?";

        try (Connection conn = this.connectDB();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, userId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    total = rs.getDouble(1);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error fetching total sales: " + e.getMessage());
        }
        return total;
    }

    public int getTransactionCount(int userId) {
        int count = 0;

        String sql = "SELECT COUNT(sale_id) FROM sales WHERE u_id = ?";

        try (Connection conn = this.connectDB();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, userId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    count = rs.getInt(1);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error fetching transaction count: " + e.getMessage());
        }
        return count;
    }

    public int getUserCount() {
        int totalUsers = 0;

        String sql = "SELECT COUNT(*) FROM user_account";

        try (Connection conn = connectDB();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            if (rs.next()) {
                totalUsers = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Error counting users: " + e.getMessage());
        }
        return totalUsers;
    }

    public double getTotalSalesAmount() {
        double totalSum = 0;

        String sql = "SELECT SUM(p_total) FROM sales_details";

        try (Connection conn = connectDB();
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery()) {

            if (rs.next()) {
                totalSum = rs.getDouble(1);
            }
        } catch (SQLException e) {
            System.out.println("Error calculating total sales: " + e.getMessage());
        }
        return totalSum;
    }

}
