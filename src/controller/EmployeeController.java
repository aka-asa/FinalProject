package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import model.*;
import view.EmployeeView;
import view.ManagerView;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Formatter;

public class EmployeeController implements Showable
{
    private EmployeeView employeeView;
    private int index;
    private int selectedRowIndex;
//    private static ArrayList <TicketModel> usedTickets = new ArrayList<TicketModel>();

    public EmployeeController ()
    {
        employeeView = new EmployeeView();
        initJfxButton3();
        initJfxButton4();
        initJfxButton8();
        initJfxButton9();
        initJfxButton15();
        initJfxButton16();
        initJfxButton17();
        initJfxButton18();
        initJfxButton19();
        initJfxButton20();
        initJfxButton21();
        initJfxButton22();
        initJfxButton31();
        initJfxButton32();
        initJfxButton33();
        initJfxButton34();
        initJfxButton35();
        initJfxButton36();
        initJfxButton37();
        initJfxButton38();
        initJfxButton39();
        initJfxButton40();
        initJfxButton70();
        initJfxButton72();
        initJfxButton74();
        initJfxButton75();
        initJfxButton300();
        initJfxButton301();
        initJfxButton544();
        initJfxButton545();
        initJfxButton606();
        initJfxButton605();
    }

    public void showLoginMenu ()
    {
        employeeView.getStage().setScene(employeeView.getLoginScene());
        employeeView.getStage().setTitle("Employee Login Menu");
        employeeView.getStage().setMinWidth(750);
        employeeView.getStage().setMinHeight(580);
        employeeView.getStage().show();
    }

    public void show()
    {
        employeeView = new EmployeeView();
        for (int i=0 ; i<EmployeeModel.getEmployees().size() ; i++)
        {
            employeeView.getTableView().getItems().add(EmployeeModel.getEmployees().get(i));
        }
        employeeView.getStage().setScene(employeeView.getShowEmployeesScene());
        employeeView.getStage().setTitle("Show Employees");
        employeeView.getStage().setMinWidth(600);
        employeeView.getStage().setMinHeight(400);
        employeeView.getStage().show();
    }

    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public int getSelectedRowIndex()
    {
        return selectedRowIndex;
    }

    public void setSelectedRowIndex(int selectedRowIndex)
    {
        this.selectedRowIndex = selectedRowIndex;
    }

    public EmployeeView getEmployeeView()
    {
        return employeeView;
    }

    public void setEmployeeView(EmployeeView employeeView)
    {
        this.employeeView = employeeView;
    }

    public static int partition(int low, int high)
    {
        long pivot = EmployeeModel.getEmployees().get(high).getId();
        int i = (low-1);
        for (int j=low ; j<high ; j++)
        {
            if (EmployeeModel.getEmployees().get(j).getId() < pivot)
            {
                i++;
                EmployeeModel temp = EmployeeModel.getEmployees().get(i);
                EmployeeModel.getEmployees().set(i,EmployeeModel.getEmployees().get(j));
                EmployeeModel.getEmployees().set(j,temp);
            }
        }
        EmployeeModel temp = EmployeeModel.getEmployees().get(i+1);
        EmployeeModel.getEmployees().set(i+1,EmployeeModel.getEmployees().get(high));
        EmployeeModel.getEmployees().set(high,temp);

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
        int last = EmployeeModel.getEmployees().size()-1 ;
        int mid = (first + last) / 2;
        while (first <= last)
        {
            if (EmployeeModel.getEmployees().get(mid).getId() < key)
            {
                first = mid + 1;
            } else if (EmployeeModel.getEmployees().get(mid).getId() == key)
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

//edit a employee
    public void initJfxButton3()
    {
        employeeView.getJfxButton3().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (employeeView.getJfxTextField6().getText().isEmpty()||employeeView.getJfxTextField7().getText().isEmpty()||employeeView.getJfxTextField8().getText().isEmpty() || employeeView.getJfxTextField9().getText().isEmpty()||employeeView.getJfxTextField10().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(employeeView.getJfxTextField6().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for name section!");
                }
                else if (!(employeeView.getJfxTextField7().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for last name section!");
                }
                else if (!(employeeView.getJfxTextField8().getText().matches("\\w{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for username section!");
                }
                else if (!(employeeView.getJfxTextField9().getText().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")))
                {
                    MessageController messageController = new MessageController("Wrong email address,please try again!");
                }
                else if (employeeView.getJfxTextField9().getLength()>20)
                {
                    MessageController messageController = new MessageController("Email address is too long,please try again!");
                }
                else if (!(employeeView.getJfxTextField10().getText().matches("[0]\\d{10}||[9][8]\\d{10}")))
                {
                    MessageController messageController = new MessageController("You can only use 11 numbers starting with 0 or 12 numbers starting with 98 for phone number section");
                }
                else
                {
                    int emailError = 0;
                    int phoneNumberError = 0;
                    String phoneNumber;
                    if (employeeView.getJfxTextField10().getText().charAt(0) == '0')
                        phoneNumber = employeeView.getJfxTextField10().getText().replaceFirst("0", "98");
                    else
                    {
                        phoneNumber = employeeView.getJfxTextField10().getText();
                    }

                    for (int i=0 ; i<EmployeeModel.getEmployees().size() ; i++)
                    {
                        if (i == index)
                        {
                            continue;
                        }
                        else if (employeeView.getJfxTextField9().getText().equals(EmployeeModel.getEmployees().get(i).getEmail()))
                        {
                            emailError = 1;
                            break;
                        }
                    }
                    for (int i=0 ; i<EmployeeModel.getEmployees().size() ; i++)
                    {
                        if (i == index)
                        {
                            continue;
                        }
                        else if (phoneNumber.equals(EmployeeModel.getEmployees().get(i).getPhoneNumber()))
                        {
                            phoneNumberError = 1;
                            break;
                        }
                    }

                    if (emailError == 1)
                    {
                        MessageController messageController = new MessageController("There is a employee with this email address!");
                    }
                    else if (phoneNumberError == 1)
                    {
                        MessageController messageController = new MessageController("There is a employee with this phone number!");
                    }

                    else
                    {
                        EmployeeModel employeeModel = new EmployeeModel(employeeView.getJfxTextField6().getText(), employeeView.getJfxTextField7().getText(), employeeView.getJfxTextField8().getText(), PassengerModel.getPassengers().get(index).getPassword(), employeeView.getJfxTextField9().getText(), employeeView.getJfxTextField13().getText());
                        employeeModel.setSalary(EmployeeModel.getEmployees().get(index).getSalary());
                        employeeModel.setId(EmployeeModel.getEmployees().get(index).getId());
                        employeeModel.setPhoneNumber(employeeView.getJfxTextField10().getText());
                        EmployeeModel.setIdGenerator(EmployeeModel.getIdGenerator() - 1);
                        EmployeeModel.getEmployees().set(index, employeeModel);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        LocalDateTime localDateTime = LocalDateTime.now();
                        ManagerModel.getReports().add("Employee with "+EmployeeModel.getEmployees().get(index).getId()+" as id edited his/her profile at "+dtf.format(localDateTime));
                        employeeView.getStage().close();
                        employeeView.getJfxTextField6().clear();
                        employeeView.getJfxTextField7().clear();
                        employeeView.getJfxTextField8().clear();
                        employeeView.getJfxTextField9().clear();
                        employeeView.getJfxTextField10().clear();
                        employeeView.getJfxTextField13().clear();
                        employeeView.getStage().setScene(employeeView.getMainMenuScene());
                        employeeView.getStage().setTitle("Employee Main Menu");
                        employeeView.getStage().setMinWidth(570);
                        employeeView.getStage().setMinHeight(270);
                        employeeView.getStage().show();
                    }
                }
            }
        });
    }

//exit edit menu
    public void initJfxButton4()
    {
        employeeView.getJfxButton4().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                employeeView.getStage().close();
                employeeView.getJfxTextField6().clear();
                employeeView.getJfxTextField7().clear();
                employeeView.getJfxTextField8().clear();
                employeeView.getJfxTextField9().clear();
                employeeView.getJfxTextField10().clear();
                employeeView.getJfxTextField13().clear();
                employeeView.getStage().setScene(employeeView.getMainMenuScene());
                employeeView.getStage().setTitle("Employee Main Menu");
                employeeView.getStage().setMinWidth(570);
                employeeView.getStage().setMinHeight(270);
                employeeView.getStage().show();
            }
        });

    }

//login as employee
    public void initJfxButton70()
    {
        employeeView.getJfxButton70().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (employeeView.getJfxTextField70().getText().isEmpty()||employeeView.getJfxPasswordField70().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(employeeView.getJfxTextField70().getText().matches("\\d{1,7}")))
                {
                    MessageController messageController = new MessageController("Wrong id!");
                }
                else if ((employeeView.getJfxTextField70().getText().charAt(0) == '0')&&(employeeView.getJfxTextField70().getLength()>1))
                {
                    MessageController messageController = new MessageController("Wrong id!");
                }
                else if (!(employeeView.getJfxPasswordField70().getText().matches("\\S{1,13}")))
                {
                    MessageController messageController = new MessageController("Wrong password!");
                }
                else
                {
                    index = search(Integer.parseInt(employeeView.getJfxTextField70().getText()));
                    if (index == -1)
                    {
                        MessageController messageController = new MessageController("Sorry id is wrong,please try again.");
                    } else if (!(employeeView.getJfxPasswordField70().getText().equals(EmployeeModel.getEmployees().get(index).getPassword())))
                    {
                        MessageController messageController = new MessageController("Sorry password is wrong,please try again.");
                    } else
                    {
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        LocalDateTime localDateTime = LocalDateTime.now();
                        ManagerModel.getReports().add("Employee with "+EmployeeModel.getEmployees().get(index).getId()+" as id has logged in at "+dtf.format(localDateTime));
                        employeeView.getStage().close();
                        employeeView.getJfxTextField70().clear();
                        employeeView.getJfxPasswordField70().clear();
                        employeeView.getStage().setScene(employeeView.getMainMenuScene());
                        employeeView.getStage().setTitle("Employee Main Menu");
                        employeeView.getStage().setMinWidth(570);
                        employeeView.getStage().setMinHeight(270);
                        employeeView.getStage().show();
                    }
                }
            }
        });
    }

