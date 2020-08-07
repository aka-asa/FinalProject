package model;

import java.util.ArrayList;

public class TicketModel
{
    private long id;
    private static long idGenerator = 400000;
    private long price;
    private long penaltyOfCancellation;
    private static ArrayList <TicketModel> tickets = new ArrayList<TicketModel>();
    private static ArrayList <TicketModel> usedTickets = new ArrayList<TicketModel>();

    public TicketModel(long price, long penaltyOfCancellation)
    {
        idGenerator++;
        id = idGenerator;
        this.price = price;
        this.penaltyOfCancellation = penaltyOfCancellation;
    }

    public static long getIdGenerator()
    {
        return idGenerator;
    }

    public static void setIdGenerator(long idGenerator)
    {
        TicketModel.idGenerator = idGenerator;
    }

    public static ArrayList<TicketModel> getTickets()
    {
        return tickets;
    }

    public static void setTickets(ArrayList<TicketModel> tickets)
    {
        TicketModel.tickets = tickets;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public long getPrice()
    {
        return price;
    }

    public void setPrice(long price)
    {
        this.price = price;
    }

    public long getPenaltyOfCancellation()
    {
        return penaltyOfCancellation;
    }

    public void setPenaltyOfCancellation(long penaltyOfCancellation)
    {
        this.penaltyOfCancellation = penaltyOfCancellation;
    }

    public static ArrayList<TicketModel> getUsedTickets()
    {
        return usedTickets;
    }

    public static void setUsedTickets(ArrayList<TicketModel> usedTickets)
    {
        TicketModel.usedTickets = usedTickets;
    }
}

