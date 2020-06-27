package controller;

import view.FlightView;

public class FlightController implements Showable
{
    private FlightView flightView;

    public void show()
    {
        flightView = new FlightView();
        flightView.getStage().show();
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
