module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens Exercise9 to javafx.fxml;
    exports Exercise9;
}