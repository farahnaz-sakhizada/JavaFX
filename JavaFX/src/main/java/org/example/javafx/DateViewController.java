package org.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateViewController {
    @FXML
    private DatePicker myDatePicker;
    @FXML
    private Label myLabel;

    public void getDate(ActionEvent event){
        LocalDate myDate = myDatePicker.getValue();
        String myFormattedDate= myDate.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        myLabel.setText(String.valueOf(myFormattedDate));
    }
}
