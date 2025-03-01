package org.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.HashMap;

public class LightViewController {
    @FXML
    ImageView lamp_iv;
    @FXML
    Label status_lbl;
    @FXML
    CheckBox on_off_cb;
    Image onLight= new Image(getClass().getResourceAsStream("light_on.jpg"));
    Image offLight= new Image(getClass().getResourceAsStream("light_off.jpg"));

//    Image [] lights= new Image[]{offLight, onLight};
//    private int currentImageIndex=0;
//    public void turn(){
//        if (currentImageIndex<lights.length-1){
//            currentImageIndex++;
//            lamp_iv.setImage(lights[currentImageIndex]);
//            status_lbl.setText("ON");
//        }else{
//            currentImageIndex=0;
//            lamp_iv.setImage(lights[currentImageIndex]);
//            status_lbl.setText("OFF");
//       }
//    }
    public void change(){
        if (on_off_cb.isSelected()){
            lamp_iv.setImage(onLight);
            status_lbl.setText("ON");
        }else{
            lamp_iv.setImage(offLight);
            status_lbl.setText("OFF");
        }
    }
}
