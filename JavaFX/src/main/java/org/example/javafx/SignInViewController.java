package org.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class  SignInViewController {
    @FXML
    Label wellcome_lbl;
    @FXML
    TextField age_tf;
    @FXML
    Button submit_btn;
    int age;

    public void submit (ActionEvent event){
        try{
            age= Integer.parseInt(age_tf.getText());
            if (age >=18){
                wellcome_lbl.setText("You are now signed in");
            }else{
                wellcome_lbl.setText("You must be 18+ to sign in");
            }
        }
        catch(NumberFormatException e){
            System.out.println("Enter only numbers pls");
        }
        catch (Exception e){
            System.out.println(e);
        }

    }


}
