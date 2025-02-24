package org.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class ShapViewController {
    @FXML
    private Circle myCircle;
    private double x;
    private double y;
    public void up(ActionEvent e){
        System.out.println("Up");
        myCircle.setCenterY(y-=10);
    }public void down(ActionEvent e){
        System.out.println("Down");
        myCircle.setCenterY(y+=10);
    }public void left(ActionEvent e){
        System.out.println("Left");
        myCircle.setCenterX(x-=10);
    }public void right(ActionEvent e){
        System.out.println("Right");
        myCircle.setCenterX(x+=10);
    }

    public void switchToLabelScene(ActionEvent event)throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("label-view.fxml"));
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        stage.setScene(scene);
        stage.show();

    }
}