//exit login menu
    public void initJfxButton72()
    {
        employeeView.getJfxButton72().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                employeeView.getStage().close();
                employeeView.getJfxTextField70().clear();
                employeeView.getJfxPasswordField70().clear();
                AirportController airportController = new AirportController();
            }
        });
    }

//select an ability
    public void initJfxButton8()
    {
        employeeView.getJfxButton8().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                switch (employeeView.getChoiceBox().getValue())
                {
                    case "":
                        MessageController messageController = new MessageController("Please choose an option!");
                        break;

                    case "Edit account":
                        if (EmployeeModel.getEmployees().get(index).getId() == 1)
                        {
                            MessageController messageController2 = new MessageController("Sorry , this section cannot be used by super admin!");
                        }
                        else
                        {
                            employeeView.getStage().close();
                            employeeView.getJfxTextField6().setText(EmployeeModel.getEmployees().get(index).getName());
                            employeeView.getJfxTextField7().setText(EmployeeModel.getEmployees().get(index).getLastName());
                            employeeView.getJfxTextField8().setText(EmployeeModel.getEmployees().get(index).getUsername());
                            employeeView.getJfxTextField9().setText(EmployeeModel.getEmployees().get(index).getEmail());
                            employeeView.getJfxTextField10().setText(EmployeeModel.getEmployees().get(index).getPhoneNumber());
                            employeeView.getJfxTextField13().setText(EmployeeModel.getEmployees().get(index).getAddress());
                            employeeView.getStage().setScene(employeeView.getEditAllScene());
                            employeeView.getStage().setTitle("Edit Menu");
                            employeeView.getStage().setMinWidth(750);
                            employeeView.getStage().setMinHeight(580);
                            employeeView.getStage().show();
                        }
                        break;

                    case "Change password":
                        employeeView.getStage().close();
                        employeeView.getStage().setScene(employeeView.getChangePasswordScene());
                        employeeView.getStage().setTitle("Change Password Menu");
                        employeeView.getStage().setMinWidth(750);
                        employeeView.getStage().setMinHeight(580);
                        employeeView.getStage().show();
                        break;

                    case "Manage flights":
                        employeeView.getStage().close();
                        refreshFlightCondition();
                        employeeView.getTableView5().getItems().clear();
                        for (int i=0; i< FlightModel.getFlights().size() ; i++)
                        {
                            employeeView.getTableView5().getItems().add(FlightModel.getFlights().get(i));
                        }
                        employeeView.getStage().setScene(employeeView.getFlightScene());
                        employeeView.getStage().setTitle("Flight Menu");
                        employeeView.getStage().setMinWidth(1000);
                        employeeView.getStage().setMinHeight(580);
                        employeeView.getStage().show();
                        break;

                    case "Manage tickets":
                        employeeView.getStage().close();
                        employeeView.getTableView3().getItems().clear();
                        for (int i=0 ; i< TicketModel.getTickets().size() ; i++)
                        {
                            employeeView.getTableView3().getItems().add(TicketModel.getTickets().get(i));
                        }
                        employeeView.getStage().setScene(employeeView.getTicketScene());
                        employeeView.getStage().setTitle("Ticket Menu");
                        employeeView.getStage().setMinWidth(750);
                        employeeView.getStage().setMinHeight(580);
                        employeeView.getStage().show();
                        break;

                    case "Send critics and suggestions":
                        employeeView.getStage().close();
                        employeeView.getStage().setScene(employeeView.getCriticsAndSuggestionsScene());
                        employeeView.getStage().setTitle("Employee Critics And Suggestions Menu");
                        employeeView.getStage().setMinWidth(750);
                        employeeView.getStage().setMinHeight(580);
                        employeeView.getStage().show();
                        break;

                    case "Forgot Password":
                        employeeView.getStage().close();
                        employeeView.getStage().setScene(employeeView.getForgotPasswordScene());
                        employeeView.getStage().setTitle("Forgot Password Menu");
                        employeeView.getStage().setMinWidth(750);
                        employeeView.getStage().setMinHeight(580);
                        employeeView.getStage().show();
                        break;

                    default :
                        break;
                }

            }
        });
    }

//exit main menu
    public void initJfxButton9()
    {
        employeeView.getJfxButton9().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                employeeView.getStage().close();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime localDateTime = LocalDateTime.now();
                ManagerModel.getReports().add("Employee with "+EmployeeModel.getEmployees().get(index).getId()+" as id quited the program at "+dtf.format(localDateTime));
                employeeView.getStage().setScene(employeeView.getLoginScene());
                employeeView.getStage().setTitle("Login Menu");
                employeeView.getStage().setMinWidth(750);
                employeeView.getStage().setMinHeight(580);
                employeeView.getStage().show();
            }
        });
    }

