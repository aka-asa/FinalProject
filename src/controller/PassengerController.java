package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import model.*;
import view.PassengerView;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PassengerController implements Showable
{
    private PassengerView passengerView;
    private int index;
    private int selectedRowIndex;

    public PassengerController ()
    {
        passengerView = new PassengerView();
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
        initJfxButton100();
        initJfxButton101();
        initJfxButton31();
        initJfxButton32();
        initJfxButton33();
        initJfxButton34();
        initJfxButton35();
        initJfxButton435();
        initJfxButton605();
        initJfxButton606();
    }

    public void showLoginMenu ()
    {
        passengerView.getStage().setScene(passengerView.getLoginScene());
        passengerView.getStage().setTitle("Passenger Login Menu");
        passengerView.getStage().setMinWidth(750);
        passengerView.getStage().setMinHeight(580);
        passengerView.getStage().show();
    }

    public void show()
    {
        passengerView = new PassengerView();
        for (int i=0 ; i<PassengerModel.getPassengers().size() ; i++)
        {
            passengerView.getTableView().getItems().add(PassengerModel.getPassengers().get(i));
        }
        passengerView.getStage().setScene(passengerView.getShowPassengersScene());
        passengerView.getStage().setTitle("Show Passengers");
        passengerView.getStage().setMinWidth(600);
        passengerView.getStage().setMinHeight(400);
        passengerView.getStage().show();
    }

    public PassengerView getPassengerView()
    {
        return passengerView;
    }

    public void setPassengerView(PassengerView passengerView)
    {
        this.passengerView = passengerView;
    }

    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public static int partition(int low, int high)
    {
        long pivot = PassengerModel.getPassengers().get(high).getId();
        int i = (low-1);
        for (int j=low ; j<high ; j++)
        {
            if (PassengerModel.getPassengers().get(j).getId() < pivot)
            {
                i++;
                PassengerModel temp = PassengerModel.getPassengers().get(i);
                PassengerModel.getPassengers().set(i,PassengerModel.getPassengers().get(j));
                PassengerModel.getPassengers().set(j,temp);
            }
        }
        PassengerModel temp = PassengerModel.getPassengers().get(i+1);
        PassengerModel.getPassengers().set(i+1,PassengerModel.getPassengers().get(high));
        PassengerModel.getPassengers().set(high,temp);

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
        int last = PassengerModel.getPassengers().size()-1 ;
        int mid = (first + last) / 2;
        while (first <= last)
        {
            if (PassengerModel.getPassengers().get(mid).getId() < key)
            {
                first = mid + 1;
            } else if (PassengerModel.getPassengers().get(mid).getId() == key)
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

//add a passenger
    public void initJfxButton()
    {
        passengerView.getJfxButton().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (passengerView.getJfxTextField().getText().isEmpty()||passengerView.getJfxTextField2().getText().isEmpty()||passengerView.getJfxTextField3().getText().isEmpty()||passengerView.getJfxTextField4().getText().isEmpty()||passengerView.getJfxTextField5().getText().isEmpty()||passengerView.getJfxPasswordField().getText().isEmpty()||passengerView.getJfxPasswordField2().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(passengerView.getJfxPasswordField().getText().equals(passengerView.getJfxPasswordField2().getText())))
                {
                    MessageController messageController = new MessageController("Passwords are not same!");
                }
                else if (!(passengerView.getJfxTextField().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for name section!");
                }
                else if (!(passengerView.getJfxTextField2().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for last name section!");
                }
                else if (!(passengerView.getJfxTextField3().getText().matches("\\w{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for username section!");
                }
                else if (!(passengerView.getJfxPasswordField().getText().matches("\\S{1,13}")))
                {
                    MessageController messageController = new MessageController("You can not use whitespace for password section!");
                }
                else if (!(passengerView.getJfxTextField4().getText().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")))
                {
                    MessageController messageController = new MessageController("Wrong email address,please try again!");
                }
                else if (passengerView.getJfxTextField4().getLength()>20)
                {
                    MessageController messageController = new MessageController("Email address is too long,please try again!");
                }
                else if (!(passengerView.getJfxTextField5().getText().matches("[0]\\d{10}||[9][8]\\d{10}")))
                {
                    MessageController messageController = new MessageController("You can only use 11 numbers starting with 0 or 12 numbers starting with 98 for phone number section");
                }
                else if (!(passengerView.getJfxTextField605().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for security question section!");
                }
                else
                {
                    int emailError = 0;
                    int phoneNumberError = 0;
                    String phoneNumber;
                    if (passengerView.getJfxTextField5().getText().charAt(0) == '0')
                        phoneNumber = passengerView.getJfxTextField5().getText().replaceFirst("0", "98");
                    else
                    {
                        phoneNumber = passengerView.getJfxTextField5().getText();
                    }

                    for (int i=0 ; i<PassengerModel.getPassengers().size() ; i++)
                    {
                        if (passengerView.getJfxTextField4().getText().equals(PassengerModel.getPassengers().get(i).getEmail()))
                        {
                            emailError = 1;
                            break;
                        }
                    }
                    for (int i=0 ; i<PassengerModel.getPassengers().size() ; i++)
                    {
                        if (phoneNumber.equals(PassengerModel.getPassengers().get(i).getPhoneNumber()))
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
                        PassengerModel passengerModel = new PassengerModel(passengerView.getJfxTextField().getText(), passengerView.getJfxTextField2().getText(), passengerView.getJfxTextField3().getText(), passengerView.getJfxPasswordField().getText(), passengerView.getJfxTextField4().getText());
                        passengerModel.setPhoneNumber(passengerView.getJfxTextField5().getText());
                        passengerModel.setSecurityAnswer(passengerView.getJfxTextField605().getText());
                        PassengerModel.getPassengers().add(passengerModel);
                        sort(0, PassengerModel.getPassengers().size() - 1);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        LocalDateTime localDateTime = LocalDateTime.now();
                        ManagerModel.getReports().add("Passenger with "+passengerModel.getId()+" as id registered at "+dtf.format(localDateTime));
                        passengerView.getStage().close();
                        passengerView.getJfxTextField().clear();
                        passengerView.getJfxTextField2().clear();
                        passengerView.getJfxTextField3().clear();
                        passengerView.getJfxTextField4().clear();
                        passengerView.getJfxTextField5().clear();
                        passengerView.getJfxTextField605().clear();
                        passengerView.getJfxPasswordField().clear();
                        passengerView.getJfxPasswordField2().clear();
                        passengerView.getStage().setScene(passengerView.getLoginScene());
                        passengerView.getStage().setTitle("Passenger Login Menu");
                        passengerView.getStage().setMinWidth(750);
                        passengerView.getStage().setMinHeight(580);
                        passengerView.getStage().show();
                        MessageController messageController = new MessageController("Your ID is : (" + passengerModel.getId() + ") please remember it!");
                    }


                }
            }
        });
    }

//exit registration menu
    public void initJfxButton2()
    {
        passengerView.getJfxButton2().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                passengerView.getStage().close();
                passengerView.getJfxTextField().clear();
                passengerView.getJfxTextField2().clear();
                passengerView.getJfxTextField3().clear();
                passengerView.getJfxTextField4().clear();
                passengerView.getJfxTextField5().clear();
                passengerView.getJfxPasswordField().clear();
                passengerView.getJfxPasswordField2().clear();
                passengerView.getStage().setScene(passengerView.getLoginScene());
                passengerView.getStage().setTitle("Passenger Login Menu");
                passengerView.getStage().setMinWidth(750);
                passengerView.getStage().setMinHeight(580);
                passengerView.getStage().show();
            }
        });
    }

//edit a passenger
    public void initJfxButton3()
    {
        passengerView.getJfxButton3().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (passengerView.getJfxTextField6().getText().isEmpty()||passengerView.getJfxTextField7().getText().isEmpty()||passengerView.getJfxTextField8().getText().isEmpty() || passengerView.getJfxTextField9().getText().isEmpty()||passengerView.getJfxTextField10().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(passengerView.getJfxTextField6().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for name section!");
                }
                else if (!(passengerView.getJfxTextField7().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for last name section!");
                }
                else if (!(passengerView.getJfxTextField8().getText().matches("\\w{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for username section!");
                }
                else if (!(passengerView.getJfxTextField9().getText().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")))
                {
                    MessageController messageController = new MessageController("Wrong email address,please try again!");
                }
                else if (passengerView.getJfxTextField9().getLength()>20)
                {
                    MessageController messageController = new MessageController("Email address is too long,please try again!");
                }
                else if (!(passengerView.getJfxTextField10().getText().matches("[0]\\d{10}||[9][8]\\d{10}")))
                {
                    MessageController messageController = new MessageController("You can only use 11 numbers starting with 0 or 12 numbers starting with 98 for phone number section");
                }
                else
                {
                    int emailError = 0;
                    int phoneNumberError = 0;
                    String phoneNumber;
                    if (passengerView.getJfxTextField10().getText().charAt(0) == '0')
                        phoneNumber = passengerView.getJfxTextField10().getText().replaceFirst("0", "98");
                    else
                    {
                        phoneNumber = passengerView.getJfxTextField10().getText();
                    }

                    for (int i=0 ; i<PassengerModel.getPassengers().size() ; i++)
                    {
                        if (i == index)
                        {
                            continue;
                        }
                        else if (passengerView.getJfxTextField9().getText().equals(PassengerModel.getPassengers().get(i).getEmail()))
                        {
                            emailError = 1;
                            break;
                        }
                    }
                    for (int i=0 ; i<PassengerModel.getPassengers().size() ; i++)
                    {
                        if (i == index)
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
                        PassengerModel passengerModel = new PassengerModel(passengerView.getJfxTextField6().getText(), passengerView.getJfxTextField7().getText(), passengerView.getJfxTextField8().getText(), PassengerModel.getPassengers().get(index).getPassword(), passengerView.getJfxTextField9().getText());
                        passengerModel.setPhoneNumber(passengerView.getJfxTextField10().getText());
                        passengerModel.setId(PassengerModel.getPassengers().get(index).getId());
                        passengerModel.setCredit(PassengerModel.getPassengers().get(index).getCredit());
                        PassengerModel.getPassengers().set(index, passengerModel);
                        PassengerModel.setIdGenerator(PassengerModel.getIdGenerator() - 1);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        LocalDateTime localDateTime = LocalDateTime.now();
                        ManagerModel.getReports().add("Passenger with "+PassengerModel.getPassengers().get(index).getId()+" as id edited his/her profile at "+dtf.format(localDateTime));
                        passengerView.getStage().close();
                        passengerView.getJfxTextField6().clear();
                        passengerView.getJfxTextField7().clear();
                        passengerView.getJfxTextField8().clear();
                        passengerView.getJfxTextField9().clear();
                        passengerView.getJfxTextField10().clear();
                        passengerView.getStage().setScene(passengerView.getMainMenuScene());
                        passengerView.getStage().setTitle("Passenger Main Menu");
                        passengerView.getStage().setMinWidth(570);
                        passengerView.getStage().setMinHeight(270);
                        passengerView.getStage().show();
                    }
                }
            }
        });
    }

//exit edit menu
    public void initJfxButton4()
    {
        passengerView.getJfxButton4().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                passengerView.getStage().close();
                passengerView.getJfxTextField6().clear();
                passengerView.getJfxTextField7().clear();
                passengerView.getJfxTextField8().clear();
                passengerView.getJfxTextField9().clear();
                passengerView.getJfxTextField10().clear();
                passengerView.getStage().setScene(passengerView.getMainMenuScene());
                passengerView.getStage().setTitle("Passenger Main Menu");
                passengerView.getStage().setMinWidth(570);
                passengerView.getStage().setMinHeight(270);
                passengerView.getStage().show();
            }
        });

    }

//login as passenger
    public void initJfxButton5()
    {
        passengerView.getJfxButton5().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (passengerView.getJfxTextField11().getText().isEmpty()||passengerView.getJfxPasswordField5().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(passengerView.getJfxTextField11().getText().matches("\\d{1,7}")))
                {
                    MessageController messageController = new MessageController("You can only use numbers for id section");
                }
                else if ((passengerView.getJfxTextField11().getText().charAt(0) == '0')&&(passengerView.getJfxTextField11().getLength()>1))
                {
                    MessageController messageController = new MessageController("Wrong id!");
                }
                else if (!(passengerView.getJfxPasswordField5().getText().matches("\\S{1,13}")))
                {
                    MessageController messageController = new MessageController("You can not use whitespace for password section!");
                }
                else
                {
                    index = search(Integer.parseInt(passengerView.getJfxTextField11().getText()));
                    if (index == -1)
                    {
                        MessageController messageController = new MessageController("Sorry id is wrong,please try again.");
                    } else if (!(passengerView.getJfxPasswordField5().getText().equals(PassengerModel.getPassengers().get(index).getPassword())))
                    {
                        MessageController messageController = new MessageController("Sorry password is wrong,please try again.");
                    } else
                    {
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        LocalDateTime localDateTime = LocalDateTime.now();
                        ManagerModel.getReports().add("Passenger with "+PassengerModel.getPassengers().get(index).getId()+" as id logged in at "+dtf.format(localDateTime));
                        passengerView.getStage().close();
                        passengerView.getJfxTextField11().clear();
                        passengerView.getJfxPasswordField5().clear();
                        passengerView.getStage().setScene(passengerView.getMainMenuScene());
                        passengerView.getStage().setTitle("Passenger Main Menu");
                        passengerView.getStage().setMinWidth(570);
                        passengerView.getStage().setMinHeight(270);
                        passengerView.getStage().show();
                    }
                }
            }
        });
    }

