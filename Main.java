package com.company;


import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    Controller controller;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primarystage) {
        controller=new Controller(primarystage);

    }
}
