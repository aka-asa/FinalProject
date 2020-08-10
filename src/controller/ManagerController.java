package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import model.*;
import view.ManagerView;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Formatter;

public class ManagerController implements Showable
{
    private ManagerView managerView;
    private int index;
    private int selectedRowIndex;
    private static int currentPolicy = 0;

    public ManagerController ()
    {
        managerView = new ManagerView();
        initJfxButton();
        initJfxButton2();
        initJfxButton3();
        initJfxButton4();
        initJfxButton7();
        initJfxButton8();
        initJfxButton9();
        initJfxButton11();
        initJfxButton12();
        initJfxButton13();
        initJfxButton14();
        initJfxButton15();
        initJfxButton16();
        initJfxButton17();
        initJfxButton18();
        initJfxButton19();
        initJfxButton20();
        initJfxButton21();
        initJfxButton22();
        initJfxButton23();
        initJfxButton24();
        initJfxButton25();
        initJfxButton26();
        initJfxButton27();
        initJfxButton28();
        initJfxButton29();
        initJfxButton30();
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
        initJfxButton41();
        initJfxButton42();
        initJfxButton43();
        initJfxButton46();
        initJfxButton47();
        initJfxButton48();
        initJfxButton49();
        initJfxButton50();
        initJfxButton51();
        initJfxButton52();
        initJfxButton53();
        initJfxButton70();
        initJfxButton72();
        initJfxButton74();
        initJfxButton75();
        initJfxButton446();
        initJfxButton447();
        initJfxButton448();
        initJfxButton449();
        initJfxButton452();
        initJfxButton453();
        initJfxButton544();
        initJfxButton545();
        initJfxButton643();
        initJfxButton652();
        initJfxButton653();
        initJfxButton654();
        initJfxButton655();
        initJfxButton605();
        initJfxButton606();
    }

    public void showLoginMenu ()
    {
        managerView.getStage().setScene(managerView.getLoginScene());
        managerView.getStage().setTitle("Manager Login Menu");
        managerView.getStage().setMinWidth(750);
        managerView.getStage().setMinHeight(580);
        managerView.getStage().show();
    }

    public void show()
    {
        managerView = new ManagerView();
        for (int i=0 ; i<ManagerModel.getManagers().size() ; i++)
        {
            managerView.getTableView().getItems().add(ManagerModel.getManagers().get(i));
        }
        managerView.getStage().setScene(managerView.getShowManagersScene());
        managerView.getStage().setTitle("Show Managers");
        managerView.getStage().setMinWidth(600);
        managerView.getStage().setMinHeight(400);
        managerView.getStage().show();
    }

    public ManagerView getManagerView()
    {
        return managerView;
    }

    public void setManagerView(ManagerView managerView)
    {
        this.managerView = managerView;
    }

    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public static int getCurrentPolicy()
    {
        return currentPolicy;
    }

    public static void setCurrentPolicy(int currentPolicy)
    {
        ManagerController.currentPolicy = currentPolicy;
    }

    public int getSelectedRowIndex()
    {
        return selectedRowIndex;
    }

    public void setSelectedRowIndex(int selectedRowIndex)
    {
        this.selectedRowIndex = selectedRowIndex;
    }

    public int partition(int low, int high)
    {
        long pivot = ManagerModel.getManagers().get(high).getId();
        int i = (low-1);
        for (int j=low ; j<high ; j++)
        {
            if (ManagerModel.getManagers().get(j).getId() < pivot)
            {
                i++;
                ManagerModel temp = ManagerModel.getManagers().get(i);
                ManagerModel.getManagers().set(i,ManagerModel.getManagers().get(j));
                ManagerModel.getManagers().set(j,temp);
            }
        }
        ManagerModel temp = ManagerModel.getManagers().get(i+1);
        ManagerModel.getManagers().set(i+1,ManagerModel.getManagers().get(high));
        ManagerModel.getManagers().set(high,temp);

        return i+1;
    }

    public void sort(int low, int high)
    {
        if (low < high)
        {
            int pi = partition(low, high);
            sort(low, pi-1);
            sort(pi+1, high);
        }
    }

    public int search(int key)
    {
        int first = 0;
        int last = ManagerModel.getManagers().size()-1 ;
        int mid = (first + last) / 2;
        while (first <= last)
        {
            if (ManagerModel.getManagers().get(mid).getId() < key)
            {
                first = mid + 1;
            } else if (ManagerModel.getManagers().get(mid).getId() == key)
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

//edit a manager
    public void initJfxButton3()
    {
        managerView.getJfxButton3().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getJfxTextField6().getText().isEmpty()||managerView.getJfxTextField7().getText().isEmpty()||managerView.getJfxTextField8().getText().isEmpty() || managerView.getJfxTextField9().getText().isEmpty()||managerView.getJfxTextField10().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(managerView.getJfxTextField6().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for name section!");
                }
                else if (!(managerView.getJfxTextField7().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for last name section!");
                }
                else if (!(managerView.getJfxTextField8().getText().matches("\\w{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for username section!");
                }
                else if (!(managerView.getJfxTextField9().getText().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")))
                {
                    MessageController messageController = new MessageController("Wrong email address,please try again!");
                }
                else if (managerView.getJfxTextField9().getLength()>20)
                {
                    MessageController messageController = new MessageController("Email address is too long,please try again!");
                }
                else if (!(managerView.getJfxTextField10().getText().matches("[0]\\d{10}||[9][8]\\d{10}")))
                {
                    MessageController messageController = new MessageController("You can only use 11 numbers starting with 0 or 12 numbers starting with 98 for phone number section");
                }
                else
                {
                    int emailError = 0;
                    int phoneNumberError = 0;
                    String phoneNumber;
                    if (managerView.getJfxTextField10().getText().charAt(0) == '0')
                        phoneNumber = managerView.getJfxTextField10().getText().replaceFirst("0", "98");
                    else
                    {
                        phoneNumber = managerView.getJfxTextField10().getText();
                    }

                    for (int i=0 ; i<ManagerModel.getManagers().size() ; i++)
                    {
                        if (i == index)
                        {
                            continue;
                        }
                        else if (managerView.getJfxTextField9().getText().equals(ManagerModel.getManagers().get(i).getEmail()))
                        {
                            emailError = 1;
                            break;
                        }
                    }
                    for (int i=0 ; i<ManagerModel.getManagers().size() ; i++)
                    {
                        if (i == index)
                        {
                            continue;
                        }
                        else if (phoneNumber.equals(ManagerModel.getManagers().get(i).getPhoneNumber()))
                        {
                            phoneNumberError = 1;
                            break;
                        }
                    }

                    if (emailError == 1)
                    {
                        MessageController messageController = new MessageController("There is a manager with this email address!");
                    }
                    else if (phoneNumberError == 1)
                    {
                        MessageController messageController = new MessageController("There is a manager with this phone number!");
                    }


                    else
                    {
                        ManagerModel managerModel = new ManagerModel(managerView.getJfxTextField6().getText(), managerView.getJfxTextField7().getText(), managerView.getJfxTextField8().getText(), PassengerModel.getPassengers().get(index).getPassword(), managerView.getJfxTextField9().getText(), managerView.getJfxTextField13().getText());
                        managerModel.setSalary(ManagerModel.getManagers().get(index).getSalary());
                        managerModel.setId(ManagerModel.getManagers().get(index).getId());
                        managerModel.setPhoneNumber(managerView.getJfxTextField10().getText());
                        ManagerModel.setIdGenerator(ManagerModel.getIdGenerator() - 1);
                        ManagerModel.getManagers().set(index, managerModel);
                        managerView.getStage().close();
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        LocalDateTime localDateTime = LocalDateTime.now();
                        ManagerModel.getReports().add("Manager with "+managerModel.getId()+" as id edited his/her profile at "+dtf.format(localDateTime));
                        managerView.getJfxTextField6().clear();
                        managerView.getJfxTextField7().clear();
                        managerView.getJfxTextField8().clear();
                        managerView.getJfxTextField9().clear();
                        managerView.getJfxTextField10().clear();
                        managerView.getJfxTextField13().clear();
                        managerView.getStage().setScene(managerView.getMainMenuScene());
                        managerView.getStage().setTitle("Manager Main Menu");
                        managerView.getStage().setMinWidth(570);
                        managerView.getStage().setMinHeight(270);
                        managerView.getStage().show();
                    }
                }
            }
        });
    }

//exit edit menu
    public void initJfxButton4()
    {
        managerView.getJfxButton4().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getJfxTextField6().clear();
                managerView.getJfxTextField7().clear();
                managerView.getJfxTextField8().clear();
                managerView.getJfxTextField9().clear();
                managerView.getJfxTextField10().clear();
                managerView.getJfxTextField13().clear();
                managerView.getStage().setScene(managerView.getMainMenuScene());
                managerView.getStage().setTitle("Manager Main Menu");
                managerView.getStage().setMinWidth(570);
                managerView.getStage().setMinHeight(270);
                managerView.getStage().show();
            }
        });

    }

//login as manager
    public void initJfxButton70()
    {
        managerView.getJfxButton70().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getJfxTextField70().getText().isEmpty()||managerView.getJfxPasswordField70().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(managerView.getJfxTextField70().getText().matches("\\d{1,7}")))
                {
                    MessageController messageController = new MessageController("Wrong id!");
                }
                else if ((managerView.getJfxTextField70().getText().charAt(0) == '0')&&(managerView.getJfxTextField70().getLength()>1))
                {
                    MessageController messageController = new MessageController("Wrong id!");
                }
                else if (!(managerView.getJfxPasswordField70().getText().matches("\\S{1,13}")))
                {
                    MessageController messageController = new MessageController("Wrong password!");
                }
                else
                {
                    index = search(Integer.parseInt(managerView.getJfxTextField70().getText()));
                    if (index == -1)
                    {
                        MessageController messageController = new MessageController("Sorry id is wrong,please try again.");
                    } else if (!(managerView.getJfxPasswordField70().getText().equals(ManagerModel.getManagers().get(index).getPassword())))
                    {
                        MessageController messageController = new MessageController("Sorry password is wrong,please try again.");
                    } else
                    {
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        LocalDateTime localDateTime = LocalDateTime.now();
                        ManagerModel.getReports().add("Manager with "+ManagerModel.getManagers().get(index).getId()+" as id logged in at "+dtf.format(localDateTime));
                        managerView.getStage().close();
                        managerView.getJfxTextField70().clear();
                        managerView.getJfxPasswordField70().clear();
                        managerView.getStage().setScene(managerView.getMainMenuScene());
                        managerView.getStage().setTitle("Manager Main Menu");
                        managerView.getStage().setMinWidth(570);
                        managerView.getStage().setMinHeight(270);
                        managerView.getStage().show();
                    }
                }
            }
        });
    }

//exit login menu
    public void initJfxButton72()
    {
        managerView.getJfxButton72().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getJfxTextField70().clear();
                managerView.getJfxPasswordField70().clear();
                AirportController airportController = new AirportController();
            }
        });
    }

