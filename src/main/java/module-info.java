module com.example.teacher2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.teacher2 to javafx.fxml;
    exports com.example.teacher2;
}