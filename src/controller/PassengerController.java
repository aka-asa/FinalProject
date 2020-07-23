package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.FlightModel;
import model.PassengerModel;
import view.MessageView;
import view.PassengerView;

import java.util.ArrayList;

public class PassengerController implements Showable
{
    private PassengerView passengerView;
    private int index;

    public PassengerController ()
    {
        passengerView = new PassengerView();
        passengerView.getStage().setScene(passengerView.getLoginScene());
        passengerView.getStage().show();
        initJfxButton();
        initJfxButton2();
        initJfxButton3();
        initJfxButton4();
        initJfxButton5();
        initJfxButton6();
//        initJfxButton7();
        initJfxButton8();
        initJfxButton9();
        initJfxButton10();
        initJfxButton11();
        initJfxButton12();
        initJfxButton13();
    }


    public void show()
    {
        passengerView = new PassengerView();
        passengerView.getStage().setScene(passengerView.getShowPassengersScene());
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

    public int partition(int low, int high)
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

//add a passenger d
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
                else if (!(passengerView.getJfxTextField().getText().matches("[a-zA-z]+")))
                {
                    MessageController messageController = new MessageController("You can only use letters for name section!");
                }
                else if (!(passengerView.getJfxTextField2().getText().matches("[a-zA-z]+")))
                {
                    MessageController messageController = new MessageController("You can only use letters for last name section!");
                }
                else if (!(passengerView.getJfxTextField3().getText().matches("\\w+")))
                {
                    MessageController messageController = new MessageController("You can only use letters,numbers and (_) for username section!");
                }
                else if (!(passengerView.getJfxPasswordField().getText().matches("\\S+")))
                {
                    MessageController messageController = new MessageController("You can not use whitespace for password section!");
                }
                else if (!(passengerView.getJfxTextField4().getText().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")))
                {
                    MessageController messageController = new MessageController("Wrong email address,please try again!");
                }
                else if (!(passengerView.getJfxTextField5().getText().matches("[0]\\d{10}||[9][8]\\d{10}")))
                {
                    MessageController messageController = new MessageController("You can only use 11 numbers starting with 0 or 12 numbers starting with 98 for phone number section");
                }
                else
                {
                    PassengerModel passengerModel = new PassengerModel(passengerView.getJfxTextField().getText(), passengerView.getJfxTextField2().getText(), passengerView.getJfxTextField3().getText(), passengerView.getJfxPasswordField().getText(), passengerView.getJfxTextField4().getText(), passengerView.getJfxTextField5().getText(), 0);
                    PassengerModel.getPassengers().add(passengerModel);
                    sort(0, PassengerModel.getPassengers().size() - 1);
                    passengerView.getStage().close();
                    MessageController messageController = new MessageController("Your ID is : ("+PassengerModel.getPassengers().get(PassengerModel.getPassengers().size() - 1).getId()+") please remember it!");
                    passengerView.getJfxTextField().clear();
                    passengerView.getJfxTextField2().clear();
                    passengerView.getJfxTextField3().clear();
                    passengerView.getJfxTextField4().clear();
                    passengerView.getJfxTextField5().clear();
                    passengerView.getJfxPasswordField().clear();
                    passengerView.getJfxPasswordField2().clear();
                    passengerView.getStage().setScene(passengerView.getLoginScene());
                    passengerView.getStage().show();
                }
            }
        });
    }

//exit registration menu d
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
                passengerView.getStage().show();
            }
        });
    }

//edit a passenger d
    public void initJfxButton3()
    {
        passengerView.getJfxButton3().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (passengerView.getJfxTextField6().getText().isEmpty()||passengerView.getJfxTextField7().getText().isEmpty()||passengerView.getJfxTextField8().getText().isEmpty() || passengerView.getJfxTextField9().getText().isEmpty()||passengerView.getJfxTextField10().getText().isEmpty())
                {
                    MessageController messageController1 = new MessageController("Please complete all parts!");
                }
                else if (!(passengerView.getJfxTextField6().getText().matches("[a-zA-z]+")))
                {
                    MessageController messageController1 = new MessageController("You can only use letters for name section!");
                }
                else if (!(passengerView.getJfxTextField7().getText().matches("[a-zA-z]+")))
                {
                    MessageController messageController1 = new MessageController("You can only use letters for last name section!");
                }
                else if (!(passengerView.getJfxTextField8().getText().matches("\\w+")))
                {
                    MessageController messageController1 = new MessageController("You can only use letters,numbers and (_) for username section!");
                }
                else if (!(passengerView.getJfxTextField9().getText().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")))
                {
                    MessageController messageController1 = new MessageController("Wrong email address,please try again!");
                }
                else if (!(passengerView.getJfxTextField10().getText().matches("[0]\\d{10}||[9][8]\\d{10}")))
                {
                    MessageController messageController1 = new MessageController("You can only use 11 numbers starting with 0 or 12 numbers starting with 98 for phone number section");
                }
                else
                {
                    PassengerModel passengerModel = new PassengerModel(passengerView.getJfxTextField6().getText(), passengerView.getJfxTextField7().getText(), passengerView.getJfxTextField8().getText(), PassengerModel.getPassengers().get(index).getPassword(), passengerView.getJfxTextField9().getText(), passengerView.getJfxTextField10().getText(), 0);
                    PassengerModel.getPassengers().set(index,passengerModel);
                    passengerView.getStage().close();
                    passengerView.getJfxTextField6().clear();
                    passengerView.getJfxTextField7().clear();
                    passengerView.getJfxTextField8().clear();
                    passengerView.getJfxTextField9().clear();
                    passengerView.getJfxTextField10().clear();
                    passengerView.getStage().setScene(passengerView.getMainMenuScene());
                    passengerView.getStage().show();

                }
            }
        });
    }

