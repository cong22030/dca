module com.example.phamduccong_ver1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.phamduccong_ver1 to javafx.fxml;
    exports com.example.phamduccong_ver1;
}