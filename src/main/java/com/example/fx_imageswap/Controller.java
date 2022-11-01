package com.example.fx_imageswap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    Image img1,img2;

    @FXML
    private ImageView imgV1;

    @FXML
    private ImageView imgV2;

    @FXML
    private Button btn;

    @FXML
    void loadImages(MouseEvent event) {
        ImageView temp = (ImageView) event.getSource(); 
        System.out.println(temp.getId());

        if(temp.getImage()==null) {
            if(temp.getId().equals("imgV1") ) {
                temp.setImage(img1);
            }
            else if(temp.getId().equals("imgV2") ) {
                temp.setImage(img2);
            }
            System.out.println("Image has been set!");
        }
    }

    @FXML
    void swapImages(ActionEvent event) {

        Image myImg1 = imgV1.getImage();
        Image myImg2 = imgV2.getImage();

        imgV1.setImage(myImg2);
        imgV2.setImage(myImg1);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        img1 = new Image (getClass().getResourceAsStream("/img/21.jpg"));
        img2 = new Image (getClass().getResourceAsStream("/img/shutter.jpg") );
    }
}
