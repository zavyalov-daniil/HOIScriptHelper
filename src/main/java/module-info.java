module com.dev.hoiscripthelper {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dev.hoiscripthelper to javafx.fxml;
    exports com.dev.hoiscripthelper;
}