//register d
    public void initJfxButton6()
    {
        passengerView.getJfxButton6().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                passengerView.getStage().close();
                passengerView.getJfxTextField11().clear();
                passengerView.getJfxPasswordField5().clear();
                passengerView.getStage().setScene(passengerView.getRegistrationScene());
                passengerView.getStage().setTitle("Passenger Registration Menu");
                passengerView.getStage().setMinWidth(750);
                passengerView.getStage().setMinHeight(580);
                passengerView.getStage().show();
            }
        });
    }

//exit login menu
    public void initJfxButton7()
    {
        passengerView.getJfxButton7().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                passengerView.getStage().close();
                passengerView.getJfxTextField11().clear();
                passengerView.getJfxPasswordField5().clear();
                AirportController airportController = new AirportController();
            }
        });
    }

//select an ability
    public void initJfxButton8()
    {
        passengerView.getJfxButton8().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                    switch (passengerView.getChoiceBox().getValue())
                    {
                        case "":
                            MessageController messageController = new MessageController("please choose an option!");
                            break;

                        case "Edit profile":
                            passengerView.getStage().close();
                            passengerView.getJfxTextField6().setText(PassengerModel.getPassengers().get(index).getName());
                            passengerView.getJfxTextField7().setText(PassengerModel.getPassengers().get(index).getLastName());
                            passengerView.getJfxTextField8().setText(PassengerModel.getPassengers().get(index).getUsername());
                            passengerView.getJfxTextField9().setText(PassengerModel.getPassengers().get(index).getEmail());
                            passengerView.getJfxTextField10().setText(PassengerModel.getPassengers().get(index).getPhoneNumber());
                            passengerView.getStage().setScene(passengerView.getEditAllScene());
                            passengerView.getStage().setTitle("Passenger Edit Menu");
                            passengerView.getStage().setMinWidth(750);
                            passengerView.getStage().setMinHeight(580);
                            passengerView.getStage().show();
                            break;

                        case "Change password":
                            passengerView.getStage().close();
                            passengerView.getStage().setScene(passengerView.getChangePasswordScene());
                            passengerView.getStage().setTitle("Passenger Change Password Menu");
                            passengerView.getStage().setMinWidth(750);
                            passengerView.getStage().setMinHeight(580);
                            passengerView.getStage().show();
                            break;

                        case "Charge account":
                            passengerView.getStage().close();
                            passengerView.getLabel9().setText("How much would you like to charge?\nyour current credit is : ("+PassengerModel.getPassengers().get(index).getCredit()+")");
                            passengerView.getStage().setScene(passengerView.getChargeScene());
                            passengerView.getStage().setTitle("Passenger Charge Account Menu");
                            passengerView.getStage().setMinWidth(750);
                            passengerView.getStage().setMinHeight(580);
                            passengerView.getStage().show();
                            break;

                        case "Ticket section":
                            passengerView.getStage().close();
                            passengerView.getLabel19().setText("Youre current credit is : ("+PassengerModel.getPassengers().get(index).getCredit()+")\nPlease slect a row from table!");
                            passengerView.getTableView5().getItems().clear();
                            for (int i=0 ; i<FlightModel.getFlights().size() ; i++)
                            {
                                passengerView.getTableView5().getItems().add(FlightModel.getFlights().get(i));
                            }
                            passengerView.getStage().setScene(passengerView.getBuyTicketScene());
                            passengerView.getStage().setTitle("Passenger Buy Ticket Menu");
                            passengerView.getStage().setMinWidth(1000);
                            passengerView.getStage().setMinHeight(600);
                            passengerView.getStage().show();
                            break;

                        case "Send critics and suggestions":
                            passengerView.getStage().close();
                            passengerView.getStage().setScene(passengerView.getCriticsAndSuggestionsScene());
                            passengerView.getStage().setTitle("Passenger Critics And Suggestions Menu");
                            passengerView.getStage().setMinWidth(750);
                            passengerView.getStage().setMinHeight(580);
                            passengerView.getStage().show();
                            break;

                        case "Forgot Password" :
                            passengerView.getStage().close();
                            passengerView.getStage().setScene(passengerView.getForgotPasswordScene());
                            passengerView.getStage().setTitle("Forgot Password Menu");
                            passengerView.getStage().setMinWidth(750);
                            passengerView.getStage().setMinHeight(580);
                            passengerView.getStage().show();
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
        passengerView.getJfxButton9().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                passengerView.getStage().close();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime localDateTime = LocalDateTime.now();
                ManagerModel.getReports().add("Passenger with "+PassengerModel.getPassengers().get(index).getId()+" as id quited the program at "+dtf.format(localDateTime));
                passengerView.getStage().setScene(passengerView.getLoginScene());
                passengerView.getStage().setTitle("Passenger Login Menu");
                passengerView.getStage().setMinWidth(570);
                passengerView.getStage().setMinHeight(270);
                passengerView.getStage().show();
            }
        });
    }

