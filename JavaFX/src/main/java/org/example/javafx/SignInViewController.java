package org.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SignInViewController {
    @FXML
    Label wellcome_lbl;
    @FXML
    TextField age_tf;
    @FXML
    Button submit_btn;
    int age;

    public void submit (ActionEvent event){
        age= Integer.parseInt(age_tf.getText());
        System.out.println(age);
    }


}
