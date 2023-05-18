module com.muving.muving_backend_hexagonal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mock.user_signup_kata to javafx.fxml;
    exports com.mock.user_signup_kata;
}