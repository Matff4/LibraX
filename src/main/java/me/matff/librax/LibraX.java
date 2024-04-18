package me.matff.librax;

import atlantafx.base.theme.Dracula;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import me.matff.librax.util.DatabaseUtil;

import java.io.IOException;
import java.util.Objects;

public class LibraX extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("LibraX");
        stage.getIcons().add(new Image(Objects.requireNonNull(LibraX.class.getResourceAsStream("img/appicon.png"))));
        //stage.setResizable(false);
        stage.setMinWidth(600);
        stage.setMinHeight(400);

        Application.setUserAgentStylesheet(new Dracula().getUserAgentStylesheet());

        FXMLLoader fxmlLoader = new FXMLLoader(LibraX.class.getResource("fxml/Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setScene(scene);

        stage.show();

        Platform.runLater(() -> {
            DatabaseUtil databaseUtil = new DatabaseUtil();
        });

    }

    public static void main(String[] args) {
        launch();
    }
}