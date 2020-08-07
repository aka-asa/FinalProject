package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.AirportView;

public class AirportController
{
    private AirportView airportView;

    public AirportController ()
    {
        airportView = new AirportView();
        initJfxButton();
        initJfxButton2();
        airportView.getStage().show();
    }

    public void initJfxButton()
    {
        airportView.getJfxButton().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                switch (airportView.getChoiceBox().getValue())
                {
                    case "":
                        MessageController messageController = new MessageController("Please choose an option!");
                        break;

                    case "Manager Or Super Admin":
                        airportView.getStage().close();
                        ManagerController managerController = new ManagerController();
                        managerController.showLoginMenu();
                        break;

                    case "Employee":
                        airportView.getStage().close();
                        EmployeeController employeeController = new EmployeeController();
                        employeeController.showLoginMenu();
                        break;

                    case "Passenger":
                        airportView.getStage().close();
                        PassengerController passengerController = new PassengerController();
                        passengerController.showLoginMenu();
                        break;

                    default :
                        break;
                }

            }
        });
    }

    public void initJfxButton2()
    {
        airportView.getJfxButton2().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                airportView.getStage().close();
            }
        });
    }

    public AirportView getAirportView()
    {
        return airportView;
    }

    public void setAirportView(AirportView airportView)
    {
        this.airportView = airportView;
    }
}
