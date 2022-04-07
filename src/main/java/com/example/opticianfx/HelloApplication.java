package com.example.opticianfx;

import com.example.optician.OpticianModel;
import com.example.optician.Patient;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {

    private OpticianModel model = new OpticianModel();
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader welcomeLoader = new FXMLLoader(getClass().getResource("Welcome.fxml"));
        Parent root = welcomeLoader.load();
        WelcomeFXController welcomeFxController = welcomeLoader.getController();
        welcomeFxController.initModel(this.model);
        Scene scene = new Scene(root);
        stage.setTitle("Welcome!");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("GCU.png")));
        stage.setResizable(true);
        stage.setScene(scene);
        stage.show();
    }

    private void passModels() throws IOException {
        FXMLLoader patientloader = new FXMLLoader(getClass().getResource("Patient.fxml"));
        patientloader.load();
        PatientController patientcontroller = patientloader.getController();
        patientcontroller.initModel(this.model);
    }

    public static void main(String[] args) {
        launch();
    }
}