package org.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class LabelViewController {
    public Label titleLabel;
    public Label textLabel;

    public void switchToShapScene(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("shap-view.fxml"));
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
