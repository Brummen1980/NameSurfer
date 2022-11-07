package com.graph.namesurfer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NameSurferApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NameSurferApplication.class.getResource("NameSurfer-View.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 430, 350);

        stage.setTitle("Name Surfer");
        stage.setMinWidth(445);
        stage.setMinHeight(388);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}