package com.example.optician;
import java.util.Date;

public class Appointment
{
    public Date date;
    public String duration;
    public String service;

//    Constructor for class Appointment
    public Appointment(Date date, String duration, String service)
    {
        this.date = date;
        this.duration = duration;
        this.service = service;

    }


    //    Getter Methods

    public String getDuration()
    {
        return duration;
    }
    public String getService()
    {
        return service;
    }
    public Date getDate()
    {
        return date;
    }
    @Override
    public String toString()
    {
        return "Appointment{" +
                "date=" + date +
                ", duration=" + duration +
                ", service='" + service + '\'' +
                '}';
    }
}
