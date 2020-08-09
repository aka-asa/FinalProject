import controller.*;
import javafx.application.Application;
import javafx.stage.Stage;
import model.*;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Application
{
    public void start(Stage primaryStage) throws Exception
    {

//read from file
        try
        {
            FileReader fileReader = new FileReader("File.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String[] strings;
            String string;
            ArrayList <Integer> arrayList = new ArrayList<>();
            ArrayList <Integer> arrayList2 = new ArrayList<>();
            int j=0;
            while ((string=bufferedReader.readLine())!=null)
            {
                if ((j == 1)||(j == 3))
                    strings = string.split("[$]");
                else
                {
                    strings = string.split(" ");
                }
                if (!(strings[0].equals("")))
                {

                    if (j == 0)
                    {
                        AirplaneModel.setIdGenerator(Long.parseLong(strings[0]));
                        EmployeeModel.setIdGenerator(Long.parseLong(strings[1]));
                        FlightModel.setIdGenerator(Long.parseLong(strings[2]));
                        ManagerModel.setIdGenerator(Long.parseLong(strings[3]));
                        PassengerModel.setIdGenerator(Long.parseLong(strings[4]));
                        TicketModel.setIdGenerator(Long.parseLong(strings[5]));
                        ManagerController.setCurrentPolicy(Integer.parseInt(strings[6]));
                    }
                    if (j == 1)
                    {
                        for (int i = 0; i < strings.length; i++)
                        {
                            ManagerModel.getReports().add(strings[i]);
                        }
                    }
                    if (j == 2)
                    {
                        for (int i = 0; i < strings.length; i+=10)
                        {
                            ManagerModel managerModel = new ManagerModel(strings[i+1],strings[i+2],strings[i+3],strings[i+4],strings[i+5],strings[i+6]);
                            managerModel.setId(Long.parseLong(strings[i]));
                            managerModel.setPhoneNumber(strings[i+7]);
                            managerModel.setSalary(Long.parseLong(strings[i+8]));
                            managerModel.setSecurityAnswer(strings[i+9]);
                            ManagerModel.getManagers().add(managerModel);
                            ManagerModel.setIdGenerator(ManagerModel.getIdGenerator()-1);
                        }
                    }
                    if (j == 3)
                    {
                        for (int i = 0; i < strings.length; i++)
                        {
                               ManagerModel.getCriticsAndSuggestions().add(strings[i]);
                        }
                    }
                    if (j == 4)
                    {
                        for (int i = 0; i < strings.length; i+=10)
                        {
                            EmployeeModel employeeModel = new EmployeeModel(strings[i+1],strings[i+2],strings[i+3],strings[i+4],strings[i+5],strings[i+6]);
                            employeeModel.setId(Long.parseLong(strings[i]));
                            employeeModel.setPhoneNumber(strings[i+7]);
                            employeeModel.setSalary(Long.parseLong(strings[i+8]));
                            employeeModel.setSecurityAnswer(strings[i+9]);
                            EmployeeModel.getEmployees().add(employeeModel);
                            EmployeeModel.setIdGenerator(EmployeeModel.getIdGenerator()-1);
                        }
                    }
                    if (j == 5)
                    {
                        for (int i = 0; i < strings.length; i+=3)
                        {
                            TicketModel ticketModel = new TicketModel(Long.parseLong(strings[i+1]),Long.parseLong(strings[i+2]));
                            ticketModel.setId(Long.parseLong(strings[i]));
                            TicketModel.getTickets().add(ticketModel);
                            TicketModel.setIdGenerator(TicketModel.getIdGenerator()-1);
                        }
                    }
                    if (j == 6)
                    {
                        for (int i = 0; i < strings.length; i+=3)
                        {
                            TicketModel ticketModel = new TicketModel(Long.parseLong(strings[i+1]),Long.parseLong(strings[i+2]));
                            ticketModel.setId(Long.parseLong(strings[i]));
                            TicketModel.getUsedTickets().add(ticketModel);
                            TicketModel.setIdGenerator(TicketModel.getIdGenerator()-1);
                        }
                    }
                    if (j == 7)
                    {
                        int l = 0;
                        for ( ; l < strings.length;)
                        {
                            PassengerModel passengerModel = new PassengerModel(strings[l+1],strings[l+2],strings[l+3],strings[l+4],strings[l+5]);
                            passengerModel.setId(Long.parseLong(strings[l]));
                            passengerModel.setCredit(Long.parseLong(strings[l+6]));
                            passengerModel.setPhoneNumber(strings[l+7]);
                            passengerModel.setSecurityAnswer(strings[l+8]);
                            int i=0 ;
                            for (; i<Integer.parseInt(strings[l+9]) ; i++)
                            {
                                passengerModel.getTickets().add(TicketModel.getTickets().get(TicketController.search(Integer.parseInt(strings[l+9+i+1]))));
                            }
                            PassengerModel.getPassengers().add(passengerModel);
                            PassengerModel.setIdGenerator(PassengerModel.getIdGenerator()-1);
                            l += (Integer.parseInt(strings[l+9])+10);
                        }
                    }
                    if (j == 8)
                    {
                        int l = 0 ;
                        for (; l < strings.length;)
                        {
                            AirplaneModel airplaneModel = new AirplaneModel(Integer.parseInt(strings[l+1]));
                            arrayList.add(Integer.parseInt(strings[l+2]));
                            int i=0 ;
                            for ( ; i<Integer.parseInt(strings[l+2]) ; i++)
                            {
                                arrayList.add(Integer.parseInt(strings[l+2+i+1]));
                            }
                            airplaneModel.setId(Long.parseLong(strings[l]));
                            AirplaneModel.getAirplanes().add(airplaneModel);
                            AirplaneModel.setIdGenerator(AirplaneModel.getIdGenerator()-1);
                            l += (Integer.parseInt(strings[l+2]+3));
                        }
                    }
                    if (j == 9)
                    {
                        int l = 0;
                        for (; l < strings.length;)
                        {
                            String [] parts5 = strings[l+5].split("-");
                            LocalDate date = LocalDate.of(Integer.parseInt(parts5[0]),Integer.parseInt(parts5[1]),Integer.parseInt(parts5[2]));
                            FlightModel flightModel = new FlightModel(null,null,strings[l+3],strings[l+4],date,strings[l+6],Integer.parseInt(strings[l+7]),Double.parseDouble(strings[l+8]));
                            arrayList2.add(Integer.parseInt(strings[l+1]));
                            arrayList2.add(Integer.parseInt(strings[l+2]));
                            arrayList2.add(Integer.parseInt(strings[l+10]));
                            int i=0 ;
                            for ( ;i<Integer.parseInt(strings[l+10]) ; i++)
                            {
                                arrayList2.add(Integer.parseInt(strings[l+10+i+1]));
                            }
                            flightModel.setId(Long.parseLong(strings[l]));
                            if (strings[l+9].equals("SCHEDULED"))
                                flightModel.setFlightCondition(FlightModel.FlightCondition.SCHEDULED);
                            else if (strings[l+9].equals("INAIR"))
                                flightModel.setFlightCondition(FlightModel.FlightCondition.INAIR);
                            else if (strings[l+9].equals("ARRIVED"))
                                flightModel.setFlightCondition(FlightModel.FlightCondition.ARRIVED);
                            FlightModel.getFlights().add(flightModel);
                            FlightModel.setIdGenerator(FlightModel.getIdGenerator()-1);
                            l += Integer.parseInt(strings[l+10]+11);
                        }
                    }


                }
                j++;
            }

            int m = 0;
            for (int i=0 ; i<FlightModel.getFlights().size() ; i++)
            {
                FlightModel.getFlights().get(i).setAirplane(AirplaneModel.getAirplanes().get(AirplaneController.search(arrayList2.get(m))));
                FlightModel.getFlights().get(i).setTicket(TicketModel.getTickets().get(TicketController.search(arrayList2.get(m+1))));
                int k=0;
                for (; k<arrayList2.get(m+2) ; k++)
                {
                    FlightModel.getFlights().get(i).getListOfPassengers().add(PassengerModel.getPassengers().get(PassengerController.search(arrayList2.get(m+2+k+1))));
                }
                m += 3+arrayList2.get(m+2);
            }

            int n=0;
            for (int i=0 ; i<AirplaneModel.getAirplanes().size() ; i++)
            {
                int o=0;
                for (; o<arrayList.get(n) ; o++)
                {
                    AirplaneModel.getAirplanes().get(i).getListOfFlights().add(FlightModel.getFlights().get(FlightController.search(arrayList.get(n+o+1))));
                }
                n += 1+arrayList.get(n);
            }


        }
        catch (IOException e)
        {
            MessageController messageController = new MessageController("There was an error reading the file!");
        }

        ManagerModel managerModel = new ManagerModel("Arya","Samimi","aryasa","1","aryasa@outlook.com","Iran");
        managerModel.setId(1);
        managerModel.setSecurityAnswer("khavari");
        managerModel.setSalary(1000);
        managerModel.setPhoneNumber("09171111111");
        ManagerModel.getManagers().add(managerModel);

        AirportController airportController = new AirportController();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}

