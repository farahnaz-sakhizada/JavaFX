package org.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1Controller {
    @FXML
    Label nameLabel;
    @FXML
    private Button logoutButton;
    @FXML
    private AnchorPane scenePane;

    Stage stage;
    public void logout(ActionEvent event){

        Alert alert= new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setContentText("Do you want to exit?");

        if (alert.showAndWait().get()== ButtonType.OK){
            //stage= (Stage) scenePane.getScene().getWindow();
            //System.out.println("You successfully logged out");
            //stage.close();
            Parent root= null;
            try {
                root = FXMLLoader.load(getClass().getResource("scene2-view.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene= new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
    public void displayName(String username){
        nameLabel.setText("Hello "+ username);
    }
}
