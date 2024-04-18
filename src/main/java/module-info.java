module me.matff.librax {
    requires javafx.controls;
    requires javafx.fxml;

    requires atlantafx.base;
    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.materialdesign2;
    requires jdk.compiler;

    requires mysql.connector.j;
    requires java.sql;

    opens me.matff.librax to javafx.fxml;
    exports me.matff.librax;
}