//select an ability
    public void initJfxButton8()
    {
        managerView.getJfxButton8().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                switch (managerView.getChoiceBox().getValue())
                {
                    case "":
                        MessageController messageController = new MessageController("Please choose an option!");
                        break;

                    case "Edit account (cannot be accessed by super admin)":
                        if (ManagerModel.getManagers().get(index).getId() == 1)
                        {
                            MessageController messageController2 = new MessageController("Sorry , this section cannot be used by super admin!");
                        }
                        else
                        {
                            managerView.getStage().close();
                            managerView.getJfxTextField6().setText(ManagerModel.getManagers().get(index).getName());
                            managerView.getJfxTextField7().setText(ManagerModel.getManagers().get(index).getLastName());
                            managerView.getJfxTextField8().setText(ManagerModel.getManagers().get(index).getUsername());
                            managerView.getJfxTextField9().setText(ManagerModel.getManagers().get(index).getEmail());
                            managerView.getJfxTextField10().setText(ManagerModel.getManagers().get(index).getPhoneNumber());
                            managerView.getJfxTextField13().setText(ManagerModel.getManagers().get(index).getAddress());
                            managerView.getStage().setScene(managerView.getEditAllScene());
                            managerView.getStage().setTitle("Edit Menu");
                            managerView.getStage().setMinWidth(750);
                            managerView.getStage().setMinHeight(580);
                            managerView.getStage().show();
                        }
                        break;

                    case "Change password":
                        managerView.getStage().close();
                        managerView.getStage().setScene(managerView.getChangePasswordScene());
                        managerView.getStage().setTitle("Change Password Menu");
                        managerView.getStage().setMinWidth(750);
                        managerView.getStage().setMinHeight(580);
                        managerView.getStage().show();
                        break;

                    case "Manage employees":
                        managerView.getStage().close();
                        managerView.getTableView412().getItems().clear();
                        for (int i=0; i< EmployeeModel.getEmployees().size() ; i++)
                        {
                            managerView.getTableView412().getItems().add(EmployeeModel.getEmployees().get(i));
                        }
                        managerView.getStage().setScene(managerView.getManageEmployeesScene());
                        managerView.getStage().setTitle("Manage Employee Menu");
                        managerView.getStage().setMinWidth(900);
                        managerView.getStage().setMinHeight(580);
                        managerView.getStage().show();
                        break;

                    case "Manage passengers":
                        managerView.getStage().close();
                        managerView.getTableView2().getItems().clear();
                        for (int i=0; i<PassengerModel.getPassengers().size() ; i++)
                        {
                            managerView.getTableView2().getItems().add(PassengerModel.getPassengers().get(i));
                        }
                        managerView.getStage().setScene(managerView.getPassengerScene());
                        managerView.getStage().setTitle("Passenger Menu");
                        managerView.getStage().setMinWidth(900);
                        managerView.getStage().setMinHeight(580);
                        managerView.getStage().show();
                        break;

                    case "Manage flights":
                        managerView.getStage().close();
                        refreshFlightCondition ();
                        managerView.getTableView5().getItems().clear();
                        for (int i=0; i< FlightModel.getFlights().size() ; i++)
                        {
                            managerView.getTableView5().getItems().add(FlightModel.getFlights().get(i));
                        }
                        managerView.getStage().setScene(managerView.getFlightScene());
                        managerView.getStage().setTitle("Flight Menu");
                        managerView.getStage().setMinWidth(1200);
                        managerView.getStage().setMinHeight(580);
                        managerView.getStage().show();
                        break;

                    case "Manage tickets":
                        managerView.getStage().close();
                        managerView.getTableView3().getItems().clear();
                        for (int i=0 ; i< TicketModel.getTickets().size() ; i++)
                        {
                            managerView.getTableView3().getItems().add(TicketModel.getTickets().get(i));
                        }
                        managerView.getStage().setScene(managerView.getTicketScene());
                        managerView.getStage().setTitle("Ticket Menu");
                        managerView.getStage().setMinWidth(750);
                        managerView.getStage().setMinHeight(580);
                        managerView.getStage().show();
                        break;

                    case "Manage airplanes":
                        managerView.getStage().close();
                        managerView.getTableView4().getItems().clear();
                        for (int i=0; i< AirplaneModel.getAirplanes().size() ; i++)
                        {
                            managerView.getTableView4().getItems().add(AirplaneModel.getAirplanes().get(i));
                        }
                        managerView.getStage().setScene(managerView.getAirplaneScene());
                        managerView.getStage().setTitle("Airplane Menu");
                        managerView.getStage().setMinWidth(750);
                        managerView.getStage().setMinHeight(580);
                        managerView.getStage().show();
                        break;

                    case "Manage critics and suggestions":
                        managerView.getStage().close();
                        managerView.getTableView11().getItems().clear();
                        ObservableList<String> details = FXCollections.observableArrayList(ManagerModel.getCriticsAndSuggestions());
                        managerView.getTableView11().setItems(details);
                        managerView.getStage().setScene(managerView.getCriticsAndSuggestionsScene());
                        managerView.getStage().setTitle("Critics And Suggestions Menu");
                        managerView.getStage().setMinWidth(750);
                        managerView.getStage().setMinHeight(580);
                        managerView.getStage().show();
                        break;

                    case "Manage managers (only accessible by super admin)":
                        if (ManagerModel.getManagers().get(index).getId() == 1)
                        {
                            managerView.getStage().close();
                            managerView.getTableView12().getItems().clear();
                            for (int i = 0; i < ManagerModel.getManagers().size(); i++)
                            {
                                if (ManagerModel.getManagers().get(i).getId() == 1)
                                    continue;
                                managerView.getTableView12().getItems().add(ManagerModel.getManagers().get(i));
                            }
                            managerView.getStage().setScene(managerView.getManageManagersScene());
                            managerView.getStage().setTitle("Manage Manager Menu");
                            managerView.getStage().setMinWidth(900);
                            managerView.getStage().setMinHeight(580);
                            managerView.getStage().show();
                        }
                        else
                        {
                            MessageController messageController3 = new MessageController("sorry , this section is only accessible by super admin");
                        }
                        break;

                    case "Show Reports (only accessible by super admin)":
                        if (ManagerModel.getManagers().get(index).getId() == 1)
                        {
                            managerView.getStage().close();
                            managerView.getTableView611().getItems().clear();
                            ObservableList<String> details2 = FXCollections.observableArrayList(ManagerModel.getReports());
                            managerView.getTableView611().setItems(details2);
                            managerView.getStage().setScene(managerView.getShowReportsScene());
                            managerView.getStage().setTitle("Show Reports Menu");
                            managerView.getStage().setMinWidth(750);
                            managerView.getStage().setMinHeight(600);
                            managerView.getStage().show();
                        }
                        else
                        {
                            MessageController messageController4 = new MessageController("sorry , this section is only accessible by super admin");
                        }
                        break;

                    case "Choose Financial Policy (only accessible by super admin)":
                        if (ManagerModel.getManagers().get(index).getId() == 1)
                        {
                            managerView.getStage().close();
                            managerView.getStage().setScene(managerView.getFinancialPolicyScene());
                            managerView.getStage().setTitle("Choose Financial Policy Menu");
                            managerView.getStage().setMinWidth(1000);
                            managerView.getStage().setMinHeight(600);
                            managerView.getStage().show();
                        }
                        else
                        {
                            MessageController messageController5 = new MessageController("sorry , this section is only accessible by super admin");
                        }
                        break;

                    case "Forgot Password":
                        managerView.getStage().close();
                        managerView.getStage().setScene(managerView.getForgotPasswordScene());
                        managerView.getStage().setTitle("Forgot Password Menu");
                        managerView.getStage().setMinWidth(750);
                        managerView.getStage().setMinHeight(580);
                        managerView.getStage().show();
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
        managerView.getJfxButton9().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime localDateTime = LocalDateTime.now();
                ManagerModel.getReports().add("Manager with "+ManagerModel.getManagers().get(index).getId()+" as id quited at "+dtf.format(localDateTime));
                managerView.getStage().setScene(managerView.getLoginScene());
                managerView.getStage().setTitle("Login Menu");
                managerView.getStage().setMinWidth(750);
                managerView.getStage().setMinHeight(580);
                managerView.getStage().show();
            }
        });
    }

//change password menu
    public void initJfxButton74()
    {
        managerView.getJfxButton74().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getJfxPasswordField71().getText().isEmpty()||managerView.getJfxPasswordField72().getText().isEmpty()||managerView.getJfxPasswordField73().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(managerView.getJfxPasswordField72().getText().equals(managerView.getJfxPasswordField73().getText())))
                {
                    MessageController messageController = new MessageController("Passwords are not same!");
                }
                else if (!((managerView.getJfxPasswordField71().getText().matches("\\S+"))&&(managerView.getJfxPasswordField72().getText().matches("\\S{1,13}"))))
                {
                    MessageController messageController = new MessageController("You can not use whitespace for password section!");
                }
                else if (!(managerView.getJfxPasswordField71().getText().equals(ManagerModel.getManagers().get(index).getPassword())))
                {
                    MessageController messageController = new MessageController("Wrong old password please try again!");
                }
                else
                {
                    ManagerModel.getManagers().get(index).setPassword(managerView.getJfxPasswordField72().getText());
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("Manager with "+ManagerModel.getManagers().get(index).getId()+" as id changed his/her password at "+dtf.format(localDateTime));
                    managerView.getJfxPasswordField71().clear();
                    managerView.getJfxPasswordField72().clear();
                    managerView.getJfxPasswordField73().clear();
                    managerView.getStage().close();
                    managerView.getStage().setScene(managerView.getMainMenuScene());
                    managerView.getStage().setTitle("Manager Main Menu");
                    managerView.getStage().setMinWidth(570);
                    managerView.getStage().setMinHeight(270);
                    managerView.getStage().show();
                }
            }
        });
    }

//exit change password menu
    public void initJfxButton75()
    {
        managerView.getJfxButton75().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getJfxPasswordField71().clear();
                managerView.getJfxPasswordField72().clear();
                managerView.getJfxPasswordField73().clear();
                managerView.getStage().setScene(managerView.getMainMenuScene());
                managerView.getStage().setTitle("Manager Main Menu");
                managerView.getStage().setMinWidth(570);
                managerView.getStage().setMinHeight(270);
                managerView.getStage().show();
            }
        });
    }

//edit a passenger menu
    public void initJfxButton11()
    {
        managerView.getJfxButton11().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getTableView2().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row!");
                }
                else
                {
                    PassengerModel passengerModel = managerView.getTableView2().getSelectionModel().getSelectedItem();
                    selectedRowIndex = PassengerController.search((int) passengerModel.getId());
                    managerView.getStage().close();
                    managerView.getJfxTextField18().setText(PassengerModel.getPassengers().get(selectedRowIndex).getName());
                    managerView.getJfxTextField19().setText(PassengerModel.getPassengers().get(selectedRowIndex).getLastName());
                    managerView.getJfxTextField20().setText(PassengerModel.getPassengers().get(selectedRowIndex).getUsername());
                    managerView.getJfxTextField21().setText(PassengerModel.getPassengers().get(selectedRowIndex).getEmail());
                    managerView.getJfxTextField22().setText(PassengerModel.getPassengers().get(selectedRowIndex).getPhoneNumber());
                    managerView.getJfxTextField301().setText(Long.toString(PassengerModel.getPassengers().get(selectedRowIndex).getCredit()));
                    managerView.getStage().setScene(managerView.getPassengerEditScene());
                    managerView.getStage().setTitle("Passenger Edit Menu");
                    managerView.getStage().setMinWidth(750);
                    managerView.getStage().setMinHeight(580);
                    managerView.getStage().show();
                }
            }
        });
    }

//edit a passenger
    public void initJfxButton7()
    {
        managerView.getJfxButton7().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getJfxTextField18().getText().isEmpty() || managerView.getJfxTextField19().getText().isEmpty() || managerView.getJfxTextField20().getText().isEmpty() || managerView.getJfxTextField21().getText().isEmpty() || managerView.getJfxTextField22().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(managerView.getJfxTextField18().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for name section!");
                }
                else if (!(managerView.getJfxTextField19().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for last name section!");
                }
                else if (!(managerView.getJfxTextField20().getText().matches("\\w{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for username section!");
                }
                else if (!(managerView.getJfxTextField21().getText().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")))
                {
                    MessageController messageController = new MessageController("Wrong email address,please try again!");
                }
                else if (managerView.getJfxTextField21().getLength()>20)
                {
                    MessageController messageController = new MessageController("Email address is too long,please try again!");
                }
                else if (!(managerView.getJfxTextField22().getText().matches("[0]\\d{10}||[9][8]\\d{10}")))
                {
                    MessageController messageController = new MessageController("You can only use 11 numbers starting with 0 or 12 numbers starting with 98 for phone number section");
                }
                else if (!(managerView.getJfxTextField301().getText().matches("\\d{1,7}")))
                {
                    MessageController messageController = new MessageController("You can only use natural numbers for credit section!");
                }
                else if (managerView.getJfxTextField301().getText().charAt(0) == '0')
                {
                    MessageController messageController = new MessageController("You can only use natural numbers for credit section!");
                }
                else
                {
                    int emailError = 0;
                    int phoneNumberError = 0;
                    String phoneNumber;
                    if (managerView.getJfxTextField22().getText().charAt(0) == '0')
                        phoneNumber = managerView.getJfxTextField22().getText().replaceFirst("0", "98");
                    else
                    {
                        phoneNumber = managerView.getJfxTextField22().getText();
                    }

                    for (int i=0 ; i<PassengerModel.getPassengers().size() ; i++)
                    {
                        if (i == selectedRowIndex)
                        {
                            continue;
                        }
                        else if (managerView.getJfxTextField21().getText().equals(PassengerModel.getPassengers().get(i).getEmail()))
                        {
                            emailError = 1;
                            break;
                        }
                    }
                    for (int i=0 ; i<PassengerModel.getPassengers().size() ; i++)
                    {
                        if (i == selectedRowIndex)
                        {
                            continue;
                        }
                        else if (phoneNumber.equals(PassengerModel.getPassengers().get(i).getPhoneNumber()))
                        {
                            phoneNumberError = 1;
                            break;
                        }
                    }

                    if (emailError == 1)
                    {
                        MessageController messageController = new MessageController("There is a passenger with this email address!");
                    }
                    else if (phoneNumberError == 1)
                    {
                        MessageController messageController = new MessageController("There is a passenger with this phone number!");
                    }

                    else
                    {
                        PassengerModel passengerModel = new PassengerModel(managerView.getJfxTextField18().getText(), managerView.getJfxTextField19().getText(), managerView.getJfxTextField20().getText(), PassengerModel.getPassengers().get(selectedRowIndex).getPassword(), managerView.getJfxTextField21().getText());
                        passengerModel.setId(PassengerModel.getPassengers().get(selectedRowIndex).getId());
                        passengerModel.setCredit(Long.parseLong(managerView.getJfxTextField301().getText()));
                        passengerModel.setPhoneNumber(managerView.getJfxTextField22().getText());
                        PassengerModel.setIdGenerator(PassengerModel.getIdGenerator() - 1);
                        PassengerModel.getPassengers().set(selectedRowIndex, passengerModel);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        LocalDateTime localDateTime = LocalDateTime.now();
                        ManagerModel.getReports().add("Manager with "+ManagerModel.getManagers().get(index).getId()+" as id edited a passengers profile with "+passengerModel.getId()+"as id at "+dtf.format(localDateTime));
                        managerView.getStage().close();
                        managerView.getJfxTextField18().clear();
                        managerView.getJfxTextField19().clear();
                        managerView.getJfxTextField20().clear();
                        managerView.getJfxTextField21().clear();
                        managerView.getJfxTextField22().clear();
                        managerView.getJfxTextField301().clear();
                        managerView.getTableView2().getItems().clear();
                        for (int i = 0; i < PassengerModel.getPassengers().size(); i++)
                        {
                            managerView.getTableView2().getItems().add(PassengerModel.getPassengers().get(i));
                        }
                        managerView.getStage().setScene(managerView.getPassengerScene());
                        managerView.getStage().setTitle("passenger Menu");
                        managerView.getStage().setMinWidth(900);
                        managerView.getStage().setMinHeight(580);
                        managerView.getStage().show();
                    }
                }

            }
        });
    }

//exit edit a passenger menu
    public void initJfxButton14()
    {
        managerView.getJfxButton14().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getJfxTextField18().clear();
                managerView.getJfxTextField19().clear();
                managerView.getJfxTextField20().clear();
                managerView.getJfxTextField21().clear();
                managerView.getJfxTextField22().clear();
                managerView.getJfxTextField301().clear();
                managerView.getTableView2().getItems().clear();
                for (int i=0; i< PassengerModel.getPassengers().size() ; i++)
                {
                    managerView.getTableView2().getItems().add(PassengerModel.getPassengers().get(i));
                }
                managerView.getStage().setScene(managerView.getPassengerScene());
                managerView.getStage().setTitle("Passenger Menu");
                managerView.getStage().setMinWidth(900);
                managerView.getStage().setMinHeight(580);
                managerView.getStage().show();
            }
        });
    }

