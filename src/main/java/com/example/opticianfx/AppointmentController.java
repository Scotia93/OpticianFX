package com.example.opticianfx;

import com.example.optician.Appointment;
import com.example.optician.Optician;
import com.example.optician.OpticianModel;
import com.example.optician.Patient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class AppointmentController
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
//        root = FXMLLoader.load(getClass().getResource("Optician.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        stage.setTitle("Welcome!");
        stage.setScene(scene);
        stage.show();
    }

    public void BookAppointment(ActionEvent event)
    {
        System.out.println(textService.getText());
        String duration = textDuration.getText();
        String service = textService.getText();
        String Optician = textOptician.getText();
        // Optician optician = new Optician();

        Patient patient = model.patients.get(0);
        patient.makeFirstAppointment(new Date(),duration,service);

        LocalDate myDate = myDatePicker.getValue();
        String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));


        PrintArea.setText("Appointment booked");
    }

    public void BookAdditionalAppointment(ActionEvent event)
    {
        System.out.println(textService.getText());
        String duration = textDuration.getText();
        String service = textService.getText();
        String Optician = textOptician.getText();
        // Optician optician = new Optician();

        Patient patient = model.patients.get(0);
        patient.makeAdditionalAppointment(new Date(),duration,service);

        LocalDate myDate = myDatePicker.getValue();
        String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));


        PrintArea.setText("Appointment booked");
    }

    public void getDate(ActionEvent event)
    {
        LocalDate myDate = myDatePicker.getValue();
        String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        myLabel.setText(myFormattedDate);
    }

    @FXML
    private DatePicker myDatePicker;
    @FXML
    private Label myLabel;
    @FXML
    private Button HomeButton;
    @FXML
    private Label PrintArea;
    @FXML
    private TextField textService;
    @FXML
    private TextField textDuration;
    @FXML
    private TextField textOptician;
    @FXML
    private Button Book;
    @FXML
    private Button ExtraAppointment;


    public void initModel(OpticianModel model) {
        this.model = model;
    }


}
