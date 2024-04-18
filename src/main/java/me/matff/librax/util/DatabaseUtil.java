package me.matff.librax.util;

import me.matff.librax.model.Book;
import java.sql.*;
import java.util.ArrayList;

public class DatabaseUtil {
    private static final String DB_USER = "libraxusr";
    private static final String DB_PASS = "cRR4F5EswXP9n67";
    private static final String DB_URL = "jdbc:mysql://rpi-nas.lan:3306/librax";

    public ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM books");
             ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    long id = rs.getLong("id");
                    String isbn = rs.getString("isbn");
                    String title = rs.getString("title");
                    String author = rs.getString("author");
                    String year = rs.getString("year");

                    books.add(new Book(id, isbn, title, author, year));
                }
        } catch (SQLException e) {
            // handle the exception
        }

        return books;
    }
}
