module com.muving.muving_backend_hexagonal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.muving.muving_backend_hexagonal to javafx.fxml;
    exports com.muving.muving_backend_hexagonal;
}