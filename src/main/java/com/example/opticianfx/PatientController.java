package com.example.opticianfx;

import com.example.optician.OpticianModel;
import com.example.optician.Patient;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class PatientController
{
    private OpticianModel model;
    private Stage stage;
    private Scene scene;
    private Parent root;


    public void initModel(OpticianModel model) {
        this.model = model;
    }

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

    public void AddPatient(ActionEvent event){
        System.out.println(textFirstname.getText());
        String Firstname = textFirstname.getText();
        String Lastname = textLastname.getText();
        String Address = textAddress.getText();
        String ContactNumber = textContactNumber.getText();
        String Email = textEmail.getText();
        Patient patient = new Patient(Firstname, Lastname, Address, ContactNumber, Email);
        System.out.println(patient);
        this.model.patients.add(patient);
        System.out.println(model);
        PrintArea.setText(model.FormattedPatientString());
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
    private Button BackButton;
    @FXML
    private Label SceneLabel;
    @FXML
    private Label FirstName;
    @FXML
    private Label Lastname;
    @FXML
    private Label Address;
    @FXML
    private Label ContactNumber;
    @FXML
    private Label Email;
    @FXML
    private Button NextButton;
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
    private Button AddButton;
    @FXML
    private Label PrintArea;
}