//delete a passenger
    public void initJfxButton12()
    {
        managerView.getJfxButton12().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getTableView2().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row!");
                }
                else
                {
                    PassengerModel passengerModel = managerView.getTableView2().getSelectionModel().getSelectedItem();
                    PassengerModel.getPassengers().remove(PassengerController.search((int) passengerModel.getId()));
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("Manager with "+ManagerModel.getManagers().get(index).getId()+" as id deleted passenger with "+passengerModel.getId()+" as id at "+dtf.format(localDateTime));
               //     managerView.getStage().close();
                    managerView.getTableView2().getItems().clear();
                    for (int i = 0; i < PassengerModel.getPassengers().size(); i++)
                    {
                        managerView.getTableView2().getItems().add(PassengerModel.getPassengers().get(i));
                    }
                    managerView.getStage().setScene(managerView.getPassengerScene());
                    managerView.getStage().setTitle("Passenger Menu");
                    managerView.getStage().setMinWidth(900);
                    managerView.getStage().setMinHeight(580);
                    managerView.getStage().show();
                }
            }
        });
    }

//exit passenger menu
    public void initJfxButton13()
    {
        managerView.getJfxButton13().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getStage().setScene(managerView.getMainMenuScene());
                managerView.getStage().setTitle("Manager Main Menu");
                managerView.getStage().setMinWidth(570);
                managerView.getStage().setMinHeight(270);
                managerView.getStage().show();
            }
        });
    }

//add a ticket menu
    public void initJfxButton15()
    {
        managerView.getJfxButton15().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getStage().setScene(managerView.getTicketRegistrationScene());
                managerView.getStage().setTitle("Ticket Registration menu");
                managerView.getStage().setMinWidth(750);
                managerView.getStage().setMinHeight(580);
                managerView.getStage().show();
            }
        });
    }

//add a ticket
    public void initJfxButton19()
    {
        managerView.getJfxButton19().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getJfxTextField23().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(managerView.getJfxTextField23().getText().matches("\\d{1,7}")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for Price section");
                }
//                else if (!(managerView.getJfxTextField24().getText().matches("\\d{1,7}")))
//                {
//                    MessageController messageController = new MessageController("You can only use whole numbers for Penalty Of Cancellation section");
//                }
                else if ((managerView.getJfxTextField23().getText().charAt(0) == '0')&&(managerView.getJfxTextField23().getLength()>1))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for price section!");
                }
//                else if ((managerView.getJfxTextField24().getText().charAt(0) == '0')&&(managerView.getJfxTextField24().getLength()>1))
//                {
//                    MessageController messageController = new MessageController("You can only use whole numbers for penalty of cancellation section!");
//                }
                else
                {
                    long price = 0;
                    long penaltyOfCancellation = 0;
                    if (currentPolicy == 0)
                    {
                        price = Long.parseLong(managerView.getJfxTextField23().getText());
                        penaltyOfCancellation = ((price*20)/100);
                    }
                    else if (currentPolicy == 1)
                    {
                        price = ((Long.parseLong(managerView.getJfxTextField23().getText())*120)/100);
                        penaltyOfCancellation = ((price*20)/100);
                    }
                    else if (currentPolicy == 2)
                    {
                        price = ((Long.parseLong(managerView.getJfxTextField23().getText())*90)/100);
                        penaltyOfCancellation = ((price*20)/100);
                    }
                    TicketModel ticketModel = new TicketModel(price,penaltyOfCancellation );
                    TicketModel.getTickets().add(ticketModel);
                    TicketController.sort(0, TicketModel.getTickets().size() - 1);
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("Manager with "+ManagerModel.getManagers().get(index).getId()+" as id added ticket with "+ticketModel.getId()+" as id at "+dtf.format(localDateTime));
                    managerView.getStage().close();
                    managerView.getJfxTextField23().clear();
                    managerView.getTableView3().getItems().clear();
                    for (int i=0 ; i<TicketModel.getTickets().size() ; i++)
                    {
                        managerView.getTableView3().getItems().add(TicketModel.getTickets().get(i));
                    }
                    managerView.getStage().setScene(managerView.getTicketScene());
                    managerView.getStage().setTitle("Ticket Menu");
                    managerView.getStage().setMinWidth(750);
                    managerView.getStage().setMinHeight(580);
                    managerView.getStage().show();
                    MessageController messageController = new MessageController("The ID is : ("+ticketModel.getId()+")");
                }


            }
        });
    }

//exit add a ticket menu
    public void initJfxButton20()
    {
        managerView.getJfxButton20().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getJfxTextField23().clear();
                managerView.getTableView3().getItems().clear();
                for (int i=0; i< TicketModel.getTickets().size() ; i++)
                {
                    managerView.getTableView3().getItems().add(TicketModel.getTickets().get(i));
                }
                managerView.getStage().setScene(managerView.getTicketScene());
                managerView.getStage().setTitle("Ticket Menu");
                managerView.getStage().setMinWidth(750);
                managerView.getStage().setMinHeight(580);
                managerView.getStage().show();
            }
        });
    }

//edit a ticket menu
    public void initJfxButton16()
    {
        managerView.getJfxButton16().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getTableView3().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row!");
                }
                else
                {
                    TicketModel ticketModel = managerView.getTableView3().getSelectionModel().getSelectedItem();
                    selectedRowIndex = TicketController.search((int) ticketModel.getId());
                    managerView.getStage().close();
                    managerView.getJfxTextField25().setText(Long.toString(TicketModel.getTickets().get(selectedRowIndex).getPrice()));
                    managerView.getStage().setScene(managerView.getTicketEditScene());
                    managerView.getStage().setTitle("Ticket edit Menu");
                    managerView.getStage().setMinWidth(750);
                    managerView.getStage().setMinHeight(580);
                    managerView.getStage().show();
                }
            }
        });
    }

//edit a ticket
    public void initJfxButton21()
    {
        managerView.getJfxButton21().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getJfxTextField25().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(managerView.getJfxTextField25().getText().matches("\\d{1,7}")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for Price section");
                }
//                else if (!(managerView.getJfxTextField26().getText().matches("\\d{1,7}")))
//                {
//                    MessageController messageController = new MessageController("You can only use whole numbers for Penalty Of Cancellation section");
//                }
                else if ((managerView.getJfxTextField25().getText().charAt(0) == '0')&&(managerView.getJfxTextField25().getLength()>1))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for price section!");
                }
//                else if ((managerView.getJfxTextField26().getText().charAt(0) == '0')&&(managerView.getJfxTextField26().getLength()>1))
//                {
//                    MessageController messageController = new MessageController("You can only use whole numbers for penalty of cancellation section!");
//                }
                else
                {
                    long price = 0;
                    long penaltyOfCancellation = 0;
                    if (currentPolicy == 0)
                    {
                        price = Long.parseLong(managerView.getJfxTextField25().getText());
                        penaltyOfCancellation = ((price*20)/100);
                    }
                    else if (currentPolicy == 1)
                    {
                        price = ((Long.parseLong(managerView.getJfxTextField25().getText())*120)/100);
                        penaltyOfCancellation = ((price*20)/100);
                    }
                    else if (currentPolicy == 2)
                    {
                        price = ((Long.parseLong(managerView.getJfxTextField25().getText())*90)/100);
                        penaltyOfCancellation = ((price*20)/100);
                    }
                    TicketModel ticketModel = new TicketModel(price,penaltyOfCancellation );
                    ticketModel.setId(TicketModel.getTickets().get(selectedRowIndex).getId());
                    TicketModel.getTickets().set(selectedRowIndex,ticketModel);
                    TicketModel.setIdGenerator(TicketModel.getIdGenerator()-1);
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("Manager with "+ManagerModel.getManagers().get(index).getId()+" as id edited ticket with "+ticketModel.getId()+" as id at "+dtf.format(localDateTime));
                    managerView.getStage().close();
                    managerView.getJfxTextField25().clear();
                    managerView.getTableView3().getItems().clear();
                    for ( int i=0; i<TicketModel.getTickets().size() ; i++)
                    {
                        managerView.getTableView3().getItems().add(TicketModel.getTickets().get(i));
                    }
                    managerView.getStage().setScene(managerView.getTicketScene());
                    managerView.getStage().setTitle("Ticket Menu");
                    managerView.getStage().setMinWidth(750);
                    managerView.getStage().setMinHeight(580);
                    managerView.getStage().show();
                }

            }
        });
    }

//exit edit a ticket menu
    public void initJfxButton22()
    {
        managerView.getJfxButton22().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getJfxTextField25().clear();
                managerView.getTableView3().getItems().clear();
                for (int i=0 ; i< TicketModel.getTickets().size() ; i++)
                {
                    managerView.getTableView3().getItems().add(TicketModel.getTickets().get(i));
                }
                managerView.getStage().setScene(managerView.getTicketScene());
                managerView.getStage().setTitle("Ticket Menu");
                managerView.getStage().setMinWidth(750);
                managerView.getStage().setMinHeight(580);
                managerView.getStage().show();
            }
        });
    }

//delete a ticket
    public void initJfxButton17()
    {
        managerView.getJfxButton17().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getTableView3().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row!");
                }
                else
                {
                    TicketModel ticketModel = managerView.getTableView3().getSelectionModel().getSelectedItem();
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
                    ManagerModel.getReports().add("Manager with "+ManagerModel.getManagers().get(index).getId()+" as id deleted ticket with "+ticketModel.getId()+" as id at "+dtf.format(localDateTime));
             //       managerView.getStage().close();
                    managerView.getTableView3().getItems().clear();
                    for (int i=0 ; i < TicketModel.getTickets().size(); i++)
                    {
                        managerView.getTableView3().getItems().add(TicketModel.getTickets().get(i));
                    }
                    managerView.getStage().setScene(managerView.getTicketScene());
                    managerView.getStage().setTitle("Ticket Menu");
                    managerView.getStage().setMinWidth(750);
                    managerView.getStage().setMinHeight(580);
                    managerView.getStage().show();
                }
            }
        });
    }

//exit ticket menu
    public void initJfxButton18()
    {
        managerView.getJfxButton18().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getStage().setScene(managerView.getMainMenuScene());
                managerView.getStage().setTitle("Manager Main Menu");
                managerView.getStage().setMinWidth(570);
                managerView.getStage().setMinHeight(270);
                managerView.getStage().show();
            }
        });
    }

//add an airplane menu
    public void initJfxButton23()
    {
        managerView.getJfxButton23().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getStage().setScene(managerView.getAirplaneRegistrationScene());
                managerView.getStage().setTitle("Airplane Registration Menu");
                managerView.getStage().setMinWidth(750);
                managerView.getStage().setMinHeight(580);
                managerView.getStage().show();
            }
        });
    }

//add an airplane
    public void initJfxButton27()
    {
        managerView.getJfxButton27().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getJfxTextField27().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(managerView.getJfxTextField27().getText().matches("\\d{1,7}")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for Number Of Seats section");
                }
                else if ((managerView.getJfxTextField27().getText().charAt(0) == '0')&&(managerView.getJfxTextField27().getLength()>1))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for numbers of seat section!");
                }
                else
                {
                    AirplaneModel airplaneModel = new AirplaneModel(Integer.parseInt(managerView.getJfxTextField27().getText()));
                    AirplaneModel.getAirplanes().add(airplaneModel);
                    AirplaneController.sort(0, AirplaneModel.getAirplanes().size() - 1);
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("Manager with "+ManagerModel.getManagers().get(index).getId()+" as id added airplane with "+airplaneModel.getId()+" as id at "+dtf.format(localDateTime));
                    managerView.getStage().close();
                    managerView.getJfxTextField27().clear();
                    managerView.getTableView4().getItems().clear();
                    for ( int i=0; i<AirplaneModel.getAirplanes().size() ; i++)
                    {
                        managerView.getTableView4().getItems().add(AirplaneModel.getAirplanes().get(i));
                    }
                    managerView.getStage().setScene(managerView.getAirplaneScene());
                    managerView.getStage().setTitle("Airplane Menu");
                    managerView.getStage().setMinWidth(750);
                    managerView.getStage().setMinHeight(580);
                    managerView.getStage().show();
                    MessageController messageController = new MessageController("The ID is : ("+airplaneModel.getId()+")");
                }



            }
        });
    }

//exit add an airplane menu
    public void initJfxButton28()
    {
        managerView.getJfxButton28().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getJfxTextField27().clear();
                managerView.getTableView4().getItems().clear();
                for (int i=0; i< AirplaneModel.getAirplanes().size() ; i++)
                {
                    managerView.getTableView4().getItems().add(AirplaneModel.getAirplanes().get(i));
                }
                managerView.getStage().setScene(managerView.getAirplaneScene());
                managerView.getStage().setTitle("Airplane Menu");
                managerView.getStage().setMinWidth(750);
                managerView.getStage().setMinHeight(580);
                managerView.getStage().show();
            }
        });
    }

//edit an airplane menu
    public void initJfxButton24()
    {
        managerView.getJfxButton24().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getTableView4().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row!");
                }
                else
                {
                    AirplaneModel airplaneModel = managerView.getTableView4().getSelectionModel().getSelectedItem();
                    selectedRowIndex = AirplaneController.search((int) airplaneModel.getId());
                    managerView.getStage().close();
                    managerView.getJfxTextField28().setText(Long.toString(AirplaneModel.getAirplanes().get(selectedRowIndex).getNumberOfSeats()));
                    managerView.getStage().setScene(managerView.getAirplaneEditScene());
                    managerView.getStage().setTitle("Airplane Edit Menu");
                    managerView.getStage().setMinWidth(750);
                    managerView.getStage().setMinHeight(580);
                    managerView.getStage().show();
                }
            }
        });
    }

//edit an airplane
    public void initJfxButton29()
    {
        managerView.getJfxButton29().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getJfxTextField28().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(managerView.getJfxTextField28().getText().matches("\\d{1,7}")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for Number Of Seats section");
                }
                else if ((managerView.getJfxTextField28().getText().charAt(0) == '0')&&(managerView.getJfxTextField28().getLength()>1))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for numbers of seat section!");
                }
                else
                {
                    AirplaneModel airplaneModel = new AirplaneModel(Integer.parseInt(managerView.getJfxTextField28().getText()));
                    airplaneModel.setId(AirplaneModel.getAirplanes().get(selectedRowIndex).getId());
                    AirplaneModel.getAirplanes().set(selectedRowIndex,airplaneModel);
                    AirplaneModel.setIdGenerator(AirplaneModel.getIdGenerator()-1);
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("Manager with "+ManagerModel.getManagers().get(index).getId()+" as id edited airplane with "+airplaneModel.getId()+" as id at "+dtf.format(localDateTime));
                    managerView.getStage().close();
                    managerView.getJfxTextField28().clear();
                    managerView.getTableView4().getItems().clear();
                    for ( int i=0 ; i<AirplaneModel.getAirplanes().size() ; i++)
                    {
                        managerView.getTableView4().getItems().add(AirplaneModel.getAirplanes().get(i));
                    }
                    managerView.getStage().setScene(managerView.getAirplaneScene());
                    managerView.getStage().setTitle("Airplane Menu");
                    managerView.getStage().setMinWidth(750);
                    managerView.getStage().setMinHeight(580);
                    managerView.getStage().show();
                }

            }
        });
    }

