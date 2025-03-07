package org.example.javafx;

import javafx.collections.ObservableArray;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Food2ViewController implements Initializable {
    @FXML
    private Label myLabel;
    @FXML
    private ChoiceBox <String> myChoiceBox;
    private String [] food = {"pizza", "sushi", "ramen"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myChoiceBox.getItems().addAll(food);
        //:: is for referencing a mothode to something
        myChoiceBox.setOnAction(this::getFood);
    }
    public void getFood(ActionEvent event){
        String myFood = myChoiceBox.getValue();
        myLabel.setText(myFood);
    }

}