//change password menu
    public void initJfxButton10()
    {
        passengerView.getJfxButton10().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (passengerView.getJfxPasswordField3().getText().isEmpty()||passengerView.getJfxPasswordField4().getText().isEmpty()||passengerView.getJfxPasswordField6().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(passengerView.getJfxPasswordField4().getText().equals(passengerView.getJfxPasswordField6().getText())))
                {
                    MessageController messageController = new MessageController("Passwords are not same!");
                }
                else if (!((passengerView.getJfxPasswordField3().getText().matches("\\S+"))&&(passengerView.getJfxPasswordField4().getText().matches("\\S{1,13}"))))
                {
                    MessageController messageController = new MessageController("You can not use whitespace for password section!");
                }
                else if (!(passengerView.getJfxPasswordField3().getText().equals(PassengerModel.getPassengers().get(index).getPassword())))
                {
                    MessageController messageController = new MessageController("Wrong old password please try again!");
                }
                else
                {
                    PassengerModel.getPassengers().get(index).setPassword(passengerView.getJfxPasswordField4().getText());
                    passengerView.getJfxPasswordField3().clear();
                    passengerView.getJfxPasswordField4().clear();
                    passengerView.getJfxPasswordField6().clear();
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("Passenger with "+PassengerModel.getPassengers().get(index).getId()+" as id changed his/her password at "+dtf.format(localDateTime));
                    passengerView.getStage().close();
                    passengerView.getStage().setScene(passengerView.getMainMenuScene());
                    passengerView.getStage().setTitle("Passenger Main Menu");
                    passengerView.getStage().setMinWidth(570);
                    passengerView.getStage().setMinHeight(270);
                    passengerView.getStage().show();
                }


            }
        });
    }

