module com.example.supplychange17dec {
    requires javafx.controls;
    requires javafx.fxml;
    //requires com.fasterxml.jackson.databind;
    requires java.sql;


    opens com.example.supplychange17dec to javafx.fxml;
    exports com.example.supplychange17dec;
}