package org.example.javafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage stage) throws IOException {
        try{
            Parent root= FXMLLoader.load(getClass().getResource("shap-view.fxml"));
            Scene scene = new Scene(root);
            //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            String css= this.getClass().getResource("application.css").toExternalForm();
            scene.getStylesheets().add(css);


            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        launch();
    }
}