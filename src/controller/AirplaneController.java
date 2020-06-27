package controller;

import view.AirplaneView;

public class AirplaneController implements Showable
{
    private AirplaneView airplaneView;

    public void show()
    {
        airplaneView = new AirplaneView();
        airplaneView.getStage().show();
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
