package controller;

import model.PassengerModel;
import model.TicketModel;
import view.TicketView;

public class TicketController implements Showable
{
    private TicketView ticketView;

    public void show()
    {
        ticketView = new TicketView();
        for (int i=0 ; i<TicketModel.getTickets().size() ; i++)
        {
            ticketView.getTableView().getItems().add(TicketModel.getTickets().get(i));
        }
        ticketView.getStage().setTitle("Show Tickets");
        ticketView.getStage().show();
    }

    public static int partition(int low, int high)
    {
        long pivot = TicketModel.getTickets().get(high).getId();
        int i = (low-1);
        for (int j=low ; j<high ; j++)
        {
            if (TicketModel.getTickets().get(j).getId() < pivot)
            {
                i++;
                TicketModel temp = TicketModel.getTickets().get(i);
                TicketModel.getTickets().set(i,TicketModel.getTickets().get(j));
                TicketModel.getTickets().set(j,temp);
            }
        }
        TicketModel temp = TicketModel.getTickets().get(i+1);
        TicketModel.getTickets().set(i+1,TicketModel.getTickets().get(high));
        TicketModel.getTickets().set(high,temp);

        return i+1;
    }

    public static void sort(int low, int high)
    {
        if (low < high)
        {
            int pi = partition(low, high);
            sort(low, pi-1);
            sort(pi+1, high);
        }
    }

    public static int search(int key)
    {
        int first = 0;
        int last = TicketModel.getTickets().size()-1 ;
        int mid = (first + last) / 2;
        while (first <= last)
        {
            if (TicketModel.getTickets().get(mid).getId() < key)
            {
                first = mid + 1;
            } else if (TicketModel.getTickets().get(mid).getId() == key)
            {
                return mid;
            } else
            {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        return -1;
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
