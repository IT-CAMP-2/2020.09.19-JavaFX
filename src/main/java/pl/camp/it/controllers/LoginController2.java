package pl.camp.it.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.util.StringConverter;
import javafx.util.converter.IntegerStringConverter;
import pl.camp.it.App3;
import pl.camp.it.model.User;
import pl.camp.it.model.view.UserViewModel;

import java.io.IOException;

public class LoginController2 {
    @FXML
    TextField loginTextField;

    @FXML
    TextField passwordTextField;

    @FXML
    TextField ageTextField;

    @FXML
    CheckBox confirmationCheckbox;

    @FXML
    Button confirmButton;

    UserViewModel user = new UserViewModel();

    @FXML
    public void initialize() {
        loginTextField.textProperty().bindBidirectional(user.loginProperty());
        passwordTextField.textProperty().bindBidirectional(user.passProperty());
        StringConverter converter = new IntegerStringConverter();
        ageTextField.textProperty().bindBidirectional(user.ageProperty(), converter);

        confirmButton.disableProperty().bind(
                user.loginFilledProperty().not()
                        .or(user.passFilledProperty().not())
                        .or(user.ageFilledProperty().not())
                        .or(confirmationCheckbox.selectedProperty().not())
        );
    }

    public void okClick() throws IOException {
            System.out.println(user);

            /*App3.user = user;

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(this.getClass().getResource("/fxml/UserPane.fxml"));
            AnchorPane pane = loader.load();
            Scene scene = new Scene(pane);
            App3.stage.setScene(scene);*/
    }
}
