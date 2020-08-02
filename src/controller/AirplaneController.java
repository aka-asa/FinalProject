package controller;

import model.AirplaneModel;
import model.PassengerModel;
import view.AirplaneView;

public class AirplaneController implements Showable
{
    private AirplaneView airplaneView;

    public void show()
    {
        airplaneView = new AirplaneView();
        for (int i=0; i<AirplaneModel.getAirplanes().size() ; i++)
        {
            airplaneView.getTableView().getItems().add(AirplaneModel.getAirplanes().get(i));
        }
        airplaneView.getStage().setTitle("Show Airplanes");
        airplaneView.getStage().show();
    }

    public static int partition(int low, int high)
    {
        long pivot = AirplaneModel.getAirplanes().get(high).getId();
        int i = (low-1);
        for (int j=low ; j<high ; j++)
        {
            if (AirplaneModel.getAirplanes().get(j).getId() < pivot)
            {
                i++;
                AirplaneModel temp = AirplaneModel.getAirplanes().get(i);
                AirplaneModel.getAirplanes().set(i,AirplaneModel.getAirplanes().get(j));
                AirplaneModel.getAirplanes().set(j,temp);
            }
        }
        AirplaneModel temp = AirplaneModel.getAirplanes().get(i+1);
        AirplaneModel.getAirplanes().set(i+1,AirplaneModel.getAirplanes().get(high));
        AirplaneModel.getAirplanes().set(high,temp);

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
        int last = AirplaneModel.getAirplanes().size()-1 ;
        int mid = (first + last) / 2;
        while (first <= last)
        {
            if (AirplaneModel.getAirplanes().get(mid).getId() < key)
            {
                first = mid + 1;
            } else if (AirplaneModel.getAirplanes().get(mid).getId() == key)
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

    public AirplaneView getAirplaneView()
    {
        return airplaneView;
    }

    public void setAirplaneView(AirplaneView airplaneView)
    {
        this.airplaneView = airplaneView;
    }
}