//exit change password menu
    public void initJfxButton11()
    {
        passengerView.getJfxButton11().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                passengerView.getStage().close();
                passengerView.getJfxPasswordField3().clear();
                passengerView.getJfxPasswordField4().clear();
                passengerView.getJfxPasswordField6().clear();
                passengerView.getStage().setScene(passengerView.getMainMenuScene());
                passengerView.getStage().setTitle("Passenger Main Menu");
                passengerView.getStage().setMinWidth(570);
                passengerView.getStage().setMinHeight(270);
                passengerView.getStage().show();
            }
        });
    }

//charge menu
    public void initJfxButton12()
    {
        passengerView.getJfxButton12().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (passengerView.getJfxTextField12().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete the part!");
                }
                else if (!(passengerView.getJfxTextField12().getText().matches("\\d{1,7}")))
                {
                    MessageController messageController = new MessageController("Please write a number!");
                }
                else if (passengerView.getJfxTextField12().getText().charAt(0) == '0')
                {
                    MessageController messageController = new MessageController("You can only use natural numbers for charge acoount section!");
                }
//                else if (!(Long.parseLong(passengerView.getJfxTextField12().getText())>0))
//                {
//                    MessageController messageController = new MessageController("Your number should be larger than 0 !");
//                }
                else
                {
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("Passenger with "+PassengerModel.getPassengers().get(index).getId()+" as id charged his/her profile with "+passengerView.getJfxTextField12().getText() +" at "+dtf.format(localDateTime));
                    passengerView.getStage().close();
                    PassengerModel.getPassengers().get(index).setCredit((PassengerModel.getPassengers().get(index).getCredit())+(Long.parseLong(passengerView.getJfxTextField12().getText())));
                    passengerView.getJfxTextField12().clear();
                    passengerView.getStage().setScene(passengerView.getMainMenuScene());
                    passengerView.getStage().setTitle("Passenger Main Menu");
                    passengerView.getStage().setMinWidth(570);
                    passengerView.getStage().setMinHeight(270);
                    passengerView.getStage().show();
                }
            }
        });
    }

