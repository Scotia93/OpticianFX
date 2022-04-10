package com.example.opticianfx;

import com.example.optician.Optician;
import com.example.optician.OpticianModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Date;

public class OpticianController
{
    private OpticianModel model;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToWelcome(ActionEvent event) throws IOException
    {
        FXMLLoader welcomeLoader = new FXMLLoader(getClass().getResource("Welcome.fxml")); // new bit
        Parent root = welcomeLoader.load();
        WelcomeFXController welcomeController = welcomeLoader.getController();
        welcomeController.initModel(this.model);
//        root = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(true);
        stage.setTitle("Welcome!");
        stage.show();
    }

    public void switchToAppointment(ActionEvent event) throws IOException
    {
        FXMLLoader appointmentLoader = new FXMLLoader(getClass().getResource("Appointment.fxml")); // new bit
        Parent root = appointmentLoader.load();
        AppointmentController appointmentController = appointmentLoader.getController();
        appointmentController.initModel(this.model);
//        root = FXMLLoader.load(getClass().getResource("Appointment.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        stage.setTitle("Book Appointment");
        stage.setScene(scene);
        stage.show();
    }

    public void initModel(OpticianModel model) {
        this.model = model;
    }

    public void AddOptician(ActionEvent event)
    {
        System.out.println(textFirstname.getText());
        String Firstname = textFirstname.getText();
        String Lastname = textLastname.getText();
        String Address = textAddress.getText();
        String ContactNumber = textContactNumber.getText();
        String Email = textEmail.getText();
        String RoomNumber = textRoomNumber.getText();

        Optician optician = new Optician(Firstname, Lastname, Address, ContactNumber, Email, new Date(), RoomNumber);
        System.out.println(optician);

        PrintOptician.setText(optician.toString());


    }

    @FXML
    private Button BackButton;
    @FXML
    private Button NextButton;
    @FXML
    private Label PrintOptician;
    @FXML
    private TextField textFirstname;
    @FXML
    private TextField textLastname;
    @FXML
    private TextField textAddress;
    @FXML
    private TextField textContactNumber;
    @FXML
    private TextField textEmail;
    @FXML
    private TextField textRoomNumber;
    @FXML
    private Button ConfirmButton;
}