//exit edit an airplane menu
    public void initJfxButton30()
    {
        managerView.getJfxButton30().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getJfxTextField28().clear();
                managerView.getTableView4().getItems().clear();
                for (int i=0 ; i< AirplaneModel.getAirplanes().size() ; i++)
                {
                    managerView.getTableView4().getItems().add(AirplaneModel.getAirplanes().get(i));
                }
                managerView.getStage().setScene(managerView.getAirplaneScene());
                managerView.getStage().setTitle("Airplane Menu");
                managerView.getStage().setMinWidth(750);
                managerView.getStage().setMinHeight(580);
                managerView.getStage().show();
            }
        });
    }

//delete an airplane
    public void initJfxButton25()
    {
        managerView.getJfxButton25().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getTableView4().getSelectionModel().isEmpty())
                {
                    MessageController messageController1 = new MessageController("Please select a row!");
                }
                else
                {
                    AirplaneModel airplaneModel = managerView.getTableView4().getSelectionModel().getSelectedItem();
                    for (int i=0 ; i<FlightModel.getFlights().size() ; i++)
                    {
                        if (FlightModel.getFlights().get(i).getAirplane().getId() == airplaneModel.getId())
                            FlightModel.getFlights().remove(i);
                    }
                    AirplaneModel.getAirplanes().remove(AirplaneController.search((int) airplaneModel.getId()));
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("Manager with "+ManagerModel.getManagers().get(index).getId()+" as id deleted airplane with "+airplaneModel.getId()+" as id at "+dtf.format(localDateTime));
             //       managerView.getStage().close();
                    managerView.getTableView4().getItems().clear();
                    for (int i=0 ; i < AirplaneModel.getAirplanes().size(); i++)
                    {
                        managerView.getTableView4().getItems().add(AirplaneModel.getAirplanes().get(i));
                    }
                    managerView.getStage().setScene(managerView.getAirplaneScene());
                    managerView.getStage().setTitle("Airplane Menu");
                    managerView.getStage().setMinWidth(750);
                    managerView.getStage().setMinHeight(580);
                    managerView.getStage().show();
                }
            }
        });
    }

//exit airplane menu
    public void initJfxButton26()
    {
        managerView.getJfxButton26().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getStage().setScene(managerView.getMainMenuScene());
                managerView.getStage().setTitle("Manager Main Menu");
                managerView.getStage().setMinWidth(570);
                managerView.getStage().setMinHeight(270);
                managerView.getStage().show();
            }
        });
    }

//show flights of an airplane menu for add
    public void initJfxButton35()
    {
        managerView.getJfxButton35().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getTableView6().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row from airplanes table!");
                } else
                {
                    AirplaneModel airplaneModel = managerView.getTableView6().getSelectionModel().getSelectedItem();
                    selectedRowIndex = AirplaneController.search((int) airplaneModel.getId());
                    refreshFlightCondition ();
                    managerView.getTableView8().getItems().clear();
                    for (int i = 0; i < AirplaneModel.getAirplanes().get(selectedRowIndex).getListOfFlights().size(); i++)
                    {
                        managerView.getTableView8().getItems().add(AirplaneModel.getAirplanes().get(selectedRowIndex).getListOfFlights().get(i));
                    }
                    Stage stage2 = new Stage();
                    stage2.setScene(managerView.getFlightsOfAirplaneScene());
                    stage2.setTitle("Flights Of Airplane");
                    stage2.setMinWidth(600);
                    stage2.setMinHeight(400);
                    stage2.show();
                }
            }
        });
    }

//show flights of an airplane menu for edit
    public void initJfxButton38()
    {
        managerView.getJfxButton38().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getTableView9().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row from airplanes table!");
                } else
                {
                    AirplaneModel airplaneModel = managerView.getTableView9().getSelectionModel().getSelectedItem();
                    selectedRowIndex = AirplaneController.search((int) airplaneModel.getId());
                    refreshFlightCondition ();
                    managerView.getTableView8().getItems().clear();
                    for (int i = 0; i < AirplaneModel.getAirplanes().get(selectedRowIndex).getListOfFlights().size(); i++)
                    {
                        managerView.getTableView8().getItems().add(AirplaneModel.getAirplanes().get(selectedRowIndex).getListOfFlights().get(i));
                    }
                    Stage stage2 = new Stage();
                    stage2.setScene(managerView.getFlightsOfAirplaneScene());
                    stage2.setTitle("Flights of Airplane");
                    stage2.setMinWidth(600);
                    stage2.setMinHeight(400);
                    stage2.show();
                }
            }
        });
    }

//add a flight menu
    public void initJfxButton31()
    {
        managerView.getJfxButton31().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                int t = 1;
                managerView.getStage().close();
                managerView.getTableView7().getItems().clear();

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
                        managerView.getTableView7().getItems().add(TicketModel.getTickets().get(i));
                }
                managerView.getTableView6().getItems().clear();
                int u = 1;
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
                        managerView.getTableView6().getItems().add(AirplaneModel.getAirplanes().get(k));
                }
                managerView.getStage().setScene(managerView.getFlightRegistrationScene());
                managerView.getStage().setTitle("Flight Registration Menu");
                managerView.getStage().setMinWidth(1200);
                managerView.getStage().setMinHeight(600);
                managerView.getStage().show();
            }
        });
    }

//add a flight
    public void initJfxButton36()
    {
        managerView.getJfxButton36().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
//                String[] parts = new String[3];
//                String[] parts2 = new String[3];
                String[] parts3 = new String[2];
                String[] parts4 = new String[2];
//                if (managerView.getJfxTextField31().getText().matches("\\d{4}[-]\\d{2}[-]\\d{2}"))
//                {
//                    LocalDate dateNow = LocalDate.now();
//                    String dateNowString = dateNow.toString();
//                    parts = dateNowString.split("-");
//                    for (int i = 1; i < 3; i++)
//                    {
//                        if (parts[i].charAt(0) == '0')
//                            parts[i] = Character.toString(parts[i].charAt(1));
//                    }
//                    parts2 = managerView.getJfxTextField31().getText().split("-");
//                    for (int i = 1; i < 3; i++)
//                    {
//                        if (parts2[i].charAt(0) == '0')
//                            parts2[i] = Character.toString(parts2[i].charAt(1));
//                    }
//                }

                if (managerView.getJfxTextField32().getText().matches("\\d{2}[:]\\d{2}"))
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
                parts4 = managerView.getJfxTextField32().getText().split(":");
                for (int i = 0; i < 2; i++)
                {
                    if (parts4[i].charAt(0) == '0')
                        parts4[i] = Character.toString(parts4[i].charAt(1));
                }
                }

                LocalDate localDate = null;
                if (managerView.getJfxTextField31().getText().matches("\\d{4}[-]\\d{2}[-]\\d{2}"))
                {
                    String[] parts = managerView.getJfxTextField31().getText().split("-");
                    localDate = LocalDate.of(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                }

                if (managerView.getTableView6().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row from airplane table!");
                }
                else if (managerView.getTableView7().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row from ticket table!");
                }
                else if (managerView.getJfxTextField29().getText().isEmpty()||managerView.getJfxTextField30().getText().isEmpty()||managerView.getJfxTextField31().getText().isEmpty()||managerView.getJfxTextField32().getText().isEmpty()||managerView.getJfxTextField33().getText().isEmpty()||managerView.getJfxTextField34().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(managerView.getJfxTextField29().getText().matches("\\w{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for Origin section!");
                }
                else if (!(managerView.getJfxTextField30().getText().matches("\\w{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for Destination section!");
                }
                else if (!(managerView.getJfxTextField31().getText().matches("\\d{4}[-]\\d{2}[-]\\d{2}")))
                {
                    MessageController messageController = new MessageController("Your date format should be YEAR-MONTH-DAY (write month and day with 0 if they are smaller than 10)!");
                }
                else if (!(managerView.getJfxTextField32().getText().matches("\\d{2}[:]\\d{2}")))
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
                else if (!(managerView.getJfxTextField33().getText().matches("\\d{1,7}")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for Number Of Sold Tickets section!");
                }
                else if ((managerView.getJfxTextField33().getText().charAt(0) == '0')&&(managerView.getJfxTextField33().getLength()>1))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for numbers of sold tickets section!");
                }
                else if (!(managerView.getJfxTextField34().getText().matches("\\d{1,2}\\.\\d{1,2}")))
                {
                    MessageController messageController = new MessageController("You can only use numbers for Flight Time section (double format number and less than 24.0)!");
                }
                else if (managerView.getJfxTextField34().getText().charAt(0) == '0')
                {
                    MessageController messageController = new MessageController("You can only use double numbers for flight time section (bigger than 0)!");
                }
                else if ((Double.parseDouble(managerView.getJfxTextField34().getText())>23.59))
                {
                    MessageController messageController = new MessageController("The flights time should be less than 24 hours!");
                }
                else
                {
                    AirplaneModel airplaneModel = managerView.getTableView6().getSelectionModel().getSelectedItem();
                    TicketModel ticketModel = managerView.getTableView7().getSelectionModel().getSelectedItem();
                    String [] parts5 = managerView.getJfxTextField31().getText().split("-");
                    LocalDate date = LocalDate.of(Integer.parseInt(parts5[0]),Integer.parseInt(parts5[1]),Integer.parseInt(parts5[2]));
                    FlightModel flightModel = new FlightModel(airplaneModel,ticketModel,managerView.getJfxTextField29().getText(),managerView.getJfxTextField30().getText(),date,managerView.getJfxTextField32().getText(),Integer.parseInt(managerView.getJfxTextField33().getText()),Double.parseDouble(managerView.getJfxTextField34().getText()));
                    FlightModel.getFlights().add(flightModel);
                    TicketModel.getUsedTickets().add(ticketModel);
                    AirplaneModel.getAirplanes().get(AirplaneController.search((int) airplaneModel.getId())).getListOfFlights().add(flightModel);
                    FlightController.sort(0, FlightModel.getFlights().size() - 1);
                    managerView.getStage().close();
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("Manager with "+ManagerModel.getManagers().get(index).getId()+" as id added flight with "+flightModel.getId()+" as id at "+dtf.format(localDateTime));
                    managerView.getJfxTextField29().clear();
                    managerView.getJfxTextField30().clear();
                    managerView.getJfxTextField31().clear();
                    managerView.getJfxTextField32().clear();
                    managerView.getJfxTextField33().clear();
                    managerView.getJfxTextField34().clear();
                    refreshFlightCondition ();
                    managerView.getTableView5().getItems().clear();
                    for (int i = 0; i < FlightModel.getFlights().size(); i++)
                    {
                        managerView.getTableView5().getItems().add(FlightModel.getFlights().get(i));
                    }
                    managerView.getStage().setScene(managerView.getFlightScene());
                    managerView.getStage().setTitle("Flight Menu");
                    managerView.getStage().setMinWidth(1200);
                    managerView.getStage().setMinHeight(580);
                    managerView.getStage().show();
                    MessageController messageController = new MessageController("The ID is : ("+flightModel.getId()+")");
                }

            }
        });
    }

//exit add a flight menu
    public void initJfxButton37()
    {
        managerView.getJfxButton37().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                refreshFlightCondition ();
                managerView.getTableView5().getItems().clear();
                for (int i = 0; i < FlightModel.getFlights().size(); i++)
                {
                    managerView.getTableView5().getItems().add(FlightModel.getFlights().get(i));
                }
                managerView.getJfxTextField29().clear();
                managerView.getJfxTextField30().clear();
                managerView.getJfxTextField31().clear();
                managerView.getJfxTextField32().clear();
                managerView.getJfxTextField33().clear();
                managerView.getJfxTextField34().clear();
                managerView.getStage().setScene(managerView.getFlightScene());
                managerView.getStage().setTitle("Flight Menu");
                managerView.getStage().setMinWidth(1200);
                managerView.getStage().setMinHeight(580);
                managerView.getStage().show();
            }
        });
    }

//edit a flight menu
    public void initJfxButton32()
    {
        managerView.getJfxButton32().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getTableView5().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row!");
                }
                else
                {
                    int t = 1;
                    FlightModel flightModel = managerView.getTableView5().getSelectionModel().getSelectedItem();
                    selectedRowIndex = FlightController.search((int) flightModel.getId());
                    managerView.getStage().close();
                    managerView.getTableView10().getItems().clear();
                    managerView.getTableView10().getItems().add(FlightModel.getFlights().get(selectedRowIndex).getTicket());
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
                            managerView.getTableView10().getItems().add(TicketModel.getTickets().get(i));
                    }
                    managerView.getJfxTextField35().setText(FlightModel.getFlights().get(selectedRowIndex).getOrigin());
                    managerView.getJfxTextField36().setText(FlightModel.getFlights().get(selectedRowIndex).getDestination());
                    managerView.getJfxTextField37().setText(FlightModel.getFlights().get(selectedRowIndex).getDate().toString());
                    managerView.getJfxTextField38().setText(FlightModel.getFlights().get(selectedRowIndex).getTime());
                    managerView.getJfxTextField39().setText(Integer.toString(FlightModel.getFlights().get(selectedRowIndex).getNumberOfSoldTickets()));
                    managerView.getJfxTextField40().setText(Double.toString(FlightModel.getFlights().get(selectedRowIndex).getFlightTime()));
                    managerView.getTableView9().getItems().clear();
                    int u = 1;
                    managerView.getTableView9().getItems().add(FlightModel.getFlights().get(selectedRowIndex).getAirplane());
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
                            managerView.getTableView9().getItems().add(AirplaneModel.getAirplanes().get(k));
                    }
                    managerView.getStage().setScene(managerView.getFlightEditScene());
                    managerView.getStage().setTitle("Flight Edit Menu");
                    managerView.getStage().setMinWidth(1200);
                    managerView.getStage().setMinHeight(600);
                    managerView.getStage().show();
                }
            }
        });
    }

