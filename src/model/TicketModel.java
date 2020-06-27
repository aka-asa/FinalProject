package model;

import java.util.ArrayList;

public class TicketModel
{
    private long id;
    private long price;
    private long penaltyOfCancellation;
    public static ArrayList <TicketModel> tickets = new ArrayList<TicketModel>();

    public TicketModel(long id, long price, long penaltyOfCancellation)
    {
        this.id = id;
        this.price = price;
        this.penaltyOfCancellation = penaltyOfCancellation;
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


}