//exit charge menu
    public void initJfxButton13()
    {
        passengerView.getJfxButton13().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                passengerView.getStage().close();
                passengerView.getJfxTextField12().clear();
                passengerView.getStage().setScene(passengerView.getMainMenuScene());
                passengerView.getStage().setTitle("Passenger Main Menu");
                passengerView.getStage().setMinWidth(570);
                passengerView.getStage().setMinHeight(270);
                passengerView.getStage().show();
            }
        });
    }

//send critics and suggestions
    public void initJfxButton100()
    {
        passengerView.getJfxButton100().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (passengerView.getJfxTextArea100().getText().contains("$"))
                {
                    MessageController messageController = new MessageController("Sorry you cannot use ($)!");
                }
                else
                {
                    passengerView.getStage().close();
                    ManagerModel.getCriticsAndSuggestions().add(passengerView.getJfxTextArea100().getText());
                    passengerView.getJfxTextArea100().clear();
                    passengerView.getStage().setScene(passengerView.getMainMenuScene());
                    passengerView.getStage().setTitle("Passenger Main Menu");
                    passengerView.getStage().setMinWidth(570);
                    passengerView.getStage().setMinHeight(270);
                    passengerView.getStage().show();
                }
            }
        });
    }

//exit critics and suggestions menu
    public void initJfxButton101()
    {
        passengerView.getJfxButton101().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                passengerView.getStage().close();
                passengerView.getJfxTextArea100().clear();
                passengerView.getStage().setScene(passengerView.getMainMenuScene());
                passengerView.getStage().setTitle("Passenger Main Menu");
                passengerView.getStage().setMinWidth(570);
                passengerView.getStage().setMinHeight(270);
                passengerView.getStage().show();
            }
        });
    }