//edit a flight
    public void initJfxButton39()
    {
        managerView.getJfxButton39().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
//                String[] parts = new String[3];
//                String[] parts2 = new String[3];
                String[] parts3 = new String[2];
                String[] parts4 = new String[2];
//                if (managerView.getJfxTextField37().getText().matches("\\d{4}[-]\\d{2}[-]\\d{2}"))
//                {
//                    LocalDate dateNow = LocalDate.now();
//                    String dateNowString = dateNow.toString();
//                    parts = dateNowString.split("-");
//                    for (int i = 1; i < 3; i++)
//                    {
//                        if (parts[i].charAt(0) == '0')
//                            parts[i] = Character.toString(parts[i].charAt(1));
//                    }
//                    parts2 = managerView.getJfxTextField37().getText().split("-");
//                    for (int i = 1; i < 3; i++)
//                    {
//                        if (parts2[i].charAt(0) == '0')
//                            parts2[i] = Character.toString(parts2[i].charAt(1));
//                    }
//                }

                if (managerView.getJfxTextField38().getText().matches("\\d{2}[:]\\d{2}"))
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
                    parts4 = managerView.getJfxTextField38().getText().split(":");
                    for (int i = 0; i < 2; i++)
                    {
                        if (parts4[i].charAt(0) == '0')
                            parts4[i] = Character.toString(parts4[i].charAt(1));
                    }
                }

                LocalDate localDate = null;
                if (managerView.getJfxTextField37().getText().matches("\\d{4}[-]\\d{2}[-]\\d{2}"))
                {
                    String[] parts = managerView.getJfxTextField37().getText().split("-");
                    localDate = LocalDate.of(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                }

                if (managerView.getTableView9().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Select a row from airplanes table!");
                }
                else if (managerView.getTableView10().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Select a row from tickets table!");
                }
                else if (managerView.getJfxTextField35().getText().isEmpty() || managerView.getJfxTextField36().getText().isEmpty() || managerView.getJfxTextField37().getText().isEmpty() || managerView.getJfxTextField38().getText().isEmpty() || managerView.getJfxTextField39().getText().isEmpty() || managerView.getJfxTextField40().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(managerView.getJfxTextField35().getText().matches("\\w{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for Origin section!");
                }
                else if (!(managerView.getJfxTextField36().getText().matches("\\w{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for Destination section!");
                }
                else if (!(managerView.getJfxTextField37().getText().matches("\\d{4}[-]\\d{2}[-]\\d{2}")))
                {
                    MessageController messageController = new MessageController("Your date format should be YEAR-MONTH-DAY (write month and day with 0 if they are smaller than 10)!");
                }
                else if (!(managerView.getJfxTextField38().getText().matches("\\d{2}[:]\\d{2}")))
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
                else if (!(managerView.getJfxTextField39().getText().matches("\\d{1,7}")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for Number Of Sold Tickets section!");
                }
                else if ((managerView.getJfxTextField39().getText().charAt(0) == '0')&&(managerView.getJfxTextField39().getLength()>1))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for numbers of sold tickets section!");
                }
                else if (!(managerView.getJfxTextField40().getText().matches("\\d{1,2}\\.\\d{1,2}")))
                {
                    MessageController messageController = new MessageController("You can only use numbers for Flight Time section (double format number and less than 24.0)!");
                }
                else if (managerView.getJfxTextField40().getText().charAt(0) == '0')
                {
                    MessageController messageController = new MessageController("You can only use double numbers for flight time section (bigger than 0)!");
                }
                else if ((Double.parseDouble(managerView.getJfxTextField40().getText())>23.59))
                {
                    MessageController messageController = new MessageController("The flights time should be less than 24 hours!");
                }
                else
                {
                    AirplaneModel airplaneModel = managerView.getTableView9().getSelectionModel().getSelectedItem();
                    TicketModel ticketModel = managerView.getTableView10().getSelectionModel().getSelectedItem();
                    String[] parts5 = managerView.getJfxTextField37().getText().split("-");
                    LocalDate date = LocalDate.of(Integer.parseInt(parts5[0]), Integer.parseInt(parts5[1]), Integer.parseInt(parts5[2]));
                    FlightModel flightModel = new FlightModel(airplaneModel, ticketModel, managerView.getJfxTextField35().getText(), managerView.getJfxTextField36().getText(), date, managerView.getJfxTextField38().getText(), Integer.parseInt(managerView.getJfxTextField39().getText()), Double.parseDouble(managerView.getJfxTextField40().getText()));
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
                    ManagerModel.getReports().add("Manager with "+ManagerModel.getManagers().get(index).getId()+" as id edited flight with "+flightModel.getId()+" as id at "+dtf.format(localDateTime));
                    managerView.getStage().close();
                    managerView.getJfxTextField35().clear();
                    managerView.getJfxTextField36().clear();
                    managerView.getJfxTextField37().clear();
                    managerView.getJfxTextField38().clear();
                    managerView.getJfxTextField39().clear();
                    managerView.getJfxTextField40().clear();
                    refreshFlightCondition ();
                    managerView.getTableView5().getItems().clear();
                    for (int i = 0; i < FlightModel.getFlights().size(); i++)
                    {
                        managerView.getTableView5().getItems().add(FlightModel.getFlights().get(i));
                    }
                    managerView.getTableView10().getItems().clear();
                    for (int j = 0; j < TicketModel.getTickets().size(); j++)
                    {
                        managerView.getTableView10().getItems().add(TicketModel.getTickets().get(j));
                    }
                    managerView.getStage().setScene(managerView.getFlightScene());
                    managerView.getStage().setTitle("Flight Menu");
                    managerView.getStage().setMinWidth(1200);
                    managerView.getStage().setMinHeight(580);
                    managerView.getStage().show();

                }
            }
        });
    }

//exit edit a flight menu
    public void initJfxButton40()
    {
        managerView.getJfxButton40().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                refreshFlightCondition ();
                managerView.getTableView5().getItems().clear();
                for (int i = 0; i < FlightModel.getFlights().size(); i++)
                {
                    managerView.getTableView5().getItems().add(FlightModel.getFlights().get(i));
                }
                managerView.getJfxTextField35().clear();
                managerView.getJfxTextField36().clear();
                managerView.getJfxTextField37().clear();
                managerView.getJfxTextField38().clear();
                managerView.getJfxTextField39().clear();
                managerView.getJfxTextField40().clear();
                managerView.getStage().setScene(managerView.getFlightScene());
                managerView.getStage().setTitle("Flight Menu");
                managerView.getStage().setMinWidth(1200);
                managerView.getStage().setMinHeight(580);
                managerView.getStage().show();
            }
        });
    }

//delete a flight
    public void initJfxButton33()
    {
        managerView.getJfxButton33().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getTableView5().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row!");
                }
                else
                {
                    FlightModel flightModel = managerView.getTableView5().getSelectionModel().getSelectedItem();
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
                    ManagerModel.getReports().add("Manager with "+ManagerModel.getManagers().get(index).getId()+" as id deleted flight with "+flightModel.getId()+" as id at "+dtf.format(localDateTime));
           //         managerView.getStage().close();
                    refreshFlightCondition ();
                    managerView.getTableView5().getItems().clear();
                    for (int i = 0; i < FlightModel.getFlights().size(); i++)
                    {
                        managerView.getTableView5().getItems().add(FlightModel.getFlights().get(i));
                    }
                    managerView.getStage().setScene(managerView.getFlightScene());
                    managerView.getStage().setTitle("Flight Menu");
                    managerView.getStage().setMinWidth(1200);
                    managerView.getStage().setMinHeight(580);
                    managerView.getStage().show();
                }
            }
        });
    }

//exit flight menu
    public void initJfxButton34()
    {
        managerView.getJfxButton34().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getStage().setScene(managerView.getMainMenuScene());
                managerView.getStage().setTitle("Manager Main Menu");
                managerView.getStage().setMinWidth(570);
                managerView.getStage().setMinHeight(270);
                managerView.getStage().show();
            }
        });
    }

//show a critic or suggestion
public void initJfxButton41()
{
    managerView.getJfxButton41().setOnAction(new EventHandler<ActionEvent>()
    {
        @Override
        public void handle(ActionEvent event)
        {
            if (managerView.getTableView11().getSelectionModel().isEmpty())
            {
                MessageController messageController = new MessageController("Please select a row from table!");
            } else
            {
                String string = managerView.getTableView11().getSelectionModel().getSelectedItem();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime localDateTime = LocalDateTime.now();
                ManagerModel.getReports().add("Manager with "+ManagerModel.getManagers().get(index).getId()+" as id has seen critics and suggestion at "+dtf.format(localDateTime));
                MessageController messageController = new MessageController(string);
            }
        }
    });
}

//delete a critic or suggestion
public void initJfxButton42()
{
    managerView.getJfxButton42().setOnAction(new EventHandler<ActionEvent>()
    {
        @Override
        public void handle(ActionEvent event)
        {
            if (managerView.getTableView11().getSelectionModel().isEmpty())
            {
                MessageController messageController = new MessageController("Please select a row from table!");
            } else
            {
                String string = managerView.getTableView11().getSelectionModel().getSelectedItem();
                for (int i=0 ; i<ManagerModel.getCriticsAndSuggestions().size() ; i++)
                {
                    if (ManagerModel.getCriticsAndSuggestions().get(i).equals(string))
                    {
                        ManagerModel.getCriticsAndSuggestions().remove(i);
                    }
                }
                managerView.getTableView11().getItems().clear();
                ObservableList<String> details = FXCollections.observableArrayList(ManagerModel.getCriticsAndSuggestions());
                managerView.getTableView11().setItems(details);
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime localDateTime = LocalDateTime.now();
                ManagerModel.getReports().add("Manager with "+ManagerModel.getManagers().get(index).getId()+" as id has deleted a critic and suggestion at "+dtf.format(localDateTime));
                managerView.getStage().setScene(managerView.getCriticsAndSuggestionsScene());
                managerView.getStage().setTitle("Critics And Suggestions Menu");
                managerView.getStage().setMinWidth(750);
                managerView.getStage().setMinHeight(580);
                managerView.getStage().show();
            }
        }
    });
}

//exit a critics and suggestions menu
public void initJfxButton43()
{
    managerView.getJfxButton43().setOnAction(new EventHandler<ActionEvent>()
    {
        @Override
        public void handle(ActionEvent event)
        {
            {
                managerView.getStage().close();
                managerView.getStage().setScene(managerView.getMainMenuScene());
                managerView.getStage().setTitle("Manager Main Menu");
                managerView.getStage().setMinWidth(570);
                managerView.getStage().setMinHeight(270);
                managerView.getStage().show();
            }
        }
    });
}

//add a manager menu (for super admin)
    public void initJfxButton46()
    {
        managerView.getJfxButton46().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getStage().setScene(managerView.getManagerRegistrationScene());
                managerView.getStage().setTitle("Manager Registration Menu (Super Admin)");
                managerView.getStage().setMinWidth(1000);
                managerView.getStage().setMinHeight(600);
                managerView.getStage().show();
            }
        });
    }

//add a manager (for super admin)
    public void initJfxButton50()
    {
        managerView.getJfxButton50().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getJfxTextField41().getText().isEmpty()||managerView.getJfxTextField42().getText().isEmpty()||managerView.getJfxTextField43().getText().isEmpty()||managerView.getJfxTextField44().getText().isEmpty()||managerView.getJfxTextField45().getText().isEmpty()||managerView.getJfxTextField46().getText().isEmpty()||managerView.getJfxTextField47().getText().isEmpty()||managerView.getJfxTextField45().getText().isEmpty()||managerView.getJfxPasswordField5().getText().isEmpty()||managerView.getJfxPasswordField6().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(managerView.getJfxPasswordField5().getText().equals(managerView.getJfxPasswordField6().getText())))
                {
                    MessageController messageController = new MessageController("Passwords are not same!");
                }
                else if (!(managerView.getJfxTextField41().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for name section!");
                }
                else if (!(managerView.getJfxTextField42().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for last name section!");
                }
                else if (!(managerView.getJfxTextField43().getText().matches("\\w{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for username section!");
                }
                else if (!(managerView.getJfxPasswordField5().getText().matches("\\S{1,13}")))
                {
                    MessageController messageController = new MessageController("You can not use whitespace for password section!");
                }
                else if (!(managerView.getJfxTextField44().getText().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")))
                {
                    MessageController messageController = new MessageController("Wrong email address,please try again!");
                }
                else if (managerView.getJfxTextField44().getLength()>20)
                {
                    MessageController messageController = new MessageController("Email address is too long,please try again!");
                }
                else if (!(managerView.getJfxTextField45().getText().matches("[0]\\d{10}||[9][8]\\d{10}")))
                {
                    MessageController messageController = new MessageController("You can only use 11 numbers starting with 0 or 12 numbers starting with 98 for phone number section");
                }
                else if (!(managerView.getJfxTextField47().getText().matches("\\d{1,7}")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for salary section!");
                }
                else if ((managerView.getJfxTextField47().getText().charAt(0) == '0')&&(managerView.getJfxTextField47().getLength()>1))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for salary section!");
                }
                else
                {
                    int emailError = 0;
                    int phoneNumberError = 0;
                    String phoneNumber;
                    if (managerView.getJfxTextField45().getText().charAt(0) == '0')
                        phoneNumber = managerView.getJfxTextField45().getText().replaceFirst("0", "98");
                    else
                    {
                        phoneNumber = managerView.getJfxTextField45().getText();
                    }

                    for (int i=0 ; i<ManagerModel.getManagers().size() ; i++)
                    {
                        if (managerView.getJfxTextField44().getText().equals(ManagerModel.getManagers().get(i).getEmail()))
                        {
                            emailError = 1;
                            break;
                        }
                    }
                    for (int i=0 ; i<ManagerModel.getManagers().size() ; i++)
                    {
                        if (phoneNumber.equals(ManagerModel.getManagers().get(i).getPhoneNumber()))
                        {
                            phoneNumberError = 1;
                            break;
                        }
                    }

                    if (emailError == 1)
                    {
                        MessageController messageController = new MessageController("There is a manager with this email address!");
                    }
                    else if (phoneNumberError == 1)
                    {
                        MessageController messageController = new MessageController("There is a manager with this phone number!");
                    }

                    else
                    {
                        ManagerModel managerModel = new ManagerModel(managerView.getJfxTextField41().getText(), managerView.getJfxTextField42().getText(), managerView.getJfxTextField43().getText(), managerView.getJfxPasswordField5().getText(), managerView.getJfxTextField44().getText(), managerView.getJfxTextField46().getText());
                        managerModel.setPhoneNumber(managerView.getJfxTextField45().getText());
                        managerModel.setSalary(Long.parseLong(managerView.getJfxTextField47().getText()));
                        managerModel.setSecurityAnswer(managerView.getJfxTextField605().getText());
                        ManagerModel.getManagers().add(managerModel);
                        sort(0, ManagerModel.getManagers().size() - 1);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        LocalDateTime localDateTime = LocalDateTime.now();
                        ManagerModel.getReports().add("Super admin added manager with "+managerModel.getId()+" as id at "+dtf.format(localDateTime));
                        managerView.getStage().close();
                        managerView.getJfxTextField41().clear();
                        managerView.getJfxTextField42().clear();
                        managerView.getJfxTextField43().clear();
                        managerView.getJfxTextField44().clear();
                        managerView.getJfxTextField45().clear();
                        managerView.getJfxTextField46().clear();
                        managerView.getJfxTextField47().clear();
                        managerView.getJfxPasswordField5().clear();
                        managerView.getJfxPasswordField6().clear();
                        managerView.getTableView12().getItems().clear();
                        for (int i = 0; i < ManagerModel.getManagers().size(); i++)
                        {
                            if (ManagerModel.getManagers().get(i).getId() == 1)
                                continue;
                            managerView.getTableView12().getItems().add(ManagerModel.getManagers().get(i));
                        }
                        managerView.getStage().setScene(managerView.getManageManagersScene());
                        managerView.getStage().setTitle("Manage Manager Menu (Super Admin)");
                        managerView.getStage().setMinWidth(900);
                        managerView.getStage().setMinHeight(580);
                        managerView.getStage().show();
                        MessageController messageController = new MessageController("The ID is : (" + managerModel.getId() + ")");
                    }
                }
            }
        });
    }

//exit add a manager menu (for super admin)
    public void initJfxButton51()
    {
        managerView.getJfxButton51().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getJfxTextField41().clear();
                managerView.getJfxTextField42().clear();
                managerView.getJfxTextField43().clear();
                managerView.getJfxTextField44().clear();
                managerView.getJfxTextField45().clear();
                managerView.getJfxTextField46().clear();
                managerView.getJfxTextField47().clear();
                managerView.getJfxPasswordField5().clear();
                managerView.getJfxPasswordField6().clear();
                managerView.getTableView2().getItems().clear();
                managerView.getStage().setScene(managerView.getManageManagersScene());
                managerView.getStage().setTitle("Manage Manager Menu (Super Admin)");
                managerView.getStage().setMinWidth(900);
                managerView.getStage().setMinHeight(580);
                managerView.getStage().show();
            }
        });
    }

