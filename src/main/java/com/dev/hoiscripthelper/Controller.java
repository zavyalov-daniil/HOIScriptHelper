package com.dev.hoiscripthelper;

import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Controller {

    @FXML
    private Button chooseTamplateButton;

    @FXML
    private Button enterCodeButton;

    @FXML
    private Button enterKeyButton;

    @FXML
    private Button readTagsButton;

    @FXML
    private Text text1;

    @FXML
    private Text text2;

    @FXML
    private Label welcomeText;
    @FXML
    void initialize(){
        enterCodeButton.setOnAction(actionEvent -> {
            onEnterCodeButtonClick();
        });
    }
    void onEnterCodeButtonClick(){
        try {
            File codeFile = new File("CodeToBeReplicated.txt");
            if (codeFile.createNewFile()) {
                System.out.println("File created: " + codeFile.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileOpener.openFileInDefaultEditor(codeFile);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

