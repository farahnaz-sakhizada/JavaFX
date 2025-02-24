package org.example.javafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage stage) throws IOException {
        try{
            Parent root= FXMLLoader.load(getClass().getResource("image-view.fxml"));
            Scene scene = new Scene(root);
            //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            //String css= this.getClass().getResource("application.css").toExternalForm();
            //scene.getStylesheets().add(css);

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(event -> {
                event.consume();
                logout(stage);
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void logout (Stage stage){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setContentText("Do you want to log out?");

        if (alert.showAndWait().get()== ButtonType.OK){
            stage.close();
        }
    }
    public static void main(String[] args) {
        launch();
    }
}