//edit a manager menu (for super admin)
    public void initJfxButton47()
    {
        managerView.getJfxButton47().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getTableView12().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row!");
                }
                else
                {
                    ManagerModel managerModel = managerView.getTableView12().getSelectionModel().getSelectedItem();
                    selectedRowIndex = search((int) managerModel.getId());
                    managerView.getStage().close();
                    managerView.getJfxTextField48().setText(ManagerModel.getManagers().get(selectedRowIndex).getName());
                    managerView.getJfxTextField49().setText(ManagerModel.getManagers().get(selectedRowIndex).getLastName());
                    managerView.getJfxTextField50().setText(ManagerModel.getManagers().get(selectedRowIndex).getUsername());
                    managerView.getJfxTextField51().setText(ManagerModel.getManagers().get(selectedRowIndex).getPassword());
                    managerView.getJfxTextField52().setText(ManagerModel.getManagers().get(selectedRowIndex).getEmail());
                    managerView.getJfxTextField53().setText(ManagerModel.getManagers().get(selectedRowIndex).getPhoneNumber());
                    managerView.getJfxTextField54().setText(ManagerModel.getManagers().get(selectedRowIndex).getAddress());
                    managerView.getJfxTextField55().setText(Long.toString(ManagerModel.getManagers().get(selectedRowIndex).getSalary()));
                    managerView.getStage().setScene(managerView.getManagerEditScene());
                    managerView.getStage().setTitle("Manager Edit Menu (Super Admin)");
                    managerView.getStage().setMinWidth(750);
                    managerView.getStage().setMinHeight(600);
                    managerView.getStage().show();
                }
            }
        });
    }

//edit a manager (for super admin)
    public void initJfxButton52()
    {
        managerView.getJfxButton52().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getJfxTextField48().getText().isEmpty()||managerView.getJfxTextField49().getText().isEmpty()||managerView.getJfxTextField50().getText().isEmpty()||managerView.getJfxTextField51().getText().isEmpty()||managerView.getJfxTextField52().getText().isEmpty()||managerView.getJfxTextField53().getText().isEmpty()||managerView.getJfxTextField54().getText().isEmpty()||managerView.getJfxTextField55().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(managerView.getJfxTextField48().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for name section!");
                }
                else if (!(managerView.getJfxTextField49().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for last name section!");
                }
                else if (!(managerView.getJfxTextField50().getText().matches("\\w{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for username section!");
                }
                else if (!(managerView.getJfxTextField51().getText().matches("\\S{1,13}")))
                {
                    MessageController messageController = new MessageController("You can not use whitespace for password section!");
                }
                else if (!(managerView.getJfxTextField52().getText().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")))
                {
                    MessageController messageController = new MessageController("Wrong email address,please try again!");
                }
                else if (managerView.getJfxTextField52().getLength()>20)
                {
                    MessageController messageController = new MessageController("Email address is too long,please try again!");
                }
                else if (!(managerView.getJfxTextField53().getText().matches("[0]\\d{10}||[9][8]\\d{10}")))
                {
                    MessageController messageController = new MessageController("You can only use 11 numbers starting with 0 or 12 numbers starting with 98 for phone number section");
                }
                else if (!(managerView.getJfxTextField55().getText().matches("\\d{1,7}")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for salary section!");
                }
                else if ((managerView.getJfxTextField55().getText().charAt(0) == '0')&&(managerView.getJfxTextField55().getLength()>1))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for salary section!");
                }
                else
                {
                    int emailError = 0;
                    int phoneNumberError = 0;
                    String phoneNumber;
                    if (managerView.getJfxTextField53().getText().charAt(0) == '0')
                        phoneNumber = managerView.getJfxTextField53().getText().replaceFirst("0", "98");
                    else
                    {
                        phoneNumber = managerView.getJfxTextField53().getText();
                    }

                    for (int i=0 ; i<ManagerModel.getManagers().size() ; i++)
                    {
                        if (i == index)
                        {
                            continue;
                        }
                        else if (managerView.getJfxTextField52().getText().equals(ManagerModel.getManagers().get(i).getEmail()))
                        {
                            emailError = 1;
                            break;
                        }
                    }
                    for (int i=0 ; i<ManagerModel.getManagers().size() ; i++)
                    {
                        if (i == index)
                        {
                            continue;
                        }
                        else if (phoneNumber.equals(ManagerModel.getManagers().get(i).getPhoneNumber()))
                        {
                            phoneNumberError = 1;
                            break;
                        }
                    }

                    if (emailError == 1)
                    {
                        MessageController messageController = new MessageController("There is a manager with this email address!");
                    }
                    else if (phoneNumberError == 1)
                    {
                        MessageController messageController = new MessageController("There is a manager with this phone number!");
                    }

                    else
                    {
                        ManagerModel managerModel = new ManagerModel(managerView.getJfxTextField48().getText(), managerView.getJfxTextField49().getText(), managerView.getJfxTextField50().getText(), managerView.getJfxTextField51().getText(), managerView.getJfxTextField52().getText(), managerView.getJfxTextField54().getText());
                        managerModel.setSalary(Long.parseLong(managerView.getJfxTextField55().getText()));
                        managerModel.setPhoneNumber(managerView.getJfxTextField53().getText());
                        managerModel.setId(ManagerModel.getManagers().get(selectedRowIndex).getId());
                        ManagerModel.getManagers().set(selectedRowIndex, managerModel);
                        ManagerModel.setIdGenerator(ManagerModel.getIdGenerator() - 1);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        LocalDateTime localDateTime = LocalDateTime.now();
                        ManagerModel.getReports().add("super admin edited manager with "+managerModel.getId()+" as id at "+dtf.format(localDateTime));
                        managerView.getStage().close();
                        managerView.getJfxTextField48().clear();
                        managerView.getJfxTextField49().clear();
                        managerView.getJfxTextField50().clear();
                        managerView.getJfxTextField51().clear();
                        managerView.getJfxTextField52().clear();
                        managerView.getJfxTextField53().clear();
                        managerView.getJfxTextField54().clear();
                        managerView.getJfxTextField55().clear();
                        managerView.getTableView12().getItems().clear();
                        for (int i = 0; i < ManagerModel.getManagers().size(); i++)
                        {
                            if (ManagerModel.getManagers().get(i).getId() == 1)
                                continue;
                            managerView.getTableView12().getItems().add(ManagerModel.getManagers().get(i));
                        }
                        managerView.getStage().setScene(managerView.getManageManagersScene());
                        managerView.getStage().setTitle("Manage Manager Menu (Super Admin)");
                        managerView.getStage().setMinWidth(900);
                        managerView.getStage().setMinHeight(580);
                        managerView.getStage().show();
                    }
                }
            }
        });
    }

//exit edit a manager menu (for super admin)
    public void initJfxButton53()
    {
        managerView.getJfxButton53().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getJfxTextField48().clear();
                managerView.getJfxTextField49().clear();
                managerView.getJfxTextField50().clear();
                managerView.getJfxTextField51().clear();
                managerView.getJfxTextField52().clear();
                managerView.getJfxTextField53().clear();
                managerView.getJfxTextField54().clear();
                managerView.getJfxTextField55().clear();
                managerView.getStage().setScene(managerView.getManageManagersScene());
                managerView.getStage().setTitle("Manage Manager Menu (Super Admin)");
                managerView.getStage().setMinWidth(900);
                managerView.getStage().setMinHeight(580);
                managerView.getStage().show();
            }
        });
    }

//delete a manager (for super admin)
    public void initJfxButton48()
    {
        managerView.getJfxButton48().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getTableView12().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row!");
                }
                else
                {
                    ManagerModel managerModel = managerView.getTableView12().getSelectionModel().getSelectedItem();
                    ManagerModel.getManagers().remove(search((int) managerModel.getId()));
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("super admin deleted manager with "+managerModel.getId()+" as id at "+dtf.format(localDateTime));
               //     managerView.getStage().close();
                    managerView.getTableView12().getItems().clear();
                    for (int i=0 ; i < ManagerModel.getManagers().size(); i++)
                    {
                        if (ManagerModel.getManagers().get(i).getId() == 1)
                            continue;
                        managerView.getTableView12().getItems().add(ManagerModel.getManagers().get(i));
                    }
                    managerView.getStage().setScene(managerView.getManageManagersScene());
                    managerView.getStage().setTitle("Manage Manager Menu (Super Admin)");
                    managerView.getStage().setMinWidth(900);
                    managerView.getStage().setMinHeight(580);
                    managerView.getStage().show();
                }
            }
        });
    }

//exit manager menu (for super admin)
    public void initJfxButton49()
    {
        managerView.getJfxButton49().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getStage().setScene(managerView.getMainMenuScene());
                managerView.getStage().setTitle("Manager Main Menu");
                managerView.getStage().setMinWidth(570);
                managerView.getStage().setMinHeight(270);
                managerView.getStage().show();
            }
        });
    }

//add an employee menu
    public void initJfxButton446()
    {
        managerView.getJfxButton446().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getStage().setScene(managerView.getEmployeeRegistrationScene());
                managerView.getStage().setTitle("Employee Registration Menu");
                managerView.getStage().setMinWidth(750);
                managerView.getStage().setMinHeight(580);
                managerView.getStage().show();
            }
        });
    }

