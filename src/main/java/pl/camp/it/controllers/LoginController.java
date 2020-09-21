package pl.camp.it.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import pl.camp.it.App3;
import pl.camp.it.model.User;

import java.io.IOException;

public class LoginController {

    @FXML
    TextField loginTextField;

    @FXML
    TextField passwordTextField;

    @FXML
    TextField ageTextField;

    @FXML
    CheckBox confirmationCheckbox;

    public void okClick() throws IOException {
        if(!this.loginTextField.getText().equals("") &&
                !this.passwordTextField.getText().equals("") &&
                !this.ageTextField.getText().equals("") &&
                this.confirmationCheckbox.isSelected()) {

            User user = new User();
            user.setLogin(this.loginTextField.getText());
            user.setPass(this.passwordTextField.getText());
            user.setAge(Integer.parseInt(this.ageTextField.getText()));

            System.out.println(user);

            App3.user = user;

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(this.getClass().getResource("/fxml/UserPane.fxml"));
            AnchorPane pane = loader.load();
            Scene scene = new Scene(pane);
            App3.stage.setScene(scene);
        }
    }
}
