package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import model.*;
import view.ManagerView;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Formatter;

public class ManagerController implements Showable
{
    private ManagerView managerView;
    private int index;
    private int selectedRowIndex;
    private static ArrayList <TicketModel> usedTickets = new ArrayList<TicketModel>();

    public ManagerController ()
    {
        managerView = new ManagerView();
        initJfxButton();
        initJfxButton2();
        initJfxButton3();
        initJfxButton4();
        initJfxButton5();
        initJfxButton6();
        initJfxButton7();
        initJfxButton8();
        initJfxButton9();
        initJfxButton10();
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
        initJfxButton71();
//        initMenusJfxButton72();
        initJfxButton74();
        initJfxButton75();
    }

    public void showLoginMenu ()
    {
        managerView.getStage().setScene(managerView.getLoginScene());
        managerView.getStage().setTitle("Manager Login Menu");
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

    public int getSelectedRowIndex()
    {
        return selectedRowIndex;
    }

    public void setSelectedRowIndex(int selectedRowIndex)
    {
        this.selectedRowIndex = selectedRowIndex;
    }

    public static ArrayList<TicketModel> getUsedTickets()
    {
        return usedTickets;
    }

    public static void setUsedTickets(ArrayList<TicketModel> usedTickets)
    {
        ManagerController.usedTickets = usedTickets;
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

//add a manager
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
                else if (!(managerView.getJfxTextField().getText().matches("[a-zA-z]+")))
                {
                    MessageController messageController = new MessageController("You can only use letters for name section!");
                }
                else if (!(managerView.getJfxTextField2().getText().matches("[a-zA-z]+")))
                {
                    MessageController messageController = new MessageController("You can only use letters for last name section!");
                }
                else if (!(managerView.getJfxTextField3().getText().matches("\\w+")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for username section!");
                }
                else if (!(managerView.getJfxPasswordField().getText().matches("\\S+")))
                {
                    MessageController messageController = new MessageController("You can not use whitespace for password section!");
                }
                else if (!(managerView.getJfxTextField4().getText().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")))
                {
                    MessageController messageController = new MessageController("Wrong email address,please try again!");
                }
                else if (!(managerView.getJfxTextField5().getText().matches("[0]\\d{10}||[9][8]\\d{10}")))
                {
                    MessageController messageController = new MessageController("You can only use 11 numbers starting with 0 or 12 numbers starting with 98 for phone number section");
                }
                else
                {
                    ManagerModel managerModel = new ManagerModel(managerView.getJfxTextField().getText(), managerView.getJfxTextField2().getText(), managerView.getJfxTextField3().getText(), managerView.getJfxPasswordField().getText(), managerView.getJfxTextField4().getText(), managerView.getJfxTextField11().getText());
                    managerModel.setPhoneNumber(managerView.getJfxTextField5().getText());
                    ManagerModel.getManagers().add(managerModel);
                    sort(0, ManagerModel.getManagers().size() - 1);
                    managerView.getStage().close();
                    managerView.getJfxTextField().clear();
                    managerView.getJfxTextField2().clear();
                    managerView.getJfxTextField3().clear();
                    managerView.getJfxTextField4().clear();
                    managerView.getJfxTextField5().clear();
                    managerView.getJfxTextField11().clear();
                    managerView.getJfxPasswordField().clear();
                    managerView.getJfxPasswordField2().clear();
                    managerView.getStage().setScene(managerView.getLoginScene());
                    managerView.getStage().setTitle("Manager Main Menu");
                    managerView.getStage().show();
                    MessageController messageController = new MessageController("Your ID is : ("+managerModel.getId()+") please remember it!");
                }
            }
        });
    }

//exit registration menu
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
                managerView.getJfxPasswordField().clear();
                managerView.getJfxPasswordField2().clear();
                managerView.getStage().setScene(managerView.getLoginScene());
                managerView.getStage().setTitle("Manager Login Menu");
                managerView.getStage().show();
            }
        });
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
                else if (!(managerView.getJfxTextField6().getText().matches("[a-zA-z]+")))
                {
                    MessageController messageController = new MessageController("You can only use letters for name section!");
                }
                else if (!(managerView.getJfxTextField7().getText().matches("[a-zA-z]+")))
                {
                    MessageController messageController = new MessageController("You can only use letters for last name section!");
                }
                else if (!(managerView.getJfxTextField8().getText().matches("\\w+")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for username section!");
                }
                else if (!(managerView.getJfxTextField9().getText().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")))
                {
                    MessageController messageController = new MessageController("Wrong email address,please try again!");
                }
                else if (!(managerView.getJfxTextField10().getText().matches("[0]\\d{10}||[9][8]\\d{10}")))
                {
                    MessageController messageController = new MessageController("You can only use 11 numbers starting with 0 or 12 numbers starting with 98 for phone number section");
                }
                else
                {
                    ManagerModel managerModel = new ManagerModel(managerView.getJfxTextField6().getText(), managerView.getJfxTextField7().getText(), managerView.getJfxTextField8().getText(), PassengerModel.getPassengers().get(index).getPassword(), managerView.getJfxTextField9().getText(), managerView.getJfxTextField13().getText());
                    managerModel.setSalary(ManagerModel.getManagers().get(index).getSalary());
                    managerModel.setId(ManagerModel.getManagers().get(index).getId());
                    managerModel.setPhoneNumber(managerView.getJfxTextField10().getText());
                    ManagerModel.setIdGenerator(ManagerModel.getIdGenerator()-1);
                    ManagerModel.getManagers().set(index,managerModel);
                    managerView.getStage().close();
                    managerView.getJfxTextField6().clear();
                    managerView.getJfxTextField7().clear();
                    managerView.getJfxTextField8().clear();
                    managerView.getJfxTextField9().clear();
                    managerView.getJfxTextField10().clear();
                    managerView.getJfxTextField13().clear();
                    managerView.getStage().setScene(managerView.getMainMenuScene());
                    managerView.getStage().setTitle("Manager Main Menu");
                    managerView.getStage().show();
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
                else if (!(managerView.getJfxTextField70().getText().matches("\\d+")))
                {
                    MessageController messageController = new MessageController("Wrong id!");
                }
                else if (!(managerView.getJfxPasswordField70().getText().matches("\\S+")))
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
                        managerView.getStage().close();
                        managerView.getJfxTextField70().clear();
                        managerView.getJfxPasswordField70().clear();
                        managerView.getStage().setScene(managerView.getMainMenuScene());
                        managerView.getStage().setTitle("Manager Main Menu");
                        managerView.getStage().show();
                    }
                }
            }
        });
    }

