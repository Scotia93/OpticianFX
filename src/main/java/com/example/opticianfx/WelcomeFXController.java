package com.example.opticianfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeFXController
{
    private Stage stage;
    private Scene scene;
    private Parent root;


    public void switchToPatient(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("Patient.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Patient Registration");
        stage.setResizable(true);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToWelcome(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Welcome!");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToOptician(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("Optician.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Assign Optician");
        stage.show();
    }

    @FXML
    private Label welcomeText;
    @FXML
    private Button StartButton;
    @FXML
    private Button CreateOptician;

    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}