package org.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class FoodViewController {
    @FXML
    private Label myLabel;
    @FXML
    private RadioButton rButton1;
    @FXML
    private RadioButton rButton2;
    @FXML
    private RadioButton rButton3;

    public void getFood(ActionEvent event){
        if (rButton1.isSelected()){
            myLabel.setText(rButton1.getText());
        }else if (rButton2.isSelected()){
            myLabel.setText(rButton2.getText());
        }else if (rButton3.isSelected()){
            myLabel.setText(rButton3.getText());
        }
    }

}
