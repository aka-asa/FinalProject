package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class FlightModel
{
    private long id;
    private static long idGenerator = 600000;
    private AirplaneModel airplane;
    private TicketModel ticket;
    private String origin;
    private String destination;
    private LocalDate date;
    private String time;
    private int numberOfSoldTickets;
    private double flightTime;
    public enum FlightCondition {SCHEDULED,ARRIVED,INAIR};
    private static FlightCondition flightCondition;
    private static ArrayList<FlightModel> flights = new ArrayList<FlightModel>();

    public FlightModel(AirplaneModel airplane, TicketModel ticket, String origin, String destination, LocalDate date, String time, int numberOfSoldTickets, double flightTime)
    {
        idGenerator++;
        id = idGenerator;
        this.airplane = airplane;
        this.ticket = ticket;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.time = time;
        this.numberOfSoldTickets = numberOfSoldTickets;
        this.flightTime = flightTime;
        this.flightCondition = FlightCondition.SCHEDULED;
    }

    public static long getIdGenerator()
    {
        return idGenerator;
    }

    public static void setIdGenerator(long idGenerator)
    {
        FlightModel.idGenerator = idGenerator;
    }

    public static ArrayList<FlightModel> getFlights()
    {
        return flights;
    }

    public static void setFlights(ArrayList<FlightModel> flights)
    {
        FlightModel.flights = flights;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public AirplaneModel getAirplane()
    {
        return airplane;
    }

    public void setAirplane(AirplaneModel airplane)
    {
        this.airplane = airplane;
    }

    public TicketModel getTicket()
    {
        return ticket;
    }

    public void setTicket(TicketModel ticket)
    {
        this.ticket = ticket;
    }

    public String getOrigin()
    {
        return origin;
    }

    public void setOrigin(String origin)
    {
        this.origin = origin;
    }

    public String getDestination()
    {
        return destination;
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public String getTime()
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public int getNumberOfSoldTickets()
    {
        return numberOfSoldTickets;
    }

    public void setNumberOfSoldTickets(int numberOfSoldTickets)
    {
        this.numberOfSoldTickets = numberOfSoldTickets;
    }

    public double getFlightTime()
    {
        return flightTime;
    }

    public void setFlightTime(double flightTime)
    {
        this.flightTime = flightTime;
    }

    public static FlightCondition getFlightCondition()
    {
        return flightCondition;
    }

    public static void setFlightCondition(FlightCondition flightCondition)
    {
        FlightModel.flightCondition = flightCondition;
    }
}
