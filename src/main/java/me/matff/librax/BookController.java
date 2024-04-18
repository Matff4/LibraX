package me.matff.librax;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import me.matff.librax.model.Book;
import me.matff.librax.util.DatabaseUtil;

import java.util.List;

public class BookController {
    @FXML
    TableView<Book> bookTable;

    @FXML
    public void initialize() {
        DatabaseUtil databaseUtil = new DatabaseUtil();

        ObservableList<Book> booksList = FXCollections.observableArrayList(databaseUtil.getBooks());

        bookTable.setItems(booksList);

        // Define columns
        TableColumn<Book, String> col_id = new TableColumn<>("ID");
        col_id.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getID().toString()));

        TableColumn<Book, String> col_isbn = new TableColumn<>("ISBN");
        col_isbn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIsbn()));

        TableColumn<Book, String> col_title = new TableColumn<>("Title");
        col_title.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTitle()));

        TableColumn<Book, String> col_author = new TableColumn<>("Author");
        col_author.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getAuthor()));

        TableColumn<Book, String> col_year = new TableColumn<>("Year");
        col_year.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getYear()));


        // Add columns to TableView
        bookTable.getColumns().addAll(List.of(col_id, col_isbn, col_title, col_author, col_year));


    }



}