//register
    public void initJfxButton71()
    {
        managerView.getJfxButton71().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getJfxTextField70().clear();
                managerView.getJfxPasswordField70().clear();
                managerView.getStage().setScene(managerView.getRegistrationScene());
                managerView.getStage().setTitle("Registration Menu");
                managerView.getStage().show();
            }
        });
    }

//exit login menu
//    public void initJfxButton72()
//    {
//        managerView.getJfxButton72().setOnAction(new EventHandler<ActionEvent>()
//        {
//            @Override
//            public void handle(ActionEvent event)
//            {
//
//            }
//        });
//    }

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
                            managerView.getStage().show();
                        }
                        break;

                    case "Change password":
                        managerView.getStage().close();
                        managerView.getStage().setScene(managerView.getChangePasswordScene());
                        managerView.getStage().setTitle("Change Password Menu");
                        managerView.getStage().show();
                        break;

//                    case "Manage employees":
//
//                        break;

                    case "Manage passengers":
                        managerView.getStage().close();
                        managerView.getTableView2().getItems().clear();
                        for (int i=0; i<PassengerModel.getPassengers().size() ; i++)
                        {
                            managerView.getTableView2().getItems().add(PassengerModel.getPassengers().get(i));
                        }
                        managerView.getStage().setScene(managerView.getPassengerScene());
                        managerView.getStage().setTitle("Passenger Menu");
                        managerView.getStage().show();
                        break;

                    case "Manage flights":
                        managerView.getStage().close();
                        managerView.getTableView5().getItems().clear();
                        for (int i=0; i< FlightModel.getFlights().size() ; i++)
                        {
                            managerView.getTableView5().getItems().add(FlightModel.getFlights().get(i));
                        }
                        managerView.getStage().setScene(managerView.getFlightScene());
                        managerView.getStage().setTitle("Flight Menu");
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
                        managerView.getStage().show();
                        break;

                    case "Manage critics and suggestions":
                        managerView.getStage().close();
                        managerView.getTableView11().getItems().clear();
                        ObservableList<String> details = FXCollections.observableArrayList(ManagerModel.getCriticsAndSuggestions());
                        managerView.getTableView11().setItems(details);
                        managerView.getStage().setScene(managerView.getCriticsAndSuggestionsScene());
                        managerView.getStage().setTitle("Critics And Suggestions Menu");
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
                            managerView.getStage().show();
                        }
                        else
                        {
                            MessageController messageController3 = new MessageController("sorry , this section is only accessible by super admin");
                        }
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
                managerView.getStage().setScene(managerView.getLoginScene());
                managerView.getStage().setTitle("Login Menu");
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
                else if (!((managerView.getJfxPasswordField71().getText().matches("\\S+"))&&(managerView.getJfxPasswordField72().getText().matches("\\S+"))))
                {
                    MessageController messageController = new MessageController("You can not use whitespace for password section!");
                }
                else if (!(managerView.getJfxPasswordField71().getText().equals(ManagerModel.getManagers().get(index).getPassword())))
                {
                    MessageController messageController = new MessageController("Wrong old password please try again!");
                }
                else
                {
                    ManagerModel.getManagers().get(index).setPassword(managerView.getJfxPasswordField71().getText());
                    managerView.getJfxPasswordField71().clear();
                    managerView.getJfxPasswordField72().clear();
                    managerView.getJfxPasswordField73().clear();
                    managerView.getStage().close();
                    managerView.getStage().setScene(managerView.getMainMenuScene());
                    managerView.getStage().setTitle("Manager Main Menu");
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
                managerView.getStage().show();
            }
        });
    }

