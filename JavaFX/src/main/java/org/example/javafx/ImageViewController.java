package org.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageViewController {
    @FXML
    ImageView picture_iv;
    @FXML
    Button change_btn;
    Image foto1= new Image(getClass().getResourceAsStream("foto1.jpg"));
    Image foto2= new Image(getClass().getResourceAsStream("foto2.png"));
    private Boolean isFoto1= true;
    public void displayImage(){
        picture_iv.setImage(foto2);
    }
    public void changeImage(){
        if (isFoto1){
            picture_iv.setImage((foto2));
        }else{
            picture_iv.setImage(foto1);
        }
        isFoto1= !isFoto1;
    }


}
