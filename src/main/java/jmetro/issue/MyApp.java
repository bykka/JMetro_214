package jmetro.issue;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

public class MyApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setScene(new Scene(new Button("Hello")));

        JMetro jMetro = new JMetro(Style.LIGHT);
        jMetro.setScene(primaryStage.getScene());

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(MyApp.class);
    }

}
