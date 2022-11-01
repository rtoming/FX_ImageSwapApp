module com.example.fx_imageswap {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fx_imageswap to javafx.fxml;
    exports com.example.fx_imageswap;
}