//add a passenger menu
    public void initJfxButton10()
    {
     managerView.getJfxButton10().setOnAction(new EventHandler<ActionEvent>()
       {
           @Override
          public void handle(ActionEvent event)
          {
             managerView.getStage().close();
             managerView.getStage().setScene(managerView.getPassengerRegistrationScene());
              managerView.getStage().setTitle("Passenger Registration Menu");
             managerView.getStage().show();
         }
      });
    }

//add a passenger
    public void initJfxButton5()
    {
        managerView.getJfxButton5().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (managerView.getJfxTextField12().getText().isEmpty()||managerView.getJfxTextField14().getText().isEmpty()||managerView.getJfxTextField15().getText().isEmpty()||managerView.getJfxTextField16().getText().isEmpty()||managerView.getJfxTextField17().getText().isEmpty()||managerView.getJfxPasswordField3().getText().isEmpty()||managerView.getJfxPasswordField4().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(managerView.getJfxPasswordField3().getText().equals(managerView.getJfxPasswordField4().getText())))
                {
                    MessageController messageController = new MessageController("Passwords are not same!");
                }
                else if (!(managerView.getJfxTextField12().getText().matches("[a-zA-z]+")))
                {
                    MessageController messageController = new MessageController("You can only use letters for name section!");
                }
                else if (!(managerView.getJfxTextField14().getText().matches("[a-zA-z]+")))
                {
                    MessageController messageController = new MessageController("You can only use letters for last name section!");
                }
                else if (!(managerView.getJfxTextField15().getText().matches("\\w+")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for username section!");
                }
                else if (!(managerView.getJfxPasswordField3().getText().matches("\\S+")))
                {
                    MessageController messageController = new MessageController("You can not use whitespace for password section!");
                }
                else if (!(managerView.getJfxTextField16().getText().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")))
                {
                    MessageController messageController = new MessageController("Wrong email address,please try again!");
                }
                else if (!(managerView.getJfxTextField17().getText().matches("[0]\\d{10}||[9][8]\\d{10}")))
                {
                    MessageController messageController = new MessageController("You can only use 11 numbers starting with 0 or 12 numbers starting with 98 for phone number section");
                }
                else if (!(managerView.getJfxTextField300().getText().matches("\\d+")))
                {
                    MessageController messageController = new MessageController("You can only use natural numbers for credit section!");
                }
                else
                {
                    PassengerModel passengerModel = new PassengerModel(managerView.getJfxTextField12().getText(), managerView.getJfxTextField14().getText(), managerView.getJfxTextField15().getText(), managerView.getJfxPasswordField3().getText(), managerView.getJfxTextField16().getText());
                    passengerModel.setCredit(Long.parseLong(managerView.getJfxTextField300().getText()));
                    passengerModel.setPhoneNumber(managerView.getJfxTextField17().getText());
                    PassengerModel.getPassengers().add(passengerModel);
                    PassengerController.sort(0, PassengerModel.getPassengers().size() - 1);
                    managerView.getStage().close();
                    managerView.getJfxTextField12().clear();
                    managerView.getJfxTextField14().clear();
                    managerView.getJfxTextField15().clear();
                    managerView.getJfxTextField16().clear();
                    managerView.getJfxTextField17().clear();
                    managerView.getJfxTextField300().clear();
                    managerView.getJfxPasswordField3().clear();
                    managerView.getJfxPasswordField4().clear();
                    managerView.getTableView2().getItems().clear();
                    for ( int i=0; i<PassengerModel.getPassengers().size() ; i++)
                    {
                        managerView.getTableView2().getItems().add(PassengerModel.getPassengers().get(i));
                    }
                    managerView.getStage().setScene(managerView.getPassengerScene());
                    managerView.getStage().setTitle("Passenger Menu");
                    managerView.getStage().show();
                    MessageController messageController = new MessageController("The ID is : ("+passengerModel.getId()+") please remember it!");
                }
            }
        });
    }