//buy a ticket
    public void initJfxButton31()
    {
        passengerView.getJfxButton31().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (passengerView.getTableView5().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row from table!");
                }
                else if (passengerView.getJfxTextField229().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (!(passengerView.getJfxTextField229().getText().matches("\\d{1,7}")))
                {
                    MessageController messageController = new MessageController("You can only use natural numbers for this section!");
                }
                else if (passengerView.getJfxTextField229().getText().charAt(0) == '0')
                {
                    MessageController messageController = new MessageController("You can only use natural numbers for this section!");
                }
                else
                {
                    FlightModel flightModel = passengerView.getTableView5().getSelectionModel().getSelectedItem();
                    long price;
                    if ((Integer.parseInt(passengerView.getJfxTextField229().getText())==4)&&(Integer.parseInt(passengerView.getJfxTextField229().getText())==5))
                    {
                        price = ((flightModel.getTicket().getPrice()*90)/100)*(Integer.parseInt(passengerView.getJfxTextField229().getText()));
                    }
                    else if (Integer.parseInt(passengerView.getJfxTextField229().getText())>5)
                    {
                        price = ((flightModel.getTicket().getPrice()*80)/100)*(Integer.parseInt(passengerView.getJfxTextField229().getText()));
                    }
                    else
                    {
                        price = flightModel.getTicket().getPrice()*(Integer.parseInt(passengerView.getJfxTextField229().getText()));
                    }

                    if (PassengerModel.getPassengers().get(index).getCredit() < price)
                    {
                        MessageController messageController = new MessageController("Sorry you dont have enough credit !");
                    }
                    else
                    {
                        String [] strings = flightModel.getTime().split(":");
                        for (int i = 0; i < 2; i++)
                        {
                            if (strings[i].charAt(0) == '0')
                                strings[i] = Character.toString(strings[i].charAt(1));
                        }
                        String string = strings[0]+"."+strings[1];
                        double startTime = Double.parseDouble(string);
                        double endTime = Double.parseDouble(string) + flightModel.getFlightTime();

                        selectedRowIndex = FlightController.search((int) flightModel.getId());
                        int numberOfRemainingTickets = FlightModel.getFlights().get(selectedRowIndex).getAirplane().getNumberOfSeats() - FlightModel.getFlights().get(selectedRowIndex).getNumberOfSoldTickets();
                        int error = 0;

                        for (int i = 0; i < PassengerModel.getPassengers().get(index).getTickets().size(); i++)
                        {
                            FlightModel flightModel2 = null;
                            for (int j=0 ; j<FlightModel.getFlights().size(); j++)
                            {
                                if (FlightModel.getFlights().get(j).getTicket().getId() == PassengerModel.getPassengers().get(index).getTickets().get(i).getId())
                                {
                                    flightModel2 = FlightModel.getFlights().get(j);
                                    break;
                                }
                            }

                            String [] strings2 = flightModel2.getTime().split(":");
                            for (int k = 0; k < 2; k++)
                            {
                                if (strings2[k].charAt(0) == '0')
                                    strings2[k] = Character.toString(strings2[k].charAt(1));
                            }
                            String string2 = strings2[0]+"."+strings2[1];
                            double startTime2 = Double.parseDouble(string2);
                            double endTime2 = (Double.parseDouble(string2)) + flightModel2.getFlightTime();

                            String date1 = flightModel.getDate().toString();
                            String date2 = flightModel2.getDate().toString();

                            if ((date1.equals(date2))&&(endTime<24)&&(endTime2<24))
                            {
                                if (!((endTime < startTime2) || (startTime > endTime2)))
                                {
                                    MessageController messageController = new MessageController("Sorry you already have a flight in this interval");
                                    error = 1;
                                    break;
                                }
                            }
                            else if ((endTime>23.59)&&(endTime2<24)&&(date1.equals(date2)))
                            {
                                if (!(startTime > endTime2))
                                {
                                    MessageController messageController = new MessageController("Sorry you already have a flight in this interval");
                                    error = 1;
                                    break;
                                }
                            }
                            else if ((endTime<24)&&(endTime2>23.59)&&(date1.equals(date2)))
                            {
                                if (!(endTime < startTime2))
                                {
                                    MessageController messageController = new MessageController("Sorry you already have a flight in this interval");
                                    error = 1;
                                    break;
                                }
                            }
                            else if ((!(date1.equals(date2)))&&(endTime2>23.59))
                            {
                                if (flightModel2.getDate().getDayOfYear() == flightModel.getDate().getDayOfYear()-1)
                                {
                                    endTime2 -= 24.00;
                                    if (!(endTime2 < startTime))
                                    {
                                        MessageController messageController = new MessageController("Sorry you already have a flight in this interval");
                                        error = 1;
                                        break;
                                    }
                                }
                            }
                            else if ((!(date1.equals(date2)))&&(endTime>23.59))
                            {
                                if (flightModel.getDate().getDayOfYear() == flightModel2.getDate().getDayOfYear()-1)
                                {
                                    endTime -= 24.00;
                                    if (!(endTime < startTime2))
                                    {
                                        MessageController messageController = new MessageController("Sorry you already have a flight in this interval");
                                        error = 1;
                                        break;
                                    }
                                }
                            }




                        }


                        if (error != 1)
                        {
                            if ((numberOfRemainingTickets > 0) && ((numberOfRemainingTickets > Integer.parseInt(passengerView.getJfxTextField229().getText())) || (numberOfRemainingTickets == Integer.parseInt(passengerView.getJfxTextField229().getText()))))
                            {
                                for (int i = 0; i < Integer.parseInt(passengerView.getJfxTextField229().getText()); i++)
                                {
                                    PassengerModel.getPassengers().get(index).getTickets().add(FlightModel.getFlights().get(selectedRowIndex).getTicket());
                                }

                                if (FlightModel.getFlights().get(selectedRowIndex).getListOfPassengers().size() == 0)
                                    FlightModel.getFlights().get(selectedRowIndex).getListOfPassengers().add(PassengerModel.getPassengers().get(index));
                                else
                                {
                                    for (int i = 0; i < FlightModel.getFlights().get(selectedRowIndex).getListOfPassengers().size(); i++)
                                    {
                                        if (FlightModel.getFlights().get(selectedRowIndex).getListOfPassengers().get(i).getId() == PassengerModel.getPassengers().get(index).getId())
                                        {
                                            break;
                                        }
                                        else if ((FlightModel.getFlights().get(selectedRowIndex).getListOfPassengers().get(i).getId() != PassengerModel.getPassengers().get(index).getId()) && (i == FlightModel.getFlights().get(selectedRowIndex).getListOfPassengers().size() - 1))
                                        {
                                            FlightModel.getFlights().get(selectedRowIndex).getListOfPassengers().add(PassengerModel.getPassengers().get(index));
                                        }
                                    }
                                }

                                FlightModel.getFlights().get(selectedRowIndex).setNumberOfSoldTickets(FlightModel.getFlights().get(selectedRowIndex).getNumberOfSoldTickets() + Integer.parseInt(passengerView.getJfxTextField229().getText()));
                                PassengerModel.getPassengers().get(index).setCredit(PassengerModel.getPassengers().get(index).getCredit() - price);

                                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                                LocalDateTime localDateTime = LocalDateTime.now();
                                ManagerModel.getReports().add("Passenger with "+PassengerModel.getPassengers().get(index).getId()+" as id bought ticket with "+FlightModel.getFlights().get(selectedRowIndex).getTicket().getId()+"as id at "+dtf.format(localDateTime));

                                passengerView.getStage().close();
                                passengerView.getStage().setScene(passengerView.getMainMenuScene());
                                passengerView.getStage().setTitle("Passenger Main Menu");
                                passengerView.getStage().setMinWidth(570);
                                passengerView.getStage().setMinHeight(270);
                                passengerView.getStage().show();
                                MessageController messageController = new MessageController("Your Ticket id is : (" + FlightModel.getFlights().get(selectedRowIndex).getTicket().getId() + ") you bought " + passengerView.getJfxTextField229().getText() + " of it.");
                                passengerView.getJfxTextField229().clear();
                            } else
                            {
                                MessageController messageController = new MessageController("Sorry there are not that much remaining seats!");
                            }


                        }


                    }

                }
            }
        });
    }