//exit edit menu d
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
                passengerView.getStage().show();
            }
        });

    }

//login as passenger d
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
                else if (!(passengerView.getJfxTextField11().getText().matches("\\d+")))
                {
                    MessageController messageController = new MessageController("You can only use numbers for id section");
                }
                else if (!(passengerView.getJfxPasswordField5().getText().matches("\\S+")))
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
                        passengerView.getStage().close();
                        passengerView.getJfxTextField11().clear();
                        passengerView.getJfxPasswordField5().clear();
                        passengerView.getStage().setScene(passengerView.getMainMenuScene());
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
                passengerView.getStage().show();
            }
        });
    }

//exit login menu
//    public void initJfxButton7()
//    {
//        passengerView.getJfxButton7().setOnAction(new EventHandler<ActionEvent>()
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
                            passengerView.getStage().show();
                            break;

                        case "Change password":
                            passengerView.getStage().close();
                            passengerView.getStage().setScene(passengerView.getChangePasswordScene());
                            passengerView.getStage().show();
                            break;

                        case "Charge account":
                            passengerView.getStage().close();
                            passengerView.getLabel9().setText("How much would you like to charge?\nyour current credit is : ("+PassengerModel.getPassengers().get(index).getCredit()+")");
                            passengerView.getStage().setScene(passengerView.getChargeScene());
                            passengerView.getStage().show();
                            break;

//                        case "Ticket section":
//
//                            break;

//                        case "Send reviews":
//
//                            break;

                        default :
                            break;
                    }


            }
        });
    }

//exit main menu d
    public void initJfxButton9()
    {
        passengerView.getJfxButton9().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                passengerView.getStage().close();
                passengerView.getStage().setScene(passengerView.getLoginScene());
                passengerView.getStage().show();
            }
        });
    }

//change password menu d
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
                else if (!((passengerView.getJfxPasswordField3().getText().matches("\\S+"))&&(passengerView.getJfxPasswordField4().getText().matches("\\S+"))))
                {
                    MessageController messageController = new MessageController("You can not use whitespace for password section!");
                }
                else
                {
                    PassengerModel.getPassengers().get(index).setPassword(passengerView.getJfxPasswordField4().getText());
                    passengerView.getJfxPasswordField3().clear();
                    passengerView.getJfxPasswordField4().clear();
                    passengerView.getJfxPasswordField6().clear();
                    passengerView.getStage().close();
                    passengerView.getStage().setScene(passengerView.getMainMenuScene());
                    passengerView.getStage().show();
                }




            }
        });
    }


//exit change password menu d
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
                passengerView.getStage().show();
            }
        });
    }

//charge menu d
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
                else if (!(Long.parseLong(passengerView.getJfxTextField12().getText())>0))
                {
                    MessageController messageController = new MessageController("Your number should be larger than 0 !");
                }
                else if (!(passengerView.getJfxTextField12().getText().matches("\\d+")))
                {
                    MessageController messageController = new MessageController("Please write a number!");
                }
                else
                {
                    passengerView.getStage().close();
                    PassengerModel.getPassengers().get(index).setCredit((PassengerModel.getPassengers().get(index).getCredit())+(Long.parseLong(passengerView.getJfxTextField12().getText())));
                    passengerView.getJfxTextField12().clear();
                    passengerView.getStage().setScene(passengerView.getMainMenuScene());
                    passengerView.getStage().show();
                }
            }
        });
    }

//exit charge menu d
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
                passengerView.getStage().show();
            }
        });
    }




}