//exit add a passenger menu
    public void initJfxButton6()
    {
        managerView.getJfxButton6().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                managerView.getStage().close();
                managerView.getJfxTextField12().clear();
                managerView.getJfxTextField14().clear();
                managerView.getJfxTextField15().clear();
                managerView.getJfxTextField16().clear();
                managerView.getJfxTextField17().clear();
                managerView.getJfxTextField300().clear();
                managerView.getJfxPasswordField3().clear();
                managerView.getJfxPasswordField4().clear();
                managerView.getTableView2().getItems().clear();
                for (int i=0; i< PassengerModel.getPassengers().size() ; i++)
                {
                    managerView.getTableView2().getItems().add(PassengerModel.getPassengers().get(i));
                }
                managerView.getStage().setScene(managerView.getPassengerScene());
                managerView.getStage().setTitle("Passenger Menu");
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
                else if (!(managerView.getJfxTextField18().getText().matches("[a-zA-z]+")))
                {
                    MessageController messageController = new MessageController("You can only use letters for name section!");
                }
                else if (!(managerView.getJfxTextField19().getText().matches("[a-zA-z]+")))
                {
                    MessageController messageController = new MessageController("You can only use letters for last name section!");
                }
                else if (!(managerView.getJfxTextField20().getText().matches("\\w+")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for username section!");
                }
                else if (!(managerView.getJfxTextField21().getText().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")))
                {
                    MessageController messageController = new MessageController("Wrong email address,please try again!");
                }
                else if (!(managerView.getJfxTextField22().getText().matches("[0]\\d{10}||[9][8]\\d{10}")))
                {
                    MessageController messageController = new MessageController("You can only use 11 numbers starting with 0 or 12 numbers starting with 98 for phone number section");
                }
                else if (!(managerView.getJfxTextField301().getText().matches("\\d+")))
                {
                    MessageController messageController = new MessageController("You can only use natural numbers for credit section!");
                }
                else
                {
                    PassengerModel passengerModel = new PassengerModel(managerView.getJfxTextField18().getText(), managerView.getJfxTextField19().getText(), managerView.getJfxTextField20().getText(), PassengerModel.getPassengers().get(selectedRowIndex).getPassword(), managerView.getJfxTextField21().getText());
                    passengerModel.setId(PassengerModel.getPassengers().get(selectedRowIndex).getId());
                    passengerModel.setCredit(Long.parseLong(managerView.getJfxTextField301().getText()));
                    passengerModel.setPhoneNumber(managerView.getJfxTextField22().getText());
                    PassengerModel.setIdGenerator(PassengerModel.getIdGenerator()-1);
                    PassengerModel.getPassengers().set(selectedRowIndex, passengerModel);
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
                    managerView.getStage().show();
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
                managerView.getStage().setTitle("Passenger Scene");
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
                    managerView.getStage().close();
                    managerView.getTableView2().getItems().clear();
                    for (int i = 0; i < PassengerModel.getPassengers().size(); i++)
                    {
                        managerView.getTableView2().getItems().add(PassengerModel.getPassengers().get(i));
                    }
                    managerView.getStage().setScene(managerView.getPassengerScene());
                    managerView.getStage().setTitle("Passenger Menu");
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
                if (managerView.getJfxTextField23().getText().isEmpty()||managerView.getJfxTextField24().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(managerView.getJfxTextField23().getText().matches("\\d+")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for Price section");
                }
                else if (!(managerView.getJfxTextField24().getText().matches("\\d+")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for Penalty Of Cancellation section");
                }
                else
                {
                    TicketModel ticketModel = new TicketModel(Long.parseLong(managerView.getJfxTextField23().getText()), Long.parseLong(managerView.getJfxTextField24().getText()));
                    TicketModel.getTickets().add(ticketModel);
                    TicketController.sort(0, TicketModel.getTickets().size() - 1);
                    managerView.getStage().close();
                    managerView.getJfxTextField23().clear();
                    managerView.getJfxTextField24().clear();
                    managerView.getTableView3().getItems().clear();
                    int i=0;
                    for ( ; i<TicketModel.getTickets().size() ; i++)
                    {
                        managerView.getTableView3().getItems().add(TicketModel.getTickets().get(i));
                    }
                    managerView.getStage().setScene(managerView.getTicketScene());
                    managerView.getStage().setTitle("Ticket Menu");
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
                managerView.getJfxTextField24().clear();
                managerView.getTableView3().getItems().clear();
                for (int i=0; i< TicketModel.getTickets().size() ; i++)
                {
                    managerView.getTableView3().getItems().add(TicketModel.getTickets().get(i));
                }
                managerView.getStage().setScene(managerView.getTicketScene());
                managerView.getStage().setTitle("Ticket Menu");
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
                    managerView.getJfxTextField26().setText(Long.toString(TicketModel.getTickets().get(selectedRowIndex).getPenaltyOfCancellation()));
                    managerView.getStage().setScene(managerView.getTicketEditScene());
                    managerView.getStage().setTitle("Ticket edit Menu");
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
                if (managerView.getJfxTextField25().getText().isEmpty()||managerView.getJfxTextField26().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(managerView.getJfxTextField25().getText().matches("\\d+")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for Price section");
                }
                else if (!(managerView.getJfxTextField26().getText().matches("\\d+")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for Penalty Of Cancellation section");
                }
                else
                {
                    TicketModel ticketModel = new TicketModel(Long.parseLong(managerView.getJfxTextField25().getText()), Long.parseLong(managerView.getJfxTextField26().getText()));
                    ticketModel.setId(TicketModel.getTickets().get(selectedRowIndex).getId());
                    TicketModel.getTickets().set(selectedRowIndex,ticketModel);
                    TicketModel.setIdGenerator(TicketModel.getIdGenerator()-1);
                    managerView.getStage().close();
                    managerView.getJfxTextField25().clear();
                    managerView.getJfxTextField26().clear();
                    managerView.getTableView3().getItems().clear();
                    for ( int i=0; i<TicketModel.getTickets().size() ; i++)
                    {
                        managerView.getTableView3().getItems().add(TicketModel.getTickets().get(i));
                    }
                    managerView.getStage().setScene(managerView.getTicketScene());
                    managerView.getStage().setTitle("Ticket Menu");
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
                managerView.getJfxTextField26().clear();
                managerView.getTableView3().getItems().clear();
                for (int i=0 ; i< TicketModel.getTickets().size() ; i++)
                {
                    managerView.getTableView3().getItems().add(TicketModel.getTickets().get(i));
                }
                managerView.getStage().setScene(managerView.getTicketScene());
                managerView.getStage().setTitle("Ticket Menu");
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
                    TicketModel.getTickets().remove(TicketController.search((int) ticketModel.getId()));
                    managerView.getStage().close();
                    managerView.getTableView3().getItems().clear();
                    for (int i=0 ; i < TicketModel.getTickets().size(); i++)
                    {
                        managerView.getTableView3().getItems().add(TicketModel.getTickets().get(i));
                    }
                    managerView.getStage().setScene(managerView.getTicketScene());
                    managerView.getStage().setTitle("Ticket Menu");
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
                else if (!(managerView.getJfxTextField27().getText().matches("\\d+")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for Number Of Seats section");
                }
                else
                {
                    AirplaneModel airplaneModel = new AirplaneModel(Integer.parseInt(managerView.getJfxTextField27().getText()));
                    AirplaneModel.getAirplanes().add(airplaneModel);
                    AirplaneController.sort(0, AirplaneModel.getAirplanes().size() - 1);
                    managerView.getStage().close();
                    managerView.getJfxTextField27().clear();
                    managerView.getTableView4().getItems().clear();
                    for ( int i=0; i<AirplaneModel.getAirplanes().size() ; i++)
                    {
                        managerView.getTableView4().getItems().add(AirplaneModel.getAirplanes().get(i));
                    }
                    managerView.getStage().setScene(managerView.getAirplaneScene());
                    managerView.getStage().setTitle("Airplane Menu");
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
                else if (!(managerView.getJfxTextField28().getText().matches("\\d+")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for Number Of Seats section");
                }
                else
                {
                    AirplaneModel airplaneModel = new AirplaneModel(Integer.parseInt(managerView.getJfxTextField28().getText()));
                    airplaneModel.setId(AirplaneModel.getAirplanes().get(selectedRowIndex).getId());
                    AirplaneModel.getAirplanes().set(selectedRowIndex,airplaneModel);
                    AirplaneModel.setIdGenerator(AirplaneModel.getIdGenerator()-1);
                    managerView.getStage().close();
                    managerView.getJfxTextField28().clear();
                    managerView.getTableView4().getItems().clear();
                    for ( int i=0 ; i<AirplaneModel.getAirplanes().size() ; i++)
                    {
                        managerView.getTableView4().getItems().add(AirplaneModel.getAirplanes().get(i));
                    }
                    managerView.getStage().setScene(managerView.getAirplaneScene());
                    managerView.getStage().setTitle("Airplane Menu");
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
                    AirplaneModel.getAirplanes().remove(AirplaneController.search((int) airplaneModel.getId()));
                    managerView.getStage().close();
                    managerView.getTableView4().getItems().clear();
                    for (int i=0 ; i < AirplaneModel.getAirplanes().size(); i++)
                    {
                        managerView.getTableView4().getItems().add(AirplaneModel.getAirplanes().get(i));
                    }
                    managerView.getStage().setScene(managerView.getAirplaneScene());
                    managerView.getStage().setTitle("Airplane Menu");
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
                    managerView.getTableView8().getItems().clear();
                    for (int i = 0; i < AirplaneModel.getAirplanes().get(selectedRowIndex).getListOfFlights().size(); i++)
                    {
                        managerView.getTableView8().getItems().add(AirplaneModel.getAirplanes().get(selectedRowIndex).getListOfFlights().get(i));
                    }
                    Stage stage2 = new Stage();
                    stage2.setScene(managerView.getFlightsOfAirplaneScene());
                    managerView.getStage().setTitle("Flights Of Airplane");
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
                    managerView.getTableView8().getItems().clear();
                    for (int i = 0; i < AirplaneModel.getAirplanes().get(selectedRowIndex).getListOfFlights().size(); i++)
                    {
                        managerView.getTableView8().getItems().add(AirplaneModel.getAirplanes().get(selectedRowIndex).getListOfFlights().get(i));
                    }
                    Stage stage2 = new Stage();
                    stage2.setScene(managerView.getFlightsOfAirplaneScene());
                    managerView.getStage().setTitle("Flights of Airplane");
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
                    for ( ; j<usedTickets.size() ; j++)
                    {
                        if (TicketModel.getTickets().get(i).getId() == usedTickets.get(j).getId())
                        {
                            t = 0;
                            break;
                        }
                    }
                    if (t == 1)
                        managerView.getTableView7().getItems().add(TicketModel.getTickets().get(i));
                }
                managerView.getTableView6().getItems().clear();
                for ( int k=0; k<AirplaneModel.getAirplanes().size() ; k++)
                {
                    managerView.getTableView6().getItems().add(AirplaneModel.getAirplanes().get(k));
                }
                managerView.getStage().setScene(managerView.getFlightRegistrationScene());
                managerView.getStage().setTitle("Flight Registration Menu");
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
                String[] parts = new String[3];
                String[] parts2 = new String[3];
                String[] parts3 = new String[2];
                String[] parts4 = new String[2];
                if (managerView.getJfxTextField31().getText().matches("\\d{4}[-]\\d{2}[-]\\d{2}"))
                {
                    LocalDate dateNow = LocalDate.now();
                    String dateNowString = dateNow.toString();
                    parts = dateNowString.split("-");
                    for (int i = 1; i < 3; i++)
                    {
                        if (parts[i].charAt(0) == '0')
                            parts[i] = Character.toString(parts[i].charAt(1));
                    }
                    parts2 = managerView.getJfxTextField31().getText().split("-");
                    for (int i = 1; i < 3; i++)
                    {
                        if (parts2[i].charAt(0) == '0')
                            parts2[i] = Character.toString(parts2[i].charAt(1));
                    }
                }

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
                else if (!(managerView.getJfxTextField29().getText().matches("\\w+")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for Origin section!");
                }
                else if (!(managerView.getJfxTextField30().getText().matches("\\w+")))
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
                else if ((Integer.parseInt(parts2[0])<Integer.parseInt(parts[0]))||((Integer.parseInt(parts2[0])==Integer.parseInt(parts[0]))&&(Integer.parseInt(parts2[1])<Integer.parseInt(parts[1])))||((Integer.parseInt(parts2[1])==Integer.parseInt(parts[1]))&&(Integer.parseInt(parts2[2])<Integer.parseInt(parts[2])+2)))
                {
                    MessageController messageController = new MessageController("Wrong date!");
                }
                else if ((Integer.parseInt(parts4[0])<0)||(Integer.parseInt(parts4[0])>23)||(Integer.parseInt(parts4[1])>59)||(Integer.parseInt(parts4[1])<0))
                {
                    MessageController messageController = new MessageController("Wrong time!");
                }
                else if (!(managerView.getJfxTextField33().getText().matches("\\d+")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for Number Of Sold Tickets section!");
                }
                else if (!(managerView.getJfxTextField34().getText().matches("\\d+\\.\\d+")))
                {
                    MessageController messageController = new MessageController("You can only use numbers for Flight Time section (double format number)!");
                }
                else
                {
                    AirplaneModel airplaneModel = managerView.getTableView6().getSelectionModel().getSelectedItem();
                    TicketModel ticketModel = managerView.getTableView7().getSelectionModel().getSelectedItem();
                    String [] parts5 = managerView.getJfxTextField31().getText().split("-");
                    LocalDate date = LocalDate.of(Integer.parseInt(parts5[0]),Integer.parseInt(parts5[1]),Integer.parseInt(parts5[2]));
                    FlightModel flightModel = new FlightModel(airplaneModel,ticketModel,managerView.getJfxTextField29().getText(),managerView.getJfxTextField30().getText(),date,managerView.getJfxTextField32().getText(),Integer.parseInt(managerView.getJfxTextField33().getText()),Double.parseDouble(managerView.getJfxTextField34().getText()));
                    FlightModel.getFlights().add(flightModel);
                    usedTickets.add(ticketModel);
                    AirplaneModel.getAirplanes().get(AirplaneController.search((int) airplaneModel.getId())).getListOfFlights().add(flightModel);
                    FlightController.sort(0, FlightModel.getFlights().size() - 1);
                    managerView.getStage().close();
                    managerView.getJfxTextField29().clear();
                    managerView.getJfxTextField30().clear();
                    managerView.getJfxTextField31().clear();
                    managerView.getJfxTextField32().clear();
                    managerView.getJfxTextField33().clear();
                    managerView.getJfxTextField34().clear();
                    managerView.getTableView5().getItems().clear();
                    for (int i=0 ; i<FlightModel.getFlights().size() ; i++)
                    {
                        managerView.getTableView5().getItems().add(FlightModel.getFlights().get(i));
                    }
                    managerView.getStage().setScene(managerView.getFlightScene());
                    managerView.getStage().setTitle("Flight Menu");
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
                managerView.getJfxTextField29().clear();
                managerView.getJfxTextField30().clear();
                managerView.getJfxTextField31().clear();
                managerView.getJfxTextField32().clear();
                managerView.getJfxTextField33().clear();
                managerView.getJfxTextField34().clear();
                managerView.getStage().setScene(managerView.getFlightScene());
                managerView.getStage().setTitle("Flight Menu");
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
                        for ( ; j<usedTickets.size() ; j++)
                        {
                            if (TicketModel.getTickets().get(i).getId() == usedTickets.get(j).getId())
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
                    for ( int k=0; k<AirplaneModel.getAirplanes().size() ; k++)
                    {
                        managerView.getTableView9().getItems().add(AirplaneModel.getAirplanes().get(k));
                    }
                    managerView.getStage().setScene(managerView.getFlightEditScene());
                    managerView.getStage().setTitle("Flight Edit Menu");
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
                String[] parts = new String[3];
                String[] parts2 = new String[3];
                String[] parts3 = new String[2];
                String[] parts4 = new String[2];
                if (managerView.getJfxTextField37().getText().matches("\\d{4}[-]\\d{2}[-]\\d{2}"))
                {
                    LocalDate dateNow = LocalDate.now();
                    String dateNowString = dateNow.toString();
                    parts = dateNowString.split("-");
                    for (int i = 1; i < 3; i++)
                    {
                        if (parts[i].charAt(0) == '0')
                            parts[i] = Character.toString(parts[i].charAt(1));
                    }
                    parts2 = managerView.getJfxTextField37().getText().split("-");
                    for (int i = 1; i < 3; i++)
                    {
                        if (parts2[i].charAt(0) == '0')
                            parts2[i] = Character.toString(parts2[i].charAt(1));
                    }
                }

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
                else if (!(managerView.getJfxTextField35().getText().matches("\\w+")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for Origin section!");
                }
                else if (!(managerView.getJfxTextField36().getText().matches("\\w+")))
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
                else if ((Integer.parseInt(parts2[0])<Integer.parseInt(parts[0]))||((Integer.parseInt(parts2[0])==Integer.parseInt(parts[0]))&&(Integer.parseInt(parts2[1])<Integer.parseInt(parts[1])))||((Integer.parseInt(parts2[1])==Integer.parseInt(parts[1]))&&(Integer.parseInt(parts2[2])<Integer.parseInt(parts[2])+2)))
                {
                    MessageController messageController = new MessageController("Wrong date!");
                }
                else if ((Integer.parseInt(parts4[0])<0)||(Integer.parseInt(parts4[0])>23)||(Integer.parseInt(parts4[1])>59)||(Integer.parseInt(parts4[1])<0))
                {
                    MessageController messageController = new MessageController("Wrong time!");
                }
                else if (!(managerView.getJfxTextField39().getText().matches("\\d+")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for Number Of Sold Tickets section!");
                }
                else if (!(managerView.getJfxTextField40().getText().matches("\\d+\\.\\d+")))
                {
                    MessageController messageController = new MessageController("You can only use numbers for Flight Time section (double format number)!");
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

                    for ( int l = 0; l <usedTickets.size(); l++)
                    {
                            if (usedTickets.get(l).getId() == FlightModel.getFlights().get(FlightController.search((int) flightModel.getId())).getTicket().getId())
                            {
                                usedTickets.remove(l);
                                break;
                            }
                    }
                    FlightModel.getFlights().set(selectedRowIndex, flightModel);
                    usedTickets.add(ticketModel);
                    AirplaneModel.getAirplanes().get(AirplaneController.search((int) airplaneModel.getId())).getListOfFlights().add(flightModel);
                    FlightController.sort(0, FlightModel.getFlights().size() - 1);
                    managerView.getStage().close();
                    managerView.getJfxTextField35().clear();
                    managerView.getJfxTextField36().clear();
                    managerView.getJfxTextField37().clear();
                    managerView.getJfxTextField38().clear();
                    managerView.getJfxTextField39().clear();
                    managerView.getJfxTextField40().clear();
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
                managerView.getJfxTextField35().clear();
                managerView.getJfxTextField36().clear();
                managerView.getJfxTextField37().clear();
                managerView.getJfxTextField38().clear();
                managerView.getJfxTextField39().clear();
                managerView.getJfxTextField40().clear();
                managerView.getStage().setScene(managerView.getFlightScene());
                managerView.getStage().setTitle("Flight Menu");
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
                    for ( int l = 0; l <usedTickets.size(); l++)
                    {
                        if (usedTickets.get(l).getId() == FlightModel.getFlights().get(FlightController.search((int) flightModel.getId())).getTicket().getId())
                        {
                            usedTickets.remove(l);
                            break;
                        }
                    }
                    FlightModel.getFlights().remove(FlightController.search((int) flightModel.getId()));
                    managerView.getStage().close();
                    managerView.getTableView5().getItems().clear();
                    for (int i = 0; i < FlightModel.getFlights().size(); i++)
                    {
                        managerView.getTableView5().getItems().add(FlightModel.getFlights().get(i));
                    }
                    managerView.getStage().setScene(managerView.getFlightScene());
                    managerView.getStage().setTitle("Flight Menu");
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
                managerView.getStage().setScene(managerView.getCriticsAndSuggestionsScene());
                managerView.getStage().setTitle("Critics And Suggestions Menu");
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
                else if (!(managerView.getJfxTextField41().getText().matches("[a-zA-z]+")))
                {
                    MessageController messageController = new MessageController("You can only use letters for name section!");
                }
                else if (!(managerView.getJfxTextField42().getText().matches("[a-zA-z]+")))
                {
                    MessageController messageController = new MessageController("You can only use letters for last name section!");
                }
                else if (!(managerView.getJfxTextField43().getText().matches("\\w+")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for username section!");
                }
                else if (!(managerView.getJfxPasswordField5().getText().matches("\\S+")))
                {
                    MessageController messageController = new MessageController("You can not use whitespace for password section!");
                }
                else if (!(managerView.getJfxTextField44().getText().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")))
                {
                    MessageController messageController = new MessageController("Wrong email address,please try again!");
                }
                else if (!(managerView.getJfxTextField45().getText().matches("[0]\\d{10}||[9][8]\\d{10}")))
                {
                    MessageController messageController = new MessageController("You can only use 11 numbers starting with 0 or 12 numbers starting with 98 for phone number section");
                }
                else if (!(managerView.getJfxTextField47().getText().matches("\\d+")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for salary section!");
                }
                else
                {
                    ManagerModel managerModel = new ManagerModel(managerView.getJfxTextField41().getText(), managerView.getJfxTextField42().getText(), managerView.getJfxTextField43().getText(), managerView.getJfxPasswordField5().getText(), managerView.getJfxTextField44().getText(),  managerView.getJfxTextField46().getText());
                    managerModel.setPhoneNumber(managerView.getJfxTextField45().getText());
                    managerModel.setSalary(Long.parseLong(managerView.getJfxTextField47().getText()));
                    ManagerModel.getManagers().add(managerModel);
                    sort(0, ManagerModel.getManagers().size() - 1);
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
                    for ( int i=0; i<ManagerModel.getManagers().size() ; i++)
                    {
                        if (ManagerModel.getManagers().get(i).getId() == 1)
                            continue;
                        managerView.getTableView12().getItems().add(ManagerModel.getManagers().get(i));
                    }
                    managerView.getStage().setScene(managerView.getManageManagersScene());
                    managerView.getStage().setTitle("Manage Manager Menu (Super Admin)");
                    managerView.getStage().show();
                    MessageController messageController = new MessageController("The ID is : ("+managerModel.getId()+")");
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
                else if (!(managerView.getJfxTextField48().getText().matches("[a-zA-z]+")))
                {
                    MessageController messageController = new MessageController("You can only use letters for name section!");
                }
                else if (!(managerView.getJfxTextField49().getText().matches("[a-zA-z]+")))
                {
                    MessageController messageController = new MessageController("You can only use letters for last name section!");
                }
                else if (!(managerView.getJfxTextField50().getText().matches("\\w+")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for username section!");
                }
                else if (!(managerView.getJfxTextField51().getText().matches("\\S+")))
                {
                    MessageController messageController = new MessageController("You can not use whitespace for password section!");
                }
                else if (!(managerView.getJfxTextField52().getText().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")))
                {
                    MessageController messageController = new MessageController("Wrong email address,please try again!");
                }
                else if (!(managerView.getJfxTextField53().getText().matches("[0]\\d{10}||[9][8]\\d{10}")))
                {
                    MessageController messageController = new MessageController("You can only use 11 numbers starting with 0 or 12 numbers starting with 98 for phone number section");
                }
                else if (!(managerView.getJfxTextField55().getText().matches("\\d+")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for salary section!");
                }
                else
                {
                    ManagerModel managerModel = new ManagerModel(managerView.getJfxTextField48().getText(), managerView.getJfxTextField49().getText(), managerView.getJfxTextField50().getText(), managerView.getJfxTextField51().getText(), managerView.getJfxTextField52().getText(), managerView.getJfxTextField54().getText());
                    managerModel.setSalary(Long.parseLong(managerView.getJfxTextField55().getText()));
                    managerModel.setPhoneNumber(managerView.getJfxTextField53().getText());
                    managerModel.setId(ManagerModel.getManagers().get(selectedRowIndex).getId());
                    ManagerModel.getManagers().set(selectedRowIndex, managerModel);
                    ManagerModel.setIdGenerator(ManagerModel.getIdGenerator()-1);
                    sort(0, ManagerModel.getManagers().size() - 1);
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
                    managerView.getStage().show();
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
                    managerView.getStage().close();
                    managerView.getTableView12().getItems().clear();
                    for (int i=0 ; i < ManagerModel.getManagers().size(); i++)
                    {
                        if (ManagerModel.getManagers().get(i).getId() == 1)
                            continue;
                        managerView.getTableView12().getItems().add(ManagerModel.getManagers().get(i));
                    }
                    managerView.getStage().setScene(managerView.getManageManagersScene());
                    managerView.getStage().setTitle("Manage Manager Menu (Super Admin)");
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
                managerView.getStage().show();
            }
        });
    }



}