//cancel a ticket
    public void initJfxButton32()
    {
        passengerView.getJfxButton32().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (passengerView.getJfxTextField229().getText().isEmpty())
                {
                    MessageController messageController = new MessageController("Please complete all parts!");
                }
                else if (passengerView.getTableView5().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row from table!");
                }
                else if (!(passengerView.getJfxTextField229().getText().matches("\\d{1,7}")))
                {
                    MessageController messageController = new MessageController("You can only use whole numbers for Number Of Seats section");
                }
                else if (passengerView.getJfxTextField229().getText().charAt(0) == '0')
                {
                    MessageController messageController = new MessageController("You can only use natural numbers for this section!");
                }
                else
                {
                    FlightModel flightModel = passengerView.getTableView5().getSelectionModel().getSelectedItem();
                    long penaltyPrice = flightModel.getTicket().getPenaltyOfCancellation()*(Integer.parseInt(passengerView.getJfxTextField229().getText()));
                    long price =(flightModel.getTicket().getPrice()*(Integer.parseInt(passengerView.getJfxTextField229().getText())));


                    selectedRowIndex = FlightController.search((int) flightModel.getId());
                    int numberOfCancellation = Integer.parseInt(passengerView.getJfxTextField229().getText());
                    int numberOfTickets = 0;
                    for (int i = 0; i < PassengerModel.getPassengers().get(index).getTickets().size(); i++)
                    {
                        if (PassengerModel.getPassengers().get(index).getTickets().get(i).getId() == FlightModel.getFlights().get(selectedRowIndex).getTicket().getId())
                        {
                            numberOfTickets++;
                        }
                    }

                    if (!(numberOfCancellation > numberOfTickets))
                    {
                        FlightModel.getFlights().get(selectedRowIndex).setNumberOfSoldTickets(FlightModel.getFlights().get(selectedRowIndex).getNumberOfSoldTickets() - numberOfCancellation);
                        PassengerModel.getPassengers().get(index).setCredit(PassengerModel.getPassengers().get(index).getCredit()+(price-penaltyPrice));
                        for (int i = 0; i < FlightModel.getFlights().get(selectedRowIndex).getListOfPassengers().size(); i++)
                        {
                            if ((FlightModel.getFlights().get(selectedRowIndex).getListOfPassengers().get(i).getId() == PassengerModel.getPassengers().get(index).getId()) && (numberOfCancellation == numberOfTickets))
                            {
                                FlightModel.getFlights().get(selectedRowIndex).getListOfPassengers().remove(i);
                            }
                        }
                        int size = PassengerModel.getPassengers().get(index).getTickets().size();
                        int remaining = numberOfTickets-numberOfCancellation;
                        int i = 0;
                        for (; i < size ; i++)
                        {
                            if (PassengerModel.getPassengers().get(index).getTickets().get(i).getId() == FlightModel.getFlights().get(selectedRowIndex).getTicket().getId())
                            {
                                PassengerModel.getPassengers().get(index).getTickets().remove(i);
                                numberOfCancellation--;
                                i--;
                            }
                            if (numberOfCancellation == 0)
                                break;
                        }


                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        LocalDateTime localDateTime = LocalDateTime.now();
                        ManagerModel.getReports().add("Passenger with "+PassengerModel.getPassengers().get(index).getId()+" as id cancelled ticket with "+FlightModel.getFlights().get(selectedRowIndex).getTicket().getId()+" as id at "+dtf.format(localDateTime));

                        passengerView.getStage().close();
                        passengerView.getStage().setScene(passengerView.getMainMenuScene());
                        passengerView.getStage().setTitle("Passenger Main Menu");
                        passengerView.getStage().setMinWidth(570);
                        passengerView.getStage().setMinHeight(270);
                        passengerView.getStage().show();
                        MessageController messageController = new MessageController("You have "+remaining+" remaining tickets with "+FlightModel.getFlights().get(selectedRowIndex).getTicket().getId()+" as id");
                        passengerView.getJfxTextField229().clear();
                    }
                    else
                    {
                        MessageController messageController = new MessageController("You dont have that much ticket!");
                    }




                }
            }
        });
    }

