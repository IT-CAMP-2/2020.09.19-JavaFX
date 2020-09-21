package pl.camp.it;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import pl.camp.it.model.User;

public class App3 extends Application {

    static public Stage stage;
    static public User user;

    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/fxml/LoginPane.fxml"));
        AnchorPane pane = loader.load();
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
        App3.stage = stage;
    }
}
