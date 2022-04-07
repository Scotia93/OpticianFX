package com.example.opticianfx;

import com.example.optician.Optician;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Date;

public class OpticianController
{
    private Stage stage;
    private Scene scene;
    private Parent root;
    Optician optician = new Optician("Andy", "Allan", "20 Blind Av", "07123 456 789","1specs@gmail.com",new Date(),1);

    public void switchToWelcome(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(true);
        stage.setTitle("Welcome!");
        stage.show();
    }

    public void switchToAppointment(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("Appointment.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        stage.setTitle("Book Appointment");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button BackButton;
    @FXML
    private Button NextButton;
}
