module com.example.opticianfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.opticianfx to javafx.fxml;
    exports com.example.opticianfx;
}