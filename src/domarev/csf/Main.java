package domarev.csf;

import com.sun.javafx.geom.Rectangle;
import domarev.csf.model.BlackChecker;
import domarev.csf.model.Checker;
import domarev.csf.model.Coordinates;
import domarev.csf.service.Logic;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import domarev.csf.model.Coordinates;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    private final Logic logic = new Logic();

    public static void main(String[] args) {
        // write your code here
    }

    //TODO: add refresh

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane border = new BorderPane();
        HBox control = new HBox();
        control.setPrefHeight(40);
        control.setSpacing(10.0);
        control.setAlignment(Pos.BASELINE_CENTER);
        Button start = new Button("Play");
        start.setOnMouseClicked(

        control.getChildren().addAll(start);
        border.setBottom(control);
        stage.setScene(new Scene(border, 400, 400));
        stage.setTitle("CHECKERS GAME BY VSEZNAMUS");
        stage.setResizable(false);
        stage.show();

    }

}