//change password menu
    public void initJfxButton74()
    {
        employeeView.getJfxButton74().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (employeeView.getJfxPasswordField71().getText().isEmpty()||employeeView.getJfxPasswordField72().getText().isEmpty()||employeeView.getJfxPasswordField73().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(employeeView.getJfxPasswordField72().getText().equals(employeeView.getJfxPasswordField73().getText())))
                {
                    MessageController messageController = new MessageController("Passwords are not same!");
                }
                else if (!((employeeView.getJfxPasswordField71().getText().matches("\\S+"))&&(employeeView.getJfxPasswordField72().getText().matches("\\S{1,13}"))))
                {
                    MessageController messageController = new MessageController("You can not use whitespace for password section!");
                }
                else if (!(employeeView.getJfxPasswordField71().getText().equals(EmployeeModel.getEmployees().get(index).getPassword())))
                {
                    MessageController messageController = new MessageController("Wrong old password please try again!");
                }
                else
                {
                    EmployeeModel.getEmployees().get(index).setPassword(employeeView.getJfxPasswordField72().getText());
                    employeeView.getJfxPasswordField71().clear();
                    employeeView.getJfxPasswordField72().clear();
                    employeeView.getJfxPasswordField73().clear();
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("Employee with "+EmployeeModel.getEmployees().get(index).getId()+" as id changed his/her password with at "+dtf.format(localDateTime));
                    employeeView.getStage().close();
                    employeeView.getStage().setScene(employeeView.getMainMenuScene());
                    employeeView.getStage().setTitle("Employee Main Menu");
                    employeeView.getStage().setMinWidth(570);
                    employeeView.getStage().setMinHeight(270);
                    employeeView.getStage().show();
                }
            }
        });
    }

//exit change password menu
    public void initJfxButton75()
    {
        employeeView.getJfxButton75().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                employeeView.getStage().close();
                employeeView.getJfxPasswordField71().clear();
                employeeView.getJfxPasswordField72().clear();
                employeeView.getJfxPasswordField73().clear();
                employeeView.getStage().setScene(employeeView.getMainMenuScene());
                employeeView.getStage().setTitle("Employee Main Menu");
                employeeView.getStage().setMinWidth(570);
                employeeView.getStage().setMinHeight(270);
                employeeView.getStage().show();
            }
        });
    }

//add a ticket menu
    public void initJfxButton15()
    {
        employeeView.getJfxButton15().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                employeeView.getStage().close();
                employeeView.getStage().setScene(employeeView.getTicketRegistrationScene());
                employeeView.getStage().setTitle("Ticket Registration menu");
                employeeView.getStage().setMinWidth(750);
                employeeView.getStage().setMinHeight(580);
                employeeView.getStage().show();
            }
        });
    }

//add a ticket
    public void initJfxButton19()
    {
        employeeView.getJfxButton19().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (employeeView.getJfxTextField23().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(employeeView.getJfxTextField23().getText().matches("\\d{1,7}")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for Price section");
                }
                else if ((employeeView.getJfxTextField23().getText().charAt(0) == '0')&&(employeeView.getJfxTextField23().getLength()>1))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for Price section!");
                }
//                else if (!(employeeView.getJfxTextField24().getText().matches("\\d{1,7}")))
//                {
//                    MessageController messageController = new MessageController("You can only use whole numbers for Penalty Of Cancellation section");
//                }
//                else if ((employeeView.getJfxTextField24().getText().charAt(0) == '0')&&(employeeView.getJfxTextField24().getLength()>1))
//                {
//                    MessageController messageController = new MessageController("You can only use whole numbers for Penalty Of Cancellation section!");
//                }

                else
                {
                    long price = 0;
                    long penaltyOfCancellation = 0;
                    if (ManagerController.getCurrentPolicy() == 0)
                    {
                        price = Long.parseLong(employeeView.getJfxTextField23().getText());
                        penaltyOfCancellation = ((price*20)/100);
                    }
                    else if (ManagerController.getCurrentPolicy() == 1)
                    {
                        price = ((Long.parseLong(employeeView.getJfxTextField23().getText())*120)/100);
                        penaltyOfCancellation = ((price*20)/100);
                    }
                    else if (ManagerController.getCurrentPolicy() == 2)
                    {
                        price = ((Long.parseLong(employeeView.getJfxTextField23().getText())*90)/100);
                        penaltyOfCancellation = ((price*20)/100);
                    }
                    TicketModel ticketModel = new TicketModel(price,penaltyOfCancellation );
                    TicketModel.getTickets().add(ticketModel);
                    TicketController.sort(0, TicketModel.getTickets().size() - 1);
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("Employee with "+EmployeeModel.getEmployees().get(index).getId()+" as id added ticket with "+ticketModel.getId()+" as id at "+dtf.format(localDateTime));
                    employeeView.getStage().close();
                    employeeView.getJfxTextField23().clear();
                    employeeView.getTableView3().getItems().clear();
                    for (int i=0 ; i<TicketModel.getTickets().size() ; i++)
                    {
                        employeeView.getTableView3().getItems().add(TicketModel.getTickets().get(i));
                    }
                    employeeView.getStage().setScene(employeeView.getTicketScene());
                    employeeView.getStage().setTitle("Ticket Menu");
                    employeeView.getStage().setMinWidth(750);
                    employeeView.getStage().setMinHeight(580);
                    employeeView.getStage().show();
                    MessageController messageController = new MessageController("The ID is : ("+ticketModel.getId()+")");
                }

            }
        });
    }

//exit add a ticket menu
    public void initJfxButton20()
    {
        employeeView.getJfxButton20().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                employeeView.getStage().close();
                employeeView.getJfxTextField23().clear();
                employeeView.getTableView3().getItems().clear();
                for (int i=0; i< TicketModel.getTickets().size() ; i++)
                {
                    employeeView.getTableView3().getItems().add(TicketModel.getTickets().get(i));
                }
                employeeView.getStage().setScene(employeeView.getTicketScene());
                employeeView.getStage().setTitle("Ticket Menu");
                employeeView.getStage().setMinWidth(750);
                employeeView.getStage().setMinHeight(580);
                employeeView.getStage().show();
            }
        });
    }

//edit a ticket menu
    public void initJfxButton16()
    {
        employeeView.getJfxButton16().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (employeeView.getTableView3().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row!");
                }
                else
                {
                    TicketModel ticketModel = employeeView.getTableView3().getSelectionModel().getSelectedItem();
                    selectedRowIndex = TicketController.search((int) ticketModel.getId());
                    employeeView.getStage().close();
                    employeeView.getJfxTextField25().setText(Long.toString(TicketModel.getTickets().get(selectedRowIndex).getPrice()));
                    employeeView.getStage().setScene(employeeView.getTicketEditScene());
                    employeeView.getStage().setTitle("Ticket edit Menu");
                    employeeView.getStage().setMinWidth(750);
                    employeeView.getStage().setMinHeight(580);
                    employeeView.getStage().show();
                }
            }
        });
    }

//edit a ticket
    public void initJfxButton21()
    {
        employeeView.getJfxButton21().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (employeeView.getJfxTextField25().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(employeeView.getJfxTextField25().getText().matches("\\d{1,7}")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for Price section");
                }
                else if ((employeeView.getJfxTextField25().getText().charAt(0) == '0')&&(employeeView.getJfxTextField25().getLength()>1))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for Price section!");
                }
//                else if (!(employeeView.getJfxTextField26().getText().matches("\\d{1,7}")))
//                {
//                    MessageController messageController = new MessageController("You can only use whole numbers for Penalty Of Cancellation section");
//                }
//                else if ((employeeView.getJfxTextField26().getText().charAt(0) == '0')&&(employeeView.getJfxTextField26().getLength()>1))
//                {
//                    MessageController messageController = new MessageController("You can only use whole numbers for Penalty Of Cancellation section!");
//                }
                else
                {
                    long price = 0;
                    long penaltyOfCancellation = 0;
                    if (ManagerController.getCurrentPolicy() == 0)
                    {
                        price = Long.parseLong(employeeView.getJfxTextField25().getText());
                        penaltyOfCancellation = ((price*20)/100);
                    }
                    else if (ManagerController.getCurrentPolicy() == 1)
                    {
                        price = ((Long.parseLong(employeeView.getJfxTextField25().getText())*120)/100);
                        penaltyOfCancellation = ((price*20)/100);
                    }
                    else if (ManagerController.getCurrentPolicy() == 2)
                    {
                        price = ((Long.parseLong(employeeView.getJfxTextField25().getText())*90)/100);
                        penaltyOfCancellation = ((price*20)/100);
                    }
                    TicketModel ticketModel = new TicketModel(price,penaltyOfCancellation );
                    ticketModel.setId(TicketModel.getTickets().get(selectedRowIndex).getId());
                    TicketModel.getTickets().set(selectedRowIndex,ticketModel);
                    TicketModel.setIdGenerator(TicketModel.getIdGenerator()-1);
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("Employee with "+EmployeeModel.getEmployees().get(index).getId()+" as id edited ticket with "+ticketModel.getId()+" as id at "+dtf.format(localDateTime));
                    employeeView.getStage().close();
                    employeeView.getJfxTextField25().clear();
                    employeeView.getTableView3().getItems().clear();
                    for ( int i=0; i<TicketModel.getTickets().size() ; i++)
                    {
                        employeeView.getTableView3().getItems().add(TicketModel.getTickets().get(i));
                    }
                    employeeView.getStage().setScene(employeeView.getTicketScene());
                    employeeView.getStage().setTitle("Ticket Menu");
                    employeeView.getStage().setMinWidth(750);
                    employeeView.getStage().setMinHeight(580);
                    employeeView.getStage().show();
                }

            }
        });
    }

