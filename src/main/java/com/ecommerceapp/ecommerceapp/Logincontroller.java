package com.ecommerceapp.ecommerceapp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Logincontroller implements Initializable {

    @FXML
    private Button button_logout;

    @FXML
    Label label_welcome;

    @FXML
    Label label_dashboard;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        button_logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DButils.changeScene(event, "Loginform.fxml ", "Loginform", null);

            }

        });

    }
    public void setUserinformation(String username){
        label_welcome.setText("Welcome" + username + "!");
    }
}
