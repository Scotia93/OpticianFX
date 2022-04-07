package com.example.optician;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Appointment
{
    public Date date;
    public int duration;
    public String service;
    public Optician optician;
//    Constructor for class Appointment
    public Appointment(Date date, int duration, String service, Optician optician)
    {
        this.date = date;
        this.duration = duration;
        this.service = service;
        this.optician = optician;
    }
//    Getter Methods
    public Optician getOptician()
    {
        return optician;
    }
    public int getDuration()
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
                ", optician=" + optician +
                '}';
    }
}
