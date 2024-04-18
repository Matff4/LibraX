package me.matff.librax.util;
import java.sql.*;

public class DatabaseUtil {
    public DatabaseUtil() {
        String connectionUrl = "jdbc:mysql://rpi-nas.lan:3306/librax?serverTimezone=UTC";

        try (Connection conn = DriverManager.getConnection(connectionUrl, "libraxusr", "cRR4F5EswXP9n67");
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM books");
             ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    long id = rs.getLong("id");
                    String name = rs.getString("title");
                    String lastName = rs.getString("author");

                    System.out.printf("ID: %d, Name: %s Author: %s\n", id, name, lastName);
                    // do something with the extracted data...
                }
        } catch (SQLException e) {
            // handle the exception
        }
    }
}
