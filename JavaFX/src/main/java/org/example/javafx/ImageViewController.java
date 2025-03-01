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
    Image foto3= new Image(getClass().getResourceAsStream("light_off.jpg"));
    Image foto4= new Image(getClass().getResourceAsStream("light_on.jpg"));

    private int currentImageIndex=0;
    Image [] images=new Image [] {foto1,foto2, foto3,foto4};
    public void changeImage(){
        if (currentImageIndex<images.length-1){
            currentImageIndex++;
            picture_iv.setImage((images[currentImageIndex]));
        }else{
            currentImageIndex=0;
            picture_iv.setImage(images[currentImageIndex]);
        }
    }
}