//exit edit a ticket menu
    public void initJfxButton22()
    {
        employeeView.getJfxButton22().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                employeeView.getStage().close();
                employeeView.getJfxTextField25().clear();
                employeeView.getTableView3().getItems().clear();
                for (int i=0 ; i< TicketModel.getTickets().size() ; i++)
                {
                    employeeView.getTableView3().getItems().add(TicketModel.getTickets().get(i));
                }
                employeeView.getStage().setScene(employeeView.getTicketScene());
                employeeView.getStage().setTitle("Ticket Menu");
                employeeView.getStage().setMinWidth(750);
                employeeView.getStage().setMinHeight(580);
                employeeView.getStage().show();
            }
        });
    }

//delete a ticket
    public void initJfxButton17()
    {
        employeeView.getJfxButton17().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (employeeView.getTableView3().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row!");
                }
                else
                {
                    TicketModel ticketModel = employeeView.getTableView3().getSelectionModel().getSelectedItem();
                    for (int i=0 ; i<FlightModel.getFlights().size() ; i++)
                    {
                        if (FlightModel.getFlights().get(i).getTicket().getId() == ticketModel.getId())
                        {
                            FlightModel.getFlights().remove(i);
                            break;
                        }
                    }
                    for (int i=0 ; i<TicketModel.getUsedTickets().size() ; i++)
                    {
                        if (TicketModel.getUsedTickets().get(i).getId() == ticketModel.getId())
                        {
                            TicketModel.getUsedTickets().remove(i);
                            break;
                        }
                    }
                    TicketModel.getTickets().remove(TicketController.search((int) ticketModel.getId()));
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("Employee with "+EmployeeModel.getEmployees().get(index).getId()+" as id deleted ticket with "+ticketModel.getId()+" as id at "+dtf.format(localDateTime));
           //         employeeView.getStage().close();
                    employeeView.getTableView3().getItems().clear();
                    for (int i=0 ; i < TicketModel.getTickets().size(); i++)
                    {
                        employeeView.getTableView3().getItems().add(TicketModel.getTickets().get(i));
                    }
                    employeeView.getStage().setScene(employeeView.getTicketScene());
                    employeeView.getStage().setTitle("Ticket Menu");
                    employeeView.getStage().setMinWidth(750);
                    employeeView.getStage().setMinHeight(580);
                    employeeView.getStage().show();
                }
            }
        });
    }

//exit ticket menu
    public void initJfxButton18()
    {
        employeeView.getJfxButton18().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                employeeView.getStage().close();
                employeeView.getStage().setScene(employeeView.getMainMenuScene());
                employeeView.getStage().setTitle("Employee Main Menu");
                employeeView.getStage().setMinWidth(570);
                employeeView.getStage().setMinHeight(270);
                employeeView.getStage().show();
            }
        });
    }

//show flights of an airplane menu for add
    public void initJfxButton35()
    {
        employeeView.getJfxButton35().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (employeeView.getTableView6().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row from airplanes table!");
                } else
                {
                    AirplaneModel airplaneModel = employeeView.getTableView6().getSelectionModel().getSelectedItem();
                    selectedRowIndex = AirplaneController.search((int) airplaneModel.getId());
                    refreshFlightCondition ();
                    employeeView.getTableView8().getItems().clear();
                    for (int i = 0; i < AirplaneModel.getAirplanes().get(selectedRowIndex).getListOfFlights().size(); i++)
                    {
                        employeeView.getTableView8().getItems().add(AirplaneModel.getAirplanes().get(selectedRowIndex).getListOfFlights().get(i));
                    }
                    Stage stage2 = new Stage();
                    stage2.setScene(employeeView.getFlightsOfAirplaneScene());
                    stage2.setTitle("Flights Of Airplane");
                    employeeView.getStage().setMinWidth(600);
                    employeeView.getStage().setMinHeight(400);
                    stage2.show();
                }
            }
        });
    }

//show flights of an airplane menu for edit
    public void initJfxButton38()
    {
        employeeView.getJfxButton38().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (employeeView.getTableView9().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row from airplanes table!");
                } else
                {
                    AirplaneModel airplaneModel = employeeView.getTableView9().getSelectionModel().getSelectedItem();
                    selectedRowIndex = AirplaneController.search((int) airplaneModel.getId());
                    refreshFlightCondition ();
                    employeeView.getTableView8().getItems().clear();
                    for (int i = 0; i < AirplaneModel.getAirplanes().get(selectedRowIndex).getListOfFlights().size(); i++)
                    {
                        employeeView.getTableView8().getItems().add(AirplaneModel.getAirplanes().get(selectedRowIndex).getListOfFlights().get(i));
                    }
                    Stage stage2 = new Stage();
                    stage2.setScene(employeeView.getFlightsOfAirplaneScene());
                    stage2.setTitle("Flights of Airplane");
                    employeeView.getStage().setMinWidth(600);
                    employeeView.getStage().setMinHeight(400);
                    stage2.show();
                }
            }
        });
    }

//show flights of an airplane for manage menu
    public void initJfxButton544()
    {
        employeeView.getJfxButton544().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (employeeView.getTableView5().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row from table!");
                } else
                {
                    FlightModel flightModel = employeeView.getTableView5().getSelectionModel().getSelectedItem();
                    AirplaneModel airplaneModel = flightModel.getAirplane();
                    selectedRowIndex = AirplaneController.search((int) airplaneModel.getId());
                    refreshFlightCondition ();
                    employeeView.getTableView8().getItems().clear();
                    for (int i = 0; i < AirplaneModel.getAirplanes().get(selectedRowIndex).getListOfFlights().size(); i++)
                    {
                        employeeView.getTableView8().getItems().add(AirplaneModel.getAirplanes().get(selectedRowIndex).getListOfFlights().get(i));
                    }
                    Stage stage2 = new Stage();
                    stage2.setScene(employeeView.getFlightsOfAirplaneScene());
                    stage2.setTitle("Flights Of Airplane");
                    employeeView.getStage().setMinWidth(600);
                    employeeView.getStage().setMinHeight(400);
                    stage2.show();
                }
            }
        });
    }

//show passengers of a flight for manage menu
    public void initJfxButton545()
    {
        employeeView.getJfxButton545().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (employeeView.getTableView5().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row from airplanes table!");
                } else
                {
                    FlightModel flightModel = employeeView.getTableView5().getSelectionModel().getSelectedItem();
                    employeeView.getTableView400().getItems().clear();
                    for (int i = 0; i < flightModel.getListOfPassengers().size() ; i++)
                    {
                        employeeView.getTableView400().getItems().add(flightModel.getListOfPassengers().get(i));
                    }
                    Stage stage2 = new Stage();
                    stage2.setScene(employeeView.getFlightsPassengersScene());
                    stage2.setTitle("Flights passengers");
                    employeeView.getStage().setMinWidth(600);
                    employeeView.getStage().setMinHeight(400);
                    stage2.show();
                }
            }
        });
    }

