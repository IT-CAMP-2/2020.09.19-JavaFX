package pl.camp.it.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class SimpleController {

    @FXML
    Button przycisk1;

    @FXML
    CheckBox checkBox;

    @FXML
    Button button2;

    public SimpleController() {
        System.out.println("konstruktor !!");
        System.out.println(przycisk1);
    }

    @FXML
    public void initialize() {
        System.out.println(przycisk1);
        this.przycisk1.setText("Fajny frzycisk !!!");

        EventHandler<ActionEvent> buttonEventHandler = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Handle !!!");
            }
        };

        button2.addEventHandler(ActionEvent.ACTION, buttonEventHandler);
    }

    @FXML
    public void buttonClick(ActionEvent event) {
        System.out.println("Click !!!!");

        if(event.getSource() instanceof Button) {
            System.out.println("Button !!!");
        } else if(event.getSource() instanceof CheckBox) {
            System.out.println("CheckBox !!!");
        }
    }

    @FXML
    public void mouseEntered() {
        System.out.println("Najechano !!!");
    }
}