//add a employee
    public void initJfxButton()
    {
        managerView.getJfxButton().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getJfxTextField().getText().isEmpty()||managerView.getJfxTextField2().getText().isEmpty()||managerView.getJfxTextField3().getText().isEmpty()||managerView.getJfxTextField4().getText().isEmpty()||managerView.getJfxTextField5().getText().isEmpty()||managerView.getJfxPasswordField().getText().isEmpty()||managerView.getJfxPasswordField2().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(managerView.getJfxPasswordField().getText().equals(managerView.getJfxPasswordField2().getText())))
                {
                    MessageController messageController = new MessageController("Passwords are not same!");
                }
                else if (!(managerView.getJfxTextField().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for name section!");
                }
                else if (!(managerView.getJfxTextField2().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for last name section!");
                }
                else if (!(managerView.getJfxTextField3().getText().matches("\\w{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for username section!");
                }
                else if (!(managerView.getJfxPasswordField().getText().matches("\\S{1,13}")))
                {
                    MessageController messageController = new MessageController("You can not use whitespace for password section!");
                }
                else if (!(managerView.getJfxTextField4().getText().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")))
                {
                    MessageController messageController = new MessageController("Wrong email address,please try again!");
                }
                else if (managerView.getJfxTextField4().getLength()>20)
                {
                    MessageController messageController = new MessageController("Email address is too long,please try again!");
                }
                else if (!(managerView.getJfxTextField5().getText().matches("[0]\\d{10}||[9][8]\\d{10}")))
                {
                    MessageController messageController = new MessageController("You can only use 11 numbers starting with 0 or 12 numbers starting with 98 for phone number section");
                }
                else if (!(managerView.getJfxTextField311().getText().matches("\\d{1,7}")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for salary section");
                }
                else if ((managerView.getJfxTextField311().getText().charAt(0) == '0')&&(managerView.getJfxTextField311().getLength()>1))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for salary section!");
                }
                else
                {
                    int emailError = 0;
                    int phoneNumberError = 0;
                    String phoneNumber;
                    if (managerView.getJfxTextField5().getText().charAt(0) == '0')
                        phoneNumber = managerView.getJfxTextField5().getText().replaceFirst("0", "98");
                    else
                    {
                        phoneNumber = managerView.getJfxTextField5().getText();
                    }

                    for (int i=0 ; i<EmployeeModel.getEmployees().size() ; i++)
                    {
                        if (managerView.getJfxTextField4().getText().equals(EmployeeModel.getEmployees().get(i).getEmail()))
                        {
                            emailError = 1;
                            break;
                        }
                    }
                    for (int i=0 ; i<EmployeeModel.getEmployees().size() ; i++)
                    {
                        if (phoneNumber.equals(EmployeeModel.getEmployees().get(i).getPhoneNumber()))
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
                        EmployeeModel employeeModel = new EmployeeModel(managerView.getJfxTextField().getText(), managerView.getJfxTextField2().getText(), managerView.getJfxTextField3().getText(), managerView.getJfxPasswordField().getText(), managerView.getJfxTextField4().getText(), managerView.getJfxTextField11().getText());
                        employeeModel.setPhoneNumber(managerView.getJfxTextField5().getText());
                        employeeModel.setSalary(Long.parseLong(managerView.getJfxTextField311().getText()));
                        employeeModel.setSecurityAnswer(managerView.getJfxTextField707().getText());
                        EmployeeModel.getEmployees().add(employeeModel);
                        EmployeeController.sort(0, EmployeeModel.getEmployees().size() - 1);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        LocalDateTime localDateTime = LocalDateTime.now();
                        ManagerModel.getReports().add("Manager with "+ManagerModel.getManagers().get(index).getId()+" as id added employee with "+employeeModel.getId()+" as id at "+dtf.format(localDateTime));
                        managerView.getStage().close();
                        managerView.getJfxTextField().clear();
                        managerView.getJfxTextField2().clear();
                        managerView.getJfxTextField3().clear();
                        managerView.getJfxTextField4().clear();
                        managerView.getJfxTextField5().clear();
                        managerView.getJfxTextField11().clear();
                        managerView.getJfxTextField311().clear();
                        managerView.getJfxPasswordField().clear();
                        managerView.getJfxPasswordField2().clear();
                        managerView.getTableView412().getItems().clear();
                        for (int i = 0; i < EmployeeModel.getEmployees().size(); i++)
                        {
                            managerView.getTableView412().getItems().add(EmployeeModel.getEmployees().get(i));
                        }
                        managerView.getStage().setScene(managerView.getManageEmployeesScene());
                        managerView.getStage().setTitle("Manage Employee Menu");
                        managerView.getStage().setMinWidth(900);
                        managerView.getStage().setMinHeight(580);
                        managerView.getStage().show();
                        MessageController messageController = new MessageController("Your ID is : (" + employeeModel.getId() + ")");
                    }
                }
            }
        });
    }

//exit employee registration menu
    public void initJfxButton2()
    {
        managerView.getJfxButton2().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getJfxTextField().clear();
                managerView.getJfxTextField2().clear();
                managerView.getJfxTextField3().clear();
                managerView.getJfxTextField4().clear();
                managerView.getJfxTextField5().clear();
                managerView.getJfxTextField11().clear();
                managerView.getJfxTextField311().clear();
                managerView.getJfxPasswordField().clear();
                managerView.getJfxPasswordField2().clear();
                managerView.getStage().setScene(managerView.getManageEmployeesScene());
                managerView.getStage().setTitle("Manage Employee Menu");
                managerView.getStage().setMinWidth(900);
                managerView.getStage().setMinHeight(580);
                managerView.getStage().show();
            }
        });
    }

//edit an employee menu
    public void initJfxButton447()
    {
        managerView.getJfxButton447().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getTableView412().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row!");
                }
                else
                {
                    EmployeeModel employeeModel = managerView.getTableView412().getSelectionModel().getSelectedItem();
                    selectedRowIndex = EmployeeController.search((int) employeeModel.getId());
                    managerView.getStage().close();
                    managerView.getJfxTextField448().setText(EmployeeModel.getEmployees().get(selectedRowIndex).getName());
                    managerView.getJfxTextField449().setText(EmployeeModel.getEmployees().get(selectedRowIndex).getLastName());
                    managerView.getJfxTextField450().setText(EmployeeModel.getEmployees().get(selectedRowIndex).getUsername());
                    managerView.getJfxTextField451().setText(EmployeeModel.getEmployees().get(selectedRowIndex).getPassword());
                    managerView.getJfxTextField452().setText(EmployeeModel.getEmployees().get(selectedRowIndex).getEmail());
                    managerView.getJfxTextField453().setText(EmployeeModel.getEmployees().get(selectedRowIndex).getPhoneNumber());
                    managerView.getJfxTextField454().setText(EmployeeModel.getEmployees().get(selectedRowIndex).getAddress());
                    managerView.getJfxTextField455().setText(Long.toString(EmployeeModel.getEmployees().get(selectedRowIndex).getSalary()));
                    managerView.getStage().setScene(managerView.getEmployeeEditScene());
                    managerView.getStage().setTitle("Employee Edit Menu");
                    managerView.getStage().setMinWidth(750);
                    managerView.getStage().setMinHeight(580);
                    managerView.getStage().show();
                }
            }
        });
    }

//edit an employee
    public void initJfxButton452()
    {
        managerView.getJfxButton452().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getJfxTextField448().getText().isEmpty()||managerView.getJfxTextField449().getText().isEmpty()||managerView.getJfxTextField450().getText().isEmpty()||managerView.getJfxTextField451().getText().isEmpty()||managerView.getJfxTextField452().getText().isEmpty()||managerView.getJfxTextField453().getText().isEmpty()||managerView.getJfxTextField454().getText().isEmpty()||managerView.getJfxTextField455().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(managerView.getJfxTextField448().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for name section!");
                }
                else if (!(managerView.getJfxTextField449().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for last name section!");
                }
                else if (!(managerView.getJfxTextField450().getText().matches("\\w{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for username section!");
                }
                else if (!(managerView.getJfxTextField451().getText().matches("\\S{1,13}")))
                {
                    MessageController messageController = new MessageController("You can not use whitespace for password section!");
                }
                else if (!(managerView.getJfxTextField452().getText().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")))
                {
                    MessageController messageController = new MessageController("Wrong email address,please try again!");
                }
                else if (managerView.getJfxTextField452().getLength()>20)
                {
                    MessageController messageController = new MessageController("Email address is too long,please try again!");
                }
                else if (!(managerView.getJfxTextField453().getText().matches("[0]\\d{10}||[9][8]\\d{10}")))
                {
                    MessageController messageController = new MessageController("You can only use 11 numbers starting with 0 or 12 numbers starting with 98 for phone number section");
                }
                else if (!(managerView.getJfxTextField455().getText().matches("\\d{1,7}")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for salary section!");
                }
                else if ((managerView.getJfxTextField455().getText().charAt(0) == '0')&&(managerView.getJfxTextField455().getLength()>1))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for salary section!");
                }
                else
                {
                    int emailError = 0;
                    int phoneNumberError = 0;
                    String phoneNumber;
                    if (managerView.getJfxTextField453().getText().charAt(0) == '0')
                        phoneNumber = managerView.getJfxTextField453().getText().replaceFirst("0", "98");
                    else
                    {
                        phoneNumber = managerView.getJfxTextField453().getText();
                    }

                    for (int i=0 ; i<EmployeeModel.getEmployees().size() ; i++)
                    {
                        if (i == selectedRowIndex)
                        {
                            continue;
                        }
                        else if (managerView.getJfxTextField452().getText().equals(EmployeeModel.getEmployees().get(i).getEmail()))
                        {
                            emailError = 1;
                            break;
                        }
                    }
                    for (int i=0 ; i<EmployeeModel.getEmployees().size() ; i++)
                    {
                        if (i == selectedRowIndex)
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
                        EmployeeModel employeeModel = new EmployeeModel(managerView.getJfxTextField448().getText(), managerView.getJfxTextField449().getText(), managerView.getJfxTextField450().getText(), managerView.getJfxTextField451().getText(), managerView.getJfxTextField452().getText(), managerView.getJfxTextField454().getText());
                        employeeModel.setSalary(Long.parseLong(managerView.getJfxTextField455().getText()));
                        employeeModel.setPhoneNumber(managerView.getJfxTextField453().getText());
                        employeeModel.setId(EmployeeModel.getEmployees().get(selectedRowIndex).getId());
                        EmployeeModel.getEmployees().set(selectedRowIndex, employeeModel);
                        EmployeeModel.setIdGenerator(EmployeeModel.getIdGenerator() - 1);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        LocalDateTime localDateTime = LocalDateTime.now();
                        ManagerModel.getReports().add("Manager with "+ManagerModel.getManagers().get(index).getId()+" as id edited employee with "+employeeModel.getId()+" as id at "+dtf.format(localDateTime));
                        managerView.getStage().close();
                        managerView.getJfxTextField448().clear();
                        managerView.getJfxTextField449().clear();
                        managerView.getJfxTextField450().clear();
                        managerView.getJfxTextField451().clear();
                        managerView.getJfxTextField452().clear();
                        managerView.getJfxTextField453().clear();
                        managerView.getJfxTextField454().clear();
                        managerView.getJfxTextField455().clear();
                        managerView.getTableView412().getItems().clear();
                        for (int i = 0; i < EmployeeModel.getEmployees().size(); i++)
                        {
                            managerView.getTableView412().getItems().add(EmployeeModel.getEmployees().get(i));
                        }
                        managerView.getStage().setScene(managerView.getManageEmployeesScene());
                        managerView.getStage().setTitle("Manage Employee Menu");
                        managerView.getStage().setMinWidth(900);
                        managerView.getStage().setMinHeight(580);
                        managerView.getStage().show();
                    }
                }
            }
        });
    }

//exit edit an employee menu
    public void initJfxButton453()
    {
        managerView.getJfxButton453().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getJfxTextField448().clear();
                managerView.getJfxTextField449().clear();
                managerView.getJfxTextField450().clear();
                managerView.getJfxTextField451().clear();
                managerView.getJfxTextField452().clear();
                managerView.getJfxTextField453().clear();
                managerView.getJfxTextField454().clear();
                managerView.getJfxTextField455().clear();
                managerView.getStage().setScene(managerView.getManageEmployeesScene());
                managerView.getStage().setTitle("Manage employee Menu");
                managerView.getStage().setMinWidth(900);
                managerView.getStage().setMinHeight(580);
                managerView.getStage().show();
            }
        });
    }

//delete an employee
    public void initJfxButton448()
    {
        managerView.getJfxButton448().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getTableView412().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row!");
                }
                else
                {
                    EmployeeModel employeeModel = managerView.getTableView412().getSelectionModel().getSelectedItem();
                    EmployeeModel.getEmployees().remove(EmployeeController.search((int) employeeModel.getId()));
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("Manager with "+ManagerModel.getManagers().get(index).getId()+" as id deleted employee with "+employeeModel.getId()+" as id at "+dtf.format(localDateTime));
         //           managerView.getStage().close();
                    managerView.getTableView412().getItems().clear();
                    for (int i=0 ; i < EmployeeModel.getEmployees().size(); i++)
                    {
                        managerView.getTableView412().getItems().add(EmployeeModel.getEmployees().get(i));
                    }
                    managerView.getStage().setScene(managerView.getManageEmployeesScene());
                    managerView.getStage().setTitle("Manage Employee Menu");
                    managerView.getStage().setMinWidth(900);
                    managerView.getStage().setMinHeight(580);
                    managerView.getStage().show();
                }
            }
        });
    }

//exit employee menu
    public void initJfxButton449()
    {
        managerView.getJfxButton449().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getStage().setScene(managerView.getMainMenuScene());
                managerView.getStage().setTitle("Manager Main Menu");
                managerView.getStage().setMinWidth(570);
                managerView.getStage().setMinHeight(270);
                managerView.getStage().show();
            }
        });
    }

//show flights of an airplane for manage menu
    public void initJfxButton544()
    {
        managerView.getJfxButton544().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getTableView5().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row from table!");
                } else
                {
                    FlightModel flightModel = managerView.getTableView5().getSelectionModel().getSelectedItem();
                    AirplaneModel airplaneModel = flightModel.getAirplane();
                    selectedRowIndex = AirplaneController.search((int) airplaneModel.getId());
                    refreshFlightCondition ();
                    managerView.getTableView8().getItems().clear();
                    for (int i = 0; i < AirplaneModel.getAirplanes().get(selectedRowIndex).getListOfFlights().size(); i++)
                    {
                        managerView.getTableView8().getItems().add(AirplaneModel.getAirplanes().get(selectedRowIndex).getListOfFlights().get(i));
                    }
                    Stage stage2 = new Stage();
                    stage2.setScene(managerView.getFlightsOfAirplaneScene());
                    stage2.setTitle("Flights Of Airplane");
                    stage2.setMinWidth(600);
                    stage2.setMinHeight(400);
                    stage2.show();
                }
            }
        });
    }

//show passengers of a flight for manage menu
    public void initJfxButton545()
    {
        managerView.getJfxButton545().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getTableView5().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row from airplanes table!");
                } else
                {
                    FlightModel flightModel = managerView.getTableView5().getSelectionModel().getSelectedItem();
                    managerView.getTableView400().getItems().clear();
                    for (int i = 0; i < flightModel.getListOfPassengers().size() ; i++)
                    {
                        managerView.getTableView400().getItems().add(flightModel.getListOfPassengers().get(i));
                    }
                    Stage stage2 = new Stage();
                    stage2.setScene(managerView.getFlightsPassengersScene());
                    stage2.setTitle("Flights passengers");
                    stage2.setMinWidth(600);
                    stage2.setMinHeight(400);
                    stage2.show();
                }
            }
        });
    }

//exit show reports
    public void initJfxButton643()
    {
        managerView.getJfxButton643().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getStage().setScene(managerView.getMainMenuScene());
                managerView.getStage().setTitle("Manager Main Menu");
                managerView.getStage().setMinWidth(570);
                managerView.getStage().setMinHeight(270);
                managerView.getStage().show();
            }
        });
    }

//exit financial policy menu
    public void initJfxButton655()
    {
        managerView.getJfxButton655().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getStage().setScene(managerView.getMainMenuScene());
                managerView.getStage().setTitle("Manager Main Menu");
                managerView.getStage().setMinWidth(570);
                managerView.getStage().setMinHeight(270);
                managerView.getStage().show();
            }
        });
    }

