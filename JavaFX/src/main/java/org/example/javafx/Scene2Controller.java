package org.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene2Controller {
    @FXML
    TextField nameTextfield;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent event)throws IOException{

        String username= nameTextfield.getText();

        FXMLLoader loader= new FXMLLoader(getClass().getResource("scene1-view.fxml"));
        root= loader.load();

        Scene1Controller scene1Controller= loader.getController();
        scene1Controller.displayName(username);

        stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
