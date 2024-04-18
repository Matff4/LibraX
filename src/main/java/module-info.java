module me.matff.librax {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens me.matff.librax to javafx.fxml;
    exports me.matff.librax;
}