//show ticket
    public void initJfxButton33()
    {
        passengerView.getJfxButton33().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (passengerView.getTableView5().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row from table!");
                } else
                {
                    FlightModel flightModel = passengerView.getTableView5().getSelectionModel().getSelectedItem();
                    selectedRowIndex = FlightController.search((int) flightModel.getId());
                    passengerView.getTableView9().getItems().clear();
                    passengerView.getTableView9().getItems().add(FlightModel.getFlights().get(selectedRowIndex).getTicket());
                    Stage stage2 = new Stage();
                    stage2.setScene(passengerView.getTicketOfFlightScene());
                    stage2.setTitle("Show Ticket Of Flight");
                    passengerView.getStage().setMinWidth(600);
                    passengerView.getStage().setMinHeight(400);
                    stage2.show();
                }
            }
        });
    }

//show airplane
    public void initJfxButton34()
    {
        passengerView.getJfxButton34().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (passengerView.getTableView5().getSelectionModel().isEmpty())
                {
                    MessageController messageController = new MessageController("Please select a row from table!");
                } else
                {
                    FlightModel flightModel = passengerView.getTableView5().getSelectionModel().getSelectedItem();
                    selectedRowIndex = FlightController.search((int) flightModel.getId());
                    passengerView.getTableView8().getItems().clear();
                    passengerView.getTableView8().getItems().add(FlightModel.getFlights().get(selectedRowIndex).getAirplane());
                    Stage stage2 = new Stage();
                    stage2.setScene(passengerView.getAirplaneOfFlightScene());
                    stage2.setTitle("Show Airplane Of Flight");
                    passengerView.getStage().setMinWidth(600);
                    passengerView.getStage().setMinHeight(400);
                    stage2.show();
                }
            }
        });
    }

//exit buy a ticket menu
    public void initJfxButton35()
    {
        passengerView.getJfxButton35().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                passengerView.getStage().close();
                passengerView.getJfxTextField229().clear();
                passengerView.getStage().setScene(passengerView.getMainMenuScene());
                passengerView.getStage().setTitle("Passenger Main Menu");
                passengerView.getStage().setMinWidth(570);
                passengerView.getStage().setMinHeight(270);
                passengerView.getStage().show();
            }
        });
    }

//show passengers tickets
    public void initJfxButton435()
    {
        passengerView.getJfxButton435().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                passengerView.getTableView435().getItems().clear();
                for (int i = 0; i< PassengerModel.getPassengers().get(index).getTickets().size() ; i++)
                {
                    passengerView.getTableView435().getItems().add(PassengerModel.getPassengers().get(index).getTickets().get(i));
                }
                Stage stage2 = new Stage();
                stage2.setScene(passengerView.getPassengersTicketsScene());
                stage2.setTitle("Show Passengers Tickets");
                passengerView.getStage().setMinWidth(570);
                passengerView.getStage().setMinHeight(270);
                stage2.show();
            }
        });
    }

//exit forgot password menu
    public void initJfxButton606()
    {
        passengerView.getJfxButton606().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                passengerView.getStage().close();
                passengerView.getJfxTextField606().clear();
                passengerView.getStage().setScene(passengerView.getMainMenuScene());
                passengerView.getStage().setTitle("Passenger Main Menu");
                passengerView.getStage().setMinWidth(570);
                passengerView.getStage().setMinHeight(270);
                passengerView.getStage().show();
            }
        });
    }

//forgot password menu
    public void initJfxButton605()
    {
        passengerView.getJfxButton605().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (!(passengerView.getJfxTextField606().getText().matches("[a-zA-z]{1,13}")))
                {
                    MessageController messageController = new MessageController("You can only use letters for this section!");
                }
                else if (!(passengerView.getJfxTextField606().getText().equals(PassengerModel.getPassengers().get(index).getSecurityAnswer())))
                {
                    MessageController messageController = new MessageController("Answer is not true!");
                }
                else
                {
                    passengerView.getStage().close();
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.now();
                    ManagerModel.getReports().add("Passenger with "+PassengerModel.getPassengers().get(index).getId()+" as id got his password back at "+dtf.format(localDateTime));
                    passengerView.getJfxTextField606().clear();
                    passengerView.getStage().setScene(passengerView.getMainMenuScene());
                    passengerView.getStage().setTitle("Passenger Main Menu");
                    passengerView.getStage().setMinWidth(570);
                    passengerView.getStage().setMinHeight(270);
                    passengerView.getStage().show();
                    MessageController messageController = new MessageController("youre password is : ("+PassengerModel.getPassengers().get(index).getPassword()+") remember it this time!");
                }
            }
        });
    }



}