//add a flight menu
    public void initJfxButton31()
    {
        employeeView.getJfxButton31().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                int t = 1;
                employeeView.getStage().close();
                employeeView.getTableView7().getItems().clear();

                for ( int i=0; i<TicketModel.getTickets().size() ; i++)
                {
                    t = 1;
                    int j=0;
                    for ( ; j<TicketModel.getUsedTickets().size() ; j++)
                    {
                        if (TicketModel.getTickets().get(i).getId() == TicketModel.getUsedTickets().get(j).getId())
                        {
                            t = 0;
                            break;
                        }
                    }
                    if (t == 1)
                        employeeView.getTableView7().getItems().add(TicketModel.getTickets().get(i));
                }
                refreshFlightCondition ();
                int u = 1;
                employeeView.getTableView6().getItems().clear();
                for ( int k=0; k<AirplaneModel.getAirplanes().size() ; k++)
                {
                    u = 1;
                    int n=0;
                    for (; n<FlightModel.getFlights().size() ; n++)
                    {
                        if ((FlightModel.getFlights().get(n).getAirplane().getId() == AirplaneModel.getAirplanes().get(k).getId())&&((FlightModel.getFlights().get(n).getFlightCondition().equals(FlightModel.FlightCondition.INAIR))||(FlightModel.getFlights().get(n).getFlightCondition().equals(FlightModel.FlightCondition.SCHEDULED))))
                        {
                            u = 0;
                            break;
                        }
                    }
                    if (u == 1)
                        employeeView.getTableView6().getItems().add(AirplaneModel.getAirplanes().get(k));
                }
                employeeView.getStage().setScene(employeeView.getFlightRegistrationScene());
                employeeView.getStage().setTitle("Flight Registration Menu");
                employeeView.getStage().setMinWidth(1000);
                employeeView.getStage().setMinHeight(600);
                employeeView.getStage().show();
            }
        });
    }

//add a flight
    public void initJfxButton36()
    {
        employeeView.getJfxButton36().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
//                String[] parts = new String[3];
//                String[] parts2 = new String[3];
                String[] parts3 = new String[2];
                String[] parts4 = new String[2];
//                if (employeeView.getJfxTextField31().getText().matches("\\d{4}[-]\\d{2}[-]\\d{2}"))
//                {
//                    LocalDate dateNow = LocalDate.now();
//                    String dateNowString = dateNow.toString();
//                    parts = dateNowString.split("-");
//                    for (int i = 1; i < 3; i++)
//                    {
//                        if (parts[i].charAt(0) == '0')
//                            parts[i] = Character.toString(parts[i].charAt(1));
//                    }
//                    parts2 = employeeView.getJfxTextField31().getText().split("-");
//                    for (int i = 1; i < 3; i++)
//                    {
//                        if (parts2[i].charAt(0) == '0')
//                            parts2[i] = Character.toString(parts2[i].charAt(1));
//                    }
//                }

                if (employeeView.getJfxTextField32().getText().matches("\\d{2}[:]\\d{2}"))
                {
                    Calendar cal = Calendar.getInstance();
                    Formatter fmt = new Formatter();
                    fmt.format("%tH:%tM", cal, cal);
                    parts3 = fmt.toString().split(":");
                    for (int i = 0; i < 2; i++)
                    {
                        if (parts3[i].charAt(0) == '0')
                            parts3[i] = Character.toString(parts3[i].charAt(1));
                    }
                    parts4 = employeeView.getJfxTextField32().getText().split(":");
                    for (int i = 0; i < 2; i++)
                    {
                        if (parts4[i].charAt(0) == '0')
                            parts4[i] = Character.toString(parts4[i].charAt(1));
                    }
                }

                LocalDate localDate = null;
                if (employeeView.getJfxTextField31().getText().matches("\\d{4}[-]\\d{2}[-]\\d{2}"))
                {
                    String[] parts = employeeView.getJfxTextField31().getText().split("-");
                    localDate = LocalDate.of(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                }

                if (employeeView.getTableView6().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row from airplane table!");
                }
                else if (employeeView.getTableView7().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row from ticket table!");
                }
                else if (employeeView.getJfxTextField29().getText().isEmpty()||employeeView.getJfxTextField30().getText().isEmpty()||employeeView.getJfxTextField31().getText().isEmpty()||employeeView.getJfxTextField32().getText().isEmpty()||employeeView.getJfxTextField33().getText().isEmpty()||employeeView.getJfxTextField34().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(employeeView.getJfxTextField29().getText().matches("\\w{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for Origin section!");
                }
                else if (!(employeeView.getJfxTextField30().getText().matches("\\w{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for Destination section!");
                }
                else if (!(employeeView.getJfxTextField31().getText().matches("\\d{4}[-]\\d{2}[-]\\d{2}")))
                {
                    MessageController messageController = new MessageController("Your date format should be YEAR-MONTH-DAY (write month and day with 0 if they are smaller than 10)!");
                }
                else if (!(employeeView.getJfxTextField32().getText().matches("\\d{2}[:]\\d{2}")))
                {
                    MessageController messageController = new MessageController("Your time format should be HOUR:MINUTE (Two-digit hour)!");
                }
                else if (localDate.isBefore(LocalDate.now()))
                {
                    MessageController messageController = new MessageController("Wrong date!");
                }
                else if ((Integer.parseInt(parts4[0])<0)||(Integer.parseInt(parts4[0])>23)||(Integer.parseInt(parts4[1])>59)||(Integer.parseInt(parts4[1])<0))
                {
                    MessageController messageController = new MessageController("Wrong time!");
                }
                else if ((LocalDate.now().isEqual(localDate))&&(!(Integer.parseInt(parts3[0])<Integer.parseInt(parts4[0]))))
                {
                    MessageController messageController = new MessageController("Wrong time!");
                }
                else if (!(employeeView.getJfxTextField33().getText().matches("\\d{1,7}")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for Number Of Sold Tickets section!");
                }
                else if ((employeeView.getJfxTextField33().getText().charAt(0) == '0')&&(employeeView.getJfxTextField33().getLength()>1))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for number of sold tickets section!");
                }
                else if (!(employeeView.getJfxTextField34().getText().matches("\\d{1,2}\\.\\d{1,2}")))
                {
                    MessageController messageController = new MessageController("You can only use numbers for Flight Time section (double format number)!");
                }
                else if (employeeView.getJfxTextField34().getText().charAt(0) == '0')
                {
                    MessageController messageController = new MessageController("You can only use double numbers for flight time section (bigger than 0)!");
                }
                else if ((Double.parseDouble(employeeView.getJfxTextField34().getText())>23.59))
                {
                    MessageController messageController = new MessageController("The flights time should be less than 24 hours!");
                }
                else
                {
                    AirplaneModel airplaneModel = employeeView.getTableView6().getSelectionModel().getSelectedItem();
                    TicketModel ticketModel = employeeView.getTableView7().getSelectionModel().getSelectedItem();
                    String [] parts5 = employeeView.getJfxTextField31().getText().split("-");
                    LocalDate date = LocalDate.of(Integer.parseInt(parts5[0]),Integer.parseInt(parts5[1]),Integer.parseInt(parts5[2]));
                    FlightModel flightModel = new FlightModel(airplaneModel,ticketModel,employeeView.getJfxTextField29().getText(),employeeView.getJfxTextField30().getText(),date,employeeView.getJfxTextField32().getText(),Integer.parseInt(employeeView.getJfxTextField33().getText()),Double.parseDouble(employeeView.getJfxTextField34().getText()));
                    FlightModel.getFlights().add(flightModel);
                    TicketModel.getUsedTickets().add(ticketModel);
                    AirplaneModel.getAirplanes().get(AirplaneController.search((int) airplaneModel.getId())).getListOfFlights().add(flightModel);
                    FlightController.sort(0, FlightModel.getFlights().size() - 1);
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("Employee with "+EmployeeModel.getEmployees().get(index).getId()+" as id added flight with "+flightModel.getId()+" as id at "+dtf.format(localDateTime));
                    employeeView.getStage().close();
                    employeeView.getJfxTextField29().clear();
                    employeeView.getJfxTextField30().clear();
                    employeeView.getJfxTextField31().clear();
                    employeeView.getJfxTextField32().clear();
                    employeeView.getJfxTextField33().clear();
                    employeeView.getJfxTextField34().clear();
                    employeeView.getTableView5().getItems().clear();
                    refreshFlightCondition ();
                    employeeView.getTableView5().getItems().clear();
                    for (int i=0 ; i<FlightModel.getFlights().size() ; i++)
                    {
                        employeeView.getTableView5().getItems().add(FlightModel.getFlights().get(i));
                    }
                    employeeView.getStage().setScene(employeeView.getFlightScene());
                    employeeView.getStage().setTitle("Flight Menu");
                    employeeView.getStage().setMinWidth(1000);
                    employeeView.getStage().setMinHeight(580);
                    employeeView.getStage().show();
                    MessageController messageController = new MessageController("The ID is : ("+flightModel.getId()+")");
                }

            }
        });
    }

