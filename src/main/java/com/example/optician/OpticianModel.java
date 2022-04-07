package com.example.optician;

import java.util.ArrayList;
import java.util.Date;

public class OpticianModel
{
    public ArrayList<Patient> patients;

    public OpticianModel()
    {
        patients = new ArrayList<Patient>();
    }

    public static void main(String[] args)
    {
        OpticianModel model = new OpticianModel();
        Patient patient = new Patient("Scott",

                "Adams", "31 Craigpark Drive", "07446965944", "scottadams@gmail.com");
        Optician optician = new Optician ("Andrew","Allan","10 Glasgow Road","01419461234","gcuoptician@ac.uk",new Date() ,1);


        //register patient
        model.patients.add(patient);
        System.out.println(model.patients);

        // make initial appointment
        patient.makeFirstAppointment(new Date(),10, "Check up", optician);
        System.out.println(model.patients);

        // come back for another appointment
        patient.makeAdditionalAppointment(new Date(),10, "Eye Test", optician);
        System.out.println(model.patients);

        // finish treatment
        patient.finishTreatment();
        System.out.println(model.patients);
    }

    public String FormattedPatientString()
    {
        String formattedString = "";
        for(int i = 0; i < patients.size(); i++)
        {
            formattedString += patients.get(i).toString() + "\n";
        }
        return formattedString;

    }
}
