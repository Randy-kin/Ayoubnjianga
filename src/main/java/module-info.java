module com.ecommerceapp.ecommerceapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires eu.hansolo.tilesfx;
    requires java.sql;
    requires annotations;
    requires java.desktop;
    requires mysql.connector.j;

    opens com.ecommerceapp.ecommerceapp to javafx.fxml;
    exports com.ecommerceapp.ecommerceapp;
}