//exit add a flight menu
    public void initJfxButton37()
    {
        employeeView.getJfxButton37().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                employeeView.getStage().close();
                refreshFlightCondition ();
                employeeView.getTableView5().getItems().clear();
                for (int i=0 ; i<FlightModel.getFlights().size() ; i++)
                {
                    employeeView.getTableView5().getItems().add(FlightModel.getFlights().get(i));
                }
                employeeView.getJfxTextField29().clear();
                employeeView.getJfxTextField30().clear();
                employeeView.getJfxTextField31().clear();
                employeeView.getJfxTextField32().clear();
                employeeView.getJfxTextField33().clear();
                employeeView.getJfxTextField34().clear();
                employeeView.getStage().setScene(employeeView.getFlightScene());
                employeeView.getStage().setTitle("Flight Menu");
                employeeView.getStage().setMinWidth(1000);
                employeeView.getStage().setMinHeight(580);
                employeeView.getStage().show();
            }
        });
    }

//edit a flight menu
    public void initJfxButton32()
    {
        employeeView.getJfxButton32().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (employeeView.getTableView5().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row!");
                }
                else
                {
                    int t = 1;
                    FlightModel flightModel = employeeView.getTableView5().getSelectionModel().getSelectedItem();
                    selectedRowIndex = FlightController.search((int) flightModel.getId());
                    employeeView.getStage().close();
                    employeeView.getTableView10().getItems().clear();
                    employeeView.getTableView10().getItems().add(FlightModel.getFlights().get(selectedRowIndex).getTicket());
                    for ( int i=0; i<TicketModel.getTickets().size() ; i++)
                    {
                        t = 1;
                        int j=0;
                        for ( ; j<TicketModel.getUsedTickets().size() ; j++)
                        {
                            if (TicketModel.getTickets().get(i).getId() == TicketModel.getUsedTickets().get(j).getId())
                            {
                                t = 0;
                                break;
                            }
                        }
                        if (t == 1)
                            employeeView.getTableView10().getItems().add(TicketModel.getTickets().get(i));
                    }
                    employeeView.getJfxTextField35().setText(FlightModel.getFlights().get(selectedRowIndex).getOrigin());
                    employeeView.getJfxTextField36().setText(FlightModel.getFlights().get(selectedRowIndex).getDestination());
                    employeeView.getJfxTextField37().setText(FlightModel.getFlights().get(selectedRowIndex).getDate().toString());
                    employeeView.getJfxTextField38().setText(FlightModel.getFlights().get(selectedRowIndex).getTime());
                    employeeView.getJfxTextField39().setText(Integer.toString(FlightModel.getFlights().get(selectedRowIndex).getNumberOfSoldTickets()));
                    employeeView.getJfxTextField40().setText(Double.toString(FlightModel.getFlights().get(selectedRowIndex).getFlightTime()));
                    employeeView.getTableView9().getItems().clear();
                    int u = 1;
                    employeeView.getTableView9().getItems().add(FlightModel.getFlights().get(selectedRowIndex).getAirplane());
                    for ( int k=0; k<AirplaneModel.getAirplanes().size() ; k++)
                    {
                        u = 1;
                        int n=0;
                        for (; n<FlightModel.getFlights().size() ; n++)
                        {
                            if ((FlightModel.getFlights().get(n).getAirplane().getId() == AirplaneModel.getAirplanes().get(k).getId())&&((FlightModel.getFlights().get(n).getFlightCondition().equals(FlightModel.FlightCondition.INAIR))||(FlightModel.getFlights().get(n).getFlightCondition().equals(FlightModel.FlightCondition.SCHEDULED))))
                            {
                                u = 0;
                                break;
                            }
                        }
                        if (u == 1)
                            employeeView.getTableView9().getItems().add(AirplaneModel.getAirplanes().get(k));
                    }
                    employeeView.getStage().setScene(employeeView.getFlightEditScene());
                    employeeView.getStage().setTitle("Flight Edit Menu");
                    employeeView.getStage().setMinWidth(1000);
                    employeeView.getStage().setMinHeight(600);
                    employeeView.getStage().show();
                }
            }
        });
    }

