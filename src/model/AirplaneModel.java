package model;

import java.util.ArrayList;

public class AirplaneModel
{
    long id;
    int numberOfSeats;
    public static ArrayList<AirplaneModel> airplanes = new ArrayList<AirplaneModel>();

    public AirplaneModel(long id,int numberOfSeats)
    {
        this.id = id;
        this.numberOfSeats = numberOfSeats;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public int getNumberOfSeats()
    {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats)
    {
        this.numberOfSeats = numberOfSeats;
    }
}
