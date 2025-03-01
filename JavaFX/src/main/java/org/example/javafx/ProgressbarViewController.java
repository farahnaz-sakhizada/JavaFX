package org.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class ProgressbarViewController implements Initializable {
    @FXML
    private ProgressBar myProgressbar;
    @FXML
    private Button myButton;
    @FXML
    private Label myLabel;

    //The BigDecimal class gives its user complete control over rounding behavior
    BigDecimal progress= new BigDecimal(String.format(Locale.US,"%.2f",0.0));

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myProgressbar.setStyle("-fx-accent: #00FF11;");
        myLabel.setText(String.valueOf((int)myProgressbar.getProgress())+ " %");
    }
    public void increaseProgress(){
        if (progress.doubleValue() <1) {
            progress= new BigDecimal(String.format(Locale.US,"%.2f", progress.doubleValue()+ 0.1));
            System.out.println(progress.doubleValue());
            myProgressbar.setProgress(progress.doubleValue());
            myLabel.setText(Integer.toString((int)Math.round(progress.doubleValue() * 100)) + " %");
        }
    }
}
