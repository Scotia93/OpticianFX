package com.example.optician;

import java.util.Date;

// Class representing the Optician
public class Optician
{
    public String Firstname;
    public String Lastname;
    public String Address;
    public String ContactNumber;
    public String Email;
    public Date StartDate;
    public int RoomNumber;
    public int OpticianID;
    private static int opticianIDInstances = 0;
    private static int opticianEndDate;



//    Constructor for optician class
    public Optician(String Firstname, String Lastname, String Address, String ContactNumber, String Email, Date StartDate, int RoomNumber)
    {
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Address = Address;
        this.ContactNumber = ContactNumber;
        this.Email = Email;
        this.StartDate = StartDate;
        this.RoomNumber = RoomNumber;
        OpticianID();


    }

    public void OpticianID()
    {
        // The static variable starts off valued at 1, and with each new instance is incremented by 1.
        Optician.opticianIDInstances++;
        // opticianID is set to the current value of the static variable
        OpticianID = opticianIDInstances;
    }
// Getters
    public String getFirstname()
    {
        return Firstname;
    }
    public String getLastname()
    {
        return Lastname;
    }
    public String getAddress()
    {
        return Address;
    }
    public String getContactNumber()
    {
        return Address;
    }
    public String getEmail()
    {
        return Email;
    }
    public Date getStartDate()
    {
        return StartDate;
    }
    public int getRoomNumber()
    {
        return RoomNumber;
    }
// Setters

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
    public void setContactNumber(String contactNumber)
    {
        ContactNumber = contactNumber;
    }
    public void setEmail(String email)
    {
        Email = email;
    }
    public void setStartDate(Date startDate)
    {
        StartDate = startDate;
    }
    public void setRoomNumber(int roomNumber)
    {
        RoomNumber = roomNumber;
    }

    @Override
    public String toString()
    {
        return "Optician{" +
                "name='" + Firstname + '\'' +
                '}';
    }
}
