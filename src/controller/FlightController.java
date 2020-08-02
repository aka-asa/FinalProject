package controller;

import model.FlightModel;
import model.ManagerModel;
import view.FlightView;

public class FlightController implements Showable
{
    private FlightView flightView;

    public void show()
    {
        flightView = new FlightView();
        for (int i=0 ; i<FlightModel.getFlights().size() ; i++)
        {
            flightView.getTableView().getItems().add(FlightModel.getFlights().get(i));
        }
        flightView.getStage().setTitle("Show Flights");
        flightView.getStage().show();
    }

    public static int partition(int low, int high)
    {
        long pivot = FlightModel.getFlights().get(high).getId();
        int i = (low-1);
        for (int j=low ; j<high ; j++)
        {
            if (FlightModel.getFlights().get(j).getId() < pivot)
            {
                i++;
                FlightModel temp = FlightModel.getFlights().get(i);
                FlightModel.getFlights().set(i,FlightModel.getFlights().get(j));
                FlightModel.getFlights().set(j,temp);
            }
        }
        FlightModel temp = FlightModel.getFlights().get(i+1);
        FlightModel.getFlights().set(i+1,FlightModel.getFlights().get(high));
        FlightModel.getFlights().set(high,temp);

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
        int last = FlightModel.getFlights().size()-1 ;
        int mid = (first + last) / 2;
        while (first <= last)
        {
            if (FlightModel.getFlights().get(mid).getId() < key)
            {
                first = mid + 1;
            } else if (FlightModel.getFlights().get(mid).getId() == key)
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

    public FlightView getFlightView()
    {
        return flightView;
    }

    public void setFlightView(FlightView flightView)
    {
        this.flightView = flightView;
    }
}
