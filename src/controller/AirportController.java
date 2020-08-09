package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.*;
import view.AirportView;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
                //write to file
                try
                {
                    FileWriter fileWriter = new FileWriter("File.txt");
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    String string = "";

                    string = AirplaneModel.getIdGenerator()+" "+EmployeeModel.getIdGenerator()+" "+FlightModel.getIdGenerator()+" "+ManagerModel.getIdGenerator()+" "+PassengerModel.getIdGenerator()+" "+TicketModel.getIdGenerator()+" "+ManagerController.getCurrentPolicy();
                    bufferedWriter.write(string);
                    string = "";
                    bufferedWriter.newLine();

                    for (int i=0 ; i<ManagerModel.getReports().size() ; i++)
                    {
                        string = string+ManagerModel.getReports().get(i)+"$";
                    }
                    bufferedWriter.write(string);
                    string = "";
                    bufferedWriter.newLine();

                    for (int i = 0; i< ManagerModel.getManagers().size() ; i++)
                    {
                        string = string+ManagerModel.getManagers().get(i).getId()+" "+ManagerModel.getManagers().get(i).getName()+" "+ManagerModel.getManagers().get(i).getLastName()+" "+ManagerModel.getManagers().get(i).getUsername()+" "+ManagerModel.getManagers().get(i).getPassword()+" "+ManagerModel.getManagers().get(i).getEmail()+" "+ManagerModel.getManagers().get(i).getAddress()+" "+ManagerModel.getManagers().get(i).getPhoneNumber()+" "+ManagerModel.getManagers().get(i).getSalary()+" "+ManagerModel.getManagers().get(i).getSecurityAnswer()+" ";
                    }
                    string = string.trim();
                    bufferedWriter.write(string);
                    string = "";
                    bufferedWriter.newLine();

                    for (int i=0 ; i<ManagerModel.getCriticsAndSuggestions().size() ; i++)
                    {
                        string = string+ManagerModel.getCriticsAndSuggestions().get(i)+"$";
                    }
                    bufferedWriter.write(string);
                    string = "";
                    bufferedWriter.newLine();

                    for (int i = 0; i< EmployeeModel.getEmployees().size() ; i++)
                    {
                        string = string+EmployeeModel.getEmployees().get(i).getId()+" "+EmployeeModel.getEmployees().get(i).getName()+" "+EmployeeModel.getEmployees().get(i).getLastName()+" "+EmployeeModel.getEmployees().get(i).getUsername()+" "+EmployeeModel.getEmployees().get(i).getPassword()+" "+EmployeeModel.getEmployees().get(i).getEmail()+" "+EmployeeModel.getEmployees().get(i).getAddress()+" "+EmployeeModel.getEmployees().get(i).getPhoneNumber()+" "+EmployeeModel.getEmployees().get(i).getSalary()+" "+EmployeeModel.getEmployees().get(i).getSecurityAnswer()+" ";
                    }
                    string = string.trim();
                    bufferedWriter.write(string);
                    string = "";
                    bufferedWriter.newLine();

                    for (int i = 0; i< TicketModel.getTickets().size() ; i++)
                    {
                        string = string+TicketModel.getTickets().get(i).getId()+" "+TicketModel.getTickets().get(i).getPrice()+" "+TicketModel.getTickets().get(i).getPenaltyOfCancellation()+" ";
                    }
                    string = string.trim();
                    bufferedWriter.write(string);
                    string = "";
                    bufferedWriter.newLine();

                    for (int i=0 ; i<TicketModel.getUsedTickets().size() ; i++)
                    {
                        string = string+TicketModel.getUsedTickets().get(i).getId()+" "+TicketModel.getUsedTickets().get(i).getPrice()+" "+TicketModel.getUsedTickets().get(i).getPenaltyOfCancellation()+" ";
                    }
                    string = string.trim();
                    bufferedWriter.write(string);
                    string = "";
                    bufferedWriter.newLine();

                    for (int i = 0; i< PassengerModel.getPassengers().size() ; i++)
                    {
                        string = string+PassengerModel.getPassengers().get(i).getId()+" "+PassengerModel.getPassengers().get(i).getName()+" "+PassengerModel.getPassengers().get(i).getLastName()+" "+PassengerModel.getPassengers().get(i).getUsername()+" "+PassengerModel.getPassengers().get(i).getPassword()+" "+PassengerModel.getPassengers().get(i).getEmail()+" "+PassengerModel.getPassengers().get(i).getCredit()+" "+PassengerModel.getPassengers().get(i).getPhoneNumber()+" "+PassengerModel.getPassengers().get(i).getSecurityAnswer()+" "+PassengerModel.getPassengers().get(i).getTickets().size()+" ";
                        for (int k=0 ; k<PassengerModel.getPassengers().get(i).getTickets().size() ; k++)
                        {
                            string = string+PassengerModel.getPassengers().get(i).getTickets().get(k).getId()+" ";
                        }
                    }

                    string = string.trim();
                    bufferedWriter.write(string);
                    string = "";
                    bufferedWriter.newLine();

                    for (int i = 0; i< AirplaneModel.getAirplanes().size() ; i++)
                    {
                        string = string+AirplaneModel.getAirplanes().get(i).getId()+" "+AirplaneModel.getAirplanes().get(i).getNumberOfSeats()+" "+AirplaneModel.getAirplanes().get(i).getListOfFlights().size()+" ";
                        for (int j=0 ; j<AirplaneModel.getAirplanes().get(i).getListOfFlights().size() ; j++)
                        {
                            string = string+AirplaneModel.getAirplanes().get(i).getListOfFlights().get(j).getId()+" ";
                        }
                    }
                    string = string.trim();
                    bufferedWriter.write(string);
                    string = "";
                    bufferedWriter.newLine();

                    for (int i=0 ; i<FlightModel.getFlights().size() ; i++)
                    {
                        string = string+FlightModel.getFlights().get(i).getId()+" "+FlightModel.getFlights().get(i).getAirplane().getId()+" "+FlightModel.getFlights().get(i).getTicket().getId()+" "+FlightModel.getFlights().get(i).getOrigin()+" "+FlightModel.getFlights().get(i).getDestination()+" "+FlightModel.getFlights().get(i).getDate()+" "+FlightModel.getFlights().get(i).getTime()+" "+FlightModel.getFlights().get(i).getNumberOfSoldTickets()+" "+FlightModel.getFlights().get(i).getFlightTime()+" "+ FlightModel.getFlights().get(i).getFlightCondition()+" "+FlightModel.getFlights().get(i).getListOfPassengers().size()+" ";
                        for (int j=0 ; j<FlightModel.getFlights().get(i).getListOfPassengers().size() ; j++)
                        {
                            string = string+FlightModel.getFlights().get(i).getListOfPassengers().get(j).getId()+" ";
                        }
                    }
                    string = string.trim();
                    bufferedWriter.write(string);

                    bufferedWriter.close();
                }
                catch (IOException e)
                {
                    MessageController messageController = new MessageController("There was an error writing on file!");
                }
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
