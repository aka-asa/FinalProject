package model;

import java.util.ArrayList;

public class AirplaneModel
{
    private long id;
    private int numberOfSeats;
    private ArrayList <FlightModel> listOfFlights = new ArrayList<FlightModel>();
    private static ArrayList <AirplaneModel> airplanes = new ArrayList<AirplaneModel>();

    public AirplaneModel(long id,int numberOfSeats)
    {
        this.id = id;
        this.numberOfSeats = numberOfSeats;
    }

    public static ArrayList<AirplaneModel> getAirplanes()
    {
        return airplanes;
    }

    public static void setAirplanes(ArrayList<AirplaneModel> airplanes)
    {
        AirplaneModel.airplanes = airplanes;
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

    public ArrayList<FlightModel> getListOfFlights()
    {
        return listOfFlights;
    }

    public void setListOfFlights(ArrayList<FlightModel> listOfFlights)
    {
        this.listOfFlights = listOfFlights;
    }
}
