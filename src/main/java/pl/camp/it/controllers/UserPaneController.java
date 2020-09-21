package pl.camp.it.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import pl.camp.it.App3;

public class UserPaneController {

    @FXML
    Label loginLabel;

    @FXML
    Label passLabel;

    @FXML
    Label ageLabel;

    public void initialize() {
        loginLabel.setText(App3.user.getLogin());
        passLabel.setText(App3.user.getPass());
        ageLabel.setText(String.valueOf(App3.user.getAge()));
    }
}
