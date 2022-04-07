package com.example.optician;
import java.util.Date;

// Class representing optician patient
public class Patient
{
    public String Firstname;
    public String Lastname;
    public String Address;
    public String ContactNumber;
    public String Email;
    public Appointment appointment;
    public String TreatmentStatus;
//Patient constructor
    public Patient(String firstname, String lastname, String address, String contactNumber, String email)
    {
        this.Firstname = firstname;
        this.Lastname = lastname;
        this.Address = address;
        this.ContactNumber = contactNumber;
        this.Email = email;
        this.TreatmentStatus = "Not Started";
    }




    // Method to make initial appointment
    public void makeFirstAppointment(Date date, int duration, String service, Optician optician)
    {
        if (this.appointment == null)
        {
            this.appointment = new Appointment(date,duration,service,optician);
            this.TreatmentStatus = "Pending";
        }
        else
        {
            System.out.println("Patient already has an appointment");
        }
    }

//     Method to Make additional appointments
    public void makeAdditionalAppointment(Date date, int duration, String service, Optician optician)
    {
        this.appointment = new Appointment(date,duration,service,optician);
        this.TreatmentStatus = "Ongoing";
    }

//    Method to finish treatment
    public void finishTreatment()
    {
        this.appointment = null;
        this.TreatmentStatus = "Complete";
    }
    @Override
    public String toString()
    {
        return "Patient{" +
                "name='" + Firstname + " " + Lastname + '\'' +
                ", appointment=" + appointment +
                ", TreatmentStatus='" + TreatmentStatus + '\'' +
                '}';
    }

    public void setFirstname(String firstname)
    {
        Firstname = firstname;
    }
    public void setLastname(String lastname)
    {
        Lastname = lastname;
    }
    public void setAddress(String address)
    {
        Address = address;
    }
    public void setEmail(String email)
    {
        Email = email;
    }
    public void setContactNumber(String contactNumber)
    {
        ContactNumber = contactNumber;
    }
}
