package domarev.csf.view.unavailable;


import domarev.csf.model.BlackChecker;
import domarev.csf.model.Checker;
import domarev.csf.model.Coordinates;
import domarev.csf.model.WhiteChecker;
import domarev.csf.service.Logic;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    private final Logic logic = new Logic();
    private final int size = 8;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
      Parent root = FXMLLoader.load((getClass().getResource("SceneBuilderClass.fxml")));
      stage.setTitle("Checkers by vseznamus");
      stage.setScene(new Scene(root,800,800));
      stage.show();
    }






}