//edit a flight
    public void initJfxButton39()
    {
        employeeView.getJfxButton39().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
//                String[] parts = new String[3];
//                String[] parts2 = new String[3];
                String[] parts3 = new String[2];
                String[] parts4 = new String[2];
//                if (employeeView.getJfxTextField37().getText().matches("\\d{4}[-]\\d{2}[-]\\d{2}"))
//                {
//                    LocalDate dateNow = LocalDate.now();
//                    String dateNowString = dateNow.toString();
//                    parts = dateNowString.split("-");
//                    for (int i = 1; i < 3; i++)
//                    {
//                        if (parts[i].charAt(0) == '0')
//                            parts[i] = Character.toString(parts[i].charAt(1));
//                    }
//                    parts2 = employeeView.getJfxTextField37().getText().split("-");
//                    for (int i = 1; i < 3; i++)
//                    {
//                        if (parts2[i].charAt(0) == '0')
//                            parts2[i] = Character.toString(parts2[i].charAt(1));
//                    }
//                }

                if (employeeView.getJfxTextField38().getText().matches("\\d{2}[:]\\d{2}"))
                {
                    Calendar cal = Calendar.getInstance();
                    Formatter fmt = new Formatter();
                    fmt.format("%tH:%tM", cal, cal);
                    parts3 = fmt.toString().split(":");
                    for (int i = 0; i < 2; i++)
                    {
                        if (parts3[i].charAt(0) == '0')
                            parts3[i] = Character.toString(parts3[i].charAt(1));
                    }
                    parts4 = employeeView.getJfxTextField38().getText().split(":");
                    for (int i = 0; i < 2; i++)
                    {
                        if (parts4[i].charAt(0) == '0')
                            parts4[i] = Character.toString(parts4[i].charAt(1));
                    }
                }


                LocalDate localDate = null;
                if (employeeView.getJfxTextField37().getText().matches("\\d{4}[-]\\d{2}[-]\\d{2}"))
                {
                    String[] parts = employeeView.getJfxTextField37().getText().split("-");
                    localDate = LocalDate.of(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                }

                if (employeeView.getTableView9().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Select a row from airplanes table!");
                }
                else if (employeeView.getTableView10().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Select a row from tickets table!");
                }
                else if (employeeView.getJfxTextField35().getText().isEmpty() || employeeView.getJfxTextField36().getText().isEmpty() || employeeView.getJfxTextField37().getText().isEmpty() || employeeView.getJfxTextField38().getText().isEmpty() || employeeView.getJfxTextField39().getText().isEmpty() || employeeView.getJfxTextField40().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(employeeView.getJfxTextField35().getText().matches("\\w{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for Origin section!");
                }
                else if (!(employeeView.getJfxTextField36().getText().matches("\\w{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for Destination section!");
                }
                else if (!(employeeView.getJfxTextField37().getText().matches("\\d{4}[-]\\d{2}[-]\\d{2}")))
                {
                    MessageController messageController = new MessageController("Your date format should be YEAR-MONTH-DAY (write month and day with 0 if they are smaller than 10)!");
                }
                else if (!(employeeView.getJfxTextField38().getText().matches("\\d{2}[:]\\d{2}")))
                {
                    MessageController messageController = new MessageController("Your time format should be HOUR-MINUTE (Two-digit hour)!");
                }
                else if (localDate.isBefore(LocalDate.now()))
                {
                    MessageController messageController = new MessageController("Wrong date!");
                }
                else if ((Integer.parseInt(parts4[0])<0)||(Integer.parseInt(parts4[0])>23)||(Integer.parseInt(parts4[1])>59)||(Integer.parseInt(parts4[1])<0))
                {
                    MessageController messageController = new MessageController("Wrong time!");
                }
                else if ((LocalDate.now().isEqual(localDate))&&(!(Integer.parseInt(parts3[0])<Integer.parseInt(parts4[0]))))
                {
                    MessageController messageController = new MessageController("Wrong time!");
                }
                else if (!(employeeView.getJfxTextField39().getText().matches("\\d{1,7}")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for Number Of Sold Tickets section!");
                }
                else if ((employeeView.getJfxTextField39().getText().charAt(0) == '0')&&(employeeView.getJfxTextField39().getLength()>1))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for numbers of sold tickets section!");
                }
                else if (!(employeeView.getJfxTextField40().getText().matches("\\d{1,2}\\.\\d{1,2}")))
                {
                    MessageController messageController = new MessageController("You can only use numbers for Flight Time section (double format number)!");
                }
                else if (employeeView.getJfxTextField40().getText().charAt(0) == '0')
                {
                    MessageController messageController = new MessageController("You can only use double numbers for flight time section (bigger than 0)!");
                }
                else if ((Double.parseDouble(employeeView.getJfxTextField40().getText())>23.59))
                {
                    MessageController messageController = new MessageController("The flights time should be less than 24 hours!");
                }
                else
                {
                    AirplaneModel airplaneModel = employeeView.getTableView9().getSelectionModel().getSelectedItem();
                    TicketModel ticketModel = employeeView.getTableView10().getSelectionModel().getSelectedItem();
                    String[] parts5 = employeeView.getJfxTextField37().getText().split("-");
                    LocalDate date = LocalDate.of(Integer.parseInt(parts5[0]), Integer.parseInt(parts5[1]), Integer.parseInt(parts5[2]));
                    FlightModel flightModel = new FlightModel(airplaneModel, ticketModel, employeeView.getJfxTextField35().getText(), employeeView.getJfxTextField36().getText(), date, employeeView.getJfxTextField38().getText(), Integer.parseInt(employeeView.getJfxTextField39().getText()), Double.parseDouble(employeeView.getJfxTextField40().getText()));
                    flightModel.setId(FlightModel.getFlights().get(selectedRowIndex).getId());
                    FlightModel.setIdGenerator(FlightModel.getIdGenerator() - 1);

                    for ( int k = 0; k < FlightModel.getFlights().get(selectedRowIndex).getAirplane().getListOfFlights().size(); k++)
                    {
                        if (FlightModel.getFlights().get(selectedRowIndex).getAirplane().getListOfFlights().get(k).getId() == flightModel.getId())
                        {
                            FlightModel.getFlights().get(selectedRowIndex).getAirplane().getListOfFlights().remove(k);
                            break;
                        }
                    }

                    for ( int l = 0; l <TicketModel.getUsedTickets().size(); l++)
                    {
                        if (TicketModel.getUsedTickets().get(l).getId() == FlightModel.getFlights().get(FlightController.search((int) flightModel.getId())).getTicket().getId())
                        {
                            TicketModel.getUsedTickets().remove(l);
                            break;
                        }
                    }
                    FlightModel.getFlights().set(selectedRowIndex, flightModel);
                    TicketModel.getUsedTickets().add(ticketModel);
                    AirplaneModel.getAirplanes().get(AirplaneController.search((int) airplaneModel.getId())).getListOfFlights().add(flightModel);
                    FlightController.sort(0, FlightModel.getFlights().size() - 1);
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("Employee with "+EmployeeModel.getEmployees().get(index).getId()+" as id edited flight with "+flightModel.getId()+" as id at "+dtf.format(localDateTime));
                    employeeView.getStage().close();
                    employeeView.getJfxTextField35().clear();
                    employeeView.getJfxTextField36().clear();
                    employeeView.getJfxTextField37().clear();
                    employeeView.getJfxTextField38().clear();
                    employeeView.getJfxTextField39().clear();
                    employeeView.getJfxTextField40().clear();
                    refreshFlightCondition ();
                    employeeView.getTableView5().getItems().clear();
                    for (int i=0 ; i<FlightModel.getFlights().size() ; i++)
                    {
                        employeeView.getTableView5().getItems().add(FlightModel.getFlights().get(i));
                    }
                    employeeView.getTableView10().getItems().clear();
                    for (int j = 0; j < TicketModel.getTickets().size(); j++)
                    {
                        employeeView.getTableView10().getItems().add(TicketModel.getTickets().get(j));
                    }
                    employeeView.getStage().setScene(employeeView.getFlightScene());
                    employeeView.getStage().setTitle("Flight Menu");
                    employeeView.getStage().setMinWidth(1000);
                    employeeView.getStage().setMinHeight(580);
                    employeeView.getStage().show();

                }
            }
        });
    }

//exit edit a flight menu
    public void initJfxButton40()
    {
        employeeView.getJfxButton40().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                employeeView.getStage().close();
                refreshFlightCondition ();
                employeeView.getTableView5().getItems().clear();
                for (int i=0 ; i<FlightModel.getFlights().size() ; i++)
                {
                    employeeView.getTableView5().getItems().add(FlightModel.getFlights().get(i));
                }
                employeeView.getJfxTextField35().clear();
                employeeView.getJfxTextField36().clear();
                employeeView.getJfxTextField37().clear();
                employeeView.getJfxTextField38().clear();
                employeeView.getJfxTextField39().clear();
                employeeView.getJfxTextField40().clear();
                employeeView.getStage().setScene(employeeView.getFlightScene());
                employeeView.getStage().setTitle("Flight Menu");
                employeeView.getStage().setMinWidth(1000);
                employeeView.getStage().setMinHeight(580);
                employeeView.getStage().show();
            }
        });
    }

