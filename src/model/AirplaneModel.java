package model;

import java.util.ArrayList;

public class AirplaneModel
{
    private long id;
    private static long idGenerator = 500000;
    private int numberOfSeats;
    private ArrayList <FlightModel> listOfFlights = new ArrayList<FlightModel>();
    private static ArrayList <AirplaneModel> airplanes = new ArrayList<AirplaneModel>();

    public AirplaneModel(int numberOfSeats)
    {
        idGenerator++;
        id = idGenerator;
        this.numberOfSeats = numberOfSeats;
    }

    public static long getIdGenerator()
    {
        return idGenerator;
    }

    public static void setIdGenerator(long idGenerator)
    {
        AirplaneModel.idGenerator = idGenerator;
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
