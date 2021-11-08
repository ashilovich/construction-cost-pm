package com.example.constructioncostpm;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Hello!");
        GridPane root=new GridPane();
        Label label=new Label("Enter your name");
        TextField textField = new TextField();

        Tooltip tooltip =new Tooltip("Please enter");
        textField.setTooltip(tooltip);

        TextArea textArea=new TextArea();
        root.add(textArea,0,2,2,1);

        class  ButtonEventHandler implements EventHandler <ActionEvent>{
            @Override
            public void handle(ActionEvent event) {
                String text = textField.getText();
                textArea.appendText("\n");
                textArea.appendText (text);

                textField.setText("");
            }
        }

        class ButtonEnterEventHandler implements  EventHandler<KeyEvent>{
            @Override
            public void handle(KeyEvent event) {
                KeyCode code = event.getCode();
                if (code==KeyCode.ENTER) {
                    String text=textField.getText();
                    System.out.println(text);
                }

            }
        }
        Button button = new Button("Save new name");
        button.setOnAction(new ButtonEventHandler());
        button.setOnKeyPressed(new ButtonEnterEventHandler());



        Insets insets=new Insets(25);
        root.setPadding(insets);
        root.setVgap(10);
        root.setHgap(10);

        root.add(label,0,0);
        root.add(textField,1,0);
        root.add(button,1,1);



        GridPane.setHalignment(button, HPos.RIGHT);

        stage.setScene(new Scene(root,300,275));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}