//constant financial police
    public void initJfxButton652()
    {
        managerView.getJfxButton652().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                if (currentPolicy == 1)
                {
//                    for (int i=0 ; i<FlightModel.getFlights().size() ; i++)
//                    {
//                        FlightModel.getFlights().get(i).getTicket().setPrice(((FlightModel.getFlights().get(i).getTicket().getPrice()/120)*100));
//                    }
                    for (int i=0 ; i<TicketModel.getUsedTickets().size() ; i++)
                    {
                        TicketModel.getUsedTickets().get(i).setPrice(((TicketModel.getUsedTickets().get(i).getPrice()/120)*100));
                        TicketModel.getUsedTickets().get(i).setPenaltyOfCancellation(((TicketModel.getUsedTickets().get(i).getPrice()*20)/100));
                    }
                    for (int i=0 ; i<TicketModel.getTickets().size() ; i++)
                    {
                        TicketModel.getTickets().get(i).setPrice(((TicketModel.getTickets().get(i).getPrice()/120)*100));
                        TicketModel.getTickets().get(i).setPenaltyOfCancellation(((TicketModel.getTickets().get(i).getPrice()*20)/100));
                    }
                    for (int i=0 ; i<PassengerModel.getPassengers().size() ; i++)
                    {
                        PassengerModel.getPassengers().get(i).setCredit(((PassengerModel.getPassengers().get(i).getCredit()/120)*100));
                    }
                }
                else if (currentPolicy == 2)
                {
//                    for (int i=0 ; i<FlightModel.getFlights().size() ; i++)
//                    {
//                        FlightModel.getFlights().get(i).getTicket().setPrice(((FlightModel.getFlights().get(i).getTicket().getPrice()/90)*100));
//                    }
                    for (int i=0 ; i<TicketModel.getUsedTickets().size() ; i++)
                    {
                        TicketModel.getUsedTickets().get(i).setPrice(((TicketModel.getUsedTickets().get(i).getPrice()/90)*100));
                        TicketModel.getUsedTickets().get(i).setPenaltyOfCancellation(((TicketModel.getUsedTickets().get(i).getPrice()*20)/100));
                    }
                    for (int i=0 ; i<TicketModel.getTickets().size() ; i++)
                    {
                        TicketModel.getTickets().get(i).setPrice(((TicketModel.getTickets().get(i).getPrice()/90)*100));
                        TicketModel.getTickets().get(i).setPenaltyOfCancellation(((TicketModel.getTickets().get(i).getPrice()*20)/100));
                    }
                    for (int i=0 ; i<EmployeeModel.getEmployees().size() ; i++)
                    {
                        EmployeeModel.getEmployees().get(i).setSalary(((EmployeeModel.getEmployees().get(i).getSalary()/90)*100));
                    }
                    for (int i=0 ; i<ManagerModel.getManagers().size() ; i++)
                    {
                        ManagerModel.getManagers().get(i).setSalary(((ManagerModel.getManagers().get(i).getSalary()/110)*100));
                    }
                }

                currentPolicy = 0;
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime localDateTime = LocalDateTime.now();
                ManagerModel.getReports().add("Super admin changed financial policy to constant at "+dtf.format(localDateTime));
                managerView.getStage().setScene(managerView.getMainMenuScene());
                managerView.getStage().setTitle("Manager Main Menu");
                managerView.getStage().setMinWidth(570);
                managerView.getStage().setMinHeight(270);
                managerView.getStage().show();
            }
        });
    }


//financial police 1
    public void initJfxButton653()
    {
        managerView.getJfxButton653().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                if (currentPolicy == 0)
                {
//                    for (int i=0 ; i<FlightModel.getFlights().size() ; i++)
//                    {
//                        FlightModel.getFlights().get(i).getTicket().setPrice(((FlightModel.getFlights().get(i).getTicket().getPrice()*120)/100));
//                    }
                    for (int i=0 ; i<TicketModel.getUsedTickets().size() ; i++)
                    {
                        TicketModel.getUsedTickets().get(i).setPrice(((TicketModel.getUsedTickets().get(i).getPrice()*120)/100));
                        TicketModel.getUsedTickets().get(i).setPenaltyOfCancellation(((TicketModel.getUsedTickets().get(i).getPrice()*20)/100));
                    }
                    for (int i=0 ; i<TicketModel.getTickets().size() ; i++)
                    {
                        TicketModel.getTickets().get(i).setPrice(((TicketModel.getTickets().get(i).getPrice()*120)/100));
                        TicketModel.getTickets().get(i).setPenaltyOfCancellation(((TicketModel.getTickets().get(i).getPrice()*20)/100));
                    }
                    for (int i=0 ; i<PassengerModel.getPassengers().size() ; i++)
                    {
                        PassengerModel.getPassengers().get(i).setCredit(((PassengerModel.getPassengers().get(i).getCredit()*120)/100));
                    }
                }
                else if (currentPolicy == 2)
                {
//                    for (int i=0 ; i<FlightModel.getFlights().size() ; i++)
//                    {
//                        FlightModel.getFlights().get(i).getTicket().setPrice(((FlightModel.getFlights().get(i).getTicket().getPrice()/90)*100));
//                    }
                    for (int i=0 ; i<TicketModel.getUsedTickets().size() ; i++)
                    {
                        TicketModel.getUsedTickets().get(i).setPrice(((TicketModel.getUsedTickets().get(i).getPrice()/90)*100));
                        TicketModel.getUsedTickets().get(i).setPenaltyOfCancellation(((TicketModel.getUsedTickets().get(i).getPrice()*20)/100));
                    }
                    for (int i=0 ; i<TicketModel.getTickets().size() ; i++)
                    {
                        TicketModel.getTickets().get(i).setPrice(((TicketModel.getTickets().get(i).getPrice()/90)*100));
                        TicketModel.getTickets().get(i).setPenaltyOfCancellation(((TicketModel.getTickets().get(i).getPrice()*20)/100));
                    }
                    for (int i=0 ; i<EmployeeModel.getEmployees().size() ; i++)
                    {
                        EmployeeModel.getEmployees().get(i).setSalary(((EmployeeModel.getEmployees().get(i).getSalary()/90)*100));
                    }
                    for (int i=0 ; i<ManagerModel.getManagers().size() ; i++)
                    {
                        ManagerModel.getManagers().get(i).setSalary(((ManagerModel.getManagers().get(i).getSalary()/110)*100));
                    }


//                    for (int i=0 ; i<FlightModel.getFlights().size() ; i++)
//                    {
//                        FlightModel.getFlights().get(i).getTicket().setPrice(((FlightModel.getFlights().get(i).getTicket().getPrice()*120)/100));
//                    }
                    for (int i=0 ; i<TicketModel.getUsedTickets().size() ; i++)
                    {
                        TicketModel.getUsedTickets().get(i).setPrice(((TicketModel.getUsedTickets().get(i).getPrice()*120)/100));
                        TicketModel.getUsedTickets().get(i).setPenaltyOfCancellation(((TicketModel.getUsedTickets().get(i).getPrice()*20)/100));
                    }
                    for (int i=0 ; i<TicketModel.getTickets().size() ; i++)
                    {
                        TicketModel.getTickets().get(i).setPrice(((TicketModel.getTickets().get(i).getPrice()*120)/100));
                        TicketModel.getTickets().get(i).setPenaltyOfCancellation(((TicketModel.getTickets().get(i).getPrice()*20)/100));
                    }
                    for (int i=0 ; i<PassengerModel.getPassengers().size() ; i++)
                    {
                        PassengerModel.getPassengers().get(i).setCredit(((PassengerModel.getPassengers().get(i).getCredit()*120)/100));
                    }
                }

                currentPolicy = 1;
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime localDateTime = LocalDateTime.now();
                ManagerModel.getReports().add("Super admin changed financial policy to 1 at "+dtf.format(localDateTime));
                managerView.getStage().setScene(managerView.getMainMenuScene());
                managerView.getStage().setTitle("Manager Main Menu");
                managerView.getStage().setMinWidth(570);
                managerView.getStage().setMinHeight(270);
                managerView.getStage().show();

            }
        });
    }

//financial police 2
    public void initJfxButton654()
    {
        managerView.getJfxButton654().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                if (currentPolicy == 0)
                {
//                    for (int i=0 ; i<FlightModel.getFlights().size() ; i++)
//                    {
//                        FlightModel.getFlights().get(i).getTicket().setPrice(((FlightModel.getFlights().get(i).getTicket().getPrice()*90)/100));
//                    }
                    for (int i=0 ; i<TicketModel.getUsedTickets().size() ; i++)
                    {
                        TicketModel.getUsedTickets().get(i).setPrice(((TicketModel.getUsedTickets().get(i).getPrice()*90)/100));
                        TicketModel.getUsedTickets().get(i).setPenaltyOfCancellation(((TicketModel.getUsedTickets().get(i).getPrice()*20)/100));
                    }
                    for (int i=0 ; i<TicketModel.getTickets().size() ; i++)
                    {
                        TicketModel.getTickets().get(i).setPrice(((TicketModel.getTickets().get(i).getPrice()*90)/100));
                        TicketModel.getTickets().get(i).setPenaltyOfCancellation(((TicketModel.getTickets().get(i).getPrice()*20)/100));
                    }
                    for (int i=0 ; i<EmployeeModel.getEmployees().size() ; i++)
                    {
                        EmployeeModel.getEmployees().get(i).setSalary(((EmployeeModel.getEmployees().get(i).getSalary()*90)/100));
                    }
                    for (int i=0 ; i<ManagerModel.getManagers().size() ; i++)
                    {
                        ManagerModel.getManagers().get(i).setSalary(((ManagerModel.getManagers().get(i).getSalary()*110)/100));
                    }
                }
                else if (currentPolicy == 1)
                {
//                    for (int i=0 ; i<FlightModel.getFlights().size() ; i++)
//                    {
//                        FlightModel.getFlights().get(i).getTicket().setPrice(((FlightModel.getFlights().get(i).getTicket().getPrice()/120)*100));
//                    }
                    for (int i=0 ; i<TicketModel.getUsedTickets().size() ; i++)
                    {
                        TicketModel.getUsedTickets().get(i).setPrice(((TicketModel.getUsedTickets().get(i).getPrice()/120)*100));
                        TicketModel.getUsedTickets().get(i).setPenaltyOfCancellation(((TicketModel.getUsedTickets().get(i).getPrice()*20)/100));
                    }
                    for (int i=0 ; i<TicketModel.getTickets().size() ; i++)
                    {
                        TicketModel.getTickets().get(i).setPrice(((TicketModel.getTickets().get(i).getPrice()/120)*100));
                        TicketModel.getTickets().get(i).setPenaltyOfCancellation(((TicketModel.getTickets().get(i).getPrice()*20)/100));
                    }
                    for (int i=0 ; i<PassengerModel.getPassengers().size() ; i++)
                    {
                        PassengerModel.getPassengers().get(i).setCredit(((PassengerModel.getPassengers().get(i).getCredit()/120)*100));
                    }


//                    for (int i=0 ; i<FlightModel.getFlights().size() ; i++)
//                    {
//                        FlightModel.getFlights().get(i).getTicket().setPrice(((FlightModel.getFlights().get(i).getTicket().getPrice()*90)/100));
//                    }
                    for (int i=0 ; i<TicketModel.getUsedTickets().size() ; i++)
                    {
                        TicketModel.getUsedTickets().get(i).setPrice(((TicketModel.getUsedTickets().get(i).getPrice()*90)/100));
                        TicketModel.getUsedTickets().get(i).setPenaltyOfCancellation(((TicketModel.getUsedTickets().get(i).getPrice()*20)/100));
                    }
                    for (int i=0 ; i<TicketModel.getTickets().size() ; i++)
                    {
                        TicketModel.getTickets().get(i).setPrice(((TicketModel.getTickets().get(i).getPrice()*90)/100));
                        TicketModel.getTickets().get(i).setPenaltyOfCancellation(((TicketModel.getTickets().get(i).getPrice()*20)/100));
                    }
                    for (int i=0 ; i<EmployeeModel.getEmployees().size() ; i++)
                    {
                        EmployeeModel.getEmployees().get(i).setSalary(((EmployeeModel.getEmployees().get(i).getSalary()*90)/100));
                    }
                    for (int i=0 ; i<ManagerModel.getManagers().size() ; i++)
                    {
                        ManagerModel.getManagers().get(i).setSalary(((ManagerModel.getManagers().get(i).getSalary()*110)/100));
                    }
                }

                currentPolicy = 2;
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime localDateTime = LocalDateTime.now();
                ManagerModel.getReports().add("Super admin changed financial policy to 2 at "+dtf.format(localDateTime));
                managerView.getStage().setScene(managerView.getMainMenuScene());
                managerView.getStage().setTitle("Manager Main Menu");
                managerView.getStage().setMinWidth(570);
                managerView.getStage().setMinHeight(270);
                managerView.getStage().show();
            }
        });
    }



//exit forgot password menu
    public void initJfxButton606()
    {
        managerView.getJfxButton606().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getJfxTextField606().clear();
                managerView.getStage().setScene(managerView.getMainMenuScene());
                managerView.getStage().setTitle("Manager Main Menu");
                managerView.getStage().setMinWidth(570);
                managerView.getStage().setMinHeight(270);
                managerView.getStage().show();
            }
        });
    }

//forgot password menu
    public void initJfxButton605()
    {
        managerView.getJfxButton605().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (!(managerView.getJfxTextField606().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for this section!");
                }
                else if (!(managerView.getJfxTextField606().getText().equals(ManagerModel.getManagers().get(index).getSecurityAnswer())))
                {
                    MessageController messageController = new MessageController("Answer is not true!");
                }
                else
                {
                    managerView.getStage().close();
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("Manager with "+ManagerModel.getManagers().get(index).getId()+" as id got his/her password back at "+dtf.format(localDateTime));
                    managerView.getJfxTextField606().clear();
                    managerView.getStage().setScene(managerView.getMainMenuScene());
                    managerView.getStage().setTitle("Manager Main Menu");
                    managerView.getStage().setMinWidth(570);
                    managerView.getStage().setMinHeight(270);
                    managerView.getStage().show();
                    MessageController messageController = new MessageController("youre password is : ("+ManagerModel.getManagers().get(index).getPassword()+") remember it this time!");
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
