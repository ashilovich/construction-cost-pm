module com.example.constructioncostpm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.constructioncostpm to javafx.fxml;
    exports com.example.constructioncostpm;
    exports preparation;
    opens preparation to javafx.fxml;
}