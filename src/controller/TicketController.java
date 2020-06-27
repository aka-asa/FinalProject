package controller;

import view.TicketView;

public class TicketController implements Showable
{
    private TicketView ticketView;

    public void show()
    {
        ticketView = new TicketView();
        ticketView.getStage().show();
    }

    public TicketView getTicketView()
    {
        return ticketView;
    }

    public void setTicketView(TicketView ticketView)
    {
        this.ticketView = ticketView;
    }

}
