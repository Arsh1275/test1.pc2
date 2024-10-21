package com.example.testarsh1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField Username;
    public PasswordField Password;
    @FXML
    private Label welcomeText;


    String x = "ARSHDEEP";

    String y = "321";

    Integer counter = 8;

    @FXML
    protected void onHelloButtonClick() {


        welcomeText.setText("");
        String u = Username.getText();

        String p = Password.getText();


        if (x.equals(u) && y.equals(p)) {

            counter = 8;

            welcomeText.setText("Login Successful");

        }else if (x.equals(u)) {


            if (counter==0) {

                welcomeText.setText("Account Locked");

            }else{

                counter--;

                welcomeText.setText("You have "+ counter +"Attempt left");
            }
        }else{

            welcomeText.setText("Invalid Username or Password");
        }

    }
}
