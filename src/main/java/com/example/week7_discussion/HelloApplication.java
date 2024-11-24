package com.example.week7_discussion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //input fields
        TextField milesInput = new TextField();
        TextField kilometersInput = new TextField();
        milesInput.setAlignment(Pos.CENTER_RIGHT);
        kilometersInput.setAlignment(Pos.CENTER_RIGHT);
        //labels
        Label milesLabel = new Label("Mile");
        Label kilometersLabel = new Label("Kilometer");
        //grid layout
        GridPane grid = new GridPane();
        grid.add(milesLabel, 0, 0);
        grid.add(milesInput, 1, 0);
        grid.add(kilometersLabel, 0, 1);
        grid.add(kilometersInput, 1, 1);

        //event handlers
        milesInput.setOnAction(e -> {
            double miles = Double.parseDouble(milesInput.getText());
            double kilometers = miles * 1.609;
            kilometersInput.setText(String.format("%.2f", kilometers));
        });
        kilometersInput.setOnAction(e -> {
            double kilometers = Double.parseDouble(kilometersInput.getText());
            double miles = kilometers / 1.609;
            milesInput.setText(String.format("%.2f", miles));
        });

        

        grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        Scene scene = new Scene( grid,400, 100);
        stage.setTitle("Exercise16_04");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}