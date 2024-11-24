module com.example.week7_discussion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week7_discussion to javafx.fxml;
    exports com.example.week7_discussion;
}