//delete a flight
    public void initJfxButton33()
    {
        employeeView.getJfxButton33().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (employeeView.getTableView5().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row!");
                }
                else
                {
                    FlightModel flightModel = employeeView.getTableView5().getSelectionModel().getSelectedItem();
                    for ( int k = 0; k < FlightModel.getFlights().get(FlightController.search((int) flightModel.getId())).getAirplane().getListOfFlights().size(); k++)
                    {
                        if (FlightModel.getFlights().get(FlightController.search((int) flightModel.getId())).getAirplane().getListOfFlights().get(k).getId() == flightModel.getId())
                        {
                            FlightModel.getFlights().get(FlightController.search((int) flightModel.getId())).getAirplane().getListOfFlights().remove(k);
                            break;
                        }
                    }
                    for ( int l = 0; l <TicketModel.getUsedTickets().size(); l++)
                    {
                        if (TicketModel.getUsedTickets().get(l).getId() == FlightModel.getFlights().get(FlightController.search((int) flightModel.getId())).getTicket().getId())
                        {
                            TicketModel.getUsedTickets().remove(l);
                            break;
                        }
                    }
                    FlightModel.getFlights().remove(FlightController.search((int) flightModel.getId()));
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("Employee with "+EmployeeModel.getEmployees().get(index).getId()+" as id deleted flight with "+flightModel.getId()+" as id at "+dtf.format(localDateTime));
                    //           employeeView.getStage().close();
                    refreshFlightCondition ();
                    employeeView.getTableView5().getItems().clear();
                    for (int i=0 ; i<FlightModel.getFlights().size() ; i++)
                    {
                        employeeView.getTableView5().getItems().add(FlightModel.getFlights().get(i));
                    }
                    employeeView.getStage().setScene(employeeView.getFlightScene());
                    employeeView.getStage().setTitle("Flight Menu");
                    employeeView.getStage().setMinWidth(1000);
                    employeeView.getStage().setMinHeight(580);
                    employeeView.getStage().show();
                }
            }
        });
    }

//exit flight menu
    public void initJfxButton34()
    {
        employeeView.getJfxButton34().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                employeeView.getStage().close();
                employeeView.getStage().setScene(employeeView.getMainMenuScene());
                employeeView.getStage().setTitle("Employee Main Menu");
                employeeView.getStage().setMinWidth(570);
                employeeView.getStage().setMinHeight(270);
                employeeView.getStage().show();
            }
        });
    }

//send critics and suggestions
    public void initJfxButton300()
    {
        employeeView.getJfxButton300().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (employeeView.getJfxTextArea300().getText().contains("$"))
                {
                    MessageController messageController = new MessageController("Sorry you cannot use ($)!");
                }
                else
                {
                    employeeView.getStage().close();
                    ManagerModel.getCriticsAndSuggestions().add(employeeView.getJfxTextArea300().getText());
                    employeeView.getJfxTextArea300().clear();
                    employeeView.getStage().setScene(employeeView.getMainMenuScene());
                    employeeView.getStage().setTitle("Employee Main Menu");
                    employeeView.getStage().setMinWidth(570);
                    employeeView.getStage().setMinHeight(270);
                    employeeView.getStage().show();
                }
            }
        });
    }

//exit critics and suggestions menu
    public void initJfxButton301()
    {
        employeeView.getJfxButton301().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                employeeView.getStage().close();
                employeeView.getJfxTextArea300().clear();
                employeeView.getStage().setScene(employeeView.getMainMenuScene());
                employeeView.getStage().setTitle("Employee Main Menu");
                employeeView.getStage().setMinWidth(570);
                employeeView.getStage().setMinHeight(270);
                employeeView.getStage().show();
            }
        });
    }

//exit forgot password menu
    public void initJfxButton606()
    {
        employeeView.getJfxButton606().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                employeeView.getStage().close();
                employeeView.getJfxTextField606().clear();
                employeeView.getStage().setScene(employeeView.getMainMenuScene());
                employeeView.getStage().setTitle("Employee Main Menu");
                employeeView.getStage().setMinWidth(570);
                employeeView.getStage().setMinHeight(270);
                employeeView.getStage().show();
            }
        });
    }

//forgot password menu
    public void initJfxButton605()
    {
        employeeView.getJfxButton605().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (!(employeeView.getJfxTextField606().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for this section!");
                }
                else if (!(employeeView.getJfxTextField606().getText().equals(EmployeeModel.getEmployees().get(index).getSecurityAnswer())))
                {
                    MessageController messageController = new MessageController("Answer is not true!");
                }
                else
                {
                    employeeView.getStage().close();
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("Employee with "+EmployeeModel.getEmployees().get(index).getId()+" as id got his password back at "+dtf.format(localDateTime));
                    employeeView.getJfxTextField606().clear();
                    employeeView.getStage().setScene(employeeView.getMainMenuScene());
                    employeeView.getStage().setTitle("Employee Main Menu");
                    employeeView.getStage().setMinWidth(570);
                    employeeView.getStage().setMinHeight(270);
                    employeeView.getStage().show();
                    MessageController messageController = new MessageController("youre password is : ("+EmployeeModel.getEmployees().get(index).getPassword()+") remember it this time!");
                }
            }
        });
    }

    public void refreshFlightCondition ()
    {
        for (int o=0 ; o<FlightModel.getFlights().size() ; o++)
        {
            String [] strings = FlightModel.getFlights().get(o).getTime().split(":");
            for (int i = 0; i < 2; i++)
            {
                if (strings[i].charAt(0) == '0')
                    strings[i] = Character.toString(strings[i].charAt(1));
            }
            String string = strings[0]+"."+strings[1];
            double startTime = Double.parseDouble(string);
            double endTime = Double.parseDouble(string) + FlightModel.getFlights().get(o).getFlightTime();

            Calendar cal = Calendar.getInstance();
            Formatter fmt = new Formatter();
            fmt.format("%tH:%tM", cal, cal);
            String [] strings2 = fmt.toString().split(":");
            for (int i = 0; i < 2; i++)
            {
                if (strings2[i].charAt(0) == '0')
                    strings2[i] = Character.toString(strings2[i].charAt(1));
            }
            String string2 = strings2[0]+"."+strings2[1];
            double time = Double.parseDouble(string2);

            if ((FlightModel.getFlights().get(o).getDate().isEqual(LocalDate.now()))&&(endTime<24))
            {
                if (endTime < time)
                    FlightModel.getFlights().get(o).setFlightCondition(FlightModel.FlightCondition.ARRIVED);
                else if (startTime > time)
                    FlightModel.getFlights().get(o).setFlightCondition(FlightModel.FlightCondition.SCHEDULED);
                else if ((startTime < time)&&(endTime > time))
                    FlightModel.getFlights().get(o).setFlightCondition(FlightModel.FlightCondition.INAIR);
            }
            else if ((FlightModel.getFlights().get(o).getDate().isEqual(LocalDate.now()))&&(endTime>23.59))
            {
                if (startTime > time)
                    FlightModel.getFlights().get(o).setFlightCondition(FlightModel.FlightCondition.SCHEDULED);
                else if (startTime < time)
                    FlightModel.getFlights().get(o).setFlightCondition(FlightModel.FlightCondition.INAIR);
            }
            else if (FlightModel.getFlights().get(o).getDate().isAfter(LocalDate.now()))
            {
                FlightModel.getFlights().get(o).setFlightCondition(FlightModel.FlightCondition.SCHEDULED);
            }
            else if ((FlightModel.getFlights().get(o).getDate().getDayOfYear() == LocalDate.now().getDayOfYear()-1)&&(endTime<24))
            {
                FlightModel.getFlights().get(o).setFlightCondition(FlightModel.FlightCondition.ARRIVED);
            }
            else if ((FlightModel.getFlights().get(o).getDate().getDayOfYear() == LocalDate.now().getDayOfYear()-1)&&(endTime>23.59))
            {
                endTime -= 24.00;
                if (endTime < time)
                    FlightModel.getFlights().get(o).setFlightCondition(FlightModel.FlightCondition.ARRIVED);
                else if (endTime > time)
                    FlightModel.getFlights().get(o).setFlightCondition(FlightModel.FlightCondition.INAIR);
            }
            else if ((FlightModel.getFlights().get(o).getDate().getDayOfYear() != LocalDate.now().getDayOfYear()-1)&&(FlightModel.getFlights().get(o).getDate().isBefore(LocalDate.now())))
            {
                FlightModel.getFlights().get(o).setFlightCondition(FlightModel.FlightCondition.ARRIVED);
            }
        }
    }

}
