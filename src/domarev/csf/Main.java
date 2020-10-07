package domarev.csf;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
	// write your code here
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane border = new BorderPane();
        HBox control = new HBox();
        control.setPrefHeight(40);
        control.setSpacing(10);
        control.setAlignment(Pos.BASELINE_CENTER);
        stage.setScene(new Scene(border,400,400));
        stage.setTitle("CHECKERS GAME BY VSEZNAMUS");
        stage.setResizable(false);
        stage.show();
    }

    private Group buildGrid() {

    }
}
