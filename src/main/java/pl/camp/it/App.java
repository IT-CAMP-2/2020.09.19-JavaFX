package pl.camp.it;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        Button button = new Button("Przycisk");
        Button button1 = new Button("Przycisk 2");

        StackPane stackPane = new StackPane();


        Scene scene = new Scene(stackPane);
        stackPane.getChildren().add(button);
        stackPane.getChildren().add(button1);
        //stage.setFullScreen(true);
        stage.setResizable(false);
        //stage.setX(2300.0);
        //stage.setY(400.0);
        stage.setScene(scene);
        stage.setHeight(300);
        stage.setWidth(400);
        stage.setTitle("Aplikacja");
        stage.show();
    }
}
